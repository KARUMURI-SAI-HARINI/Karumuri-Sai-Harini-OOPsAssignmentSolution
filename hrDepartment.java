package Departments;

public class hrDepartment extends superDepartment {
	public String departmentName(String dept) {
		String deptname = "Hr Department ";
		System.out.println("Welcome to HR Department");
		return deptname;
	}

	public String getTodaysWork(String twork) {
		String towork = "Fill today’s timesheet and mark your attendance";
		System.out.println("Fill today’s timesheet and mark your attendance");
		return towork;
	}

	public String getWorkDeadline(String gwd) {
		String gwdetails = "Complete by EOD ";
		System.out.println("Complete by EOD");
		return gwdetails;
	}

	public String doActivity(String da) {
		String dactivity = "team Lunch";
		System.out.println("team Lunch");
		return dactivity;
	}

}
