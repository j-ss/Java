package HashingSalting;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;

public class EncryptPassword {

    public static String hashPass(String password) throws NoSuchAlgorithmException
    {
        MessageDigest messageDigest=MessageDigest.getInstance("SHA-1");

        //load  password
        byte[] bytes=password.getBytes();
        messageDigest.update(bytes);
        // digest
        byte[] b=messageDigest.digest();

        StringBuilder stringBuilder=new StringBuilder(b.length*2);
        for(byte str:b)
        {
            int i=str & 0xff;
            if(i<16)
                stringBuilder.append('0');
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }
    public static String getSalt()
    {
        Random random=new SecureRandom();
        byte[] bytes=new byte[32];

        random.nextBytes(bytes);

        return   Base64.getEncoder().encodeToString(bytes);
    }
}
