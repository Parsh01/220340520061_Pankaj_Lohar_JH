import java.util.Arrays;
//Question_01
class Question_01{
	public static void main(String args[]){
	
	
		
		int[] Arr = {2,4,6,8,3};
		int M = Arr.length;
		System.out.println("Before sort : "+Arrays.toString(Arr));
		
		for(int i=M-1;i>=0;i--){
			int key =Arr[i];
			int j=i-1;
			int temp =0;
			while(j>=0 && Arr[j]>=key){
			temp =Arr[j]=Arr[j+1] =Arr[j];
			Arr[j]=Arr[j+1];
			Arr[j+1]=temp;
			j--;
		}
			temp =Arr[j+1];
			Arr[j+1]=key;
			key =temp;
			System.out.println(Arrays.toString(Arr)+ "key -: "+key);
		}
		System.out.println("After sort : "+Arrays.toString(Arr));
	}
	
}