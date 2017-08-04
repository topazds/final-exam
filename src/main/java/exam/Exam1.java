package exam;

public class Exam1 {

	public long checkinput(long input) {
		String result = String.valueOf(input);
		int count = result.length();
		if (result.length() > 1) {
			int atStart = result.length() - 2;
			int atEnd = result.length() - 1;
			for (int i = 0; i <= count; i++) {
				result = String.valueOf(input);
				if (result.length() > 1) {
					if (result.charAt(atStart) > result.charAt(atEnd)) {
						input--;
						// i--;
					} else if (atStart!=0 && result.charAt(atStart - 1) > result.charAt(atStart)) {
						String inputString = String.valueOf(input);
						StringBuilder inputfixed = new StringBuilder(inputString);
						atStart--;
						atEnd--;
						String fixchar = result.charAt(atStart)+""+result.charAt(atEnd);
						int fixcharToInt = Integer.valueOf(fixchar);
						fixcharToInt--;
						fixchar = String.valueOf(fixcharToInt);
						inputfixed.setCharAt(atStart, '0');
						inputfixed.setCharAt(atEnd, fixchar.charAt(0));
						input = Long.valueOf(inputfixed.toString().trim());
					} else if(atStart!=0){
						atStart--;
						atEnd--;
					}else {
						return input;
					}
				}

			}
		}
		return input;
	}
}
