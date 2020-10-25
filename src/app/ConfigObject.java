import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConfigObject {

    public ConfigObject(String name) {
        this.name = name;
        this.properties = new LinkedList<>();
    }

    static class ConfigObjectProperty {
        public String name;
        public String type;
        public String validatorName;
    }

    public List<ConfigObjectProperty> properties;
    public String name;

    public String getUpperName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "ConfigObject{" +
                "properties=" + properties +
                ", name='" + name + '\'' +
                '}';
    }
}


