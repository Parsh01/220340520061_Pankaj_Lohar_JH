import java.util.*;
//Question 03
class addStacks{
	int size;
	int top1, top2;
	int arr[];
	
	addStacks(int n){
	arr = new int[n];
	size = n;
	top1 =-1;
	top2 = size;
	}
	void push1(int x){
		if(top1>top2-1){
			top1++;
			arr[top1] = x;
		}else{
			System.out.println("stack overflow"+"By element "+x+"\n");
			System.exit(1);
		}
	}
	
	void push2(int x){
		if(top1<size-1){
			top2--;
			arr[top2]=x;
		}else{
			System.out.println("stack overflow"+"By element "+x+"\n");
			System.exit(1);
		}
	}
	
	int pop1(){
		if(top1>=0){
			int x= arr[top1];
			top1--;
			return x;
		}else{
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2>=size){
			int x= arr[top2];
			top2++;
			return x;
		}else{
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public static void main(String... args){
		addStacks obj =new addStacks(100);
		
		obj.push1(5);
		obj.push2(10);
		obj.push2(15);
		obj.push1(11);
		obj.push2(7);
		obj.push2(40);
	} 
}