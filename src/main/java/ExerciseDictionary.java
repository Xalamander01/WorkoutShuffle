import java.util.ArrayList;

public class ExerciseDictionary {
    private ArrayList<Exercise> exerciseDictionary;

    public ExerciseDictionary(ArrayList<Exercise> exerciseDictionary) {
        this.exerciseDictionary = exerciseDictionary;
    }

    public ArrayList<Exercise> getExerciseDictionary() {
        return exerciseDictionary;
    }

    public void setExerciseDictionary(ArrayList<Exercise> exerciseDictionary) {
        this.exerciseDictionary = exerciseDictionary;
    }
}
