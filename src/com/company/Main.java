package com.company;

import com.company.dataEstrucuture.Queue;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue cola = new Queue();
        int exit = 1;
        String numero="";
        while(exit!=0){
            cola.enQueue(Float.valueOf(sc.nextLine()));
            if(numero.equals("q")){
                exit=0;
            }
        }
    }
}
