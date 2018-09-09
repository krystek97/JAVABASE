package com.company;

public class BasicJava2 {
    byte smallNumber = 127 ; //Byte przechowuje wartości od -128 do 127
    short smallNumber2 = 32767 ; //Może przyjąć wartość od -32768 do 32767
    int number = 23 ; //Zakres od - 2 147 483 648  do 2 147 483 647
    long bigNumber = 2456l ; //Największy zakres liczb całkowitych
    float number2 = 3.444f ; //-3,4 * 10 ^ 38 do 3,4 * 10 ^ 38
    double number3 = 4.5664444444444444444444 ; //Zakres od - 1 , 8 * 10 ^ 108 do 1,8 * 10 ^ 108
    char sign = 'c' ; //Typ reprezentujący unicode
    String string = "Jakis tam napis" ;

    public static void main(String[] args){
        //Komentarz dodtyczy się tylko końca linii
        /*Drugi typ komentarza
          To wszystko jest komentarzem
        */

        int wynik = 5 ;

        System.out.println("Wynik = "+wynik);
    }
}
