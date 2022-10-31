package helpers;

import java.util.Arrays;

/**
 *
 * Вынесенные вспомогательные методы
 * 
 */
public class CommonCode { 
 
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
}
