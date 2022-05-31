
/**
 * Write a description of class ndk here.
 * @Group L1N3
 * @author (Pasang Dolmo Tamang)
 * @College ID (NP01NT4S210112)
**/

//Importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.*;
import javax.swing.table.DefaultTableModel;

//Main class
public class INGCollege  {
    //Declaring variables
    private JFrame jf, academicFrame, nonAcademicFrame;
    
    
    private JMenuBar menuBar;
    
    private JMenu menuCourses, menuING;
    
    private JMenuItem menuItemMembers, menuItemAssociation, menuItemAbout, menuItemAcademic, menuItemNonAcademic, menuItemExit;
    
    private Font fHead, fLbl, ftxt, fIng;
    
    private JPanel  JPAcademic, JPNonAcademic;
    
    private JLabel lblAcademicHead, lblAcademicCourseID, lblAcademicCourseName, lblAcademicDuration, lblAcademicLecturerName, lblAcademicCourseLeader, lblAcademicLevel, lblAcademicCredit, lblAcademicStartingDate,  lblAcademicCompletionDate, lblAcademicNumberOfAssessment, lblAcademicImage, lblAcademicIslington,
    lblNonAcademicHead, lblNonAcademicCourseID, lblNonAcademicCourseName, lblNonAcademicDuration,  lblNonAcademicCourseLeader,lblNonAcademicLevel, lblNonAcademicCredit, lblNonAcademicStartingDate, lblNonAcademicExamDate, lblNonAcademicPrerequisite, lblNonAcademicCompletionDate, lblNonAcademicInstructorName, lblNonAcademicImage, lblNonAcademicIslington;
    
    private JTextField txtAcademicCourseID, txtAcademicCourseName,txtAcademicDuration, txtAcademicLecturerName, txtAcademicCourseLeader, txtAcademicLevel, txtAcademicCredit,txtAcademicStartingDate, txtAcademicCompletionDate, txtAcademicNumberOfAssessment, 
    txtNonAcademicCourseID, txtNonAcademicCourseName,txtNonAcademicDuration,  txtNonAcademicCourseLeader,txtNonAcademicStartingDate,txtNonAcademicExamDate, txtNonAcademicPrerequisite, txtNonAcademicCompletionDate, txtNonAcademicInstructorName;
    
    
    
    private JButton btnAcademic, btnNonAcademic, btnAcademicAdd, btnAcademicRegister, btnAcademicDisplay, btnAcademicClear, btnNonAcademicAdd,btnNonAcademicRegister, btnNonAcademicDisplay, btnNonAcademicClear, btnNonAcademicRemove, btnAcademicExit, btnNonAcademicExit;

    
    public static AcademicCourse objAcademicCourse;
    public static NonAcademicCourse objNonAcademicCourse;
    
    //Creating object of arraylist for academicCourse
    public ArrayList <Course> academicCourseList = new ArrayList <Course>();
    
    
    //Creating object of arraylist for NonAcademicCourse
    public ArrayList <Course> nonAcademicCourseList = new ArrayList <Course>();
        
        
    
