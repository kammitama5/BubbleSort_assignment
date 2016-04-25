
public class BubbleSort {

	public static void main(String[] args) {
		//this initializes an array of six integers
		int[] values = {23, 76, 15, 47, 38, 52};
		
		//let's print these out to show that there is no cheating.
		
		//System.out.println("The original sequence: "  );
		for (int i = 0; i < values.length; i++){
			//System.out.print(values[i] + ", ");
		}
		//System.out.println();
		//System.out.println();
		
		//Now let's sort these numbers using a bubble sort.
		SortEm(values);

	}
	static void SortEm(int[] array){
		//we need a temporary storage area for when we want to swap numbers.
		
		int temp;
		
		//this is the code that does the bubble sort.
		for (int i = array.length -1; i > 0; i--){
			for (int j = 0; j < i; j++){
				if (array[j] > array[j + 1]){
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		//Finally let's print out the sorted version of the array.
		//System.out.println("The new sequence: ");
		for (int i = 0; i < array.length; i++){
			//System.out.print(array[i] + ", ");
		}
	}

}
