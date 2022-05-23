
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mi_matriz=new int[5];
		
		mi_matriz[0]=4;
		mi_matriz[1]=7;
		mi_matriz[2]=19;
		mi_matriz[3]=24;
		mi_matriz[4]=28;
		
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		System.out.println("");
		
		for(int i=0;i<5;i++){
			
			System.out.println("Valor del indice "+i+" = "+mi_matriz[i]);
			
		}
		
		int [] mi_matriz2={34,49,10,12,14,87,85,56,26,6};
		
		System.out.println("");
		
		for(int i=0;i<mi_matriz2.length;i++){
			
			System.out.println("Valor del indice "+i+" = "+mi_matriz2[i]);
		
		}
	}
}
