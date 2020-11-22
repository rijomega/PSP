public class Sumatorio {
	public int sumar(int numero1, int numero2){
        int resultado=0;
        for (int i=numero1;i<=numero2;i++){
                resultado=resultado+i;
        }
       return resultado;        
    }
	 public static void main(String[] args){
         Sumatorio s=new Sumatorio();
         int numero1=Integer.parseInt(args[0]);
         int numero2=Integer.parseInt(args[1]);
         int resultado=s.sumar(numero1, numero2);
         System.out.println("El resultado es:");
         System.out.println(resultado);
     }
}
