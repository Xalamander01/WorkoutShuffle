import Workouts.Workout;

import java.io.IOException;

public class WorkoutShuffle {
    public static void main(String[] args) throws IOException {

        Workout workout = new Workout();
        workout.createWorkout("fullBody");
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