import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    private int x;
    /**
     * Default constructor for objects of class FillInQuestion
     */
    public FillInQuestion()
    {
        
    }
    public void setText(String questionText)
    {
        Scanner parser=new Scanner(questionText);
        parser.useDelimiter("_");
        String question=parser.next();
        String answer=parser.next();
        question+="_____"+parser.next();
        super.setText(question);
        super.setAnswer(answer);
    }
}
