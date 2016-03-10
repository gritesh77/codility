import java.util.*;

class Peaks {
	public int solution(int[] A) {
		int N = A.length;

		// Find all the peaks
		ArrayList<Integer> peaks = new ArrayList<Integer>();
		for (int i = 1; i < N - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1])
				peaks.add(i);
		}

		for (int size = 1; size <= N; size++) {
			if (N % size != 0)
				continue;
			int section = 0;
			int numGroups = N / size;
			boolean valid = true;
			
			for (int peak : peaks) {
				if (peak / size > section) {
					valid = false;
					break;
				}
				if (peak / size == section)
					section++;
			}
			if (section != numGroups)
				valid = false;
			if (valid)
				return numGroups;
		}
		return 0;
	}
}