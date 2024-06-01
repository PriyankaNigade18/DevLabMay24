package com.Week2;

public class OperatorsDemo {

	public static void main(String[] args)
	{

		System.out.println("***********Arithmetic Operators**********");
		int a=10,b=5;
//		System.out.println(a+b);
//		System.out.println(a+b+"Addition is");
//		System.out.println("Addition is: "+a+b);

		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		System.out.println("**********Unary Operators**********");
		/*
		 * Increment
		 * 
		 * post = x++
		 * x++ means x=x+1
		 * 
		 * 
		 * Pre =++x
		 *
		 * ++x means x=x+1
		 * 
		 * 
		 * 
		 */

		//post
		int c=100;
		System.out.println(c);//100
		System.out.println(c++);//100
		System.out.println(c);//101
		
		//pre
		int d=100;
		System.out.println(d);//100
		System.out.println(++d);//101
		
		int c1=90;
		int d1=c1++;
		System.out.println(c1);//91
		System.out.println(d1);//90
		
		int x=168;
		int y=x++;
		System.out.println(x);//169
		System.out.println(y);//168
		
		
		int s=65;
		int q=++s;
		System.out.println(s);//66
		System.out.println(q);//66
		
		
		
		int r=496;
		int i=++r;
		
		System.out.println(r);//497
		System.out.println(i);//497
		
		
		/*
		 * Decrement : -- decrement value by 1
		 * x-- post
		 * --x  Pre x=x-1 
		 * 
		 * 
		 */
		
		int a1=80;
		
		System.out.println(a1);//80
		System.out.println(a1--);//80
		
		System.out.println(a1);//79
		
		int b1=700;
		System.out.println(b1);//700
		System.out.println(--b1);//699
		
		
		int s1=68;
		int l1=s1--;
		System.out.println(s1);//67
		System.out.println(l1);//68
		
		int g=476;
		int j=--g;
		System.out.println(j);//475
		System.out.println(g);//475
		
		System.out.println("****************Relational operators*******************");
		//j=475 g=475 s1=67 a1=79 s=q=66
		
		System.out.println("less than <: "+(a1<g));//true
		System.out.println("less than equal to<=: "+(s<=s1));//true
		
		System.out.println("greter than >: "+(j>s1));//true
		System.out.println("greater than and equal to >=: "+(j>=g));//true
		
		System.out.println("equal to ==: "+(s==q));//true
		System.out.println("not equal to: "+(s1!=s));//ture
		
		System.out.println(s!=q);//false
		System.out.println(s>=s1);//false
		System.out.println(j>g);//false
		
		System.out.println("****************Logical operators*******************");

		/*
		 * a       b        a&&b           a||b      a!(Not)
		 * true   true      true            true	false
		 * 
		 * true   false     false			true 	false
		 * 	
		 * false  true      false			true    true
		 * 
		 * false  false     false			false   true
		 *  
		 * 
		 */
		
		System.out.println( s==q  &&  j==g);//true
		
		System.out.println( s!=q  &&  j==g);//false
		
		System.out.println(a1<g  && s!=q);//false
		
		System.out.println(j!=g && a1>=g);//false
		
		
		
		System.out.println( s==q  ||  j==g);//true
		
		System.out.println( s!=q  ||  j==g);//true
		
		System.out.println(a1<g  || s!=q);//true
		
		System.out.println(j!=g || a1>=g);//false
		
		
		System.out.println(j==g);//true
		System.out.println(!(j==g));//false
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
