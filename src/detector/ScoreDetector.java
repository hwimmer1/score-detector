package detector;


import java.io.PrintWriter;
import java.io.IOException;

public class ScoreDetector {

	/**
	 * @param args
	 */
	
	// CONTINUE - Incorporate file reader. Host on Heroku to test if overwriting will work while on Heroku.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		parseReviews("TESTERa fndsai sdin");
		
	}
	
	
	public static String parseReviews(String reviews) throws IOException{
		String separator_type = System.getProperty("file.separator");
		String user_dir = System.getProperty("user.dir").concat(separator_type);
		String path = user_dir.concat("reviews.txt");
		
		System.out.println(path);
		
		PrintWriter out = new PrintWriter(path);
		out.println(reviews);
		out.close();
	
		
		//add textfile writing function
		
		//add textfile reading function
		int score = 4;
		return Integer.toString(score);
	}
	
	

}
