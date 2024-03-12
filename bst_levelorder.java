package mccp;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class bst_levelorder {

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
	        levelorder(root);	        
	    }
		private static void levelorder(Node root) {
			// TODO Auto-generated method stub
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				Node temp=q.poll();
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
				System.out.print(temp.data+" ");
			}
			
		}
	}
