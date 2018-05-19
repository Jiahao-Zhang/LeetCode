package pers.jiahao.leetcode.tree;

public class NO450DeleteNodeinaBST {
	 public TreeNode deleteNode(TreeNode root, int key) {
	        if(root==null){
	            return root;
	        }
	        if(root.val==key){
	            TreeNode node = null;
	            if(root.left==null&&root.right==null){
	                return null;
	            }else if(root.left!=null&&root.right!=null){
	                node = getSuccessor(root);
	                node.left = root.left; 
	            }else{
	                if(root.left!=null){
	                    node = root.left;
	                }else{
	                    node = root.right;
	                }
	            }
	            return node;
	        }
	        TreeNode parent = root;
	        TreeNode cur = root;
	        Boolean isLeftChild = true;
	        while(cur!=null&&cur.val!=key){
	            if(cur.val>key){
	                parent = cur;
	                isLeftChild = true;
	                cur = cur.left;
	            }else{
	                parent = cur;
	                isLeftChild = false;
	                cur = cur.right;
	            }
	        }
	        if(cur==null){
	            return root;
	        }
	        if(cur.left==null&&cur.right==null){
	            if(isLeftChild){
	                parent.left = null;
	            }else{
	                parent.right = null;
	            }
	        }else if(cur.left!=null&&cur.right!=null){
	            TreeNode successor = getSuccessor(cur);
	            if(isLeftChild){
	               parent.left = successor;
	            }else{
	               parent.right = successor;
	            }
	             successor.left = cur.left;
	            
	        }else{
	            if(cur.left!=null){
	                if(isLeftChild){
	                    parent.left = cur.left;
	                }else{
	                    parent.right = cur.left;
	                }
	                
	            }else{
	               if(isLeftChild){
	                   parent.left = cur.right;
	               }else{
	                   parent.right = cur.right;
	               }
	            }
	        }
	        return root;
	        
	        
	    }
	    private TreeNode getSuccessor(TreeNode delNode){
	        TreeNode parent = delNode;
	        TreeNode successor = delNode;
	        TreeNode cur = delNode.right;
	        while(cur!=null){
	            parent = successor;
	            successor = cur;
	            cur = cur.left;
	        }
	        if(successor!=delNode.right){
	            parent.left = successor.right;
	            successor.right = delNode.right;
	        }
	        return successor;
	        
	    }

}
