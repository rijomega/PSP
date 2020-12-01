package practica_UT02;

public class lanzador {
	
	public static void main(String[]args) {
		
		Cajero cajero = new Cajero();	
		
		//hilos usuarios.
		
		Thread cliente1=new Thread(cajero,"Pedro");
		Thread cliente2=new Thread(cajero,"Oscar");
		Thread cliente3=new Thread(cajero,"Pablo");
		
		cliente1.start();
		cliente2.start();
		cliente3.start();		
	}
}
