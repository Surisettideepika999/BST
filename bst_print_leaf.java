package mccp;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;

public class bst_print_leaf {

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
		    public static void main(String[] a){
		        Node root=null;
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        for(int i=0;i<n;i++){
		            root=insert(root,sc.nextInt());
		        }
		        printLeaf(root);	        
		    }
			private static void printLeaf(Node root) {
				// TODO Auto-generated method stub
				if(root != null) {
					printLeaf(root.left);
					if(root.left == null && root.right == null)
						System.out.print(root.data+" ");
					printLeaf(root.right);
				}
			}
		}
