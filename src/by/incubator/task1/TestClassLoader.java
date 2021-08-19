package by.incubator.task1;

import by.incubator.Main;

public class TestClassLoader {

    public void writeClassLoaderForMain(Class<?> myClass){
        System.out.println(myClass + " class loader is " + myClass.getClassLoader());
        Class<?> parentMyClass = myClass.getSuperclass();
        if(parentMyClass != null) {
            System.out.println(parentMyClass + " class loader is " + parentMyClass.getClassLoader());
            Class<?> parentsParents = parentMyClass.getSuperclass();
            if (parentsParents != null)
                System.out.println(parentsParents + " class loader is " + parentsParents.getClassLoader());
        }
        System.out.println();
    }

}
