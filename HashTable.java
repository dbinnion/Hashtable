package testpackage;

import java.util.Vector;

public class HashTable {
	Object [] hash;
	
	public HashTable(int length)
	{
		hash = new Object [length];
		for (int i=0;i<hash.length;i++)
		{
			hash[i]=null;
		}
	}
	
	public void put(String input)
	{
		int key = computeKey(input, hash.length);
		
		if(hash[key] != null)
		{
			//if multiple items with key, add to set of items
			if (hash[key] instanceof Vector<?>)
			{
				Vector <HashEntry> temp = (Vector<HashEntry>) hash[key];
				HashEntry newentry = new HashEntry(key,input);
				temp.add(newentry);
				hash[key]=temp;
			}
			else //make set of items, add value to that set
			{
				Vector <HashEntry> temp = new Vector();
				temp.add(((HashEntry)hash[key]));
				HashEntry newentry = new HashEntry(key,input);
				temp.add(newentry);
				hash[key]=temp;
			}
		}
		else //nothing found, place item
		{
			hash[key]= new HashEntry(key,input);
		}
	}

	public HashEntry get(String input)
	{
		HashEntry output;
		
		int key = computeKey(input, hash.length);
		
		if(hash[key] instanceof Vector<?>)
		{
			//only output the first element in the vector because i'm lazy
			output=((Vector<HashEntry>)hash[key]).firstElement();
		}
		else
		{
			output = ((HashEntry)hash[key]);
		}
		return output;
			
	}
	
	public int computeKey(String input, int length)
	{
		int key=0;
		int modnum=length;
		
		for(int i=0;i<input.length();i++)
		{
			int c = (int) input.charAt(i);
			key=key ^ c;	//xor by the character
			key%=modnum;	//mod by the length
		}
		
		return key;
	}
}
