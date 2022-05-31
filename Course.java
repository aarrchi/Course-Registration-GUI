
public class Course
{
   //attributes/ivars of course
   private String courseID; 
   private String courseName;
   private String courseLeader;
   private int duration;
   
   
   //parameterized constructors
   public Course(String courseID, String courseName, int duration){
     this.courseID = courseID;
     this.courseName = courseName;
     this.duration = duration;
     this.courseLeader = "";
   } 
   
   /* getters/ accessor methods return value of variables
      provides access to private attribute */
   public String getCourseID(){
       return this.courseID; 
    }
   
   public String getCourseName(){
       return this.courseName;
   }
   
    public String getCourseLeader(){
       return this.courseLeader;
   }
   
   public int getDuration(){
       return this.duration;
   }
   
   //setter methods sets value of attribute (courseLeader)
   public void setCourseLeader (String courseLeader){
      this.courseLeader = courseLeader;    
   }
   
   public void display(){
        
        String result;
        result = courseID + ""+ courseName + "" + duration;
        if(this.courseLeader .equals("")){
            result = result + " " + courseLeader;
        }
    
    }
    
    
    
}