
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // Fields
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    private boolean completed;
    
    private boolean passed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 15;
        
        passed = false;
        completed = false;
    }
    
    public void awardMark(int mark)
    {
        this.mark = mark;
    }

    public int getMark()
    {
        return mark;
    }
    
    /**
     * Returns the module code number
     */
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * 
     */
    public boolean isCompleted()
    {
        return mark >= 0;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Module: " + title + " " + codeNo + " Mark = " + mark); 
    }

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie title*/
    public String getTitle()
    {
        return this.title;
    }//end method getTitle

    //End GetterSetterExtension Source Code
//!
}
