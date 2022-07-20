import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
        ArrayList<Exercise> initialDictionary = new ArrayList<>();
        initialDictionary.add(overheadPress);
        initialDictionary.add(benchPress);

        ExerciseDictionary exerciseDictionary = new ExerciseDictionary();
        exerciseDictionary.setExerciseDictionary(initialDictionary);

         */
        ExerciseDictionary exerciseDictionary = new ExerciseDictionary();
        exerciseDictionary.addExercise(overheadPress);
        exerciseDictionary.addExercise(benchPress);

        for ( Exercise exercise : exerciseDictionary.getExerciseDictionary() ) {
            exercise.getAllCharacteristics();
        }

        /*
        ExerciseDictionary exerciseDictionary = mapper.readValue(new File("src/main/resources/ExerciseDictionary.json"), ExerciseDictionary.class);
        exerciseDictionary.getExerciseDictionary();

        for (Exercise exercise : exerciseDictionary ) {
            exercise.getAllCharacteristics();
        }
        */
    }
}
