import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DateGUI extends JFrame{
	
	/*
	 * Launches the dategui 
	 * I used functions setSorted and setUnsorted to add the lists to the text area
	 */
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static TextArea unsortedTA;
	static TextArea sortedTA;
	public  DateGUI(){
		
		
		JFrame myFrame = new JFrame();
		myFrame.setLayout(new GridLayout(1,1));
		myFrame.setTitle("Project 2");
		myFrame.setSize(400, 300);
		myFrame.setLocation(400,200);
		myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(1,1));
		myFrame.add(myPanel);
		setUnsorted(Project2.list);
		myPanel.add(unsortedTA);
		setSorted(Project2.list2);

		myPanel.add(sortedTA);
		myFrame.pack();
		myFrame.setVisible(true);
		
	
	}
	
	public void setUnsorted(DateList list){
		String unsorted = "";
		ArrayList<String> uns = list.returninBulk();
		
		for(int i=0; i<uns.size(); i++){
			unsorted += uns.get(i) + "\n";
		}
		
		DateGUI.unsortedTA = new TextArea(unsorted);
		DateGUI.unsortedTA.setEditable(false);
		
	}
	
	public void setSorted(DateList list){
		String sorted = "";
		ArrayList<String> sor = list.returninBulk();
		
		for(int i=0; i<sor.size(); i++){
			sorted += sor.get(i) + "\n";
		}
		
		DateGUI.sortedTA = new TextArea(sorted);
		DateGUI.sortedTA.setEditable(false);
	}
	
}

	