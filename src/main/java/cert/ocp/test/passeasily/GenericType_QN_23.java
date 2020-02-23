/**
 * 
 */
package cert.ocp.test.passeasily;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author gain
 *
 */
public class GenericType_QN_23<K, V> {
	private K key;
	private V value;

	public GenericType_QN_23(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public static <T> GenericType_QN_23<T, T> twice(T value) {
		return new GenericType_QN_23<T, T>(value, value);
	}

	public K getKey() { return key; }

	public V getValue() {
		return value;
	}

	

	public static void main(String[] args) {

		GenericType_QN_23<?, ?> percentage = new GenericType_QN_23 <> (97, 32);
		int numbers[] = { 12, 13, 42, 32, 15, 156, 23, 51, 12 };
		int max = findMax(numbers);
	}

	static int findMax(int numbers[]) {
		int max = 0;
		/* code goes here */
		return max;
	}
}