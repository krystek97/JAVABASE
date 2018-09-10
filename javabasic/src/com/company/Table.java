package com.company;

public class Table {
    public static void main(String[] args){

        int number2 = 0  ;
        int number3 = 0 ;
        int number4 = 0 ;
        int number5 = 0 ;
        int table2[][] = new int [2][5] ; //Tablica Wielowymiarowa
        int table[] = new int[5] ;
        table[0] = 6 ; //Przypisanie wartości elementowi zerowemu w tablicy
        table[1] = 7 ;
        table[2] = 8 ;
        table[3] = 9 ;
        table[4] = 10 ;

        for(int number = 0 ; number<table.length ; number++){
            System.out.println("Element  table = "+table[number]) ;
        }

        System.out.println("Petla While") ;

        while(number2<5){
            number2 ++ ;
            System.out.println(table[number2]);
        }

        System.out.println("Petla do while") ;

        do{
            number3 ++ ;
            System.out.println("Witaj swiecie") ;
        }while(number3<5) ;

        /*
          Zad 1
          Wydrukuj na ekran połowę choinki
         */

        for(int i =0 ; i <= 5;i++){
            for(int j =0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
