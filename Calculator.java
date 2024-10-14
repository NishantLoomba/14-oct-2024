import java.util.*;

public class Calculator{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(n==1){
			System.out.println(sum);
		}
		else if(n==2){
			System.out.println(sub);
        }
		else if(n==3){
			System.out.println(mul);
        }
		else if(n==4){
			System.out.println(div);
        }
		else{
			System.out.println(0);
        }
		
	}
	 public int sum(int a , int b){
		 return a+b;
	 }
	 public int sub(int a , int b){
		 return a-b;
	 }
	 public int mul(int a , int b){
		 return a*b;
	 }
	 public int div(int a , int b){
		 return a/b;
	 }
}