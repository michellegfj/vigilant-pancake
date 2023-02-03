import javax.swing.JTree.DynamicUtilTreeNode;

public class RotatingDLList<Item> extends DLList<Item> {

    public void rotateRight() {
        Item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args){
        /* Create DLList: [10,11,12,13] */
        RotatingDLList<Integer> rsl=new RotatingDLList<>();
        rsl.addLast(10);
        rsl.addLast(11);
        rsl.addLast(12);
        rsl.addLast(13);


        /* Should be [13,10,11,12] */
        rsl.rotateRight();
        rsl.print();
    }
}