import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonHelper {
    public static void saveToJson(EquationResult result, String filename) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
