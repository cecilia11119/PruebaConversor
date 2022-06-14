
public class PruebaVariablesStatic {
 
	public static void main(String[] args) {
		
		DocConversion DocContador1 = new DocConversion(555.0);
		DocConversion DocContador2 = new DocConversion(444.0);
		DocConversion DocContador3 = new DocConversion(333.0);
		
		System.out.println(DocConversion.getTotal());
	}
	
}
