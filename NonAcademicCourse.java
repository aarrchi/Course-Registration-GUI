public class NonAcademicCourse extends Course
{   //instance variables / own properties of NonAcademicCourse
    private String instructorName;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //parameterized contructor
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);
        
        this.prerequisite = prerequisite;
        instructorName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    
    
    }
    
    //accessor methods return value of attributes
    public String getInstructorName(){
        return this.instructorName;
    
    }
    
    
    public String getStartingDate(){
        return this.startingDate;
    
    }
    
    public String getCompletionDate (){
        return this.completionDate;
    
    }
    
    public String getExamDate (){
        return this.examDate;
    
    }
    
    public String getPrerequisite(){
        return this.prerequisite;
    
    }
    
    public boolean getIsRegistered (){
        return this.isRegistered;
    
    }
    
    public boolean getIsRemoved (){
        return this. isRemoved;
    
    }
    
    //setters sets value of variables
    public void setInstructorName(String instructorName){
        if(this.isRegistered == false){
            this.instructorName = instructorName;
        }else{
        System.out.println("Since course is registered, instructorName can be changed");

        }
    }
    
    // register method
    public void registerNonAcademicCourse( String courseLeader,String instructorName,String startingDate,String completionDate,String examDate){
       if( this.isRegistered == false){
        super.setCourseLeader(courseLeader);

        setInstructorName(instructorName);
        this.startingDate = startingDate;
        this.completionDate = completionDate;
        this.examDate = examDate;
        this.isRegistered = true;
      }
      else{
            System.out.println("This course is already registered");
        }    
    }
    
    //remove method
    public void remove(){
        if(this.isRemoved == true){
            System.out.println ("This course has been removed");
    
        }
        else{
            super.setCourseLeader("");
            instructorName = "";
            startingDate = "";
            completionDate = "";
            examDate = "";
            isRegistered = false;
            isRemoved = true;
        }
    }
    
    //Display method if NonAcademicCourse is registered
    public void display(){
        if(this.isRegistered == true){
            super.display();
            System.out.println ("Instructor Name : " + instructorName);
            System.out.println ("Starting Date : " + startingDate);
            System.out.println ("CompletionDate : " + completionDate);
            System.out.println ("Examination Date : " + examDate);       
        
        }
    
    }
}
    
  