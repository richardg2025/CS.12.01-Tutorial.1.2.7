# CS.12.01-Tutorial.1.2.7

This question involves identifying and processing the digits of a non-negative integer. The declaration of the Digits class is shown below. You will write the constructor and one method for the Digits class. 

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num) 
	{
		
		// To be implemented.

	}


	public boolean isStrictlyIncreasing()
	{

		// To be implemented.

	}

}

a) Write the constructor for the Digits class. The constructor initialises and fills digitList with the digits from the non-negative integer num. The elements in digitList must be Integer objects representing single digits, and appear in the same order as the digits in num. Each of the following examples shows the declaration of a Digits object and the contents of digitList as initialised by the constructor. 

Example 1

Digits d1 = new Digits(15704);

<img width="728" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.7/assets/57818506/8208af0f-2699-43c5-80c2-af218976e12e">

Example 2

Digits d2 = new Digits(0);

<img width="252" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.7/assets/57818506/82e786aa-8499-47f7-9c6c-4b2c20996fc3">


b) Write the Digits method isStrictlyIncreasing. The method returns true if the elements of digitList appear in strictly increasing order; otherwise, it returns false. A list is considered strictly increasing if each element after the first is greater than (but not equal to) the preceding element. 

The following table shows the results of several calls to isStrictlyIncreasing.

<img width="730" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.7/assets/57818506/ca6449f0-ae19-4e0e-83fd-abd64f3422eb">


