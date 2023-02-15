package practicasu2;

public class cuadrosycubos {
	public static void main( String args[] )
	{
		
		 String[][] table = new String[11][];
	        table[0] = new String[] { "Numero", "cuadrado", "cubo" };
	        table[1] = new String[] { "1", ""+Math.pow(1, 2), ""+Math.pow(1, 3) };
	        table[2] = new String[] { "2", ""+Math.pow(2, 2), ""+Math.pow(2, 3) };
	        table[3] = new String[] { "3", ""+Math.pow(3, 2), ""+Math.pow(3, 3) };
	        table[4] = new String[] { "4", ""+Math.pow(4, 2), ""+Math.pow(4, 3) };
	        table[5] = new String[] { "5", ""+Math.pow(5, 2), ""+Math.pow(5, 3) };
	        table[6] = new String[] { "6", ""+Math.pow(6, 2), ""+Math.pow(6, 3) };
	        table[7] = new String[] { "7", ""+Math.pow(7, 2), ""+Math.pow(7, 3) };
	        table[8] = new String[] { "8", ""+Math.pow(8, 2), ""+Math.pow(8, 3) };
	        table[9] = new String[] { "9", ""+Math.pow(9, 2), ""+Math.pow(9, 3) };
	        table[10] = new String[] { "10", ""+Math.pow(10, 2), ""+Math.pow(10, 3) };

	        for (String[] row : table) {
	            System.out.format("%15s %15s %15s %n", row);
	        }
}
	
}
