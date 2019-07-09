package com.copyfile;

import java.io.*;

public class Copy {
    public static void main(String[] args) {


        try (InputStream r = new FileInputStream("src/com/copyfile/image.jpg");
             OutputStream w = new FileOutputStream("src/com/copyfile/image_2.jpg")){


            while (true) {
                int s;
                if ((s = r.read()) == -1) {
                    break;
                }
                System.out.println((char) s + " = " + s);
                w.write(s);
            }


        } catch(IOException ex){
            System.out.println("IOException" + ex);
        }


    }

}
