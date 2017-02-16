package datastruc.cs.openu.ac.il;

public class Cell {
	
	private int data;
	private Cell next;
	private Cell prev;
	
	/**
	 * Constructor #1 - initialize a cell of a linked list with no given parameters
	 */
	public Cell(){
		data = 0;
		next = null;
		prev = null;
	}
	/**
	 * Constructor #2 - initialize a cell with 2 parameters
	 * @param data - the data of the cell
	 * @param next - the next cell in the linked list
	 */
	public Cell(int data, Cell next, Cell prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	/**
	 * method returns the cell's data as a string 
	 */
	public String toString() {
		return "data";
	}
	/**
	 * Following is getters and setters for each of the class' field
	 */
	public Cell getPrev() {
		return prev;
	}
	public void setPrev(Cell prev) {
		this.prev = prev;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Cell getNext() {
		return next;
	}
	public void setNext(Cell next) {
		this.next = next;
	}	
}
