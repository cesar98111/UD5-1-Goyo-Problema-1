package com.company;

import com.company.dataEstrucuture.Queue;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue cola = new Queue();
        int exit = 1;
        int count=0;
        String numero="";
        while(exit!=0){
            numero =sc.nextLine();
            if(numero.equals("q")){
                exit=0;
            }else{
                cola.enQueue(Float.valueOf(numero));
                count ++;
            }


        }
        for(int i=0;i<count;i++){
            float hola = cola.deQueue();
            System.out.println(hola);
        }
    }
}
