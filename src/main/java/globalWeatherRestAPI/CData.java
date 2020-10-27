package globalWeatherRestAPI;

public class CData {
	//This method accepts the payload as a String, formats the CData in the payload and returns the formatted String
	
	public static String fetchCData(String input) {
		int endsAt = 0;
		int startsAt = input.indexOf("&lt;NewDataSet");
		if(input.contains("]]>")) {
			endsAt = input.indexOf("]]>"); 
		}
		else {
		    endsAt = input.indexOf("/NewDataSet&gt;") + 15;
		}
	    String output = input.substring(startsAt, endsAt);
	    output = output.replaceAll("&lt;", "<")
				.replaceAll("&gt;", ">")
				.replaceAll("\\\\n", "")
				.replaceAll("\\n", "")
				.trim();
		return output;
	}
}
