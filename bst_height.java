package mccp;
import java.util.Scanner;
public class bst_height {

	    public static class Node{
	        int data;
	        Node left;
	        Node right;
	        Node(int data){
	            this.data=data;
	            left=null;
	            right=null;
	        }
	    }
	    public static Node insert(Node root,int ele){
	        if(root==null)
	        return new Node(ele);
	        else if(ele<root.data)
	            root.left= insert(root.left,ele);
	        else{
	            root.right= insert(root.right,ele);
	        }
	        return root;
	    }
	    public static void inorder(Node root){
	        if(root!=null){
	             System.out.println(root.data);
	            inorder(root.left);
	           
	            inorder(root.right);
	        }
	    }
	    public static void main(String[] a){
	        Node root=null;
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++){
	            root=insert(root,sc.nextInt());
	        }
	        System.out.println("Height : "+height(root));	        
	    }
		private static int height(Node root) {
			// TODO Auto-generated method stub
			if(root == null)
				return 0;
			return 1+Math.max(height(root.left),height(root.right));
		}
	}
