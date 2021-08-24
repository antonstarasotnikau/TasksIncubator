package by.incubator.task1;

import by.incubator.Main;

public class TestClassLoader {

    public void writeClassLoaderForMain(Class<?> myClass){
        ClassLoader myClassLoader = myClass.getClassLoader();
        System.out.println(myClass + " class loader is " + myClassLoader);
        if(myClassLoader != null) {
            ClassLoader parentMyClass = myClass.getClassLoader().getParent();
            System.out.println("Parent class loader is " + parentMyClass);
            if (parentMyClass != null) {
                ClassLoader parentsParents = parentMyClass.getParent();
                System.out.println("Parent's parent class loader is " + parentsParents);
            }
        }

        System.out.println();
    }

}
