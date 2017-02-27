package Software_Reliability.src;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
	RandomArray ra = new RandomArray();

	public void writeTo(String theFile, int numberOfArrays, int lengthOfArray) {
		try {
			PrintWriter writer = new PrintWriter(theFile, "UTF-8");
			for (int i = 0; i < numberOfArrays; i++) {
				writer.println(ra.getRandArray(lengthOfArray));
			}
			writer.close();

		} catch (IOException e) {
			System.out.println("Error occured while writing to file!");
		}

	}
}
