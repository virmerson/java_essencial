package calc;

public class BitWise {

	public static void main(String[] args) {
		
		int a =60;
		int b= 13;
		
		
		
		
		System.out.println("60 = "+  Integer.toBinaryString(a));
		System.out.println("13 = "+  Integer.toBinaryString(b));
		
		int c =  a&b;
		String binaryC = Integer.toBinaryString(c);
		int decimalC = Integer.parseInt(binaryC, 2);
		
		System.out.println("a&b = " + binaryC + " Decimal:" +  decimalC);
		
		c = a|b ;
		binaryC = Integer.toBinaryString(c);
		decimalC = Integer.parseInt(binaryC, 2);
		
		System.out.println("a|c= " + binaryC + " Decimal:" + decimalC );
		
		c = a^b ;
		binaryC = Integer.toBinaryString(c);
		decimalC = Integer.parseInt(binaryC, 2);
		
		System.out.println("a|c= " + binaryC + " Decimal:" + decimalC );
		
		 c =~a ;
		binaryC = Integer.toBinaryString(c);
	
		System.out.println(binaryC);
		System.out.println("~a= " + binaryC + " Decimal:" + c );
		
		c = a << 2;
		binaryC = Integer.toBinaryString(c);
		System.out.println(binaryC);
		System.out.println("a<<2= " + binaryC + " Decimal:" + c );
		
			
		System.out.println("-------- Deslocamento-----------");
		a = -60;
		
		/*c = a >> 2;  // Manter o sinal
		binaryC = Integer.toBinaryString(c);
		System.out.println("a=" + Integer.toBinaryString(a)+  " \na>>2= " + binaryC + " \nDecimal:" + c );
		*/
		
		c = a >>> 2; //Sem sinal
		binaryC = Integer.toBinaryString(c);
		System.out.println(binaryC);
		System.out.println("a=" + Integer.toBinaryString(a)+  " \n a>>>2= " + binaryC + " \nDecimal:" + c );
			
	
		
	}

}
