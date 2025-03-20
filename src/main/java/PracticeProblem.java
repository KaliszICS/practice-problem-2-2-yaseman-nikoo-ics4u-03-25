import java.util.Arrays;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static int[] compareSearch(int[] array, int number){
		int sequential = 0;
		for(int i=0; i<array.length; i++){
			sequential++;
			if(array[i]== number){
				i = array.length;
			}
		}
		int binary=-1;
		int high = array.length-1;
		int low =0;
		int mid;
		Arrays.sort(array);
		while (low<=high){
			
			mid =(high+low)/2;
			if (mid == number){
				low = high+1;
				binary++;
			}
			else if(number> mid){
				low = mid+1;
				binary++;
			}
			else{
				high = mid -1;
				binary++;
			}

		}
		int[] intArray = {sequential, binary};
		return intArray;
	}
	
}
