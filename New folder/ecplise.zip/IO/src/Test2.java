class Test2
{
    // A method that takes variable number of intger
    // arguments.
	int x,y;
	Test2()
	{
		this(1,2);
		System.out.println("hi");
	}
	Test2(int x,int y)
	{
		//this();
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
		
	}
    static void fun(int ...a)
    {
        System.out.println("Number of arguments: " + a.length);
 
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
    static void fun(int a,int b)
    {
       System.out.println("Number of arguments: " +a+"b="+b);
 
        // using for each loop to display contents of a
        
    }
 
 
    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with different number
        // of parameters
       // fun(100);         // one parameter
    	Test2 t=new Test2(1,2);
        fun(1, 2);  // four parameters
        //fun();            // no parameter
    }
}