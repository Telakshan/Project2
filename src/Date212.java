
public  class Date212  {
	
	private int day;
	private int month;
	private int year;
	private String Date;
	/*
	 * Constructor takes in date212 object as a string
	 */
	public Date212(String d){
		
		this.Date = d;
		
	if(valid(Date)!=false){
		year = Integer.parseInt(Date.substring(0,4));
		month = Integer.parseInt(Date.substring(4,6));
		day = Integer.parseInt(Date.substring(6,8));
	}
		
	}
	/*
	 * checks if the date212 object passed in is valid or not
	 */
	public static boolean valid(String date){
		int n = Integer.parseInt(date);
		int length = (int)(Math.log10(n)+1);
		int y = Integer.parseInt(date.substring(0,4));
		int m =	Integer.parseInt(date.substring(4,6));
		int d = Integer.parseInt(date.substring(6,8));
		if(length>8 || length<8) return false;
		if(m<1 || m>12) return false;
		if(d<1 || d>31) return false;
		if(y<1000 || y>9999) return false;
		return true;
		
	}
	
/*
 * forGUI() puts it in the string form mm/dd/yyyy 
 * 
 */
	
	public  String  forGUI(){
		
		String stringDates = "";
		if(month<10){
			stringDates += "0" + Integer.toString(this.month) + "/";
			}
		else {
			stringDates +=Integer.toString(this.month) + "/";
		}
		if(day<10){
			stringDates +="0" + Integer.toString(this.day) + "/";
		}
		else{
			stringDates += Integer.toString(this.day) + "/";
		}
		
		stringDates += Integer.toString(this.year);
		return stringDates;
	}
	/*
	 * compareto method compares year month and days returns a positive 
	 * or a negative value
	 */
	
	public int compareTo (Date212 other){
		
		int value = 0;
        if (this.year == other.year) {
        	
        	if (this.month == other.month)
 
        	{   
        		if (this.day == other.day) 
                      			
        		   value = 0;
                 
        		else if (this.day < other.day)
        			value = -1;  
        		else if (this.day > other.day)
        			value = 1;
        	}        		
        		
                else if (this.month < other.month)
                	value = -1;  
            		
                else if (this.month > other.month)
                	value = 1; 
            }    	 
       
        else if (this.year < other.year)
        	value = -1;  
  		
      
        else if (this.year > other.year)
        	value = 1;
		       
        
    
        return value;
	}
		
}
