package Workouts;

import Exercises.Exercise;
import Exercises.ExerciseDictionary;
import JSONHandler.JsonToPOJOConverter;
import Muscles.MuscleGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private Workout workout;

    public Workout() {
        List<Exercise> workout = new ArrayList<>();
    }

    public Workout getWorkout() { return workout; }
    public void setWorkout(Workout workout) { this.workout = workout; }

    //randomly select muscle groups to work depending on workout type
    public List<MuscleGroup> getMuscleGroupsToWorkInWorkout(String workoutType) throws IOException {

        List<MuscleGroup> muscleGroupsList = new JsonToPOJOConverter().JsonToMuscleGroups("src/main/resources/MuscleGroups.json");

        List<String> movementsToWorkInWorkout = new JsonToPOJOConverter().JsonToMovementTypes("src/main/resources/WorkoutProperties.json").get(workoutType);
        List<String> lightOrHeavyInWorkout = new JsonToPOJOConverter().JsonToLightOrHeavy("src/main/resources/WorkoutProperties.json").get(workoutType);



        return null;
    }

    //create final workout
    public Workout createWorkout(String workoutType) throws IOException {

        Workout workoutToReturn = new Workout();
        ExerciseDictionary exerciseDictionary = new JsonToPOJOConverter().JsonToDictionary("src/main/resources/ExerciseDictionary.json");
        List<MuscleGroup> muscleGroupsList = new JsonToPOJOConverter().JsonToMuscleGroups("src/main/resources/MuscleGroups.json");

        List<String> movementsToWorkInWorkout = new JsonToPOJOConverter().JsonToMovementTypes("src/main/resources/WorkoutProperties.json").get(workoutType);
        List<String> lightOrHeavyInWorkout = new JsonToPOJOConverter().JsonToLightOrHeavy("src/main/resources/WorkoutProperties.json").get(workoutType);
        List<MuscleGroup> muscleGroupsInWorkout = getMuscleGroupsToWorkInWorkout(workoutType);

        List<String> lightOrHeavyInNewWorkout = new ArrayList<>();
        List<String> movementsWorkedInNewWorkout = new ArrayList<>();
        List<MuscleGroup> muscleGroupsInNewWorkout = new ArrayList<>();

        //System.out.println(movementsToWorkInWorkout);
        //System.out.println(lightOrHeavyInWorkout);
        //System.out.println(exerciseDictionary.getExerciseDictionary().values());

        //for ( Exercise exercise : exerciseDictionary.getExerciseDictionary().values() ) {
            //System.out.println(exercise.getName().toString());
        //}

        return null;
    }
}

