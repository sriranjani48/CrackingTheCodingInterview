
public class Solution {
	
	public String replaceSpace(String inputStr) {
		inputStr = inputStr.trim();
		StringBuilder outputStr = new StringBuilder();
		for(int i = 0; i < inputStr.length(); i++) {
			if(inputStr.charAt(i) == ' ') {
				outputStr.append("%20");
			}else {
				outputStr.append(inputStr.charAt(i));
			}
		}
		return outputStr.toString();
	}

}
