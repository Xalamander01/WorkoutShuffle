import java.io.IOException;

public class WorkoutShuffle {
    public static void main(String[] args) throws IOException {

        ExerciseDictionary exerciseDictionary = new JsonToPOJOConverter().JsonToDictionary("src/main/resources/ExerciseDictionary.json");

        for ( String name : exerciseDictionary.getExerciseDictionary().keySet() ) {
            System.out.println(exerciseDictionary.getExercise(name).getMuscle().getRelatedMuscleGroups());
        }
    }

    /*
    object structure:
    - workouts
        - splits
            - full body, push, pull etc. ( String )
            - for each split, randomly pick exercises with:
                - movements to work ( String )
                - light or heavy ( String )
                - muscles to work ( Muscle )
    - exercises
        - name
        - movement type ( String )
        - light or heavy ( String )
        - muscles to work ( Muscle )
    - muscles
        - main muscle group ( list of strings )
        - sub muscle group ( list of strings )
        - related muscles ( list of strings )
     */
}