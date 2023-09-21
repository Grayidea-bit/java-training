public class Hello{

	final static int MAX_STACK_SIZE = 5;
    public static int[] arr = new int [MAX_STACK_SIZE];
    public static int temp = 5; 
    public static void push(int theElement) 
    {
        //System.out.println(top());
        int c = top()+1;
        arr[c] = theElement;
        temp--;
        //return arr;
	}

    public static boolean isEmpty() 
    {
        //System.out.println(arr);
        if(arr==null)
        {
            System.out.println("The Stack is EMPTY!!!");   
            return true;
        }
        return false;
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
	    

    public static void main(String args[])
    {
        push(1);
		push(2);
		push(3);
		System.out.println(top());

        //System.out.println("Hello Java");
        //System.out.println("New program");
        //System.out.println(20000000000L);
        //add L : int -> long
        //System.out.println(3.14159268F);
        //add F : double -> float(4-5)
        //''->char ""->string  
    }
}