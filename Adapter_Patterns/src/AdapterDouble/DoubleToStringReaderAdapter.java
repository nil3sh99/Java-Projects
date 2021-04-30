import java.util.LinkedList;

//Adapter class extending the Target Class

public class DoubleToStringReaderAdapter extends StringReader {
	DoubleReader l_doubleReader;
	
	public DoubleToStringReaderAdapter(DoubleReader p_dr) {
		
		l_doubleReader = p_dr;
	}
	
	public LinkedList<String> read_kbd() {
		LinkedList<Double> l_double = l_doubleReader.read_double();
		 LinkedList<String> double_strings = new LinkedList<String>();
		 for(Double d:l_double) {
			 String l_s = String.valueOf(d);
			 double_strings.add(l_s);
		 }
		 return double_strings;
	}
}
