import java.util.HashMap;
import java.util.Map;

public RuntimeResponse main(RuntimeRequest req, RuntimeResponse res) {
    Map<String, Object> responseData = new HashMap<>();
    
    return res.json(responseData);
}
