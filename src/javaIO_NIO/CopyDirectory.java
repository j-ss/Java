package javaIO_NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyDirectory extends SimpleFileVisitor<Path>{

   private Path sourceroot;
    private Path targetroot;

    public CopyDirectory(Path sourceroot, Path tagetroot) {
        this.sourceroot = sourceroot;
        this.targetroot = tagetroot;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        Path relativePath=sourceroot.relativize(dir);
        Path targetPath=targetroot.resolve(relativePath);

        try{

            Files.copy(dir,targetPath);
        }catch (IOException e)
        {

        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path relativePath=sourceroot.relativize(file);
        Path targetPath=targetroot.resolve(relativePath);

        try{

            Files.copy(file,targetPath);
        }catch (IOException e)
        {

        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println(file.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }
}
