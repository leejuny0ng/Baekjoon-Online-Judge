package Tree;

public class MyBinTree extends MyTree {
    MyBinTree(){
        super();
    }

    MyBinTree(Object e){
        super(e);
    }

    public boolean isEmpty() {
        return super.size() == 0;
    }

    public boolean isRoot(MyBinNode v) {
        return v.parent() == null;
    }

    public boolean isInternal(MyBinNode v) {
        return !this.isExternal(v);
    }

    public boolean isExternal(MyBinNode v) {
        if(!this.hasLeft(v) && !this.hasRight(v))
            return true;
        else
            return false;
    }

    public MyBinNode root() {
        return (MyBinNode)super.root();
    }

    public MyBinNode parent (MyBinNode v) {
        return (MyBinNode)v.parent();
    }

    public MyBinNode left (MyBinNode v) {
        return (MyBinNode)v.children().get(0);
    }

    public MyBinNode right (MyBinNode v) {
        return (MyBinNode)v.children().get(1);
    }

    public boolean hasLeft (MyBinNode v) {
        return v.children().get(0) != null;
    }

    public boolean hasRight (MyBinNode v) {
        return v.children().get(1) != null;
    }

    public MyBinNode addRoot (Object e) {
        return (MyBinNode)super.addRoot(e);
    }

    public MyBinNode addNode (Object e) {

        MyBinNode return_node = null;

        if(hasLeft((MyBinNode)super.root()) && hasRight((MyBinNode)super.root())) {
            // 2 children exist
            System.out.println("Can't add Node because Two Children exist !");
        }
        else if(hasLeft((MyBinNode)super.root())) {
            // left children exist - addNode to right
            return_node =  this.insertRight((MyBinNode)super.root(), e);
        }
        else if(hasRight((MyBinNode)super.root())){
            // right children exist - addNode to left
            return_node =  this.insertLeft((MyBinNode)super.root(), e);
        }
        else {
            // children > empty
            return_node =  this.insertLeft((MyBinNode)super.root(), e);
        }

        return return_node;
    }

    public MyBinNode insertLeft(MyBinNode v, Object e) {

        MyBinNode mbn = null;

        if(!this.hasLeft(v)) {
            mbn = (MyBinNode)super.setChild(v, 0, e);
        }

        return mbn;
    }

    public MyBinNode insertRight(MyBinNode v, Object e) {

        MyBinNode mbn = null;

        if(!this.hasRight(v)) {
            mbn = (MyBinNode)super.setChild(v, 1, e);
        }

        return mbn;
    }

    public Object replace(MyBinNode v, Object e) {
        Object temp = v.element();
        v.setElement(e);
        return temp;
    }

    public MyBinNode remove(MyBinNode v) throws TwoChildrenException {

        MyBinNode parent = (MyBinNode)v.parent();

        int idx = 0;

        if(this.left(parent) == v) {
            // v가 parent의 leftNode
            idx = 0;
        }
        else {
            // v가 parent의 rightNode
            idx = 1;
        }

        if(this.hasLeft(v) && this.hasRight(v)) {
            // two children
            throw new TwoChildrenException("TwochildException!!");
        }
        else if(this.hasLeft(v)) {
            // one children - left
            MyBinNode children = (MyBinNode)v.children().get(0);
            parent.children().set(idx, children);
            children.setParent(parent);
        }
        else if(this.hasRight(v)) {
            // one children - right
            MyBinNode children = (MyBinNode)v.children().get(1);
            parent.children().set(idx, children);
            children.setParent(parent);
        }
        else {
            // no children
            parent.children().set(idx, null);
        }

        return v;
    }

    public void attach (MyBinNode v, MyBinNode t1, MyBinNode t2) throws NotExternalException{

        if(this.isExternal(v)) {
            this.insertLeft(v, t1.element());
            this.insertRight(v, t2.element());
        }
        else {
            throw new NotExternalException("NotExternalException!!");
        }

    }

    public void inOrder(MyBinNode v) { // 수식 표현
        if(this.hasLeft(v)) {
            System.out.print("(");
            inOrder(this.left(v));
        }

        System.out.print(v.element());

        if(this.hasRight(v)) {
            inOrder(this.right(v));
            System.out.print(")");
        }
    }
    public int postOrder(MyBinNode v){ // 계산
        int result = 0;
        String str = "0";
        if(this.isExternal(v)){
            result = Integer.parseInt(v.element().toString());
            return result;
        }else {
            str = v.element().toString();
            char c = str.charAt(0);
            int x = postOrder(v.left());
            int y = postOrder(v.right());
            if(c == '+'){
                result = x+y;
            } else if(c == '-'){
                result = x-y;
            } else if(c == '*'){
                result = x*y;
            } else if(c == '/'){
                result = x/y;
            }
            return result;
        }
    }


    class TwoChildrenException extends Exception {

        TwoChildrenException(String msg){
            super(msg);
        }

    }

    class NotExternalException extends Exception {
        NotExternalException(String msg){
            super(msg);
        }
    }
}
