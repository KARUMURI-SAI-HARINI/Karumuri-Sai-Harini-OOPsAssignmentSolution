package Departments;

public class superDepartment {
	public String departmentName(String dept) {
		String deptname = "Super Department";
		System.out.println("Super Department");
		return deptname;
	}

	public String getTodaysWork(String twork) {
		String towork = "No Work as of now";
		System.out.println("No Work as of now");
		return towork;
	}

	public String getWorkDeadline(String gwd) {
		String gwdetails = "Nil";
		System.out.println("Nil");
		return gwdetails;
	}

	public String isTodayAHoliday(String hol) {
		String holiday = "Today is not a holiday";
		System.out.println("Today is not a holiday");
		return holiday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// E_Commerce a2 = new E_Commerce();
		superDepartment s = new superDepartment();
		adminDepartment a = new adminDepartment();
		hrDepartment h = new hrDepartment();
		techDepartment t = new techDepartment();

		a.departmentName("Admin Department");
		a.getTodaysWork("Complete your documents Submission");
		a.getWorkDeadline("Complete by EOD");
		s.isTodayAHoliday("Today is not a holiday");
		System.out.println("\n");
		h.departmentName("HR Department");
		h.getTodaysWork("Fill todays timesheet and mark your attendance");
		h.getWorkDeadline("Complete by EOD");
		h.doActivity("team Lunch");
		s.isTodayAHoliday("Today is not a holiday");
		System.out.println("\n");
		t.departmentName("Tech Department");
		t.getTodaysWork("Complete coding of module 1");
		t.getWorkDeadline("Complete by EOD");
		t.getTechStackInformation("core Java");
		s.isTodayAHoliday("Today is not a holiday");

	}

}
