package com.company;

public class Table2 {
    public static void main(String[] args){
        char sign = 'a' ;
        int table[] = new int[11] ;

        while(sign < 127){
            System.out.println("Twoj biezacy znak to "+sign) ;
            sign++ ;
        }

        for(int number = 0 , number2 = 0; number<10 ; number++ , number2++){
            table[number] = number2 ;
        }

        for(int number = 0 ; number<10 ; number++){
            System.out.println("Twoja biezaca liczba wystepujaca w tablicy table to : "+table[number]);
        }
    }
}
