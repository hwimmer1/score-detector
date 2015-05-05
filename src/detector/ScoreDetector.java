package detector;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ScoreDetector {

	/**
	 * @param args
	 */
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
	}
	
	
	public static String parseReviews(String path) throws IOException {
		
		String score = readFile(path, StandardCharsets.UTF_8);
		
		return score;
	}
	
	  static String readFile(String path, Charset encoding) throws IOException {
		    byte[] encoded = Files.readAllBytes(Paths.get(path));
		    return new String(encoded, encoding);
	  }
	

}
