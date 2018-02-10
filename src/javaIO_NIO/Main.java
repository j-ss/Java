package javaIO_NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args)throws IOException
    {
        Path path= FileSystems.getDefault().getPath("Directory");

        // anonymous method
        DirectoryStream.Filter<Path> filter=new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isRegularFile(entry);
            }
        };

        //lambada method

        DirectoryStream.Filter<Path> lambadafilter=p->Files.isRegularFile(p);
        try(DirectoryStream<Path> content=Files.newDirectoryStream(path,lambadafilter))
        {
            for (Path filelocation:content) {
                System.out.println(filelocation.getFileName());
            }
        }

        Path traverse= FileSystems.getDefault().getPath("Directory"+ File.separator+"Dir1");

        try
        {
            Files.walkFileTree(traverse,new TraverseADirectory());
        }
        catch (IOException e)
        {
                e.printStackTrace();
        }

        Path sourceroot=FileSystems.getDefault().getPath("Directory"+File.separator+"Dir1"+File.separator+"Dir2");
        Path destPath=FileSystems.getDefault().getPath("Directory"+File.separator+"Dir3"+File.separator+"NewDir");
        try {
            Files.walkFileTree(destPath,new CopyDirectory(sourceroot,destPath));
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
