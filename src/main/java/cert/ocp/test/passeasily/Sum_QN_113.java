package cert.ocp.test.passeasily;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Sum_QN_113 extends RecursiveAction { // line n1
	static final int THRESHOLD_SIZE = 3;
	int stIndex, lstIndex;
	int[] data;

	public Sum_QN_113(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}

	protected void compute() {
		int Sum_QN_113 = 0;
		if (lstIndex - stIndex <= THRESHOLD_SIZE) {
			for (int i = stIndex; i < lstIndex; i++) {
				Sum_QN_113 += data[i];
			}
			System.out.println(Sum_QN_113);
		} else {
			new Sum_QN_113(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
			new Sum_QN_113(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
		}
	}

	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool ( );
		int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		fjPool.invoke (new Sum_QN_113 (data, 0, data.length));
	}
	
}