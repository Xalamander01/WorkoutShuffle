import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonToPOJOConverter {
    public JsonToPOJOConverter() {}

    public ExerciseDictionary JsonToDictionary(String filePath) throws IOException {

        ExerciseDictionary exerciseDictionary = new ExerciseDictionary();
        JSONObject jsonObject = JSONUtil.parseJSONFile(filePath);

        for( int i=0; i<jsonObject.getJSONArray("exerciseDictionary").length(); i++) {

            String exerciseShortName = (String) jsonObject.getJSONArray("exerciseDictionary").getJSONObject(i).get("ShortName");

            org.json.JSONObject exercise = (org.json.JSONObject) jsonObject.getJSONArray("exerciseDictionary").getJSONObject(i).get("Exercise");
            org.json.JSONArray mainMuscleGroup = jsonObject.getJSONArray("exerciseDictionary").getJSONObject(i).getJSONObject("Exercise").getJSONArray("muscle").getJSONObject(0).getJSONArray("mainMuscleGroup");
            JSONArray relatedMuscleGroups = jsonObject.getJSONArray("exerciseDictionary").getJSONObject(i).getJSONObject("Exercise").getJSONArray("muscle").getJSONObject(1).getJSONArray("relatedMuscleGroups");

            Exercise exerciseToAdd = new Exercise();
            Muscle muscleToAdd = new Muscle();
            MuscleGroup mainMuscleGroupToAdd = new MuscleGroup();
            MuscleGroup relatedMuscleGroupToAdd = new MuscleGroup();
            List<MuscleGroup> relatedMuscleGroupsToAdd = new ArrayList<>();

            exerciseToAdd.setName((String) exercise.get("name"));
            exerciseToAdd.setMovementType((String) exercise.get("movementType"));
            exerciseToAdd.setLightOrHeavy((String) exercise.get("lightOrHeavy"));

            mainMuscleGroupToAdd.setMajorMuscleGroup((String) mainMuscleGroup.get(0));
            mainMuscleGroupToAdd.setSubMuscleGroup((String) mainMuscleGroup.get(1));
            muscleToAdd.setMainMuscleGroup(mainMuscleGroupToAdd);

            if ( !relatedMuscleGroups.get(0).equals(null)) {
                for ( int j=0; j<relatedMuscleGroups.length(); j++) {
                    relatedMuscleGroupToAdd.setMajorMuscleGroup((String) relatedMuscleGroups.getJSONArray(j).get(0));
                    relatedMuscleGroupToAdd.setSubMuscleGroup((String) relatedMuscleGroups.getJSONArray(j).get(1));
                    relatedMuscleGroupsToAdd.add(relatedMuscleGroupToAdd);
                }
            }
            muscleToAdd.setRelatedMuscleGroups(relatedMuscleGroupsToAdd);

            exerciseToAdd.setMuscle(muscleToAdd);

            exerciseDictionary.addExercise(exerciseShortName,exerciseToAdd);
        }
        return exerciseDictionary;
    }
}
