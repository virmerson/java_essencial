package types;

public class MainProgram {

	public static void main(String[] args) {
	
		//George Boole
		boolean a =false;
		boolean b =  true;
		//boolean c =  10;
		
		char gender = 'm'; //16 bits 0000000000000000
		char ch = 'f';
		
		System.out.println(ch);
		
		byte n1 = 127; //8 bits (-128 / + 127)
		System.out.println(n1);
		
		short n2 = 'a'; //16 bits (-32768 / 32767 )
		System.out.println(n2);
		
		short n3= 10; 
		System.out.println(n3);
		
		int n4 = 10000; // 32 bits  ( -2 ^ 31 / 2 ^ 31 -1) 
		Integer n4_w =new Integer(10000);
		Integer n4_w2 = 10000; //new Integer(1000)
		
		long n5 =9000000L; //64 bits ( -2 ^ 63 / 2 ^ 63 -1)  
		Long n5_w =  new  Long(9000000);	
		Long n5_w2= 900000L;
		//floating point
		
		float n6 = 10.5f;  // 32 bits
		
		double n7 = 45.8d; // 64 bits 
		
		
	}

}
