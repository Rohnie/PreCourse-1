public class StackAsLinkedList { 
  
    StackNode root;
    StackNode lastNode;
    StackNode prevNode;
    int count;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data=data;
        } 
    } 
  public void StackAsLinkedList(){
	  lastNode=new StackNode(-1);
	  count=0;
  }
    
	
    public boolean isEmpty() 
    { 
        return (count==0);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.

	 lastNode.next = new StackNode(data);
	 prevNode=lastNode;
	 lastNode=lastNode.next;
	 count++;
	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(count==0){
		   System.out.println("Stack Underflow");
	   }
	   else{
		   prevNode.next=null;
		   count--;
		   return lastNode.val;
	   }   
		   
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	    if(count==0){
		   System.out.println("Stack Underflow");
	   }
	   else{
		   return lastNode.val;
	   }  
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
