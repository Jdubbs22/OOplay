package timBuchalka_Inner_Abstract_Interfaces;

public interface NodeList {
    ListItem getRoot();  //start if the list..in linked list often refered to as head
    //..root in binary search tree's
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}//end interface

