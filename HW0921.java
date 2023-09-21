public class HW0921 {
	//
	final static int MAX_STACK_SIZE = 5;
	public static int[] arr = new int [MAX_STACK_SIZE];
    public static int temp = 5;

	public static boolean isFull() {
        if(top()==MAX_STACK_SIZE-1)
        {
            System.out.println("The Stack is FULL!!!");
            return true;
        }
        return false;
	}
	
	public static boolean isEmpty() {
        if(top()<0)
        {
            System.out.println("The Stack is EMPTY!!!");
            return true;
        }
		return false;
	}
	
	public static void push(int theElement) {
        if(isFull()); //System.out.println("The Stack is FULL!!!");
        else
        {
            int c = top()+1;
            arr[c] = theElement;
            temp--;   
        }
	}
	
	public static void pop() {
        //System.out.println("POP!!");
        if(isEmpty())
        {
            //System.out.println("The Stack is EMPTY!!!");
        }
        else temp++; 
	}
	
	public static int top() 
    {
        int count = -1;
        if(arr==null)
        {
            return -1;
        }
        else
        {
            for(Integer a : arr)
            {
                if(a!=null)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            return count-temp;
        }
	}
	
	public static void popall() {
        for(Integer a : arr)
        {
            if(isEmpty());
            else
            {
            System.out.println(arr[top()]);
            pop();     
            }      
        }
		// print the top and then pop it until the stack is empty
	}
	
	public static void main(String args[]) {
		
		// the following codes are used for test
		// please do not modify the following codes
		push(1);
		push(2);
		push(3);
		System.out.println(top());
		pop();
		push(4);
		push(5);
		push(6);
		push(7);
		push(8);
		pop();
		popall();
		pop();
		// Final Output should be like:
		// 3
		// The Stack is FULL!!!
		// The Stack is FULL!!!
		// 5
		// 4
		// 2
		// 1
		// The Stack is EMPTY!!!
		// The Stack is EMPTY!!!
	}
}