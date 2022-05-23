
public class Uso_Arrays_Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matrix=new int[4][5];
		
		matrix[0][0]=4;
		matrix[0][1]=7;
		matrix[0][2]=10;
		matrix[0][3]=14;
		matrix[0][4]=15;
		
		matrix[1][0]=19;
		matrix[1][1]=24;
		matrix[1][2]=25;
		matrix[1][3]=26;
		matrix[1][4]=28;
		
		matrix[2][0]=33;
		matrix[2][1]=34;
		matrix[2][2]=39;
		matrix[2][3]=49;
		matrix[2][4]=56;
		
		matrix[3][0]=85;
		matrix[3][1]=87;
		matrix[3][2]=91;
		matrix[3][3]=96;
		matrix[3][4]=6;
		
		//System.out.println(matrix[1][3]);
		
		for(int i=0;i<4;i++){
			
			for(int j=0; j<5;j++){
				
				System.out.println("Valor de la posición "+i+","+j+" es igual a "+matrix[i][j]+" ");
				
			}
			
		}
		
		int[][] matrix2={
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		for(int[]fila:matrix2){
			System.out.println();
			for(int z:fila){
				System.out.print(z+" ");
			}
		}
	}
}
