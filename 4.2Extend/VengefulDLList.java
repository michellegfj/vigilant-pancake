import java.nio.ReadOnlyBufferException;
import java.rmi.server.RemoteServer;

public class VengefulDLList<Item> extends DLList<Item> {

    DLList<Item> deletedItems ;
    /*
     * deletedItems must be instantiated, such as:
     * DLList<Item> deletedItems = new DLList<>(); or we may try:
     */

    public VengefulDLList() {
        super(); /* This line, a call to superclass's constructor can be omitted. */
        DLList <Item> deletedItems = new DLList<>();
    }

    public VengefulDLList(Item x) {
        super(x); 
        DLList <Item> deletedItems = new DLList<>();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {

        /* Create DLList: [10,11,12,13] */
        VengefulDLList<Integer> vdl = new VengefulDLList<>(0);
        vdl.addLast(10);
        vdl.addLast(11);
        vdl.addLast(12);
        vdl.addLast(13);

        int x = vdl.removeLast();
        int y = vdl.removeLast();

        System.out.print("The fallen are: ");
        vdl.printLostItems();
    }
}