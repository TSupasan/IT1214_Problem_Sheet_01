
class Student{
    private int studentId;
    private String name;
    private int daysAttended;

Student(int studentId,String name,int daysAttended){
    this.studentId = studentId;
    this.name = name;
    this.daysAttended = daysAttended;
}
    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public int getdaysAttended(){
        return daysAttended;
    }

    public void setStudentId(int S1){
        studentId = S1;
    }

    public void setName(String S1){
        name = S1;
    }

    public void setdatyAttended(int days){
        daysAttended = days;
    }

}

class Classroom{
    String stName[] = new String[10];
    int stid[] = new int[10];
    int daysAttended[] = new int[10]; 
    int numberOfStudents = 0;
    

    public void addStudent(String S1,int id,int date){
        if(numberOfStudents <= 9){
            stName[numberOfStudents] = S1;
            stid[numberOfStudents] = id;
            daysAttended[numberOfStudents] = date;
            numberOfStudents++;
        }else{
            System.out.println("Maximum Naumber of Studnts are added");
        }

    }

    public boolean validateID(int id){
            for(int item:stid){
                if(item == id){
                    return true;
                }
            }
            return false;
        }


    public void stDetails(int id){

        if(validateID(id)){
            for(int i = 0; i <= numberOfStudents;i++){
                if(id == stid[i]){
                    System.out.println("Student Id - " + stid[i]);
                    System.out.println("Student Name: " + stName[i]);
                    System.out.println("Attendence: "+daysAttended[i]+" Days");
                    System.out.println();
                } 
            }
        } else {
            System.out.println("Student is not Enrolled in this class");
        }

    }

    public void editAttendance(int id,int newDate){
        if (validateID(id)){
                    for(int i = 0;i <= numberOfStudents;i++){
            if(id == stid[i]){
                daysAttended[i] = newDate;
            }
        }
        } else{
            System.out.println("Student " +id+ " is not enrolled in this class");
        }

    }

    public void printClass(){
        System.out.println(("Student ID | \tStudent Name | \tAttendance"));
            for(int i = 0;i<=numberOfStudents;i++){
            if(stid[i] != 0){
            System.out.println(stid[i] + "\t\t" + stName[i] + "\t" + daysAttended[i]);
            }
        }
    }

    
}


class Problem01{
    public static void main(String[] args){
        Student st01 = new Student(101,"Alice Smith",12);
        Student st02 = new Student(102,"Bob Jones",15);
        Student st03 = new Student(103,"Carol Lee",10);
        
        Classroom class01 = new Classroom();

        class01.addStudent(st01.getName(),st01.getStudentId(),st01.getdaysAttended());
        class01.addStudent(st02.getName(),st02.getStudentId(),st02.getdaysAttended());
        class01.addStudent(st03.getName(),st03.getStudentId(),st03.getdaysAttended());

        class01.editAttendance(104,16);

        class01.printClass();


    }
}

