package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class student {

    int rollno;
    String name;
    String grade = "NA";
    String result;
    int total = 0;
    String gradeDesc;
    String groupDesc;

    @Test(groups = {"Basic","Advance"},dataProvider = "studentdata")
    public void getData(String s_name, int roll_no, int s_total) {

        this.name = s_name;
        this.rollno = roll_no;
        this.total = s_total;
        System.out.println("student information is fetched");
    }

    @Test(groups = "Advance",priority = 1)
    public void getResult() {

        if (total > 200)
            result = "Pass";
        else
            result = "fail";
        System.out.println("student result is Added");
    }

    @Test(groups = "Advance",priority = 2)
    public void getGrade() {

        if (total > 350)
            grade = "A";
        else if (total >= 300)
            grade = "B";
        else if (total >= 250)
            grade = "C";
        else
            grade = "NA";
        System.out.println("student Grade is Added");
    }

    @Test(groups = "Advance",dependsOnMethods = "getGrade")
    public void assignGradeDesc() {

        if (grade.equals("A"))
            gradeDesc = "Frist Class";
        else if (grade.equals("B"))
            gradeDesc = "Second Class";
        else if (grade.equals("NA"))
            gradeDesc = "NA";
        else
            gradeDesc = "Third Class";
        System.out.println("student Grade Description is Added");
    }

    @Test(groups = "Advance",priority = 3)
    public void assignGroup() {

        if (grade.equals("A"))
            groupDesc = "Maths";
        else if (grade.equals("B"))
            groupDesc = "Science";
        else
            groupDesc = "Arts";

        System.out.println("student Group is Added");
    }

    @Test(groups = "Advance", priority = 4)
    public void displaydata() {

        System.out.println("\nName : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Total : " + total);
        System.out.println("Result : " + result);
        System.out.println("Grade : " + grade);
        System.out.println("grade Desc : " + gradeDesc);
        System.out.println("Group Allocated : " + groupDesc+"\n");


    }
    @Test(groups = "Basic",priority = 4)
    public void displayBasicdata() {
        System.out.println("\nName : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Total : " + total+"\n");
    }

    @DataProvider(name = "studentdata")
    public Object[][] table1() {

        Object[][] t1 = new Object[][]{
                {"student1", 101, 345}
        };

        return t1;

    }
}
