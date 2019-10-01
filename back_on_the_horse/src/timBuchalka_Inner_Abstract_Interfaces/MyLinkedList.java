package timBuchalka_Inner_Abstract_Interfaces;

// taken from: 
//https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/t/lecture/3805246?start=900
public class MyLinkedList implements NodeList {

	private ListItem root = null; // same as head in typical linked list

	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) { // per the format its to be
												// inserted in alphabetical
												// order
		if (this.root == null) {
			// The list was empty, so this item becomes the head of the list
			this.root = newItem;
			return true;
		} // end if

		ListItem currentItem = this.root; // the head of the list
		while (currentItem != null) {
			int comparison = (currentItem.compareTo(newItem)); // returns either
																// 0, or + or -
																// number
			if (comparison < 0) {
				// newItem is greater, move right if possible
				if (currentItem.next() != null) { // moves through the list
													// forward
					currentItem = currentItem.next();
				} // end if
				else {
					// there is no next, so insert at end of list
					currentItem.setNext(newItem).setPrevious(currentItem);
					return true;
				} // end else
			} // end if
			else if (comparison > 0) {
				// newItem is less, insert before
				if (currentItem.previous() != null) { // moves throught the list
														// backward
					currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
					// ^^previous nodes .next to new item...that newItem then
					// set to current.previous
					newItem.setNext(currentItem).setPrevious(newItem);
				} // end if
				else {
					// the node with a previous is the root
					newItem.setNext(this.root).setPrevious(newItem);
					this.root = newItem;
				} // end else
				return true;
			} // end else if
			else {
				// equal
				System.out.println(newItem.getValue() + " is already present, not added.");
				return false;
			} // end else
		} // end while

		return false;
	}// end method

	@Override
	public boolean removeItem(ListItem item) {
		if (item != null) {
			System.out.println("Deleting item " + item.getValue());
		}

		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if (comparison == 0) {
				// found the item to delete
				if (currentItem == this.root) {// if the item to be deleted is
												// the head
					this.root = currentItem.next();// setting the head to the
													// next item
				} // end if
				else {
					currentItem.previous().setNext(currentItem.next());
					if (currentItem.next() != null) {
						currentItem.next().setPrevious(currentItem.previous());
					} // end if
				} // end else
				return true; // found record and were able to make changes
			} // end if
			else if (comparison < 0) {
				currentItem = currentItem.next();
			} // end else if
			else { // comparison > 0
					// We are at an item greater than the one to be deleted
					// so the item is not in the list
				return false;
			} // end else
		} // end while

		// We have reached the end of the list
		// Without finding the item to delete
		return false;
	}// end method

	@Override
	public void traverse(ListItem root) {
		if (root == null) {
			System.out.println("The list is empty");
		} // end if
		else {
			while (root != null) {
				System.out.println(root.getValue());
				root = root.next();
			} // end while
		} // end else

		// VVV recursive version VVV
		/*
		 * if(root != null){ System.out.println(root.getValue()); }//end if
		 * traverse(root.next());
		 */
		//  ^^^ this is not generally done with linked list (could be a huge amount) as it 
		//uses to many resources (causing possible stack overflow) 
		//opposed to a search tree which has a max depth of about 63
	}// end method
}// end class
