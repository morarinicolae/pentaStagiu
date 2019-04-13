
package lamp;
import java.util.Scanner;

public class Lamp {  
    public static void main(String[] args) {
        String firstAnswer;
        String secondAnswer = null;
        String thridAnswer = null;
        Scanner lampWork = new Scanner(System.in);
                System.out.println("Lamp doesn't work?");
                System.out.println ("Please say Yes or No:");
                firstAnswer = lampWork.nextLine();
                if ("Yes".equals(firstAnswer) ){
                    System.out.println("Congrulations!");
                    
                }
                else{{
                    System.out.println("Lamp plugged in?");
                    System.out.println("Yes or No?");
                    secondAnswer=lampWork.nextLine();
                    
                }
                if("No".equals(secondAnswer))
                {System.out.println("Plug in lamp!");
                        
                        }
                else{{
                    System.out.println("Bulb turned out?");
                    System.out.println("Yes or No?");
                    thridAnswer=lampWork.nextLine();
                    
                }
                if("Yes".equals(thridAnswer)){
                    System.out.println("Replace bulb!");
                }
                else{
                    System.out.println("Repair Lamp!");
                }    }     
                }
                
       
      
    }
    
}
