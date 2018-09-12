package pl.sportcode.commentvariablesoperators;

//Jest to klasa Main . Mamy dwa rodzaje komentarzy . Komentarz // tyczy si� tylko do
//ko�ca linii
/*Drugi typ komentarza zaczyna si� /* a ko�czy si� */
public class Main {
  //Maksymalna warto�c jak� byte mo�e przechowa� to 127 . Byte przechowuje warto�ci
  //od -128 do 127 . Je�eli przypiszemy mu wi�ksz� warto�� dostaniemy informacje o 
  //b��dzie
  byte smallNumber = 127 ; 
  /*Typ short mo�e przyj�� warto�� od -32 768 do 32 767 */
  short shortNumber = 32767 ;
  //Ma wi�kszy zakres ni� typ short 
  int number = 3276843 ; 
  //Ma wi�kszy zakres ni� typ int 
  long longNumber = 3245688l ; 
  //Typ zmiennoprzecinkowy
  double floatNumber = 3.67 ;
  //Typ char przechowuje znaki unicode 
  char sign = 'a' ; 
  //Typ String przechowuje �a�cuchy znakowe 
  String text = "Ala ma kota" ;
  
  public static void main(String[] args) {
      byte numberThird = 127 ; 
	  int wynik , wynik2 , wynik3 , wynik4 , wynik5;
	  int numberFirst = 56 ;
	  int numberSecond = 16 ;
	  
	  wynik = numberFirst + numberSecond ; 
	  wynik2 = numberFirst - numberSecond ;
	  wynik3 = numberFirst * numberSecond ;
	  wynik4 = numberFirst / numberSecond ;
	  wynik5 = numberFirst % numberSecond ;
	  
	  System.out.println("Wynik = "+wynik) ;
	  System.out.println("Wynik2 = "+wynik2);
	  System.out.println("Wynik3 = "+wynik3);
	  System.out.println("Wynik4 = "+wynik4);
	  System.out.println("Wynik5 = "+wynik5);
	  
	  wynik5++ ; //Inkrementacja
	  System.out.println("Wynik = "+wynik5);
	  wynik5-- ; //Dekrementacja
	  System.out.println("Wynik = "+wynik5) ;
	  numberThird++ ; 
	  System.out.println("Wynik = "+numberThird);
  }
}
