import java.io.File;
import java.io.IOException;
import java.net.URL;

public class WorkoutShuffle {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        Exercise overheadPress = new Exercise();
        overheadPress.setName("Overhead Press");
        overheadPress.setMovementType("Push");
        overheadPress.setLightOrHeavy("Heavy");
        overheadPress.setCompound(true);
        overheadPress.getAllCharacteristics();



    }
}
