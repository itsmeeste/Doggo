import java.util.ArrayList;

public class Doggo {
	
	
	public String returnPlace (int position)
	{
		String place = "";
		
		switch(position)
		{
		case 2:
		case 22:
		case 32:
		case 42:
		case 52:
		case 62:
		case 72:
		case 82:
		case 92:
			place = "nd";
			break;
		case 3:
		case 23:
		case 33:
		case 43:
		case 53:
		case 63:
		case 73:
		case 83:
		case 93:
			place = "rd";
		break;
		
		case 1:
		case 21:
		case 31:
		case 41:
		case 51:
		case 61:
		case 71:
		case 81:
		case 91:
			place = "st";
			break;
			
		default:
			place = "th";
		}
		
		
		return  position +place;
	}
	
	public ArrayList<String> returnList(int num)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 1; i <=100; i++)
		{
			if(num == i)
				continue;
			list.add(returnPlace(i));
		}
		return list;
	}
	
	public void printAll(ArrayList<String> list)
	{
		for(String p : list)
		{
			System.out.println(p);
		}
	}

}
