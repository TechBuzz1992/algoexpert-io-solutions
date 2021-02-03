public class Longest_Peak {
	public static int longestPeak(int[] array) {
		int longestPeakLength = 0;
		int i = 1;
		while (i < array.length - 1) {
			boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];
			if (!isPeak) {
				i += 1;
				continue;
			}
			int leftIdx = i - 2;
			while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
				leftIdx -= 1;
			}

			int rightIdx = i + 2;
			while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
				rightIdx += 1;
			}
			int currentPeaklength = rightIdx - leftIdx - 1;
			if (currentPeaklength > longestPeakLength) {

				longestPeakLength = currentPeaklength;

			}
			i = rightIdx;

		}
		return longestPeakLength;
	}
}
