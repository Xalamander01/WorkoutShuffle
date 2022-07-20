import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WorkoutShuffle {
    public static void main(String[] args) throws IOException {

        Exercise overheadPress = new Exercise();
        overheadPress.setName("Overhead Press");
        overheadPress.setMovementType("Push");
        overheadPress.setLightOrHeavy("Heavy");
        overheadPress.setCompound(true);
        //overheadPress.getAllCharacteristics();

        ObjectMapper mapper = new ObjectMapper();
        Exercise benchPress = mapper.readValue(new File("src/main/resources/TestExercise.json"), Exercise.class);
        //benchPress.getAllCharacteristics();

        ExerciseDictionary exerciseDictionary = new ExerciseDictionary();
        JSONObject jsonObject = JSONUtil.parseJSONFile("src/main/resources/ExerciseDictionary.json");
        for( int i=0; i<jsonObject.getJSONArray("exerciseDictionary").length(); i++) {
            String exerciseShortName = (String) jsonObject.getJSONArray("exerciseDictionary").getJSONObject(i).get("ShortName");

            org.json.JSONObject exercise = (org.json.JSONObject) jsonObject.getJSONArray("exerciseDictionary").getJSONObject(i).get("Exercise");
            Exercise exerciseToAdd = new Exercise();
            exerciseToAdd.setName((String) exercise.get("name"));
            exerciseToAdd.setMovementType((String) exercise.get("movementType"));
            exerciseToAdd.setLightOrHeavy((String) exercise.get("lightOrHeavy"));
            exerciseToAdd.setCompound((boolean) exercise.get("compound"));
            exerciseDictionary.addExercise(exerciseShortName,exerciseToAdd);
        }
        System.out.println(exerciseDictionary);

        for ( String name : exerciseDictionary.getExerciseDictionary().keySet() ) {
            exerciseDictionary.getExercise(name).getAllCharacteristics();
        }
    }
}