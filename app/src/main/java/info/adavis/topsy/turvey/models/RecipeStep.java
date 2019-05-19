package info.adavis.topsy.turvey.models;

public class RecipeStep
{

    private long recipeId;

    private int stepNumber;

    private String instruction;

    public RecipeStep (int stepNumber, String instruction)
    {
        this.stepNumber = stepNumber;
        this.instruction = instruction;
    }

    public long getRecipeId()
    {
        return recipeId;
    }

    public void setRecipeId(long recipeId)
    {
        this.recipeId = recipeId;
    }

    public int getStepNumber()
    {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber)
    {
        this.stepNumber = stepNumber;
    }

    public String getInstruction()
    {
        return instruction;
    }

    public void setInstruction(String instruction)
    {
        this.instruction = instruction;
    }

    @Override
    public String toString ()
    {
        return "RecipeStep{" +
                ", recipeId=" + recipeId +
                ", stepNumber=" + stepNumber +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
