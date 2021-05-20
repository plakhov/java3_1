package com.company;

public class SimpleBox<T, K> {
    private T testObject;
    private K secondObject;

    public SimpleBox(T testObject) {
        this.testObject = testObject;
    }

    public SimpleBox() {
    }

    public T getT(){
        return testObject;
    }

    public K getSecondObject() {
        return secondObject;
    }

    public T getTestObject() {
        return testObject;
    }

    public void setTestObject(T testObject) {
        this.testObject = testObject;
    }
}
