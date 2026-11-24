
public class IntroToArrays {

	public static void main(String[] args) {
	
		DecimalFormat dc = new DecimalFormat(0.00)
		
		int total = 0;
		
		int[]scores = { 75, 82, 68, 90, 77, 85, 57}
		
	    for (int i = 0; i < scores.length; i++)
	    {
	    	total += scores[i]
	    }
		
		double average = (double)total/scores.length;
				
		System.out.println("Total = " + total);
				
		System.out.println("Average = " + dc.format(average));

	}

}
