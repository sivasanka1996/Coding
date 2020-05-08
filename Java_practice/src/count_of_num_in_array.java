
public class count_of_num_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,4,4,4,4,4,4,10,10,10,10,10,10,10,10,10,35,46,57,68,79,89,91,100,101,120,130,140,300};
		int start = left_occurance(a,4);
		System.out.println(start);
		int end  = right_occurance(a,4);
		System.out.println(end);
		int count = end - start +1;
		System.out.println(count);
		

	}
	
	public static int binary_search(int arr[],int target){
		int start = 0;
		int end = arr.length-1;
		int index = -1;
		while(start<end){
			int mid = (start+end)/2;
			if(arr[mid] == target){
				index = mid;
				return index;
			}
			else if(arr[mid] > target){
				end = mid - 1;
				
			}
			else{
				start = mid + 1;
				}
			
			}
		return index;
	}
	public static int left_occurance(int arr[],int target){
		int start = 0;
		int end = arr.length-1;
		int index = -1;
		int mid;
		while(start<=end){
			mid = (start + end) /2;
			if(arr[mid] < target){
				start = mid + 1;
				
			}
			else if(arr[mid] > target){
				end = mid - 1;
				
			}
			else{
				
				index = mid;
				end = mid -1;
				}
			
		}
		return index;
		
	}
public static int right_occurance(int arr[],int target){
		int start = 0;
		int end = arr.length-1;
		int index = -1;
		int mid;
		while(start<=end){
			 mid = (start + end) /2;
			if(arr[mid] < target){
				start  = mid + 1;
				
			}
			else if(arr[mid] > target){
				end = mid - 1;
				
			}
			else{
				
				index = mid;
				start = mid + 1;
				}
			
		}
		return index;
		
		}


}
