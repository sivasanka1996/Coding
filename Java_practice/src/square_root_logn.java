
public class square_root_logn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(square_root(100));
		

	}
	public static int square_root(int num){
		int sqrt =1;
		int start = 1;
		int end = num;
		int mid;
		
		if(num == 1){
			return sqrt;
		}
		else{
			while(start<end){
				mid =( start + end ) / 2;
				
				int sqr = mid * mid;
				int sqr_l =(mid+1)*(mid+1);
				int sqr_r =(mid-1)*(mid-1);
				
				if(sqr == num){
					
					sqrt = mid;
				}
				else if(sqr < num){
					if(sqr_l>num){
						
						sqrt = mid;
						
					}
					else{
						start = mid + 1;
					}
					
				}
				else{
					if(sqr_r<num){
						
						sqrt = mid;
					}
					else{
						end = mid - 1;
					}
					
					
				}
			}
			
		}
		return sqrt;
		
		
		
	}

}
