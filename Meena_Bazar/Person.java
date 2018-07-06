package Meena_Bazar;
import java.util.Scanner;
public class Person {

	private String personId;
	private String personName;
	
	Scanner myscanner;
	
	public Person()
	{
		myscanner = new Scanner(System.in);
	}
	
	// input method
	public void inputPersonInfo()
	{
		System.out.println("Input person Id");
		personId = myscanner.next();
		myscanner.nextLine();
		System.out.println("Input person name");
		personName = myscanner.nextLine();
	}
	
	// getting person id
	public String getPersonId()
	{
		return personId;
	}
	
	// getting person name
	public String getPersonName()
	{
		return personName;
	}
	
}
