import java.io.File;
import java.io.IOException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.stream.FileImageOutputStream;

public class WorkoutShuffle {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Exercise overheadPress = new Exercise();
        overheadPress.setName("Overhead Press");
        overheadPress.setMovementType("Push");
        overheadPress.setLightOrHeavy("Heavy");
        overheadPress.setCompound(true);
        overheadPress.getAllCharacteristics();

        Exercise benchPress = mapper.readValue(new File("src/main/resources/TestExercise.json"), Exercise.class);
        benchPress.getAllCharacteristics();

/*
        ExerciseDictionary exerciseDictionary = mapper.readValue(new File("src/main/resources/ExerciseDictionary.json"), ExerciseDictionary.class);
        for (Exercise exercise : exerciseDictionary ) {
            exercise.getAllCharacteristics();
        }
*/
    }
}
