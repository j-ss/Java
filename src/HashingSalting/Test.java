package HashingSalting;

import java.security.NoSuchAlgorithmException;

public class Test {

    public static void main(String[] args)
    {

        // get salt

        String salt=EncryptPassword.getSalt();

        //encrypt data using hash

        String password="jogenra";
        try {
            String encryptPass = EncryptPassword.hashPass(password + salt);

            System.out.print(encryptPass);
        }catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }

    }
}
