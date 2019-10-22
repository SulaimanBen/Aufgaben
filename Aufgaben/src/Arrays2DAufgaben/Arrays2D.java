package Arrays2DAufgaben;

public class Arrays2D {
	
	public static void main(String[] args) {
		
		Arrays2D ob= new Arrays2D();
		 int[][] arr=ob.createArray(4,5);
		 
		 ob.printArray(arr);
		 System.out.println("**********************************");
		 
		 arr[1][1]=5;
		 ob.printArray(arr);
		 System.out.println("**********************************");
		 
		
		
	}
	
	 int[][] createArray(int d1, int d2){
		
		return new int[d1][d2];
	}
	 
	 void printArray(int[][] array) {
		 
		 for(int[] arr : array) {
			 for(int arr2 : arr)
			 System.out.print(arr2);
			 System.out.println();
	 }
	 }

}
