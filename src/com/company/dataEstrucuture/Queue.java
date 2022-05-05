package com.company.dataEstrucuture;

public class Queue {
    private static final int CAPACIDAD_INICIAL =5;
    private static final int TOP = 0;
    private CustomCollection collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void enQueue(float element){
        collection.insert(element, collection.length());

    }
    public float deQueue(){

        return collection.delete(0);

    }

}
