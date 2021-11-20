public class codec {
 
	    public String compression(String comStr) {
		// To check if the string to be compressed in empty.	        if (str == null || comStr.isEmpty()) return "";
	      StringBuilder strBuilder = new StringBuilder();
	        char[] chars = comStr.toCharArray();
	        char current = chars[0];
	        int counter = 1;
	 
        for (int i = 1; i < chars.length; i++) {
	            if (current == chars[i]){
	                counter++;
	            } else {
	                if (counter > 1) strBuilder.append(counter);
	                strBuilder.append(current);
	                current = chars[i];
	                counter = 1;
	            }
	        }
	        if (counter > 1) strBuilder.append(counter);
	        strBuilder.append(current);
	        return strBuilder.toString();
	    }
	 
	    public String decompression(String decomStr) {	        
            if (string == null || decomStr.isEmpty()) return "";
	 
	        StringBuilder strbuilder = new StringBuilder();
	        char[] chars = decomStr.toCharArray();
	        boolean preIsDigit = false;
	        String digitsString = "";
	        for(char current: chars) {
	            if (!Character.isDigit(current)) {
	                if (preIsDigit){
	                    String multipleString = new String(new char[Integer.valueOf(digitsString)]).replace("\0",current+"");
	                    strBuilder.append(multipleString);
	                    preIsDigit = false;
	                    digitString = "";
	                } else{
	                    strBuilder.append(current);
	                }
	            } else {
	                digitsString+=current;
	                preIsDigit = true;
	            }
	        }
	        return strBuilder.toString();
	    }
	}