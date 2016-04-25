
//Krystal Maughan prediction for algorithm (Bubble Sort)
//10 000 samples takes .15 seconds
//100 000 samples takes (10^2) seconds (because of n^2 quadratic native algorithm)
//therefore I expect the algorithm to be 100 times the size of 10 000 value
// or 15 seconds
// actual value was 17.4 seconds



import java.util.Random;

public class BubbleSortTiming {

	public static void main(String[] args) {
final int EXPERIMENTS = 10;
		
		//number of samples is 10 000
		
		final int N = 150000;
		
		int[] array = new int[N];
		
		//populate the array
		
		Random rand = new Random();
		
		// start and stop system and measure how much time
		
		long totalLapTime = 0L;
		
		for (int i = 0; i < EXPERIMENTS; i++)
		{
			for (int j = 0; j < N; j++)
				array[j] = rand.nextInt();
		long start, finish;
		start = System.currentTimeMillis();
		BubbleSort.SortEm(array);
		finish = System.currentTimeMillis();
		//print out value in long
		long lapTime = finish - start;
		totalLapTime += lapTime;
		System.out.println("Total time: " + lapTime / 1000.0 + " seconds");
		}
		System.out.println("Average time: " + totalLapTime / 1000.0 / EXPERIMENTS + " seconds");
	}

}