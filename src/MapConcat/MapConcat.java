package MapConcat;

import java.util.HashMap;
import java.util.Map;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

public class MapConcat {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");
        map.compute("Name", (key, val)  -> val.concat(" Singh"));
        System.out.println(map.get("Name"));
    }
}
