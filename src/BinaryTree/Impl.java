package BinaryTree;

public class Impl {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    int idx = -1;
    public Node buildTree(int[] node) {
      idx++;
      if (node[idx] == -1) {
        return null;
      }
      Node newNode = new Node(node[idx]);
      newNode.left = buildTree(node);
      newNode.right = buildTree(node);

      return newNode;
    }
  }

  public static void main(String[] args) {
    int[] nodes = new int[]{1, 2, 3, -1, -1, 3};

    BinaryTree binaryTree = new BinaryTree();
    binaryTree.buildTree(nodes);
  }

}
