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
		String contained ="";
		int row = 0;
		int column = 0;
		char[][] puzzle; //= new char[4][4];//[row][column]
		int lengthPuzzle = 0;
		try
		{
			//creating instances of input-stream
			FileInputStream fis = new FileInputStream(inputFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			//read data from text-file 
			String line;
			contained = br.readLine();
			//since my input file stores contained word at the 1st line,
			//read it different from the board info
			System.out.println("1st line: " + contained);
			char[] rowChars;
			
			row = 0;//initialize rowIndex to be 0
			// read rest of rows
			while((line = br.readLine())!= null)
			{//output the data on a terminal
				System.out.println(line);
				rowChars = line.toCharArray();
			    lengthPuzzle = rowChars.length;
			    puzzle = new char[lengthPuzzle][lengthPuzzle];
				for(column = 0; column < rowChars.length;column++)
				{//walk thought column one by one
					
					System.out.println("columnIndex = " + rowChars[column]);
					//insert rowChars[columnIndex] into puzzle[rowIndex][columnIndex]
					puzzle[row][column] = rowChars[column];
					System.out.printf("puzzle[%d][%d] = " + puzzle[row][column]+ "\n", row,column);
							
				}
				row++;//move to the next row
				System.out.println("rowIndex = " + row );
				System.out.println("columnIndex = " + column);
			}
			//close the file
			br.close();
			
			//System.out.println();
			System.out.println();
			System.out.println();
			String[] keyWord = contained.split(" ");//to hold string type word 
			for(int i = 0; i < keyWord.length; i++)
			{
				System.out.printf("splited[%d] = " + keyWord[i] + "\n",i);
				
			}
			
			//Search!
			int kyloc = 0;
			String candidate1 = "";
			String[] candicates = new String[4];
			while(kyloc < keyWord.length)
			{
				char fl = keyWord[kyloc].charAt(0); //get the first letter of keyword
				for(int i = 0; i < lengthPuzzle; i++)
				{
					for(int j = 0; j < lengthPuzzle; j++)
					{
						if(fl == puzzle[i][j])
						{
							for(int k = 0; k < keyWord[kyloc].length(); k++)
							{
								int t = i;
								if((t < 0) || (t > keyWord.length))
								{
									candidate1 += " ";
								}
								else
								{
									for(int index = 0; index < keyWord[kyloc].length();index++)
									{
										if(index < 0)
										{
											candidate1 += " ";
										}
										else
										{
											candidate1 += String.valueOf(puzzle[index][j]);
										}
									}//for-index
									candidate1 = String.valueOf(puzzle[t][j]) + String.valueOf(puzzle[t-1][j]) 
											+ String.valueOf(puzzle[t-2][j]) + String.valueOf(puzzle[t-3][j]);
								}
								
								
							}//for-k
						}//if
					}//for-j
				}// for-i
				kyloc++;
			}//while
		}//try
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}//main
	
}//TwoDarray
 