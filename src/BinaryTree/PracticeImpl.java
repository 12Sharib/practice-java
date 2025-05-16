package BinaryTree;

public class PracticeImpl {

  static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {

    int idx = -1;

    public Node buildTree(int[] arr) {
      idx++;
      if (arr[idx] == -1) {
        return null;
      }

      Node newNode = new Node(arr[idx]);
      newNode.left = buildTree(arr);
      newNode.right = buildTree(arr);

      return newNode;
    }

    public int countNodes(Node node) {
      if (node == null) {
        return 0;
      }
      int left = countNodes(node.left);
      int right = countNodes(node.right);

      return left + right + 1;
    }

    int sum = 0;
    public int countSum(Node node) {
      if (node ==null){
        return 0;
      }
      sum += node.data;
      countSum(node.left);
      countSum(node.right);

      return sum;
    }

    public boolean sumOfTarget(Node root, int target) {
      int sum = 0;

      return getSum(root, target, sum);

    }

    private boolean getSum(Node root, int target, int sum) {
      if(root == null){
        return false;
      }
      sum += root.data;
      if (root.left == null && root.right == null){
        return sum == target;
      }
      boolean l = getSum(root.left, target, sum);
      boolean r = getSum(root.right, target, sum);

      return l||r;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{4,2,7,1,3,6,9};
    BinaryTree binaryTree = new BinaryTree();
    Node node = binaryTree.buildTree(arr);

    int total = binaryTree.countNodes(node);

    int totalSum = binaryTree.countSum(node);

    boolean isExists = binaryTree.sumOfTarget(node, 22);
    System.out.println(totalSum);

//
//    Node invert = bu()


  }

}
