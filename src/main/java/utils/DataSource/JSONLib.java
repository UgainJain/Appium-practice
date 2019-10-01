package utils.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JSONLib{
	public static JSONParser parser ;
	public static JSONObject jobject;
	public static Object obj; 
	public static String ReadFromJson(String file,String token) throws FileNotFoundException, IOException, ParseException {
		parser = new JSONParser();
		String filepath = System.getProperty("user.dir")+"\\Resources\\JSON\\"+file+".json";
		obj = (Object)parser.parse(new FileReader(filepath));
		jobject = (JSONObject)obj;
		String data = (String)jobject.get(token);
		return data;
}
	
	
}