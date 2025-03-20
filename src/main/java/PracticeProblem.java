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
		int binary=0;
		int high = array.length-1;
		int low =0;
		int mid;
		Arrays.sort(array);
		while (low<=high){
			
			mid =(high+low)/2;
			if (array[mid] == number){
				low = high+1;
				binary++;
			}
			else if(number> array[mid]){
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
	public static int[] compareStringSearch(String[] array, String word){
		int sequential=0;
		for(int i=0; i<array.length; i++){
			sequential++;
			if (array[i].equals(word)){
				i=array.length;
			}
		}
		int binary=0;
		Arrays.sort(array);
		int high=array.length;
		int low=0;
		int mid;
		while(high>=low){
			binary++;
			mid= (high+low)/2;
			if (array[mid].equals(word)){
				low=high+1;
			}
			else if(array[mid].compareTo(word)<0){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		
		}	
		int[] answer={sequential, binary};
		return answer;
	}
}
