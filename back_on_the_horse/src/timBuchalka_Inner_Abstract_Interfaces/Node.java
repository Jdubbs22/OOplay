package timBuchalka_Inner_Abstract_Interfaces;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }//end constructor

    @Override
    ListItem next() {
        return this.rightLink;  // a field in the abstract class similar to .next
    }//end method

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }//end method

    @Override
    ListItem previous() {
        return this.leftLink;  //a field in the abstract class similar to .previous
    }//end method

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }//end method

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
            //Cast to String instead of unspecified Object... super.get value is the item
            //in the list....item is what we are checking....compare to returns either 0, <0 or >0
            //0 = uquall, >0 = greater, <0 is less than
            //String class has it's own compareTo() built in...otherwise we would have to write our own
        }//end if 
        else {
            return -1;
        }//end else
    }//end method
}//end class

