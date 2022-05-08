import java.io.*;

public class BSTree {
	
		public static node node;
		static node prevNode = null;
		static node headNode = null;

		static void BST_to_Skewed(node root, int order)
		{
			if (root==null)
			{
				return;
			}

		if (order >0)
		{
			BST_to_Skewed(root.right,order);
			
		}
		else
		{
			BST_to_Skewed(root.left,order);
		}

		node rightNode = root.right;
		node leftNode = root.left;

		if (headNode ==null)
		{
			headNode = root;
			root.left = null;
			prevNode =root;
		}
		else
		{
			prevNode.right = root;
		root.left = null;
		prevNode=root;

		}
		if (order >0)
		{
			BST_to_Skewed(leftNode,order);
			
		}
		else
		{
			BST_to_Skewed(rightNode,order);
			
		}


		if (headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}

		if (order >0)
		{
			BST_to_Skewed(leftNode, order);
		}
		else
		{
			BST_to_Skewed(rightNode, order);
		}
		}

		static void traverseRightSkewed(node root)
		{
			if (root == null)
			{
				return;
			}
			
			System.out.print(root.node + " ");
			traverseRightSkewed(root.right);
		}
		
		
public static void main(String[] Args)
{
	
	BSTree tree = new BSTree();
	tree.node = new node(50); 
	tree.node.left = new node(30); 
	tree.node.right = new node(60); 
	//tree.node.left.left = new node(10);
	//tree.node.right.left= new node(55);
	
	// int order =0;
	
	BST_to_Skewed(node,1);
	traverseRightSkewed(node);
}
}
		
		
		
		

