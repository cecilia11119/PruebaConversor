import javax.swing.*;

public class pruebaConversor {

	public static void main(String[] args) {
		
        boolean ProgramaFinaliza = false;
        while (!ProgramaFinaliza) {
        	//ingresa tipo de conversor
		String[] options = {"Conversor de Temperatura", "Conversor de moneda"};
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String n = (String)JOptionPane.showInputDialog(null, "Seleccionar", 
                "Seleccionar", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        
        if(n == "Conversor de moneda") {
        	//ingresa tipo de moneda
        	String[] opciones = {"dolar", "euro", "peso"};
            ImageIcon icono = new ImageIcon("src/images/turtle32.png");
            String monedaExt = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de moneda a cambiar:", 
                    "Cambiar soles a moneda extranjera ", JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[2]);
            String error="";
            double efectivo = 0;
            
            do {
            	
            	try {
                    	//ingresa la cantidad
                     	efectivo = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir"));
                     	error = "";
                     	
                     	
                     }catch(NumberFormatException e) {
    				error = e.toString();
    				JOptionPane.showMessageDialog(null, "Ingrese un número válido!");
                     }
            	
            }while(error != "");
            
    		//llama metodo hace el calculo
            switch(monedaExt) {
                case "dolar":
                	if(monedaExt == "dolar"){
            			DocConversion dolar = new DocConversion();
            			dolar.setTipoDeCambio(3.72);
            			dolar.convertir(efectivo);
            			
            			double numFormt = formatearDecimales( (dolar.getResultado()), 2);
            			System.out.println(numFormt);
            			JOptionPane.showMessageDialog(null, "Tiene: "+ numFormt + " dolares");
            			
                	}
                	int resp=JOptionPane.showConfirmDialog(null,"Desea continuar?");
      		      	if (JOptionPane.OK_OPTION == resp){      		    	          		    	  
      		      		System.out.println("Selecciona opción Afirmativa");
      		      	break;
      		      	}
      		      	else{
      		    	  JOptionPane.showMessageDialog(null,"Programa terminado");
      		    	ProgramaFinaliza =true;
      		    	  System.out.println("No selecciona una opción afirmativa");
      		    	break; 
      		      	}
            		
                case "euro":
                	if(monedaExt == "euro"){
            			DocConversion euro = new DocConversion();
            			euro.setTipoDeCambio(3.99);
            			euro.convertir(efectivo);
            			JOptionPane.showMessageDialog(null, "Tiene: "+ euro.getResultado() + " euros");
                	}
                	int resp2=JOptionPane.showConfirmDialog(null,"Desea continuar?");
      		      	if (JOptionPane.OK_OPTION == resp2){      		    	          		    	  
      		      		System.out.println("Selecciona opción Afirmativa");
      		      	break;
      		      	}
      		      	else{
      		    	  JOptionPane.showMessageDialog(null,"Programa terminado");
      		    	ProgramaFinaliza =true;
      		    	  System.out.println("No selecciona una opción afirmativa");
      		    	break; 
      		      	}
                	
                case "peso":
                	if(monedaExt == "peso"){
            			DocConversion peso = new DocConversion();
            			peso.setTipoDeCambio(3.99);
            			peso.convertir(efectivo);
            			JOptionPane.showMessageDialog(null, "Tiene: "+ peso.getResultado() + " pesos");
                	}
                	int resp3=JOptionPane.showConfirmDialog(null,"Desea continuar?");
      		      	if (JOptionPane.OK_OPTION == resp3){      		    	          		    	  
      		      		System.out.println("Selecciona opción Afirmativa");
      		      	break;
      		      	}
      		      	else{
      		    	  JOptionPane.showMessageDialog(null,"Programa terminado");
      		    	ProgramaFinaliza =true;
      		    	  System.out.println("No selecciona una opción afirmativa");
      		    	break; 
      		      	}
                default:
                   // System.out.println("numero fuera de rango.. lee");
                    JOptionPane.showMessageDialog(null, "error fuera de rango.. lee");
                            
                }
        
        }   else {  
        	
            System.out.println("ingreso a conversor de temperatura");
        }
            
        }
        
	}

	private static double formatearDecimales(double numero, int numeroDecimales) {
		// TODO Auto-generated method stub
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}
		
}

