// TODO: Step 2 - Import file input statements here
/*
Prepare the file input code in Main
Follow the 5 steps needed to setup your method for file input:
Import the necessary classes for text file input
Declare variables you'll need to do the file input
Initialize those variables, make sure to use "Forage.csv" for your text file name
Create a loop that runs as long as there are lines of text in the file
Close the input stream after the loop ends
Build the Plant objects and store into an ArrayList
Create an ArrayList to store the Plant objects you'll build from the CSV file
for each run of the loop that reads a line of CSV text, build the Plant object and add it to your ArrayList object
TIP: before doing this part, just print the line of text read from the file to the console. If it matches Forage.csv that's proof that your loop is working! Then you can build the objects and add them to the ArrayList
To prove it runs, print out the ArrayList contents after you've closed the input stream.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		//TEST FOR STEP 1 (you can delete/comment this out after completing step 1)
		//Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		//System.out.println("test plant:\n" + test + "\n\n");

		//declarations
		Scanner inputStream = null;
		String temp = null;
		final String FILE_NAME = "Forage.csv";
		ArrayList<Plant> plantList = new ArrayList<>();

		//Connect input stream to file (dont forget the try/catch!)
		try
		{
			inputStream = new Scanner(new FileInputStream(FILE_NAME));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: File " + FILE_NAME + " was not found or could not be opened.");
		}
		if (inputStream != null){
			while (inputStream.hasNextLine()){
				String line = inputStream.nextLine();
				plantList.add(new Plant(line));
			}
		}
        //assert inputStream != null;
        inputStream.close(); //close the input stream
		System.out.println(plantList);

	}
}