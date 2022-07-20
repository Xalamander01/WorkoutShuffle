import java.util.HashMap;

public class ExerciseDictionary {
    private HashMap<String, Exercise> exerciseDictionary;

    public ExerciseDictionary() {
        this.exerciseDictionary = new HashMap<>();
    }

    public HashMap<String, Exercise> getExerciseDictionary() {
        return exerciseDictionary;
    }

    public void setExerciseDictionary(HashMap<String, Exercise> exerciseDictionary) {
        this.exerciseDictionary = exerciseDictionary;
    }

    public void addExercise(String name, Exercise exercise) {
        this.exerciseDictionary.put(name, exercise);
    }

    public Exercise getExercise(String name) {
        return this.exerciseDictionary.get(name);
    }

    public void editExercise(String name, Exercise exercise) {
        this.exerciseDictionary.remove(name);
        this.exerciseDictionary.put(name, exercise);
    }

    public void deleteExercise(String name) {
        this.exerciseDictionary.remove(name);
    }
}
