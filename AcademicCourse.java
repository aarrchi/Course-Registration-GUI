public class AcademicCourse extends Course
{
       //instance attributes//own properties of AcademicCourse
       private String lecturerName;
       private String level;
       private String credit;
       private String startingDate;
       private String completionDate;
       private int numberOfAssessments;
       private boolean isRegistered;
       
       //parameterized constructor
       public AcademicCourse(String courseID, String courseName, int duration,String level, String credit, int numberOfAssessments){
           
           super(courseID, courseName, duration); //call made to superclass containing parameters
           this.level = level;
           this.credit = credit;
           this.numberOfAssessments = numberOfAssessments;
           this.lecturerName = "";
           this.startingDate = "";
           this.completionDate = "";
           this.isRegistered = false;
        
       } 
       
       //accessor methods/getters returns  value of attributes. 
       public String getLecturerName(){  
           return this.lecturerName;          
        }
        
       public String getLevel(){         
           return this. level;
       }
       
       public String getCredit(){        
           return this.credit;
       }
       
       public String getStartingDate(){
           return this.startingDate;
       }
       
       public String getCompletionDate(){
           return this.completionDate;
       }
       
       public int getNumberOfAssessments(){
           return this.numberOfAssessments;
       }
       
       public boolean getIsRegistered(){
           return this.isRegistered;
       }
       
       //mutator methods / setters sets  value of object
       
       public void setLecturerName(String lecturerName){
           this.lecturerName = lecturerName;
       }
       
       public void setNumberOfAssesssments (int numberOfAssessments){
           this.numberOfAssessments = numberOfAssessments;
       }
       
       //Using register method to register particular academic course 
       public void registerAcademicCourse(String courseLeader, String lecturerName, String startingDate, String completionDate){
           if(this.isRegistered == true){
               
            System.out.println("This course is already registered.");
            System.out.println("The lecturer's name of this course is " + lecturerName);
            System.out.println("Starting date of course is" + startingDate);
            System.out.println("The completon date of this course is"+ completionDate);
        
            } 
          
           else { //if not registered
         
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
          }
       }    
        
        //Displaying courseDetail if registered
       public void display(){
           
          super.display(); //Calling parent class by using super key
           
          if (this.isRegistered == true){
               
            System.out.println("The name of lecturer for this course is:" + lecturerName);
            System.out.println("The level of this course is: " + level);
            System.out.println("The total credit hour for this course is:" + credit);
            System.out.println("The course starts from:" + startingDate);
            System.out.println("The completionDate for this course is:" + completionDate);
            System.out.println("The total number of assessments in this course are:" + numberOfAssessments);
            
          }
       } 

}


     
     


