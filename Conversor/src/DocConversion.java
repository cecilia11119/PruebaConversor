
	class DocConversion {

	private Monedas denominacion = new Monedas();
	private Double tipoDeCambio;
	private Double efectivo;
	private Double resultado;
	//variable que va a contar el codigo cada instancia
	private static int total = 0;
	
	public DocConversion() {
		
	}
	//constructor asegura q no se grabe sin un numero mayor a cero
	public DocConversion(Double efectivo) {
		if (efectivo <= 0) {
			System.out.println("no se permiten ceros");
			this.efectivo = 0.0;
		}else {
			this.efectivo = efectivo;
		}
		
		total++;
		//System.out.println("Aqui se crea un nuevo documento");
		System.out.println("se van creando: " + total + " cuentas");
	}
	
	
	public void convertir(double valor) {
		this.resultado = valor / this.tipoDeCambio;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	
	public void setTipoDeCambio(double tipoDeCambio) {
		if (tipoDeCambio > 0) {
			this.tipoDeCambio = tipoDeCambio;	
		} else {
			System.out.println("la cantidad ingresada es menor a cero");
		}
	}
	
	
	public void setEfectivo(double efectivo) {
		if (efectivo > 0) {
			this.efectivo = efectivo;	
		} else {
			System.out.println("la cantidad ingresada es menor a cero");
		}
		
	}
	
	
	public Double getEfectivo() {
		return efectivo;
	}
	
	
	public void setDenominacion(Monedas denominacion) {
		this.denominacion = denominacion;
	}

	public Monedas getDenominacion() {
		return denominacion;
	}
	
	
	public static int getTotal() {
		return DocConversion.total;
	}
	
	
	
	
	
}

