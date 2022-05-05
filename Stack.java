class Stack
{
		int S1[];
		int max;
		static int count=0;
		int top1;
		int top2;
		Stack(int size)
		{
			max=size;
			S1=new int[size];
			top1=-1;
			top2=size;
		}
		
		boolean isFull()
		{
			return(count==max);
		}
		boolean isEmpty()
		{
			return(count==0);
		}
		
		
		void push1(int data)
		{
			if(isFull())
			{
				System.out.println("Stack1 is Full");
				return;
			}
			
			S1[++top1]=data;
			count++;
			System.out.println("Element "+data+" inserted in Stack1");
			
		}
		
		void push2(int data)
		{
			if(isFull())
			{
				System.out.println("Stack2 is Full");
				return;
			}
			
			S1[--top2]=data;
			count++;
			System.out.println("Element "+data+" inserted in Stack2");
			
		}
		
		
		void pop1()
		{
			if(isEmpty()&& top1==-1)
			{
				System.out.println("Stack1 is Empty");
				return;
			}
			count--;
			System.out.println("Popped element form stack1 is "+ S1[top1--]);
		}
		
		void pop2()
		{
			if(isEmpty()&& top2==max)
			{
				System.out.println("Stack2 is Empty");
				return;
			}
			count--;
			System.out.println("Popped element form stack2 is "+ S1[top2++]);
		}
	
	
	
	public static void main(String args[]){
	
			Stack stack=new Stack(10);
			stack.push1(5);
			stack.push2(10);
			stack.push2(15);
			stack.push1(11);
			stack.push2(7);
			stack.push2(40);
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("");
			
			stack.pop1();
			stack.pop2();
	
	}




}