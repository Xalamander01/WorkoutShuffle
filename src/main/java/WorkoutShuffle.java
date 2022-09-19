import Exercises.ExerciseDictionary;
import JSONHandler.JsonToPOJOConverter;
import Workouts.Workout;

import java.io.IOException;

public class WorkoutShuffle {
    public static void main(String[] args) throws IOException {

        Workout workout = new Workout();
        workout.createWorkout("fullBody");

        //ExerciseDictionary exerciseDictionary = new JsonToPOJOConverter().JsonToDictionary("src/main/resources/ExerciseDictionary.json");
        //Map<String, List<String>> movementsToWorkInWorkout = new JSONHandler.JsonToPOJOConverter().JsonToMovementTypes("src/main/resources/WorkoutProperties.json");
        //Map<String, List<String>> lightOrHeavyInWorkout = new JSONHandler.JsonToPOJOConverter().JsonToLightOrHeavy("src/main/resources/WorkoutProperties.json");
        //for ( String name : exerciseDictionary.getExerciseDictionary().keySet() ) {
            //System.out.println(exerciseDictionary.getExercise(name).getMuscle().getRelatedMuscleGroups());
        //}
    }

    /*
    object structure:
    - workouts
        - splits
            - full body, push, pull etc. ( String )
            - for each split, randomly pick exercises with:
                - movements to work ( String )
                - light or heavy ( String )
                - muscles to work ( Muscles.Muscle )
    - exercises
        - name
        - movement type ( String )
        - light or heavy ( String )
        - muscles to work ( Muscles.Muscle )
    - muscles
        - main muscle group ( list of strings )
        - sub muscle group ( list of strings )
        - related muscles ( list of strings )
     */
}