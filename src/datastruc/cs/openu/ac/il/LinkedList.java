package datastruc.cs.openu.ac.il;

/**
 * Class LinkedList is a simple implementation of a doubly linked list.
 * Class will ne used as a substance for the ListHeap data structure.
 * @author Yizhar
 */
public class LinkedList {
	
	private Cell start;
	private int size;
	
	/**
	 * Constructor - creates an empty LinkedList
	 */
	public LinkedList(){
		size=0;
		start=null;
	}
	/**
	 * @return true if LinkedList instance is empty, false otherwise.
	 */
	public boolean isEmpty(){
		return start == null;
	}
	/**
	 * method inserts cell to the linked list at the start of the list
	 * @param cell
	 */
	public void listInsert (Cell cell){
		cell.setNext(start);
		if (start != null){
			start.setPrev(cell);
		}
		start=cell;
		cell.setPrev(null);
	}
	/**
	 * method deletes the cell from the linked list
	 * @param cell
	 */
	public void listDelete(Cell cell){
		if (cell.getPrev() != null){
			(cell.getPrev()).setNext(cell.getNext());
		}
		else{
			start = cell.getNext();
		}
		if (cell.getNext() != null){
			(cell.getNext()).setPrev(cell.getPrev());
		}	
	}
	/**
	 * method searches for data in the linked list. 
	 * @param data
	 * @return Cell x if its data is the same as the parameter's, null otherwise
	 */
	public Cell listSearch(int data){
		Cell x = start;
		while ((x != null) && (x.getData() != data)) {
			x = x.getNext();
		}
		return x;
	}
	public String toString() {
		Cell x = start;
		StringBuffer sb = new StringBuffer();
		while (x != null) {
			sb.append(x.toString());
		}
		return sb.toString();
	}
}
