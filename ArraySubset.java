
public class ArraySubset {

	public static void main(String[] args) {
		
		int [] arr1 = { 11,1,13,21,7,3 };
		int [] arr2 = { 11,3,7,1 };
		
		int m = arr1.length;
		int n = arr2.length;
		
		if(isSubset(arr1,arr2,m,n))
			System.out.println("arr2[] is a subset of arr1[]");
		
		

	}

	private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
		
		int i=0,j=0;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if (arr2[i]==arr1[j])
				break;
				
				 /* If the above inner loop
	            was not broken at all then
	            arr2[i] is not present in
	            arr1[] */
				if(j == m)
					return false;
			}
			 /* If we reach here then all
	        elements of arr2[] are present
	        in arr1[] */
			
		
		}
		return true;
		
	}

}
