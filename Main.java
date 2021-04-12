import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner mysScanner= new Scanner (System.in);
    System.out.println("1) Convert currency 2) Convert weight 3)Convert weight 4)Convert time 5)Convert temperature" );
    int userchoice= mysScanner.nextInt();
    switch(userchoice){
      case 1:
    System.out.println("Your money in euros is :" +euro);
     break;
     case 2: System.out.println("The weight in kilograms" +
    }
  }
  public static  float money(float  userdollars){
    Scanner dollaramnt= new Scanner(System.in);
    System.out.println("Enter dollars");
    userdollars= dollaramnt.nextFloat();
     float euro = (userdollars *.84);
 return euro;  
 }
 public static float weight(float userweight){
 Scanner usweight= new Scanner(System.in);
 System.out.println("Enter pounds");
 userweight=usweight.nextFloat();
 float kg= userweight * .45;

 } return
 


 