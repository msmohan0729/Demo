package module3;

import java.util.HashMap;
import java.util.Map;

public class ProblemStatement2 {
	public static void main(String[] args) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("11", "Mohan");
		data.put("12", "Ravi");
		data.put("13", "Ragu");
		data.put("14", "Priya");
		
		for (Map.Entry<String,String> entry : data.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	}
}
