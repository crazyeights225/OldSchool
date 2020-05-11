//Emma Sewell- Linked list exercise 1
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.String;

public class Linked_Lists_1 {
   
	  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your list:");
        
	    LinkedList<String> apple = new LinkedList<String>();
	   
        String word = scan.next();
        while ( !word.equalsIgnoreCase("quit") ) {
            apple.add(word);
            System.out.println ("saved " + word );
            word = scan.next();
         
            
        }
        System.out.println ("received " + word );
	 	
	  System.out.println("LinkedList contains : " + apple);
	  System.out.println("Your list contains "+apple.size()+" items");
	  
	  scan.close();
	
	  }
	}
	