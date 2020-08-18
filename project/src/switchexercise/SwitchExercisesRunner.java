package switchexercise;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		// System.out.println(determineNameOfDay(0));
		// System.out.println(isWeekDay(5));
		System.out.println(determineNameOfMonth(0));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		// case 0 :
		// case 6:
		// return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}
		return false;
	}

	// determine name of day if we want to write result="";
	// result = "monday" then we need break,if we dont want to use break we can
	// directly return
	// name of the month is also same like this
	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}
		return "Invalid_day";
	}



	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 0:
			return "january";
		case 1:
			return "february";
		case 2:
			return "march";
		case 3:
			return "april";
		case 4:
			return "may";
		case 5:
			return "june";
		case 6:
			return "july";
		case 7:
			return "august";
		case 8:
			return "september";
		case 9:
			return "october";
		case 10:
			return "november";
		case 11:
			return "december";
		}
		return "Invalid_day";
	}

}