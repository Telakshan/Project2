import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project2 {
	
	static DateList list = new DateList();
	static DateList list2 = new DateList();
	static DateGUI gui;
	/*
	 * The main method will read the input file and store it in the datelists
	 * and It will launch the gui with sorted and unsorted lists
	 */
	
	public static void main (String[] args) throws FileNotFoundException{
		
		
		
		File file = new File("file.txt");
		
		Scanner scan = new Scanner(file);
		
		
			while(scan.hasNextLine()){
				String line = scan.nextLine();
				StringTokenizer token = new StringTokenizer(line, ",\n");
				while(token.hasMoreTokens()){
					
					String date = token.nextToken(); //pass the data as string
					
					Date212 Date = null;
					
					if(bool(date)){ //if the date is valid, add it to the date212 object
						Date = new Date212(date);
						list.append(Date);
						list2.insert(Date);
					}
					else{
						System.out.println(date);
					}
					}
					
					
					}
					
			scan.close();
			gui = new DateGUI(); //launches gui
	}

	/*
	 * This boolean method checks if the date object is valid 
	 * Same method I used in project1
	 */
			public static boolean bool (String x){
			    
			     boolean bool = true; //check if date is valid
			     String baseCase = "0123456789";
			     if(x.equals("00000000")) return false;
			     
			     
			     for(int i = 0; i <x.length(); i++){  
			    	
			    	 if(baseCase.indexOf(x.charAt(i))!=-1){//checks to see that number is positive and doesnt contain any letter using indexof and charAt
			    		
			    		 bool = bool & true;  //bool is true if it doesn't
			    	 }
			    	 else{
			    	 
			    		 bool = bool & false; // or else false
			    	 }
			     }
			    	 if(x.length()!=8){  //if statement that checks if the string equals 8 chars
			    		
			    		 bool = bool & false; 
			    	 }
			    	 else bool = bool & true; 
			     
			     return bool; 
			 }
			
		
		
		
		
		
		
		
		
		
		
	}
	


