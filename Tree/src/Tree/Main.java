package Tree;

public class Main {
    public static void main(String[] args) {
        MyBinTree tree4 = new MyBinTree();
        tree4.addRoot("+");
        MyBinNode node4_1 = tree4.insertLeft(tree4.root(), "*");
        MyBinNode node4_2 = tree4.insertRight(tree4.root(), "*");
        MyBinNode node4_3 = tree4.insertLeft(node4_1, "2");
        MyBinNode node4_4 = tree4.insertRight(node4_1, "-");
        MyBinNode node4_5 = tree4.insertLeft(node4_2, "3");
        MyBinNode node4_6 = tree4.insertRight(node4_2, "2");
        MyBinNode node4_7 = tree4.insertLeft(node4_4, "3");
        MyBinNode node4_8 = tree4.insertRight(node4_4, "1");
        tree4.inOrder(tree4.root());
        int result = tree4.postOrder(tree4.root());
        System.out.println("\n= " + result);
    }
}