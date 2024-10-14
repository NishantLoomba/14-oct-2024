import java.util.*;

public class CalS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		CalS calculator = new cals();
		switch(n){
			case 1:
			System.out.println(calculator.sum);
			break ;
			case 2:
			System.out.println(calculator.sub);
			break ;
			case 3:
			System.out.println(calculator.mul);
			break ;
			case 4:
			System.out.println(calculator.div);
			break ;
			
			default:System.out.println(0); 
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