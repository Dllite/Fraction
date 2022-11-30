package Fraction;

public class ViewFraction {

	public static void main(String[] args) {
	
			Fraction F1 = new Fraction(1,2);
			F1.show();
			Fraction F2 = new Fraction(3,2);
			F2.show();
			
			F1.addition(F2).show();
		
	}

}

/*

public class afficheFraction {

	public static void main(String[] args) {
		try {
			Fraction F1 = new Fraction(1,2);
			F1.show();
			Fraction F2 = new Fraction(3,2);
			F2.show();
			F1.add(F2).show();
			F2.setDen(0);
		}catch(denException e) {
			System.out.println("Denominateur = 0");
		}
	}
}
*/