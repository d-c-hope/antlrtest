import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConfigObject {

    public ConfigObject(String name) {
        this.name = name;
        this.properties = new LinkedList<>();
        this.metaProperties = new ConfigObjectMetaProperties();
    }

    static class ConfigObjectProperty {
        public String name;
        public String type;
        public String validatorName;
    }

    static class ConfigObjectMetaProperties {
        public boolean hasQueue = false;
        public String queueName;

        @Override
        public String toString() {
            return "ConfigObjectMetaProperties{" +
                    "hasQueue=" + hasQueue +
                    ", queueName='" + queueName + '\'' +
                    '}';
        }
    }

    public List<ConfigObjectProperty> properties;
    public String name;
    public ConfigObjectMetaProperties metaProperties;

    public String getUpperName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "ConfigObject{" +
                "properties=" + properties +
                ", name='" + name + '\'' +
                ", metaProperties=" + metaProperties +
                '}';
    }
}


