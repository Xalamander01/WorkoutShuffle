import java.util.ArrayList;
import java.util.Iterator;

public class ExerciseDictionary {
    private ArrayList<Exercise> exerciseDictionary;

    public ArrayList<Exercise> getExerciseDictionary() {
        return exerciseDictionary;
    }

    public void setExerciseDictionary(ArrayList<Exercise> exerciseDictionary) {
        this.exerciseDictionary = exerciseDictionary;
    }

    public void addExercise( Exercise exercise) {
        exerciseDictionary.add(exercise);
    }
}
