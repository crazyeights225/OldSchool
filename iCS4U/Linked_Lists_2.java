//Emma Sewell- Linked Lists Assignment 2
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.String;

public class Linked_Lists_2 {
     
	  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner dog=new Scanner(System.in);
        System.out.println("Enter your list:");
        
	    LinkedList<String> apple = new LinkedList<String>();
        String word = scan.nextLine();
        while ( !word.equalsIgnoreCase("quit") ) {
            apple.add(word);
            System.out.println ("saved " + word );
            word = scan.next();
           
            
        }
        System.out.println ("received " + word );
	 	
	  System.out.println("LinkedList contains : " + apple);
	  System.out.println("Your list contains "+apple.size()+" items");
	  
	  System.out.println("Enter an item you want to delete from the list: ");
	  String go=dog.nextLine();
	  while ( !go.equalsIgnoreCase("quit") ) {
       System.out.println ("will remove " + go );
          
	
	
	  int n=apple.size()-1;
	  
	  while(n>=0){
	 if(go.equals(apple.get((n)))){
		  apple.remove((n));   
	 }
	  n=n-1;
	  }
		  
	  
	
	  
	  System.out.println("Linked List now contains: "+apple);  
	  go = scan.next();
	  }
	  
	  System.out.println ("received " + go);
	 
	  dog.close();
	  
	  scan.close();
	  
	  }
	
	  }
	
/*Sample Output:
 * 
 * Enter your list:
1
saved 1
2
saved 2
3
saved 3
4
saved 4
1
saved 1
2
saved 2
3
saved 3
5
saved 5
6
saved 6
7
saved 7
3
saved 3
2
saved 2
13
saved 13
5
saved 5
568
saved 568
q35
saved q35
quit
received quit
LinkedList contains : [1, 2, 3, 4, 1, 2, 3, 5, 6, 7, 3, 2, 13, 5, 568, q35]
Your list contains 16 items
Enter an item you want to delete from the list: 
1
will remove 1
Linked List now contains: [2, 3, 4, 2, 3, 5, 6, 7, 3, 2, 13, 5, 568, q35]
2
will remove 2
Linked List now contains: [3, 4, 3, 5, 6, 7, 3, 13, 5, 568, q35]
4
will remove 4
Linked List now contains: [3, 3, 5, 6, 7, 3, 13, 5, 568, q35]
7
will remove 7
Linked List now contains: [3, 3, 5, 6, 3, 13, 5, 568, q35]
568
will remove 568
Linked List now contains: [3, 3, 5, 6, 3, 13, 5, q35]
3
will remove 3
Linked List now contains: [5, 6, 13, 5, q35]
5
will remove 5
Linked List now contains: [6, 13, q35]
quit
received quit
*/

	