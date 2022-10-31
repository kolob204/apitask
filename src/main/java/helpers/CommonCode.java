package helpers;

/**
 *
 * Вынесенные вспомогательные методы
 * 
 */
public class CommonCode {

	/**
	 * Сравнение двух массивов, независимо от порядка следования в них элементов
	 * Пример:
	 * [1,2,3] equals [3,2,1]
	 * В отличии от метода Arrays.equals(arr1, arr2), который выдаст [1,2,3] != [3,2,1] 
	 */
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;		
		for (int i = 0; i < arr1.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			if (!found)
				return false;
		}
		return true;
	}
	
}
