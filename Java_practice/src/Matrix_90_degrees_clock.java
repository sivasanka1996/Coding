import java.util.*;

public class Matrix_90_degrees_clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a.size()-1;i++){
			for(int j=0;j<a.size()-1;i++){
				a.get(i).set(j, i);
			}
		}
		matrix(a);
	

	}
	

	public static  void matrix(ArrayList<ArrayList<Integer>> a){
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		for(int i = 0,k=a.size()-1;i<a.size() -1;i++,k--){
			for (int j=0,l=0;j<a.size()-1;j++,l++){
				b.get(k).set(l,a.get(i).get(j));
				
				
			}
			
		}
		
		for(int i=0;i<b.size()-1;i++){
			for(int j=0;j<b.size()-1;i++){
				System.out.print(b.get(i).get(j));
				
			}
			System.out.println();
			
		}
		
		
	}
	

}
