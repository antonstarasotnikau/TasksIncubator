package by.incubator;

import by.incubator.task1.Test;
import by.incubator.task1.TestClassLoader;

import java.io.Console;
import java.io.File;
import java.net.http.HttpClient;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TestClassLoader cl = new TestClassLoader();
        cl.writeClassLoaderForMain(new Main().getClass());
        cl.writeClassLoaderForMain(new Integer(10).getClass());
        cl.writeClassLoaderForMain(new Test().getClass());
    }
}
