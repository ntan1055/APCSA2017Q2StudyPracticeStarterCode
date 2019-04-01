/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice
{
    private int first;
    private int second;

    public MultPractice(int first, int second)
    {
        this.first = first;
        this.second = second;
    }

    public String getProblem()
    {
        String problem = first + " " + "TIMES" + " "  + second;
        return problem;
    }

    public void nextProblem()
    {
        second += 1;
    }
}
