import java.util.LinkedList;
import java.util.List;

class Path {

    public List<LabelIDPair> idPairs;
    public DocType doctype;
    public String name;
    public List<String> methods;

    public Path() {
        this.idPairs = new LinkedList<>();
        this.methods = new LinkedList<>();
        this.name = "";
    }


    static class LabelIDPair {
        public String name;
        public String idName;

        public LabelIDPair(String name, String idName) {
            this.name = name;
            this.idName = idName;
        }

        @Override
        public String toString() {
            return "LabelIDPair{" +
                    "name='" + name + '\'' +
                    ", idName='" + idName + '\'' +
                    '}';
        }
    }

    static class DocType {
        public String name;

        public DocType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "DocType{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Path{" +
                "idPairs=" + idPairs +
                ", doctype=" + doctype +
                ", name='" + name + '\'' +
                ", methods=" + methods +
                '}';
    }
}
