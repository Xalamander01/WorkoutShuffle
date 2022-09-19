package Workouts;
import Exercises.Exercise;
import Exercises.ExerciseDictionary;
import JSONHandler.JsonToPOJOConverter;
import Muscles.Muscle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Workout {
    private Workout workout;

    public Workout() {
        List<Exercise> workout = new ArrayList<>();
    }

    public Workout getWorkout() { return workout; }
    public void setWorkout(Workout workout) { this.workout = workout; }

    public Workout createWorkout(String workoutType) throws IOException {

        ExerciseDictionary exerciseDictionary = new JsonToPOJOConverter().JsonToDictionary("src/main/resources/ExerciseDictionary.json");
        Map<String, List<String>> movementsToWorkInWorkout = new JsonToPOJOConverter().JsonToMovementTypes("src/main/resources/WorkoutProperties.json");
        Map<String, List<String>> lightOrHeavyInWorkout = new JsonToPOJOConverter().JsonToLightOrHeavy("src/main/resources/WorkoutProperties.json");
        List<Muscle> muscleList = new JsonToPOJOConverter().JsonToMuscles("src/main/resources/MuscleGroups.json");

        for ( String name : exerciseDictionary.getExerciseDictionary().keySet() ) {
            //System.out.println(exerciseDictionary.getExercise(name).getMuscle().getRelatedMuscleGroups());
        }

        //System.out.println(exerciseDictionary);
        //System.out.println(movementsToWorkInWorkout);
        //System.out.println(lightOrHeavyInWorkout);

        return null;
    }
}

