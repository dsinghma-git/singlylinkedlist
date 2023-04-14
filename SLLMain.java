// Java implementation of singly linked list
// this is lab 1 for BIM 4th Semester

import java.util.Scanner;

class SLLNode {

	public int info;
	public SLLNode next;
	
	public SLLNode()
	{
		info = 0;
		next = null;
	}
}

class SLL {
  protected SLLNode first, last;
  public SLL()
  {
	  first = null;
	  last  = null;
  }
  
  public void insertBeg(int item)
  {
	  SLLNode newnode = new SLLNode();
	  newnode.info = item;
	  	  
	  if(first == null)   // when list is empty
	  {
		   first = newnode;
		  last = newnode;
	   }
	  else  // list has some nodes
	  {
		  newnode.next = first;
		  first = newnode;
		  
	  }
  } // end of insertBeg
  
  
  public void insertEnd(int item)
  {
	  SLLNode newnode = new SLLNode();
	  newnode.info = item;
	  
	  if(first == null)
	  {
		  newnode.next = null;
		  first = newnode;
		  last = newnode;
	  }
	  else
	  {
		  newnode.next = null;
		  last.next = newnode;
		  last = newnode;
		  
	  }
  }// end of the method insertEnd

  public void insertPos( int item)    {
		int pos,i;
		SLLNode newnode  = new SLLNode();
		SLLNode temp  = new SLLNode();
		newnode.info = item;
	   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position to add a new node");
	                   pos = sc.nextInt();
      
	     if(first == null) {
	 	   System.out.println("Cannot be inserted");
		  }
	      else
	      {
		   temp = first;
		   for(i=1;i<pos-1;i++)
	             temp = temp.next;
	        newnode.next = temp.next;
		    temp.next = newnode;
		  
	      }
	     
	}

  public void deleteFirst()
  {
	  if(first ==null)
		  System.out.println("The list is empty.");
	  else if(first == last)
	  {
		  System.out.println("\n The deleted item is "+ first.info);
		  first = null;
		  last = null;
	  }
	  else
	  {
		  System.out.println("\n The deleted item is "+ first.info);
		  first = first.next;
	  }
  } // end of the deleteFirst method
  
  public void deleteLast()
  {
	  if(first== null)
	  { 
		  System.out.println(" The list is empty.");
	  }
	  else if(first == last)
	  {
		  
		  System.out.println("\n The deleted item is "+ first.info);
		  first = null;
		  last = null;	  
	  }
	  else
	  {
		 
		  SLLNode temp = first;
		  while(temp.next != last)
		  {
			  temp = temp.next;
		  }
		  temp.next = null;
		  last = temp;
	  }
    } // end of method deleting at the end 
  
  
public void deletePos()    {
		int pos,i;
		SLLNode temp;
		SLLNode hold;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position to add a new node");
	    pos = sc.nextInt();
        if(first == null)
         	 System.out.println("list is empty");
	  	 else
       	{
		   temp = first;
		   for(i=1;i<pos-1;i++)
	           temp = temp.next;
	        hold = temp.next;
		    temp.next =  hold.next;
		   
         }
       	}
  
  
  public void display()
  {
	  if(first == null)
		  System.out.println("The list is empty");
	  else
	  {
		  System.out.println("The list elements are:");
		  
		  SLLNode temp = first;
		  
		  while(temp != null)
		  {
			  System.out.print(temp.info + "\t");
			  temp = temp.next;
		  }
		 
	  }	  
  }  // end of the method display()
  
  public void search(int key)
  {
      if(first == null)
        	 System.out.println("list is empty");
      else
    	{
    	  SLLNode temp = first;
    	  while(temp !=  null) {
            if(temp.info == key)
            {
            	System.out.println("Search Successful");
            	break;
            }
          	temp = temp.next;
    	  }
    	  if(temp==null)
    		  System.out.println("Unsuccessful Search");
    	}

  }  // end of the method search()
  
} // end of the class



public class SLLMain {
	public static void main(String[] args) {
		int choice;
		int item; 
		int key;   
		
		Scanner sc = new Scanner(System.in);
		
		SLL sl = new SLL();
		
		System.out.println("1. Insert at Beginning ");
		System.out.println("2. Insert at End ");
		System.out.println("3. Insert at Position");
		System.out.println("4. Delete at Beginning ");
		System.out.println("5. Delete at End ");
		System.out.println("6. Delete at Position");
		System.out.println("7. Display ");
		System.out.println("8. Search ");
		
		do 
		{
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
		System.out.println("Enter data item to be inserted ");
		 item = sc.nextInt();
		 sl.insertBeg(item);
		 break;
				case 2: 
						System.out.println("Enter data item to be inserted ");
						item = sc.nextInt();
						sl.insertEnd(item);
						break;
				case 3:
						System.out.println("Enter data item to be inserted ");
						item = sc.nextInt();
						sl.insertPos(item);
						break;
				case 4:
					   sl.deleteFirst();
					   break;
				case  5:
					   sl.deleteLast();
					   break;
				case 6:
					   sl.deletePos();
					   break;
				case 7:
					  sl.display();
					  break;
				case 8:
					   System.out.println("Enter the search item ");
					   key = sc.nextInt();
					   sl.search(key);
					   break;
			    default:
			    	  System.out.println(" Invalid choice !");
		   }
		}
		while(choice <9);
			
	}  // end of the main

} // end of SLLMain class