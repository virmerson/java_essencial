package calc;

public class Logic {

	public static void main(String[] args) {
		
		boolean itsRaining = true;
		
		boolean itsThunder = false;
		
		boolean johnWeeps = !itsRaining || itsThunder;

		System.out.println(johnWeeps);
		
		
	}

}
