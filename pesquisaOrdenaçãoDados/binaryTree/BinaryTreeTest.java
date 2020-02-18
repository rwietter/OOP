import java.util.Stack;

public class BinaryTreeTest {

  public static void main(String[] args) throws Exception {
    TreeNode no6 = new TreeNode(6);
    TreeNode no4 = new TreeNode(4);
    TreeNode no8 = new TreeNode(8);
    TreeNode no9 = new TreeNode(9);
    TreeNode no3 = new TreeNode(3, no6, no4);
    TreeNode no2 = new TreeNode(2, no8, no9);
    TreeNode root = new TreeNode(1, no3, no2);

    System.out.println("Printing all leaf nodes of a binary tree in Java (recursively)");
    printLeafNodes(root);

    System.out.println();

    System.out.println("Printing all leaf nodes of binary tree in Java using stack");
    printLeafNodesIteratively(root);
  }

  private static class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
      this.value = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
      this.value = data;
      this.left = left;
      this.right = right;
    }

  }

  public static void printLeafNode(TreeNode node) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      System.out.printf("%d ", node.value);
    }
    printLeafNode(node.left);
    printLeafNode(node.right);
  }

  public static void printLeafNodeItweatively(TreeNode root) {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stack = new Stack<>();

    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();

      if (node.right != null) {
        stack.add(node.right);
      }
      if (node.left != null) {
        stack.add(node.left);
      }
      if (node.left == null && node.right == null) {
        System.out.printf("%d ", node.value);
      }
    }
  }
}
