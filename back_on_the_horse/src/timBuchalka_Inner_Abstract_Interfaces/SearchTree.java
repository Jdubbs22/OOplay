package timBuchalka_Inner_Abstract_Interfaces;

public class SearchTree implements NodeList {

	private ListItem root = null;

	public SearchTree(ListItem root) {
		this.root = root;
	}// end constructor

	@Override
	public ListItem getRoot() {
		return this.root;
	}// end getter

	@Override
	public boolean addItem(ListItem newItem) {
		if (this.root == null) {
			// the tree was empty, so our item becomes the head of the tree
			this.root = newItem;
			return true;
		} // end if

		// otherwise, start comparing from the head of the tree
		ListItem currentItem = this.root;
		while (currentItem != null) { // could have said while(true) as we will
										// never reach this point..added for
										// readability
			int comparison = (currentItem.compareTo(newItem));
			if (comparison < 0) {
				// newItem is greater, move right if possible
				if (currentItem.next() != null) {
					currentItem = currentItem.next();
				} // end if
				else {
					// there's no node to the right, so add at this point
					currentItem.setNext(newItem);
					return true;
				} // end else
			} // end if
			else if (comparison > 0) {
				// newItem is less, move left if possible
				if (currentItem.previous() != null) {
					currentItem = currentItem.previous();
				} // end if
				else {
					// there's no node to the left, so add at this point
					currentItem.setPrevious(newItem);
					return true;
				} // end else
			} // end else if
			else {
				// equal, so don't add
				System.out.println(newItem.getValue() + " is already present");
				return false;
			} // end else
		} // end while
			// we can't actually get here, but Java complains if there's no
			// return
		return false;
	}// end method

	@Override
	public boolean removeItem(ListItem item) {
		if (item != null) {
			System.out.println("Deleting item " + item.getValue());
		} // end if
		ListItem currentItem = this.root;
		ListItem parentItem = currentItem;

		while (currentItem != null) {
			int comparison = (currentItem.compareTo(item));
			if (comparison < 0) {
				parentItem = currentItem;
				currentItem = currentItem.next();
			} // end if
			else if (comparison > 0) {
				parentItem = currentItem;
				currentItem = currentItem.previous();
			} // end elseif
			else {
				// equal: we've found the item so remove it
				performRemoval(currentItem, parentItem);
				return true;
			} // end else
		} // end while
		return false;
	}// end method

	private void performRemoval(ListItem item, ListItem parent) {
		// remove item from the tree
		if (item.next() == null) {
			// no right tree, so make parent point to left tree (which may be
			// null)
			if (parent.next() == item) {
				// item is right child of its parent
				parent.setNext(item.previous());
			} // end if
			else if (parent.previous() == item) {
				// item is left child of its parent
				parent.setPrevious(item.previous());
			} // end elseif
			else {
				// parent must be item, which means we were looking at the root
				// of the tree
				this.root = item.previous();
			} // end else
		} // end if
		else if (item.previous() == null) {
			// no left tree, so make parent point to right tree (which may be
			// null)
			if (parent.next() == item) {
				// item is right child of its parent
				parent.setNext(item.next());
			} // end if
			else if (parent.previous() == item) {
				// item is left child of its parent
				parent.setPrevious(item.next());
			} // end else if
			else {
				// again, we are deleting the root
				this.root = item.next();
			} // end else
		} // end else if
		else {
			// neither left nor right are null, deletion is now a lot trickier!
			// From the right sub-tree, find the smallest value (i.e., the
			// leftmost).
			ListItem current = item.next();
			ListItem leftmostParent = item;
			while (current.previous() != null) {
				leftmostParent = current;
				current = current.previous();
			} // end while
				// Now put the smallest value into our node to be deleted
			item.setValue(current.getValue());
			// and delete the smallest
			if (leftmostParent == item) {
				// there was no leftmost node, so 'current' points to the
				// smallest
				// node (the one that must now be deleted).
				item.setNext(current.next());
			} // end if
			else {
				// set the smallest node's parent to point to
				// the smallest node's right child (which may be null).
				leftmostParent.setPrevious(current.next());
			} // end else
		} // end else
	}// end method

	@Override
	public void traverse(ListItem root) {
		// recursive method
		if (root != null) {
			traverse(root.previous());
			System.out.println(root.getValue());
			traverse(root.next());
		} // end if

	}// end method

}// end class
