package HuffmanDecoding;

import java.io.*;
import java.util.*;

public class UserInput {

	/**
	* Asks the user to enter the name of text file containing the characters to be encoded 
	* 
	* @throws FileNotFoundException
	*/
	
	public void readCharacters() throws FileNotFoundException
	{
		
		//User is asked to enter the name of a file containing their characters to be read
		Scanner input = new Scanner(System.in);	
		String fileName = "";
		System.out.println("Type the name of the text file containing the characters to be read in");
		fileName = input.nextLine();
		if(fileName != "")
		{	
			//User file is read in if it is a valid file name 
			char nextVal;
			Scanner scanIn = null;
			scanIn = new Scanner(new BufferedReader(new FileReader(fileName))); 
			//If there is another value, read into array
			HuffmanTree code = new HuffmanTree();
			int i = 0;
			int intCount = 0;
			while(scanIn.hasNext()){
				nextVal = scanIn.next().charAt(0);

			}
		}
}
