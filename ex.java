package calculator;
import calculator1.*;
import java.util.*;
public class ex
{
	public static void main(String[] args)
	{
		cal c=new cal();
		Scanner sc=new Scanner(System.in);
		int a,b;
		char ch;
		a=sc.nextInt();
		b=sc.nextInt();
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case '+':c.add(a,b);
					 break;
			case '-':c.sub(a,b);
					 break;
			case '*':c.mul(a,b);
					 break;
			case '/':c.div(a,b);
			         break;
			default:System.out.println("Invalid choice");
		}
	}
}