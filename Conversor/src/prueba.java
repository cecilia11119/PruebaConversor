import javax.swing.*;

public class prueba {

	public static void main(String[] args) {
		String[] options = {"Conversor de Temperatura", "Conversor de moneda"};
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String n = (String)JOptionPane.showInputDialog(null, "Seleccionar", 
                "Seleccionar", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        
        if(n == "Conversor de moneda") {
        	
        	String[] opciones = {"dolar", "euro", "peso"};
            ImageIcon icono = new ImageIcon("src/images/turtle32.png");
            String monedaExt = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de moneda a cambiar:", 
                    "Cambiar soles a moneda extranjera ", JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[2]);
            
            //ingresa la cantidad
        	double efectivo;
    		efectivo = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir"));
        	
        		if(monedaExt == "dolar"){
        			DocConversion dolar = new DocConversion();
        			//dolar.tipoDeCambio = 3.72;
        			dolar.setTipoDeCambio(3.72);
        			dolar.convertir(efectivo);
        			System.out.println(monedaExt);
        			JOptionPane.showMessageDialog(null, "Tiene: "+ dolar.getResultado() + " dolares");
        			
        			
        			int resp=JOptionPane.showConfirmDialog(null,"Desea continuar?");
        		      if (JOptionPane.OK_OPTION == resp){
        		    	  
        		    	  
        		    	  
        		    	          		    	  
        		   System.out.println("Selecciona opción Afirmativa");
        		 }
        		      else{
        		    	  JOptionPane.showMessageDialog(null,"Programa terminado");
        		    	  
        		    System.out.println("No selecciona una opción afirmativa");
        		   }
    		
        		      
        		} else {
        				
        			
        			if(monedaExt == "euro"){
        					DocConversion euro = new DocConversion();
        					euro.setTipoDeCambio(3.99);
        					euro.convertir(efectivo);
        					System.out.println(monedaExt);
        					JOptionPane.showMessageDialog(null, "Tiene: "+ euro.getResultado() + " euros");
        		
        				} else {
        					DocConversion peso = new DocConversion();
        					peso.setTipoDeCambio(0.19);
        					peso.convertir(efectivo);
        					System.out.println(monedaExt);
        					JOptionPane.showMessageDialog(null, "Tiene: "+ peso.getResultado() + " pesos");
        				}
        		}
        	
        } else {  
        	
        	
                System.out.println("ingreso a conversor de temperatura");
            }
        
       }
	
	private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
}

