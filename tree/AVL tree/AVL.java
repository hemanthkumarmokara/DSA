 
public class AVL{
    TreeNode root;

    class TreeNode {
        TreeNode Llink = null;
        TreeNode Rlink = null;
        int data;
    
    public TreeNode (int data){
        this.data = data;

    }
}
void AVLinsert(){
    
}




void postOrder(TreeNode root){
    if ( root == null){
        System.out.println("tree is empty ");
    }
    else {
      
        if ( root.Llink != null){
            postOrder(root.Llink);
            
        }
        if ( root.Rlink != null){
            postOrder(root.Rlink);
        }  
        System.out.print(  root.data + " --> ");   
       
    }
   // System.out.println();
}  


void inOrder(TreeNode root){
    
    if ( root == null){
        System.out.println("tree is empty ");
    }
    else {
      
        if ( root.Llink != null){
            inOrder(root.Llink);  
        }
        System.out.print(root.data + " --> ");   
         if ( root.Rlink != null){
            inOrder(root.Rlink);
        }  
    }
//    System.out.println();
}  

void preOrder(TreeNode root){
    if ( root == null){
        System.out.println("tree is empty ");
    }
    else {
        System.out.print( root.data + " --> ");   
        if ( root.Llink != null){
            preOrder(root.Llink);
            
        }
         if ( root.Rlink != null){
            preOrder(root.Rlink);
        }  
    }
  //  System.out.println();
}  
 
    public static void main(String[] args) {
       AVL gh = new AVL();
        
    //   gh.insertion(23);
    System.out.println("postorder traversal is : " );
       gh.postOrder(gh.root);
       System.out.println();
       System.out.println("preorder traversal is : " );
        gh.preOrder(gh.root);
        System.out.println();
        System.out.println("inorder traversal is : " );
         gh.inOrder(gh.root);
    }
    
}

