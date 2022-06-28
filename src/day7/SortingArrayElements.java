package day7;

import java.util.Arrays;

public class SortingArrayElements {

	public static void main(String[] args) {

		//int a[] = {100,500,250,400};
		
		String s[]= {"abc", "bbc", "axc", "cdx"};
		System.out.println("Before Sorting:"+Arrays.toString(s));  //Before Sorting:[100, 500, 250, 400]

		Arrays.sort(s);  //sort elements
		System.out.println("After Sorting:"+Arrays.toString(s));  //After Sorting:[100, 250, 400, 500]

	}

}
