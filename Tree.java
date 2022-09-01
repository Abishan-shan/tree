public class Tree
{
	object[] array;
	
	public Tree
	{
		array = new Object[100];
	}
	
	public boolean empty()
	{
		return array[i]==null;
	}
	public int left(int i)
	{
		return(2*i);
	}
	public int right(int i)
	{
		return(2*i+1);
	}
	public int parent(int i)
	{
		return(i/2);
	}
	public Object getCargo(int i)
	{
		if (i<0||i>array.length)
		{
			return null;
		}
		else 
		{
			return array[i];
		}
	}
	
	public void setCargo(int i,Object obj)
	{
		if (i<0||i>array.length)
		{
			return null;
		}
		else 
		{
			array[i] = obj;
		}
	}
	public void printPreorder(int i);
	{
		if (getCargo(i)==null)
		{
			System.out.println("There is no item");
		}
		else
		{
			System.out.println(getCargo(i));
			printPreorder(left(i));
			printPreorder(right(i));	
		}
	}
	public void printInorder(int i);
	{
		if (getCargo(i)==null)
		{
			System.out.println("There is no item");
		}
		else
		{
			printInorder(left(i));
			System.out.println(getCargo(i));
			printInorder(right(i));	
		}
	}
	public void printPostorder(int i);
	{
		if (getCargo(i)==null)
		{
			System.out.println("There is no item");
		}
		else
		{
			printPostorder(left(i));
			printPostorder(right(i));
			System.out.println(getCargo(i));
		}
	}
	public static void main(String args[])
	{
		Tree tree = new Tree();
		int root = 1;
		tree.setCargo (root, "A");
		tree.setCargo (tree.left (root), "B");
		tree.setCargo (tree.right (root), "C");
		root++;
		tree.setCargo (tree.left (root), "D");
		tree.setCargo (tree.right (root), "E");
		root++;
		tree.setCargo (tree.right (root), "F");
		tree.printPreorder(1);
		tree.printInorder(1);
		tree.printPostorder(1);
	}
}
