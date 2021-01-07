package databean;
//overriding equals() , hashCode() and toString() methods of Object Class
public class Student {
    private int rollNo;
    private String name;

    //override equals()
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        //checking type of current object and obj
        if(obj instanceof Student){
            //compare instance variables for equality
            //first cast obj to Student
            Student student = (Student)obj;
            //now compare
            if(rollNo == student.rollNo && name.equals(student.name)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
