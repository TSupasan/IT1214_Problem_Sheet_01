class Student { 
    private String name; 
    private int exam1; 
    private int exam2; 
    private int exam3; 

    public Student(String name, int exam1, int exam2, int exam3) { 
        this.name = name; 
        setExam1(exam1); 
        setExam2(exam2); 
        setExam3(exam3); 
    } 

    public void setExam1(int exam1) { 
        validateScore(exam1); 
        this.exam1 = exam1; 
    } 

    public void setExam2(int exam2) { 
        validateScore(exam2); 
        this.exam2 = exam2; 
    } 

    public void setExam3(int exam3) { 
        validateScore(exam3); 
        this.exam3 = exam3; 
    } 

    public String getName() { 
        return name; 
    } 

    public int getExam1() { 
        return exam1; 
    } 

    public int getExam2() { 
        return exam2; 
    } 

    public int getExam3() { 
        return exam3; 
    } 

    public double calculateAverage() { 
        return (exam1 + exam2 + exam3) / 3.0;
    } 

    private void validateScore(int score) { 
        if (score < 0 || score > 100) { 
            throw new IllegalArgumentException("Marks must be between 0 and 100!"); 
        } 
    }
} 
 class Question05 {
    public static void main(String[] args) { 
        try { 
            Student student = new Student("John", 75, 110, 90); 
            System.out.println("Name = " + student.getName()); 
            System.out.println("Exam 1 marks = " + student.getExam1()); 
            System.out.println("Exam 2 marks = " + student.getExam2()); 
            System.out.println("Exam 3 marks = " + student.getExam3()); 
            System.out.println("Average is = " + student.calculateAverage()); 
        } catch (Exception e) { 
            System.out.println("Error! " + e.getMessage()); 
        } 
    }
} 