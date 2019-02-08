package week2.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Learnmap {
	
	public void map()
	{
Map<Integer,String> map= new HashMap<>();
		
		map.put(1,"arun");
		map.put(2,"sangee");
		map.put(3,"sant");
		map.put(4,"durai");
		map.put(5,"kart");
		
		for(Entry<Integer,String> eachmap :map.entrySet())
		{
			System.out.println(eachmap.getKey() +" -->" + eachmap.getValue());
		}
	
	}

	public static void main(String[] args) {
		
		/*Learnmap lm=new Learnmap();
		lm.map();*/
        
		findduplicates fd=new findduplicates();
		fd.finddup();
		
}

}
class findduplicates
{
	
	public void finddup()
	{
		String txt="Welcome";
	    char[] ch=txt.toCharArray();
		
	    Map<Character, Integer> map= new HashMap<>();
	    
	for(char c:ch)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}
		else
		{
			map.put(c, 1);
		}
	}
	    
	for(Entry<Character, Integer> :)
	    
	    
}}
	
	
	
	
	
	
	
