package pl.sportcode.commentvariablesoperators;

public class Task5 {
  public static void main(String[] args) {
	  int number = 47 ;
	  double circuit , field ;
	  
	  circuit = 2 * Math.PI * number ;
	  field = Math.PI * Math.pow(number, 2) ;
	  
	  System.out.println("Obwod kola wynosi "+circuit);
	  System.out.println("Pole kola wynosi "+field);
  }
}
