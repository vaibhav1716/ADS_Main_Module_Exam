import java.util.*;
class Sorting {

	static void insertionSort(int a1[])
	{
		int n=a1.length;
		int j;
		for(int i=n-1;i>=0;i--)
		{
			int temp=a1[i];
			int flag=0;
			for(j=i-1;j>=0&&a1[j]>temp;j--)
			{
				
				a1[j+1]=a1[j];
				
				printArray(a1);
					flag++;
			}
			a1[j+1]=temp;
			if(flag==0)
			{		
			printArray(a1);	
			break;
			}			
		}
	
	
	}
	static void printArray(int a1[])
	{
		
		
		for(int i=0;i<a1.length;i++){
			
			System.out.print(a1[i]+" ");
			
		}
		
		System.out.println("");
	}
	
	
	public static void main(String args[]){
		
		int a1[]={1,2,4,5,3};
		
		int n=a1.length;
			
		insertionSort(a1);
		
		//case2:
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of matrix");
		
		int n=sc.nextInt();
		
		int a2[]=new int [n];
		*/
		
		System.out.println("Case 2 :");
		
		int a2[]={2,4,6,8,3};
		insertionSort(a2);
		
	}


}