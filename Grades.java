

import io.*;


/*The main method just takes the input from the user, calls the validation module on 
  input values and then passes the state of validity and the values to the output module*/
public class Grades 
{
		public static void main(String[] args)
	 	{
			int grade, numAss;
			boolean valid;
			grade = ConsoleInput.readInt("Enter the Kid's Grade");
			numAss = ConsoleInput.readInt("Enter the number of assessmesnts");
			valid = isValid(grade, numAss);
			output(valid, grade, numAss);
		}
		

			/*This is a standard Validation sub module that checks for conditions outside
			  of what the program should be dealing with and then it returns the state of validity
			  back to main*/



		public static boolean isValid(int grd, int nA)
		{
			boolean vld = false;
			if ((grd >= 50)&&(grd < 101)&&(nA >= 0)&&(nA < 6)&&(grd > 0)&&(nA > 0))
			{
				vld = true;
			}
			return vld;
		}



		/*Method takes the passed grade value then typecasts it into a double for calculation
		  Then it divides the grade by 10 and rounds it to get the prefix value, typecasting back to
		  int to remove the ugly decimal point in output. 
		  it then proceeds to form the String and return it to main */



		public static String concatenate(int grd, int nA)
		{
			double gd = (double)grd;
			Double digit = Math.floor(gd / 10.0);
			int prefix = digit.intValue();
			String g = Integer.toString(prefix);
			String n = Integer.toString(grd);
			String returnString = (g + " - " + n);
			return returnString;
		}

		/*This module handles all of the output for the program, it recieves the valid boolean
		  and selects the correct path in relation to it*/



		public static void output(boolean valid, int grade, int numAss)
		{
			String finalMark = " ";
			if (valid)
			{
				finalMark = concatenate(grade, numAss);
				System.out.println("The Kid's final grade is: " + finalMark);
			}
			else if ((!valid)&&(grade > 0)&&(numAss < 5))
			{
				System.out.println("The child has not completed and failed: DNC-"+ grade);
			}
			else if ((!valid)&&(grade > 0)&&(numAss == 5)) 
			{
				System.out.println("The kid failed with a grade of F-" + grade); 		
			}
			else
			{
				System.out.println("I hope you dont think you're funny?");
			}
		}
			
}