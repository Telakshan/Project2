import java.util.ArrayList;

public class DateList {

	private DateNode first;
	private DateNode last;
	private DateNode temp;
	
	public DateList(){
		
		DateNode ln = new DateNode(null);
		first = ln;
		last = ln;
	}
	/*
	 * Insert method that will add the dates in an ascending order using compareTo method in Date212
	 */
	public void insert(Date212 date){
		
		DateNode newNode = new DateNode(date);
		
		if(first.next == null){
			this.append(date); //if first is null add it at the bottom
			return;
		}
		
		temp = first;
		
		while (temp.next != null && temp.next.data.compareTo(date) < 0)
			temp = temp.next;
		
		if(temp.next == null){
			this.append(date);
			return;
		} else { 
			newNode.next = temp.next;
			temp.next = newNode;
		}
		temp = first;
		
	}
	/*
	 * Append method stores data in an order that it's read
	 */
	public void append(Date212 date){
		
		DateNode newNode = new DateNode(date);
		last.next = newNode;
		last = newNode;
		
	}
	/*
	 * this method returns the sorted and unsorted lists in bulk 
	 */
	public ArrayList<String> returninBulk() {

		ArrayList<String> list = new ArrayList<String> ();
		DateNode temp1;
		temp1 = first;
		
		while(temp1.next!=null){
			temp1 = temp1.next;
			
			list.add(temp1.data.forGUI());
			
		}
		temp1 = first;
		return list;
		
	}
	
}
