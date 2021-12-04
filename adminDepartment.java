package Departments;

public class adminDepartment extends superDepartment {
	public String departmentName(String dept) {
		String deptname = "Admin Department ";
		System.out.println("Welcome to Admin Department");
		return deptname;
	}

	public String getTodaysWork(String twork) {
		String towork = "Complete your documents Submission";
		System.out.println("Complete your documents Submission");
		return towork;
	}

	public String getWorkDeadline(String gwd) {
		String gwdetails = "Complete by EOD ";
		System.out.println("Complete by EOD");
		return gwdetails;
	}
}
