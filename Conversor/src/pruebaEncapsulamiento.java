
public class pruebaEncapsulamiento {
	
	public static void main(String[] args) {
		DocConversion DocDolarPrueba = new DocConversion();
		Monedas denominacionPrueba = new Monedas();
		denominacionPrueba.setDenominacionMoneda("dolar");
		
		DocDolarPrueba.setDenominacion(denominacionPrueba);
		
		System.out.println(denominacionPrueba.getDenominacionMoneda());
		System.out.println(DocDolarPrueba.getDenominacion().getDenominacionMoneda());
	}

}
