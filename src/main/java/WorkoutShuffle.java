import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WorkoutShuffle {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Exercise overheadPress = new Exercise();
        overheadPress.setName("Overhead Press");
        overheadPress.setMovementType("Push");
        overheadPress.setLightOrHeavy("Heavy");
        overheadPress.setCompound(true);
        //overheadPress.getAllCharacteristics();

        Exercise benchPress = mapper.readValue(new File("src/main/resources/TestExercise.json"), Exercise.class);
        //benchPress.getAllCharacteristics();

        /*
        ExerciseDictionary exerciseDictionary = new ExerciseDictionary();
        exerciseDictionary.addExercise("overheadPress", overheadPress);
        exerciseDictionary.addExercise("benchPress", benchPress);

        for ( String name : exerciseDictionary.getExerciseDictionary().keySet() ) {
            exerciseDictionary.getExercise(name).getAllCharacteristics();
        }
*/
/*
        ExerciseDictionary exerciseDictionary = mapper.readValue(new File("src/main/resources/ExerciseDictionary.json"), ExerciseDictionary.class);
        exerciseDictionary.getExerciseDictionary();

        for ( String name : exerciseDictionary.getExerciseDictionary().keySet() ) {
            exerciseDictionary.getExercise(name).getAllCharacteristics();
        }

 */
    }
}
