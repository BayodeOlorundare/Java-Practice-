import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] x = {1,5,7,15,24,12,14,13,4,2,23};
		System.out.println("The sum of even numbers in the array is" + " " + evenSum(x)+".");
		System.out.println("The sum of odd numbers in the array is" + " " + oddSum(x)+".");
		System.out.println("The min number in the array is" + " " + findMin(x)+".");
		System.out.println("The max number in the array is" + " " + findMax(x)+".");
		
		if(hasEven(x))
			System.out.println("The min even number is " + findminEven(x) + ".");
		else
			System.out.println("There are no even numbers.");
		
		if(hasEven(x))
			System.out.println("The max even number is " + findmaxEven(x) + ".");
		else
			System.out.println("There are no even numbers.");
		
		if(hasOdd(x))
			System.out.println("The min odd number is " + findminOdd(x) + ".");
		else
			System.out.println("There are no odd numbers.");
		
		if(hasOdd(x))
			System.out.println("The max odd number is " + findmaxOdd(x) + ".");
		else
			System.out.println("There are no odd numbers.");
		
		System.out.println("The average of the odd numbers in the array is " + " " + findoddAvg(x) +".");
		System.out.println("The average of the even numbers in the array is " + " " + findevenAvg(x) +".");
		
	}
	
	public static int evenSum(int [] x){
		int sum = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 == 0)
				sum = sum + x[i];
		}
		return sum;
	}
	public static int oddSum(int [] x){
		int sum = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 == 1)
				sum = sum + x[i];
		}
		return sum;
	}
	public static int findMin(int [] x){
		int min = x[0];
		for(int i = 0; i < x.length; i++){
			if(x[i] < min)
				min = x[i];
		}
		return min;
	}
	public static int findMax(int [] x){
		int max = x[0];
		for(int i = 0; i < x.length; i++){
			if(x[i] > max)
				max = x[i];
		}
		return max;
	}
	public static boolean hasEven(int [] x){
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 == 0)
				return true;
		}
		return false;		
	}
	public static boolean hasOdd(int [] x){
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 == 1)
				return true;
		}
		return false;		
	}
	public static int findminEven(int [] x){
		boolean flag = false;
		int min = 0;
		for(int i = 0; i < x.length; i++){
			if(flag == false){
				if(x[i] % 2 == 0){
					min = x[i];
					flag = true;
				}
				
			}
			else if (x[i] % 2 == 0 && x[i] < min)
				min = x[i];
		}
		return min;
	}
	public static int findmaxEven(int [] x){
		boolean flag = false;
		int max = 0;
		for(int i = 0; i < x.length; i++){
			if(flag == false){
				if(x[i] % 2 == 0){
					max = x[i];
					flag = true;
				}
				
			}
			else if (x[i] % 2 == 0 && x[i] > max)
				max = x[i];
		}
		return max;
	}
	public static int findmaxOdd(int [] x){
		boolean flag = false;
		int max = 0;
		for(int i = 0; i < x.length; i++){
			if(flag == false){
				if(x[i] % 2 == 1){
					max = x[i];
					flag = true;
				}
				
			}
			else if (x[i] % 2 == 1 && x[i] > max)
				max = x[i];
		}
		return max;
	}
	public static int findminOdd(int [] x){
		boolean flag = false;
		int min = 0;
		for(int i = 0; i < x.length; i++){
			if(flag == false){
				if(x[i] % 2 == 1){
					min = x[i];
					flag = true;
				}
				
			}
			else if (x[i] % 2 == 1 && x[i] < min)
				min = x[i];
		}
		return min;
	}
	//Average mean was found
	public static double findoddAvg(int [] x){
		int total = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 == 1){
				total++;
			}
		}
		//oddSum was casted with double class to return proper answer
		return (double)oddSum(x) / total;	
	}
	public static double findevenAvg(int [] x){
		int total = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 == 0)
				total++;				
			
		}
		//evenSum was casted with double class to return proper answer
		return (double)evenSum(x) / total;
	}
	
}
