package com.amdocs;

public class AlgorithmFactory {
	
	public static IAlgorithm getAlgorithm(int algo) {
		
		IAlgorithm algorithm = null;
		
		if (algo==2)
			algorithm = new QuickSort();
		
		else if(algo==1)
			algorithm = new BubbleSort();
		
		else
			algorithm = new NullAlgorithm();
		
		
		return algorithm;
	}

}
