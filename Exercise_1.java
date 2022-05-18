// "static void main" must be defined in a public class.
class St { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==-1)
            return true;
        else
            return false;
    } 

    St() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        top++;
        if(top+1>MAX){
            System.out.println("Stack Overflow error");
            return false;
        }
        else{
            a[top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int res=a[top];
            top--;
            return res;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top];
        }
    } 
}
public class Main {
    public static void main(String[] args) {
        St s = new St(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    }
}
