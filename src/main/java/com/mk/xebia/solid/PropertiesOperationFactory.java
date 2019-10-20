package com.mk.xebia.solid;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class PropertiesOperationFactory implements OperationFactory{
    private static Map<String,Operation> operationMap = new HashMap<>();
static {
    Properties props = new Properties();
    try {
        props.load(new FileInputStream("/Users/mohitk/projects/solid-principles/src/main/resources/application.properties"));
        for (Enumeration<?> e = props.propertyNames(); e.hasMoreElements(); ) {
            String name = (String)e.nextElement();
            String value = props.getProperty(name);
            if (name.startsWith("xebia.calculator")) {
                Operation operation = (Operation) PropertiesOperationFactory.class.getClassLoader().loadClass(value).newInstance();
                operationMap.put(name.substring("xebia.calculator".length()+1),operation);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


}


    public Operation getOperation(String op){

        return operationMap.get(op);
    }
}
