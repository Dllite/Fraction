package Fraction;
import java.util.Scanner;

public class Fraction {
	protected int num, den;
	
	Fraction(){
		this.num=0;
		this.den=1;
	}
	Fraction(int num, int den){
		this.num=num;
		this.den=den;
	}
	Fraction(Fraction F){
		num=F.num;
		den=F.den;
	}
	public Fraction addition(Fraction d) {
		Fraction A = new Fraction();
		//System.out.println(this.num + "/" + this.den + " = ");
		int a = this.num * d.den + this.den * d.num;
		int b = this.den * d.den;
		int c =simplifier(a, b);
		//System.out.println(c);
		A.num = a/c;
		A.den = b/c;
		return A;
	}
	public void show() {
		System.out.println("La fraction est :" +num + "/" + den);
		
	}
	public int simplifier(int a, int b){
		while(a!=b) {
			if(b>a) {
				b=b-a;
			}
			a-=b;
		}
		return b;
	}
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public void setDen(int den) {
		this.den=den;
	}
	
	public static void main(String[] args) {
		Fraction f = new Fraction(1, 2);
		f.setNum(2);
		f.setDen(4);
		
	}

}
