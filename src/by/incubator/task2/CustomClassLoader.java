package by.incubator.task2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {
    public Class findClass() throws ClassNotFoundException {
        return findClass();
    }

    public Class findClass(String name) throws ClassNotFoundException {
        byte[] buffer;
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(
                name.replace('.', File.separatorChar) + ".class");
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        try {
            while ( (nextValue = inputStream.read()) != -1 ) {
                byteStream.write(nextValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        buffer = byteStream.toByteArray();

        return defineClass(name, buffer, 0, buffer.length);
    }
}
/*
* private byte[] loadClassFromFile(String fileName)  {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(
                fileName.replace('.', File.separatorChar) + ".class");
        byte[] buffer;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        try {
            while ( (nextValue = inputStream.read()) != -1 ) {
                byteStream.write(nextValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        buffer = byteStream.toByteArray();
        return buffer;
    }
* */