package timBuchalka_Inner_Abstract_Interfaces;

public abstract class ListItem {

	protected ListItem rightLink = null;  //set to the abstract value of listItem instead of say List<String>
	protected ListItem leftLink = null;
	
	protected Object value;
	
	public ListItem(Object value) {
        this.value = value;
    }//end constructor

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }//end getter

    public void setValue(Object value) {
        this.value = value;
    }//end setter
	
}//end class
