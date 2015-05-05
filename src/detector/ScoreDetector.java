package detector;


import java.io.PrintWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScoreDetector {

	/**
	 * @param args
	 */
	
	// CONTINUE - Incorporate file reader. Host on Heroku to test if overwriting will work while on Heroku.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	public static String parseReviews(String reviews) throws IOException{
		String separator_type = System.getProperty("file.separator");
		String user_dir = System.getProperty("user.dir").concat(separator_type);
		String path = user_dir.concat("reviews.txt");
		
		System.out.println(path);
		
		//Textfile Writer
		PrintWriter out = new PrintWriter(path);
		out.println(reviews);
		out.close();
	
		//Textfile Reader
		String content = readFile("reviews.txt", StandardCharsets.UTF_8);
		//THIS IS WHERE ANY COUNTERFEIT DETECTION OPERATIONS TAKE PLACE
		//SHOULD RETURN SCORE
		//SCORE SHOULD BE CONVERTED TO STRING AND RETURNED
		
		//int score = 4;
		//return Integer.toString(score);
		
		//For now, Textfile content is returned to test Heroku writing function
		return content;
	}
	
	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
	

}
