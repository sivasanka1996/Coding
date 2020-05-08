package Searching;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}

