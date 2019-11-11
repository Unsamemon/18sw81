
class BinString{ 

	static int binarySearch(String[] arr, String x) 
	{ 
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int p = l + (r - l) / 2; 

			int res = x.compareTo(arr[p]); 

			if (res == 0) 
				return p; 

			if (res > 0) 
				l = p + 1; 

			else
				r = p - 1; 
		} 

		return -1; 
	} 
 
	public static void main(String []args) 
	{ 
		String[] arr = { "dead", "groom", "loath", "pop"}; 
		String x = "loath"; 
		int result = binarySearch(arr, x); 

		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
} 
