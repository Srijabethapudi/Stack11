import java.util.Stack;
public class Stack11 
{
	public static void main(String[] args)
	   {
		   Stack<Integer> stack=new Stack<Integer>();
		   System.out.println(stack.add(120));
		   System.out.println(stack.push(130));
		   stack.push(140);
		   stack.push(150);
		   System.out.println(stack);
		   
		   System.out.println(stack.peek());
		   
		   System.out.println(stack);
		   
		   System.out.println(stack.capacity());
		   
		   System.out.println(stack.indexOf(140));
		   
		   System.out.println(stack.firstElement());
		   
		   stack.setElementAt(100, 0);
		   System.out.println(stack);
		   
		   stack.add(2,200);
		   System.out.println(stack);
		   
		   stack.addElement(300);
		   System.out.println(stack);		   

		  



	   }
}

