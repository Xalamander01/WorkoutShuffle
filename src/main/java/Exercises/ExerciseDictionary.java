package Exercises;

import Exercises.Exercise;

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

    public void addExercise(String shortName, Exercise exercise) {
        this.exerciseDictionary.put(shortName, exercise);
    }

    public Exercise getExercise(String shortName) {
        return this.exerciseDictionary.get(shortName);
    }

    public void editExercise(String shortName, Exercise exercise) {
        this.exerciseDictionary.remove(shortName);
        this.exerciseDictionary.put(shortName, exercise);
    }

    public void deleteExercise(String shortName) {
        this.exerciseDictionary.remove(shortName);
    }
}
