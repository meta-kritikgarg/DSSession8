package metacube.get16.treesort;

/**
 * Node of a binarytree
 * @author Kritik
 *
 * @param <E>
 */

public class BinaryNode {

	 BinaryNode left, right;
     int data;
 
     /* Constructor */
     public BinaryNode(int data) {
         left = null;
         right = null;
         this.data = data;
     }    
     
     /**
      * to set left node
      * @param node 
      */
     public void setLeft(BinaryNode node) {
         left = node;
     }
     
     /**
      * to set right node
      * @param node
      */
     public void setRight(BinaryNode node) {
         right = node;
     }
     
     /**
      * to get left node
      * @return node
      */
     public BinaryNode getLeft() {
         return left;
     }
     
     /**
      * to get right node
      * @return node
      */
     public BinaryNode getRight() {
         return right;
     }
     
     /**
      * to set data to node
      * @param E data
      */
     public void setData(int data) {
         this.data = data;
     }
     
     /**
      * to get data
      * @return E data
      */
     public int getData() {
         return data;
     }     
}