    //Creating constructor
    public INGCollege() {
        
        //Creating main frame 
        jf = new JFrame("INGCollege");
        jf.setLayout(null);
        jf.setBounds(300, 60, 1020, 690);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(new Color(245,252,255));
        jf.setResizable(false);
        
        fHead = new Font("Bahnschrift",Font.PLAIN, 31);
        fLbl = new Font("Bahnschrift", Font.PLAIN, 19);
        fIng = new Font ("Lucida Calligraphy", Font.PLAIN, 13);
        
        
                
        //Creating button for academicCourse and storing in main frame
        btnAcademic = new JButton("Academic Course");
        btnAcademic.setBounds(220, 40, 240, 30);
        btnAcademic.setFont(fLbl);
        btnAcademic.setBackground(new Color(183, 230, 247));
        btnAcademic.setBorder(BorderFactory.createEtchedBorder());
        jf.add(btnAcademic);
        
        
        //Creating button for nonAcademicCourse and storing in main frame
        btnNonAcademic = new JButton("Non Academic Course");
        btnNonAcademic.setBounds(570, 40, 240, 30);
        btnNonAcademic.setFont(fLbl);
        btnNonAcademic.setBackground(new Color(183, 230, 247));
        btnNonAcademic.setBorder(BorderFactory.createEtchedBorder());
        jf.add(btnNonAcademic);
        
        
        //Creation menu and placing inside main frame
        JMenuBar menuBar = new JMenuBar();
        menuBar.setSize(1000, 30);
        menuBar.setBackground(new Color(0,191,255));
        jf.add(menuBar);
        
        menuCourses = new JMenu("Courses");
        
        menuItemNonAcademic = new JMenuItem("Non Academic Course");
        menuItemAcademic = new JMenuItem("Academic Course");
        menuItemExit = new JMenuItem("Exit");
        
        menuCourses.add(menuItemNonAcademic);
        menuCourses.addSeparator();
        menuCourses.add(menuItemAcademic);
        menuCourses.addSeparator();
        menuCourses.add(menuItemExit);
        menuBar.add(menuCourses);
        
        
        menuItemNonAcademic.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Making NonAcademicCourse panel visible when this menuitem is clicked 
                JPNonAcademic.setVisible(true);
                
                //Making AcademicCourse panel invisible when this menuitem  is clicked 
                JPAcademic.setVisible(false);
                
                
            }
        });
        
        
        menuItemAcademic.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Making AcademicCourse panel visible when this menuitem is clicked 
                JPAcademic.setVisible(true);
                
                //Making AcademicCourse panel invisible when this menuitem is clicked 
                JPNonAcademic.setVisible(false);
                
                
            }
        });
        
        
        
        menuING = new JMenu("ING GROUP");
        menuItemMembers = new JMenuItem("Members");
        menuItemAssociation = new JMenuItem("Association");
        menuItemAbout = new JMenuItem("About US");
        
        
        menuING.add(menuItemMembers);
        menuING.addSeparator();
        menuING.add(menuItemAssociation);
        menuING.addSeparator();
        menuING.add(menuItemAbout);
        menuBar.add(menuING);
        
       

        
        
        //Creating panel for the academic course
        JPAcademic = new JPanel();
        JPAcademic.setLayout(null);
        JPAcademic.setBounds(0, 35, 1020, 630);
        JPAcademic.setBackground(new Color(245,252,255));
        jf.add(JPAcademic);
        
        ImageIcon icon = new ImageIcon(".//INGgroup1.png");
        
        lblAcademicImage = new JLabel();
        lblAcademicImage.setIcon(icon);
        lblAcademicImage.setBounds(15, 0, 170, 111);
        lblAcademicImage.setVisible(true);
        JPAcademic.add(lblAcademicImage);
        
        //Creating label for all of the academic course components
        lblAcademicHead = new JLabel("Academic Course");
        lblAcademicHead.setBounds(380, 75, 310, 45);
        lblAcademicHead.setFont(fHead);
        JPAcademic.add(lblAcademicHead);
        
        
        
        lblAcademicCourseID = new JLabel("CourseID:");
        lblAcademicCourseID.setBounds(50, 180, 130, 30);
        lblAcademicCourseID.setFont(fLbl);
        JPAcademic.add(lblAcademicCourseID);
        
        
        lblAcademicDuration  = new JLabel("Duration:");
        lblAcademicDuration .setBounds(50, 225, 120, 30);
        lblAcademicDuration .setFont(fLbl);
        JPAcademic.add(lblAcademicDuration );
        
        
        lblAcademicCredit = new JLabel("Credit:");
        lblAcademicCredit.setBounds(50, 310, 170, 30);
        lblAcademicCredit.setFont(fLbl);
        JPAcademic.add(lblAcademicCredit);
        
        
        lblAcademicLevel = new JLabel("Level:");
        lblAcademicLevel.setBounds(50, 350, 130, 30);
        lblAcademicLevel.setFont(fLbl);
        JPAcademic.add(lblAcademicLevel);
        
        
        lblAcademicStartingDate = new JLabel("Starting Date:");
        lblAcademicStartingDate.setBounds(50, 390, 130, 30);
        lblAcademicStartingDate.setFont(fLbl);
        JPAcademic.add(lblAcademicStartingDate);
        
        
        lblAcademicLecturerName = new JLabel("Lecturer Name");
        lblAcademicLecturerName .setBounds(50,430, 130, 30);
        lblAcademicLecturerName.setFont(fLbl);
        JPAcademic.add(lblAcademicLecturerName);
            
                    
        lblAcademicCourseName = new JLabel("CourseName");
        lblAcademicCourseName.setBounds (570, 180, 120, 30);
        lblAcademicCourseName.setFont(fLbl);
        JPAcademic.add(lblAcademicCourseName);
            
        
        lblAcademicNumberOfAssessment= new JLabel("Number of Assessment:");
        lblAcademicNumberOfAssessment.setBounds(515,225, 225, 30);
        lblAcademicNumberOfAssessment.setFont(fLbl);
        JPAcademic.add(lblAcademicNumberOfAssessment);
        
        
        lblAcademicCompletionDate = new JLabel("Completion Date:");
        lblAcademicCompletionDate.setBounds(570, 355, 195, 30);
        lblAcademicCompletionDate.setFont(fLbl);
        JPAcademic.add(lblAcademicCompletionDate);
        
        
        lblAcademicCourseLeader = new JLabel("CourseLeader");
        lblAcademicCourseLeader.setBounds(570,400, 225, 30);
        lblAcademicCourseLeader.setFont(fLbl);
        JPAcademic.add(lblAcademicCourseLeader);
        
        
        lblAcademicIslington = new JLabel("Pasang Tamang || Islington College || Kathmandu");
        lblAcademicIslington.setBounds(310, 565, 500, 30);
        lblAcademicIslington.setFont(fIng);
        JPAcademic.add(lblAcademicIslington);
        
         
        
        //Creating textfields for academic Course components
        txtAcademicCourseID = new JTextField();
        txtAcademicCourseID.setBounds(190, 180, 220, 26);
        JPAcademic.add(txtAcademicCourseID);
        
        txtAcademicDuration = new JTextField();
        txtAcademicDuration.setBounds(190, 225, 220, 26);
        JPAcademic.add(txtAcademicDuration);
           
        txtAcademicCredit = new JTextField();
        txtAcademicCredit.setBounds(190, 310, 220, 26);
        JPAcademic.add(txtAcademicCredit);
            
        txtAcademicLevel = new JTextField();
        txtAcademicLevel.setBounds(190, 350, 220, 26);
        JPAcademic.add(txtAcademicLevel);
        
        txtAcademicStartingDate = new JTextField();
        txtAcademicStartingDate.setBounds(190, 390, 220, 26);
        JPAcademic.add(txtAcademicStartingDate);
        
        txtAcademicLecturerName = new JTextField();
        txtAcademicLecturerName.setBounds(190, 430, 220, 26);
        JPAcademic.add(txtAcademicLecturerName);
              
        txtAcademicCourseName = new JTextField();
        txtAcademicCourseName.setBounds(730, 180, 220, 26);
        JPAcademic.add(txtAcademicCourseName);
            
        txtAcademicNumberOfAssessment = new JTextField();
        txtAcademicNumberOfAssessment.setBounds(730,225, 220, 26);
        JPAcademic.add(txtAcademicNumberOfAssessment);
            
        txtAcademicCompletionDate = new JTextField();
        txtAcademicCompletionDate.setBounds(730, 355, 220, 26);
        JPAcademic.add(txtAcademicCompletionDate);
            
        txtAcademicCourseLeader  = new JTextField();
        txtAcademicCourseLeader.setBounds(730, 400, 220, 26);
        JPAcademic.add(txtAcademicCourseLeader);
            
        
        
        //Creating Add button
        btnAcademicAdd = new JButton("Add");
        btnAcademicAdd.setBounds(730, 290, 220, 28);
        btnAcademicAdd.setFont(fLbl);
        btnAcademicAdd.setBackground(new Color(0,191,255));
        btnAcademicAdd.setForeground(Color.WHITE);
        btnAcademicAdd.setBorder(BorderFactory.createEtchedBorder());   
        JPAcademic.add(btnAcademicAdd);
        
        
        
        //Performing actionlistener
        btnAcademicAdd.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                
                //Fetching inputs from specified textfields and storing them in respective variable
                String academicCourseID = txtAcademicCourseID.getText();
                String academicCourseName = txtAcademicCourseName.getText();
                String academicLevel = txtAcademicLevel.getText();
                String academicCredit = txtAcademicCredit.getText();
                
                
                
                //Checking if the textfields are empty 
                if (txtAcademicCourseID.getText().isEmpty() || txtAcademicCourseName.getText().isEmpty() || 
                txtAcademicDuration.getText().isEmpty() || txtAcademicLevel.getText().isEmpty()  ||
                txtAcademicCredit.getText().isEmpty() || txtAcademicNumberOfAssessment.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(JPAcademic, "Please fill the required textfields");
                    return;
                }
                
                //Using for each loop to store arraylist of academic course in c whose type is Course
                for(Course c:academicCourseList){
                    
                    //Checking if the courseID fetched from textfield and arraylist is same
                    if (c.getCourseID().equals(academicCourseID))
                    {
                        JOptionPane.showMessageDialog(JPAcademic,"Please enter the valid Course ID");  
                        return;
                    }
                }
               
                int academicDuration = 0;
                
                //Implementing try and catch to avoid exception case
                try{
                    //Parsing datatype of duration from string to integer
                    academicDuration = Integer.parseInt(txtAcademicDuration.getText());
                             
                }     
                catch(Exception g){
                        
                    JOptionPane.showMessageDialog(JPAcademic, txtAcademicDuration.getText() + " is invalid type of duration"); 
                    return;    
                }
                        
                
                int academicNumberOfAssessment = 0;
                //Implementing try and catch to avoid exception case
                try
                {
                    //Parsing datatype of duration from string to integer    
                    academicNumberOfAssessment=Integer.parseInt(txtAcademicNumberOfAssessment.getText());
                }
                catch(Exception f)
                {       
                    JOptionPane.showMessageDialog(JPAcademic, txtAcademicNumberOfAssessment.getText() + "is invalid type of number of assessment");
                    return;                             
                }
                     
                
                
                //Creating objecting of AcademicCourse and passing the data fetched from specified textfield     
                objAcademicCourse = new AcademicCourse(academicCourseID, academicCourseName, academicDuration, academicLevel, academicCredit, academicNumberOfAssessment );
                academicCourseList.add(objAcademicCourse);
                JOptionPane.showMessageDialog(JPAcademic, "Courses are added  successfully");
                return;
                
            }
        });
            
        
        //Creating Register button
        btnAcademicRegister = new JButton("Register");
        btnAcademicRegister.setBounds(730, 460, 220, 28);
        btnAcademicRegister.setFont(fLbl);
        btnAcademicRegister.setBackground(new Color(0,191,255));
        btnAcademicRegister.setForeground(Color.WHITE);
        btnAcademicRegister.setBorder(BorderFactory.createEtchedBorder());   
        JPAcademic.add(btnAcademicRegister);
            
        
        //Performing actionListener in register button
        btnAcademicRegister.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {   
                //Fetching the data passed from specified textfield and storing in respective variable
                String academicCourseID = txtAcademicCourseID.getText();
                String academicCourseLeader = txtAcademicCourseLeader.getText();
                String academicLecturerName = txtAcademicLecturerName.getText();
                String academicStartingDate = txtAcademicStartingDate.getText();
                String academicCompletionDate = txtAcademicCompletionDate.getText();
                
                
                //Checking if the given textfields are empty or not
                if(txtAcademicCourseID.getText().isEmpty() || txtAcademicCourseLeader.getText().isEmpty() || txtAcademicLecturerName.getText().isEmpty() || 
                txtAcademicStartingDate.getText().isEmpty() || txtAcademicCompletionDate.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(JPAcademic, "Please fill the required textfields");
                    return;
                
                }
                
                
                //Iterating upto the size of arraylist of academicCourse
                for (int i = 0; i <academicCourseList.size(); i++)
                {    
                    
                    //Checking if the data fetched from textfields are and arraylist are equal 
                    if((academicCourseList.get(i).getCourseID()).equals(txtAcademicCourseID.getText()))
                    {   
                        
                        //Converting type of arraylist from Course type to AcademicCourse type (Object Casting)
                        AcademicCourse ac = (AcademicCourse) academicCourseList.get(i);
                        
                        //Registering the data if they are not registered yet
                        if(!ac.getIsRegistered())
                        {
                            ac.registerAcademicCourse(academicCourseLeader, academicLecturerName, academicStartingDate, academicCompletionDate);
                            JOptionPane.showMessageDialog(JPAcademic, "The course is succesfully registered");
                            return;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(JPAcademic, "The course has already been registered"); 
                            return;
                        }
                    
                    }
                        
                }
                JOptionPane.showMessageDialog(JPAcademic, "The courseID" + txtAcademicCourseID.getText() + " doesn't exist");
                return; 
            
            }
        
        });
        
        
        //Creating Display button
        btnAcademicDisplay = new JButton("Display");
        btnAcademicDisplay.setBounds(270, 520, 180, 28);
        btnAcademicDisplay.setForeground(Color.WHITE);
        btnAcademicDisplay.setFont(fLbl);
        btnAcademicDisplay.setBackground(new Color(0,191,255));
        btnAcademicDisplay.setBorder(BorderFactory.createEtchedBorder());
        JPAcademic.add(btnAcademicDisplay);
        
        //Performing actionListener in display button 
        btnAcademicDisplay.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                
                // Displaying data in new frame
                academicFrame = new JFrame("Displaying data");
                academicFrame.setBounds(400, 100, 1150, 600);
                academicFrame.getContentPane().setBackground(Color.WHITE);
                academicFrame.setLocationRelativeTo(null);
                academicFrame.setResizable(false);
                
                //Displayiing the output in column
                Object[] columnField = {"CourseID", "Course Name", "Duration", "Lecturer Name", "Course Leader", "Starting Date", "Level", "Credit", "Completion Date", "Number Of Assessment"};
                
                //Initializing the modelTable
                DefaultTableModel modelTable = new DefaultTableModel(columnField, 0);
                
                //Intializing the table
                JTable table  = new JTable(modelTable);
                
                //Setting the size 
                table.setBounds(10, 10, 100, 100);
                JScrollPane scrollPane = new JScrollPane(table);
                
                for (int i = 0; i < academicCourseList.size();i++)
                {
                    //Downcasting 
                    AcademicCourse academic = (AcademicCourse) academicCourseList.get(i);
                    
                    //Initializing the array data
                    Object[] data = {academicCourseList.get(i).getCourseID(),
                                    academicCourseList.get(i).getCourseName(),
                                    academicCourseList.get(i).getDuration(),
                                    academic.getLecturerName(),
                                    academic.getCourseLeader(),
                                    academic.getStartingDate(),
                                    academic.getLevel(),
                                    academic.getCredit(),
                                    academic.getCompletionDate(),
                                    academic.getNumberOfAssessments()
                                    };
                                    
                    //passing the data to modelTable
                    modelTable.addRow(data);
                }
                
                
                academicFrame.add(scrollPane);
                
                //Making the frame visible
                academicFrame.setVisible(true);
                
               
                
                  
            }
        });
        
            
        //Creating Clear button for Academic Course
        btnAcademicClear = new JButton("Clear");
        btnAcademicClear.setBounds(510, 520,180, 28);
        btnAcademicClear.setFont(fLbl);
        btnAcademicClear.setBackground(new Color(0,191,255));
        btnAcademicClear.setForeground(Color.WHITE);
        btnAcademicClear.setBorder(BorderFactory.createEtchedBorder());
        JPAcademic.add(btnAcademicClear);
        
        //Performing actionlistener in button Clear of AcademicCourse panel
        btnAcademicClear.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                //Clearing all the textfields when this button is clicked 
                txtAcademicCourseID.setText("");
                txtAcademicCourseName.setText("");
                txtAcademicCourseLeader.setText("");
                txtAcademicLecturerName.setText("");
                txtAcademicStartingDate.setText("");
                txtAcademicCompletionDate.setText("");
                txtAcademicLevel.setText("");
                txtAcademicCredit.setText("");
                txtAcademicNumberOfAssessment.setText("");
                txtAcademicDuration.setText("");
            
            }
        
        });
        
        
        
        //Creating panel for NonAcademicCourse
        JPNonAcademic = new JPanel();
        JPNonAcademic.setLayout(null);
        JPNonAcademic.setBounds(0,35,1020, 630);
        JPNonAcademic.setBackground(new Color(245,252,255));
        JPNonAcademic.setVisible(false);
        jf.add(JPNonAcademic);
        
        
        ImageIcon icon1 = new ImageIcon(".//INGgroup1.png");
        
        lblNonAcademicImage = new JLabel();
        lblNonAcademicImage.setIcon(icon1);
        lblNonAcademicImage.setBounds(10, 0, 170, 111);
        lblNonAcademicImage.setVisible(true);
        JPNonAcademic.add(lblNonAcademicImage);        
        
        
        //Creating labels for all the components of NonAcademicCouse
        
        lblNonAcademicHead = new JLabel("Non Academic Course");
        lblNonAcademicHead.setBounds(340, 75, 350, 42);
        lblNonAcademicHead.setFont(fHead);
        JPNonAcademic.add(lblNonAcademicHead);
        
        
        
        lblNonAcademicCourseID = new JLabel("CourseID:");
        lblNonAcademicCourseID.setBounds(50, 180, 130, 30);
        lblNonAcademicCourseID.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicCourseID);
        
        
        lblNonAcademicDuration = new JLabel("Duration:");
        lblNonAcademicDuration.setBounds(50, 225, 120, 30);
        lblNonAcademicDuration.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicDuration);
        
        
        lblNonAcademicCourseLeader = new JLabel("CourseLeader:");
        lblNonAcademicCourseLeader.setBounds(50, 310, 170, 30);
        lblNonAcademicCourseLeader.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicCourseLeader);
        
        
        lblNonAcademicInstructorName = new JLabel("Instructor Name:");
        lblNonAcademicInstructorName.setBounds(48, 355, 150, 30);
        lblNonAcademicInstructorName.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicInstructorName);
            
        
        lblNonAcademicExamDate = new JLabel("ExamDate:");
        lblNonAcademicExamDate.setBounds(50, 400, 130, 30);
        lblNonAcademicExamDate.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicExamDate);
        
                
        lblNonAcademicCourseName = new JLabel("CourseName");
        lblNonAcademicCourseName.setBounds (570, 180, 120, 30);
        lblNonAcademicCourseName.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicCourseName);
            
               
        lblNonAcademicPrerequisite= new JLabel("Prerequisite:");
        lblNonAcademicPrerequisite.setBounds(570,225, 150, 30);
        lblNonAcademicPrerequisite.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicPrerequisite);
        
        
        lblNonAcademicCompletionDate = new JLabel("Completion Date:");
        lblNonAcademicCompletionDate.setBounds(570, 355, 195, 30);
        lblNonAcademicCompletionDate.setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicCompletionDate);
        
       
        lblNonAcademicStartingDate = new JLabel("Starting Date : ");
        lblNonAcademicStartingDate .setBounds(570,400, 225, 30);
        lblNonAcademicStartingDate .setFont(fLbl);
        JPNonAcademic.add(lblNonAcademicStartingDate);
            
        lblNonAcademicIslington = new JLabel("Pasang Tamang || Islington College || Kathmandu");
        lblNonAcademicIslington.setBounds(310, 565, 500, 30);
        lblNonAcademicIslington.setFont(fIng);
        JPNonAcademic.add(lblNonAcademicIslington);
        
          
                
        
        //Creating textfields for NonAcademicCourse lables
        
        txtNonAcademicCourseID = new JTextField();
        txtNonAcademicCourseID.setBounds(190, 180, 220, 26);
        JPNonAcademic.add(txtNonAcademicCourseID);
        
        
        txtNonAcademicDuration  = new JTextField();
        txtNonAcademicDuration.setBounds(190, 225, 220, 26);
        JPNonAcademic.add(txtNonAcademicDuration);
           
        
        txtNonAcademicCourseLeader = new JTextField();
        txtNonAcademicCourseLeader.setBounds(190, 310, 220, 26);
        JPNonAcademic.add(txtNonAcademicCourseLeader);
            
            
        txtNonAcademicInstructorName = new JTextField();
        txtNonAcademicInstructorName.setBounds(190, 355, 220, 26);
        JPNonAcademic.add(txtNonAcademicInstructorName);
        
        
        txtNonAcademicExamDate= new JTextField();
        txtNonAcademicExamDate.setBounds(190, 400, 220, 26);
        JPNonAcademic.add(txtNonAcademicExamDate);
        
       
        txtNonAcademicCourseName = new JTextField();
        txtNonAcademicCourseName.setBounds(730, 180, 220, 26);
        JPNonAcademic.add(txtNonAcademicCourseName);
        
            
        txtNonAcademicPrerequisite = new JTextField();
        txtNonAcademicPrerequisite.setBounds(730,225, 220, 26);
        JPNonAcademic.add(txtNonAcademicPrerequisite);
            

        txtNonAcademicCompletionDate = new JTextField();
        txtNonAcademicCompletionDate.setBounds(730, 355, 220, 26);
        JPNonAcademic.add(txtNonAcademicCompletionDate);
            
        
        txtNonAcademicStartingDate  = new JTextField();
        txtNonAcademicStartingDate .setBounds(730, 400, 220, 26);
        JPNonAcademic.add(txtNonAcademicStartingDate);
            
        
        
        //Creating Add button for NonAcademicCourse
        btnNonAcademicAdd = new JButton("Add");
        btnNonAcademicAdd.setBounds(730, 290, 220, 28);
        btnNonAcademicAdd.setFont(fLbl);
        btnNonAcademicAdd.setBackground(new Color(0,191,255));
        btnNonAcademicAdd.setForeground(Color.WHITE);
        btnNonAcademicAdd.setBorder(BorderFactory.createEtchedBorder());   
        JPNonAcademic.add(btnNonAcademicAdd);
        
        
        
        //Performing actionlistener in Add button 
        btnNonAcademicAdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //Fetching data from specified textfield and storing them in respective variables     
                String nonAcademicCourseID = txtNonAcademicCourseID.getText();
                
                String nonAcademicCourseName = txtNonAcademicCourseName.getText();
                String nonAcademicPrerequisite = txtNonAcademicPrerequisite.getText();
                
                
                //Checking if the specified textfields are empty or not
                if(txtNonAcademicCourseID.getText().isEmpty() || txtNonAcademicCourseName.getText().isEmpty() || txtNonAcademicDuration.getText().isEmpty() ||
                txtNonAcademicPrerequisite.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(JPNonAcademic, "Please fill all the required textfields");
                    return;
                
                }
                
                
                for(Course d: nonAcademicCourseList){
                    
                    //Checking if the data fetched from textfield of courseID and arraylist's courseID are same 
                    if(d.getCourseID().equals(nonAcademicCourseID)){
                        JOptionPane.showMessageDialog(JPNonAcademic, "Please enter the valid course ID");
                        return;
                    
                    }
                
                }
                
                
                int nonAcademicDuration = 0;
                //Implementing try and catch to avoid exception 
                try{
                    //Parsing data of duration textfield from string to integer datatypes
                    nonAcademicDuration = Integer.parseInt(txtNonAcademicDuration.getText());
     
                }  
                catch(Exception g){
                        
                    JOptionPane.showMessageDialog(JPNonAcademic, txtNonAcademicDuration.getText() + " is invalid type of duration");
                    return;
                        
                }
                        
                //Creating object of NonAcademicCourse and passing the data fetched from specified textfield
                objNonAcademicCourse = new NonAcademicCourse(nonAcademicCourseID, nonAcademicCourseName, nonAcademicDuration, nonAcademicPrerequisite);
                nonAcademicCourseList.add(objNonAcademicCourse);
                JOptionPane.showMessageDialog(JPNonAcademic, "All the courses are added");
                return;
            
            }
        
        });
        
            
        //Creating Register button
        btnNonAcademicRegister = new JButton("Register");
        btnNonAcademicRegister.setBounds(730, 460, 220, 28);
        btnNonAcademicRegister.setFont(fLbl);
        btnNonAcademicRegister.setBackground(new Color(0,191,255));
        btnNonAcademicRegister.setForeground(Color.WHITE);
        btnNonAcademicRegister.setBorder(BorderFactory.createEtchedBorder());   
        JPNonAcademic.add(btnNonAcademicRegister);
        
        //Performing actionlistener in register button of the NonAcademicCourse
        btnNonAcademicRegister.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Fetching data from specified textfield and storing them is respective variable 
                String nonAcademicCourseID = txtNonAcademicCourseID.getText();
                String nonAcademicCourseLeader =   txtNonAcademicCourseLeader.getText();
                String nonAcademicInstructorName =  txtNonAcademicInstructorName.getText();
                String nonAcademicStartingDate =  txtNonAcademicStartingDate.getText();
                String nonAcademicCompletionDate = txtNonAcademicCompletionDate.getText();
                String nonAcademicExamDate = txtNonAcademicExamDate.getText();
                
                //Checking if the specified textfields are empty or not
                if(txtNonAcademicCourseID.getText().isEmpty() || txtNonAcademicCourseLeader.getText().isEmpty() || txtNonAcademicInstructorName.getText().isEmpty() ||
                txtNonAcademicStartingDate.getText().isEmpty() || txtNonAcademicCompletionDate.getText().isEmpty() || txtNonAcademicExamDate.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(jf , "Please fill the required textfields" );
                    return;
                
                }
                
                //Iterating upto the size of NonAcademiCourseList              
                for (int i = 0; i<nonAcademicCourseList.size(); i++)
                {   
                    //Checking if the data fetched from the CourseID textfield of  NonAcademicCourse if eqal to the one from arraylist
                    if ((nonAcademicCourseList.get(i).getCourseID()).equals(txtNonAcademicCourseID.getText()))
                    {   
                        //Converting type of the nonAcademicCoursList from type Course to type NonAcademicCourse
                        NonAcademicCourse nac = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                        
                        //Registering the data fetched from specified textfield if not registered yet
                        if(!nac.getIsRegistered()){
                        
                            nac.registerNonAcademicCourse(nonAcademicCourseLeader, nonAcademicInstructorName,nonAcademicStartingDate, nonAcademicCompletionDate, nonAcademicExamDate);
                            JOptionPane.showMessageDialog(JPNonAcademic, "The course is successfully registered" );
                            return;
                        
                        }
                        //if data are registered
                        else
                        {
                            JOptionPane.showMessageDialog(JPNonAcademic, "The course has been already registered");
                            return;
                        
                        }
                    
                    }
                          
                }
                
                JOptionPane.showMessageDialog(JPNonAcademic, "The courseID" + txtNonAcademicCourseID.getText() + " doesn't exist");
                return;
                
            }   
            
        
        });
        
        
        //Creating remove button for NonAcademicCourse
        btnNonAcademicRemove = new JButton("Remove"); 
        btnNonAcademicRemove.setBounds(150, 520, 180, 28);
        btnNonAcademicRemove.setFont(fLbl);
        btnNonAcademicRemove.setForeground(Color.WHITE);
        btnNonAcademicRemove.setBackground(new Color(0,191,255));
        btnNonAcademicRemove.setBorder(BorderFactory.createEtchedBorder());
        JPNonAcademic.add(btnNonAcademicRemove);
        
        //Performing actionListener in remover button of NonAccademicCourse panel
        btnNonAcademicRemove.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {   
                
                //Checking if the textfield of CourseID from NonAcademicCourse panel is empty
                if(txtNonAcademicCourseID.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(JPNonAcademic, "Please enter the course ID");
                    return;
                }
                
                //Iterating upto the size of nonAcademicCourselist 
                for (int i = 0; i< nonAcademicCourseList.size(); i++)
                {
                    
                    //Checking if the data fetched from courseID textfield of NonAcademicCourse panel is equal to the one from arraylist
                    if ((nonAcademicCourseList.get(i).getCourseID()).equals(txtNonAcademicCourseID.getText()))
                    {
                        //Converting the nonAcademicCourrseList from type Coure to NonAcademicCourse
                        NonAcademicCourse nac = (NonAcademicCourse) nonAcademicCourseList.get(i);
                        
                        //Removing if the data from the arraylist if it is not removed
                        if(!nac.getIsRemoved())
                        {
                            nac.remove();  
                            JOptionPane.showMessageDialog(JPNonAcademic, "The course ID is removed");
                            nonAcademicCourseList.remove(i);
                            return;
                        }
                        //if the data are already removed
                        else{
                            JOptionPane.showMessageDialog(JPNonAcademic, "The courseID has been already removed");
                            return;
                        
                        }
                    }
                
                }
                
                JOptionPane.showMessageDialog(JPNonAcademic, "This non academic course does not exist");
                return; 
            } 
        });
        
      
        
        //Creating Display button for NonAcademicCourse panel
        btnNonAcademicDisplay = new JButton("Display");
        btnNonAcademicDisplay.setBounds(360, 520, 180, 28);
        btnNonAcademicDisplay.setForeground(Color.WHITE);
        btnNonAcademicDisplay.setFont(fLbl);
        btnNonAcademicDisplay.setBackground(new Color(0,191,255));
        btnNonAcademicDisplay.setBorder(BorderFactory.createEtchedBorder());
        JPNonAcademic.add(btnNonAcademicDisplay);
        
        
        //Performing acitonlistener in display button of nonAcadmeicCourse panel
        btnNonAcademicDisplay.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                
                //Displaying the data in new frame
                nonAcademicFrame = new JFrame("Displaying data");
                nonAcademicFrame.setBounds(400, 100, 1100, 600);
                //nonAcademicFrame.getContentPane().setBackground(Color.WHITE);
                nonAcademicFrame.setLocationRelativeTo(null);
                //nonAcademicFrame.setResizable(false);
                
                
                //Initializing the array column 
                Object[] column = {"CourseID", "Course Name", "Duration", "Instructor Name", "Course Leader", "Starting Date", "Exam Date", "Prerequisite", "Completion Date"};
                
                //Initializing modelTable
                DefaultTableModel modelTable = new DefaultTableModel(column, 0);
                
                //Initializing table
                JTable table  = new JTable(modelTable);
                
                //Setting size for the table
                table.setBounds(10, 10, 80, 300);
                
                JScrollPane scrollPane = new JScrollPane(table);
                
                for (int i = 0; i < nonAcademicCourseList.size();i++)
                {
                    NonAcademicCourse nonAcademic = (NonAcademicCourse) nonAcademicCourseList.get(i);
                    
                    //Initializing array as data and displaying output
                    Object[] data = {nonAcademicCourseList.get(i).getCourseID(),
                                    nonAcademicCourseList.get(i).getCourseName(),
                                    nonAcademicCourseList.get(i).getDuration(),
                                    nonAcademic.getInstructorName(),
                                    nonAcademic.getCourseLeader(),
                                    nonAcademic.getStartingDate(),
                                    nonAcademic.getExamDate(),
                                    nonAcademic.getPrerequisite(),
                                    nonAcademic.getCompletionDate(),
                                  
                                };
                                
                    //Passing the data to table
                    modelTable.addRow(data);
                }
                
                //Passing the scrollPane to  frame 
                nonAcademicFrame.add(scrollPane);
                
                
                
                
                //Making the whole frame visible 
                nonAcademicFrame.setVisible(true);
                
                
                
               
                    
                
            }
        });
            
        //Creating Clear button for NonAcademicCours panel
        btnNonAcademicClear = new JButton("Clear");
        btnNonAcademicClear.setBounds(570, 520,180, 28);
        btnNonAcademicClear.setFont(fLbl);
        btnNonAcademicClear.setBackground(new Color(0,191,255));
        btnNonAcademicClear.setForeground(Color.WHITE);
        btnNonAcademicClear.setBorder(BorderFactory.createEtchedBorder());
        JPNonAcademic.add(btnNonAcademicClear);
        
        //Performing actionListener in button Clear of NonAcademicCourse Panel
        btnNonAcademicClear.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Clearing all the textfields when this button is clicked
                txtNonAcademicCourseID.setText("");
                txtNonAcademicCourseName.setText("");
                txtNonAcademicCourseLeader.setText("");
                txtNonAcademicInstructorName.setText("");
                txtNonAcademicStartingDate.setText("");
                txtNonAcademicCompletionDate.setText("");
                txtNonAcademicPrerequisite.setText("");
                txtNonAcademicExamDate.setText("");
                txtNonAcademicDuration.setText("");
            
            }
        
        });
        
        
        //Performing actionlistener in btnAcademic to open AcademicCourse Panel
        btnAcademic.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Making AcademicCourse panel visible when this button is clicked 
                JPAcademic.setVisible(true);
                
                //Making NonAcademicCourse panel invisible when this button is clicked 
                JPNonAcademic.setVisible(false);
               
                
            }
        });
        
        
        //Performing actionlistener in btnNonAcademic to open AcademicCourse Panel
        btnNonAcademic.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Making NonAcademicCourse panel visible when this button is clicked 
                JPNonAcademic.setVisible(true);
                
                //Making AcademicCourse panel invisible when this button is clicked 
                JPAcademic.setVisible(false);
                
                
            }
        });
        
        
                
      
        //Making all the components of main frame visible    
        jf.setVisible(true);
        
    }
    
    
    //Creating main method
    public static void main (String args [] ){
        
        //Calling constructor
        new INGCollege();
    
    }
}



