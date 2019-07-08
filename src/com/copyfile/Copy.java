package com.copyfile;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        int s;
        InputStream r = null;
        OutputStream w = null;
        try {
            r = new FileInputStream("src/com/copyfile/text.txt");
            w = new FileOutputStream("src/com/copyfile/text_2.txt");

            while ((s = r.read()) != -1) {
                System.out.println((char) s + " = " + s);
                w.write(s);
            }


        } catch (IOException ex) {
            System.out.println("IOException" + ex);
        } finally {
            if (r != null) {
                r.close();
            }
            if (w != null) {
                r.close();
            }
        }


    }

}
