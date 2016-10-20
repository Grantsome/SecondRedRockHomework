import java.io.*;
import java.util.Scanner;
import java.math.*;
import java.util.*;



class FirstHomeWorkEncapsulation{
	private BigInteger number ;
	private int first;
	private int last;
	
	public BigInteger getnumber(){
		return number;
	}
	
	public void setnumber(){
		this.number = number;
	}
	
	public int getfirst(){
		return first;
	}
	
	public void setfirst(){
		this.first = first;
	}
	
	public int getlast(){
		return last;
	}
	
	public void setlast(){
		this.last = last;
	}
	
	public static BigInteger calculate(BigInteger number , int first , int last){
		int number1 = 1;
		int number2 = 1;
		int number3 = 1;
		String s1 = number1 + "";
		String s2 = number2 + "";
		String s3 = number3 + "";
        BigInteger i = new BigInteger(s1);
		BigInteger m = new BigInteger(s3);
        BigInteger F = new BigInteger(s2);
		for(; i.compareTo(number) != 1;i = i.add(m)){
			F = F.multiply(i);
		}
		return F;
		
		//char[] F_c = F.toString().toCharArray();
		
	}
	public static void print(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		BigInteger number = input.nextBigInteger();
		System.out.println("Enter the first number of digits:");
		int first = input.nextInt();
		System.out.println("Enter the last number of digits");
		int last = input.nextInt();
	    calculate(number,first,last);
	    BigInteger a = new BigInteger("1");
		a = calculate(number,first,last);
		System.out.println("此时的" + number + "！的阶乘为:" + a);
		char[] F_a =a.toString().toCharArray();
		System.out.print("输出的对应位数为:");
		try{
        for(int j = first-1 ; j <= last-1; j++ ){
		    System.out.print(F_a[j]);
		    }
	    }
	    catch(Exception e){
		    System.out.println(e);
	    }
    }
	
	public static void main(String args[]){
		print();	
	}
}

































/*class FirstHomeWork{
	public static void main(String args[]){
		BigInteger sum = new BigInteger("1");
		for(int i = 2888 ; i > 0 ; i--){
			sum = sum.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println(sum.toString().substring(910.940));
	}
*/