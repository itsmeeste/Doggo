import java.util.ArrayList;

public class DoggoMain {
	
	public static void main(String [] args)
	{
		Doggo d = new Doggo();
		
		System.out.println(d.returnPlace(20));
		ArrayList<String> list = d.returnList(76);
		d.printAll(list);
	}

}
