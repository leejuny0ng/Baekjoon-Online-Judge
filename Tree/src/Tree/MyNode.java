package Tree;

import java.util.ArrayList;
public class MyNode {
    private Object element;
    private MyNode parent;
    private ArrayList children;
    //생성자 선언 ()는 초기 생성자
    MyNode() {
        this.element = null;
        this.parent = null;
        this.children = null;
    }

    // 생성자 선언 (Object e)는 element가 있을때
    MyNode (Object e) {
        this.element= e;
        this.parent = null;
        this.children = new ArrayList();
        this.children.add(null);
        this.children.add(null);
    }

    MyNode (Object e, int temp) {
        this.element= e;
        this.parent = null;
        this.children = new ArrayList();
    }

    public Object element() {
        return this.element;
    }
    public MyNode parent() {
        return this.parent;
    }

    public ArrayList children() {
        return this.children;
    }

    public int degree() {
        return this.children.size();
    }

    public void setElement(Object e) {
        this.element = e;
    }

    public void setParent(MyNode p) {
        this.parent = p;
    }

    public void setChildren(ArrayList c) {
        this.children = c;
    }
}
