
public class RecursiveAndMain {

	public class fibonacci {
	}

	public static int fib(int m) { 
				if (m <= 1)
			return m;
		
		else
			return fib(m - 1) + fib(m - 2); 

	}

	public static void main(String[] args) { 
		
		int n = 10; 
			
		if (n < 0) 

			System.out.println("Fibonacci number is not defined");
		else
			System.out.println("The nth term of the fibonacci sequence is ");
		System.out.println(fib(n)); 

	}
}
