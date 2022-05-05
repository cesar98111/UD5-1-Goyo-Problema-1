package com.company.dataEstrucuture;

import java.util.Arrays;

public class CustomCollection {
    private static final int DEFAULT_CAPACITY = 5;
    private float data[] = null;
    private int length =0;

    public CustomCollection(int initialCapacity){
        data = new float[initialCapacity];
    }
    public CustomCollection(){
        data = new float[DEFAULT_CAPACITY];
    }
    public Object getElement(int position){
        return data[position];
    }
    public int length(){
        return length;
    }
    public void insert(float element, int position){
        if(length == data.length){
            float []aux = data;
            data= new float[data.length *2];

            for (int i = 0; i < aux.length; i++) {
                data[i] = aux[i];
            }
            aux= null; //esto es para que el recolector de basura se cargue a aux
        }
        for (int i = length -1; i>=position ;i--){
            data[i+1]= data[i];
        }
        data[position]=element;
        length++;
    }
    public void add(float element){
        insert(element,length);
    }
    public int search(float element){
        for (int i = 0; i < length; i++) {
            if(data[i]==element){
                return i;
            }

        }
        return -1;
    }
    public float delete(int position){
        float aux = data[position];

        for(int i= position; i< length -1; i++){
            data[i]=data[i+1];
        }
        data[length-1]=0;
        length--;
        return aux;
    }

    @Override
    public String toString() {
        if (length==0){
            return "<Empty>";
        }
            String out="";
            for (int i = 0; i < length; i++) {
                    out+=getElement(i)+",";
                }
                return out;

        }
    }

