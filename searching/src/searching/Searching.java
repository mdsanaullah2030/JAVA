package searching;

public class Searching<E extends Comparable<E>> {
    protected TreeNode<E> root; 
    
    protected static class TreeNode<E> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }
    }

    @Override
    public String toString() {
        return "Searching{" + "root=" + root + '}';
    }
    
    public boolean search(E element) {
        TreeNode<E> current = root; 
        
        
        TreeNode<Integer> root = new TreeNode<>(60);
// Create the left child node 
root.left = new TreeNode<>(55);
// Create the right child node 
root.right = new TreeNode<>(100);
        
        
        while (current != null) {
            int comparisonResult = element.compareTo(current.element);
            if (comparisonResult < 0) {
                current = current.left; 
            } else if (comparisonResult > 0) {
                current = current.right; 
            } else {
                return true;
            }
        }
        
        return false; 
    }


}
