package mccp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import mccp.bst_print_leaf.Node;

public class bst_max_width {

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
        System.out.println(maxWidth(root));	        
    }
	private static int maxWidth(Node root) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int b=0,max=0;
		while(!q.isEmpty()) {
			b=q.size();
			max=Math.max(b, max);
			while(b!=0) {
			Node temp=q.poll();
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
			b--;
			}
		}
		return max;
	}
}
