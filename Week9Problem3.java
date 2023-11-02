
public class Week9Problem3 {
	
	static int NoRepeat(int arr[], int a) {
		for (int i=0; i<a; i++) {
			int c;
			for (c=0; c<a; c++)
				if (i != c && arr[i] == arr[c])
					break;
			if (c == a)
				return arr[i];
			}
		return -1;
		}
	
	public static void main(String[] args) {
		int arr[] = {-1, 2, -1, 3, 0};
		int a = arr.length;
		int arrTwo[] = { 9, 4, 9, 6, 7, 4 };
		int b = arrTwo.length;
		System.out.println("The first number that does not repeat in Array One is: " + NoRepeat(arr, a));
		System.out.println("The first number that does not repeat in Array Two is: " + NoRepeat(arrTwo, b));
		}
}
