import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	
		// Input
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> hoursArray = new ArrayList<>();
		ArrayList<Integer> minutesArray = new ArrayList<>();
		
		// Main Logic
		for (int i = 0; i <= 999; i++) {
			String inputDuration = input.nextLine();
			if (inputDuration.equals("End")) {
				break;
			}
			else {
				String[] durationArray = inputDuration.split(":");
				for (int j = 0; j < durationArray.length; j++) {
					if (j == 0) {
						hoursArray.add(Integer.parseInt(durationArray[0]));
					}
					else {
						minutesArray.add(Integer.parseInt(durationArray[1]));
					}
				}
			}
		}
		
		int hours = 0;
		for (Integer hour : hoursArray) {
			hours += hour;
		}
		
		int minutes = 0;
		for (Integer minute : minutesArray) {
			minutes += minute;
		}
	
		// Output
		if (minutes >= 60) {
			hours = hours + minutes /60;
			minutes = minutes %60;
		}
		if (minutes < 10) {
			System.out.println(hours + ":" + 0 + "" + minutes);
		}
		else {
			System.out.println(hours + ":" + minutes);
		}
	}
}
