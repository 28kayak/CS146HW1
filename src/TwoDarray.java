import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;


public class TwoDarray 
{
	/*this class is to read a puzzle board from text-file
	 * and read contained words in the board.
	 * After reading the file line by line, break up into char array
	 * and restore the data into 2-dimensional array
	 */
	
	public static void main(String[] args)
	{
		//System.out.println("hello");
		String inputFileName = "/Users/kaya/Documents/CSAssignments/CS146HW1/src/input.txt";//name of input file
		File inputFile = new File(inputFileName);
		char[][] puzzle = new char[4][4];//[row][column]
		try
		{
			//creating instances of input-stream
			FileInputStream fis = new FileInputStream(inputFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			
			//read data from text-file 
			String contained;
			String line;
			contained = br.readLine();
			//since my input file stores contained word at the 1st line,
			//read it different from the board info
			System.out.println("1st line: " + contained);
			char[] rowChars;
			int rowIndex = 0;
			int columnIndex;
			
			// read rest of rows
			while((line = br.readLine())!= null)
			{//output the data on a terminal
				System.out.println(line);
				rowChars = line.toCharArray();
				for(columnIndex = 0; columnIndex < rowChars.length;columnIndex++)
				{//walk thought column one by one
					
					System.out.println("columnIndex = " + rowChars[columnIndex]);
					//insert rowChars[columnIndex] into puzzle[rowIndex][columnIndex]
					puzzle[rowIndex][columnIndex] = rowChars[columnIndex];
					System.out.printf("puzzle[%d][%d] = " + puzzle[rowIndex][columnIndex]+ "\n", rowIndex,columnIndex);
							
				}
				rowIndex++;//move to the next row
				
				
			}
			//close the file
			br.close();
			
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}//main

}//TwoDarray
 