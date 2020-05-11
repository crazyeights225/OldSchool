
public class Arrays_3 {
	public static void main(String []args){
		
	}
	public static int[] createWedge(int n) {
	    int[] arr = new int[n+n-1];
	    for (int i = 0; i < n; i++)
	         arr[i] = i + 1;
	    for (int g = n - 1, j = n; g > 0; g--, j++)
	         arr[j] = g;
	    return arr;
	}
	}

