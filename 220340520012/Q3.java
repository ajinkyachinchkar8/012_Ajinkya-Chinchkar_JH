 /*Java program to implement stack*/
 
  class Q3
  {
    static final int Max = 10;
	int a[]=new int[Max];
	int top;
	
	Q3(){
		top=-1;
	}
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
	boolean push(int x)
	{
		if(top>=Max-1)
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
		a[++top]=x;
		System.out.println(x+"  Push operation done  ");
		return true;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x = a[top--];
			return x;
		}
	}
	
	public static void main(String... args)
	{
		Q3 q1 = new Q3();
		q1.push(5);
		q1.push(10);
		q1.push(15);
		q1.push(11);
		q1.push(7);
		q1.push(40);
		
		System.out.println();
		System.out.println(q1.pop()+ "  Element is popped from stack");
	}
  }
  
		
		
	
 
 