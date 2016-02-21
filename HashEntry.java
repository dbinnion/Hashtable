package testpackage;

public class HashEntry {
	private String value;
	private int key;
	
	public HashEntry(int input, String string_input)
	{
		key=input;
		value=string_input;
	}
	
	public String getvalue()
	{
		return value;
	}
	
	public int getKey()
	{
		return key;
	}
	
	@Override
	public String toString()
	{	
		String output = key+"="+value;		
		return output;
	}
}
