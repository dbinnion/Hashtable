package testpackage;

import java.util.Hashtable;

public class UseHash {
	public static void main(String [] args)
	{
		Hashtable table = new Hashtable();
		HashTable mytable = new HashTable(7);
		
		table.put("Sunday", "Sunday");
		table.put("Monday", "Monday");
		table.put("Tuesday", "Tuesday");
		table.put("Wednesday", "Wednesday");
		table.put("Thursday", "Thursday");
		table.put("Friday", "Friday");
		table.put("Saturday", "Saturday");
		
		mytable.put("Sunday");
		mytable.put("Monday");
		mytable.put("Tuesday");
		mytable.put("Wednesday");
		mytable.put("Thursday");
		mytable.put("Friday");
		mytable.put("Saturday");
		
		System.out.println(table.toString());
		
		System.out.println(mytable.get("Sunday"));
		System.out.println(mytable.get("Monday"));
		System.out.println(mytable.get("Tuesday"));
		System.out.println(mytable.get("Wednesday"));
		System.out.println(mytable.get("Thursday"));
		System.out.println(mytable.get("Friday"));
		System.out.println(mytable.get("Saturday"));
		
	}
}
