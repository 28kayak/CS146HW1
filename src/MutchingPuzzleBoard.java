
public class MutchingPuzzleBoard
{
	private char[][] puzzle;//hold puzzle board 
	private String[] keyWords;
	int lengthPuzzle;
	int numKey;
	MutchingPuzzleBoard(char[][] pBoard, String[] kyList, int plength)
	{
		puzzle = pBoard;
		keyWords= kyList; 
		lengthPuzzle = plength;
		numKey = keyWords.length;
	}
	public void mutchingRtoL()
	{
		int kyloc = 0;
		String candidate1;
		String[] candicates = new String[numKey];
		String result = "";
		int kylength;
		while(kyloc < keyWords.length)
		{
			String currentKey = keyWords[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = j-k;
							if(t < 0 || t >= lengthPuzzle)
							{
								
								candidate1 += " ";
							}
							else
							{
								candidate1 += String.valueOf(puzzle[i][t]);
								
							}	
						}//for-k
						if(keyWords[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}
	public void mutchingLtoR()
	{
		int kyloc = 0;
		String candidate1;
		String[] candicates = new String[numKey];
		String result = "";
		int kylength;
		while(kyloc < keyWords.length)
		{
			String currentKey = keyWords[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = j+k;
							if(t < 0 || t >= lengthPuzzle)
							{
								candidate1 += " ";
							}
							else
							{
								candidate1 += String.valueOf(puzzle[i][t]);
							}	
						}//for-k
						if(keyWords[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}
	
	public void mutchingTtoD()
	{
		int kyloc = 0;
		String candidate1;
		String[] candicates = new String[numKey];
		String result = "";
		int kylength;
		while(kyloc < keyWords.length)
		{
			String currentKey = keyWords[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = i+k;
							if(t < 0 || t >= lengthPuzzle)
							{	
								System.out.println("--------in if-statement----------");
								
								candidate1 += " ";
								System.out.println("(t,j, lengthPuzzle) = " +"("+ t + "," + j + ","+lengthPuzzle + ")" );
								
							}
							else
							{
								//System.out.println("--------in else-statement----------");
							    //System.out.println(candidate1);
							    //System.out.println("(t,j, lengthPuzzle) = " +"("+ t + "," + j + ","+lengthPuzzle + ")" );
								candidate1 += String.valueOf(puzzle[t][j]);
								
							}	
						}//for-k
						if(keyWords[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}//mutchingTtoD();
	
	public void muchingDtoT()
	{
		int kyloc = 0;
		String candidate1;//Temporally store char which is cast to string
		String[] candicates = new String[numKey];//store String around puzzle[i][j]
		String result = "";//store the final result
		int kylength;
		while(kyloc < keyWords.length)
		{
			String currentKey = keyWords[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = i-k;
							if(t < 0 || t >= lengthPuzzle)
							{
								
								candidate1 += " ";
							}
							else
							{
								candidate1 += String.valueOf(puzzle[t][j]);
								
							}	
						}//for-k
						if(keyWords[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}//muchingDtoT()
	public void printPuzzle()
	{
		int col;
		int row = 0;
		while(row < lengthPuzzle)
		{
			for(col = 0; col< lengthPuzzle; col++)
			{
				System.out.print(puzzle[row][col]);
			}
			System.out.println();
			row++;
		}
	}
	

}
