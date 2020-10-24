import java.util.LinkedList;
import java.util.List;

class Path {
    public Path() {
        this.idPairs = new LinkedList<>();
    }

    static class LabelIDPair {
        String name;
        String idName;

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
        String name;

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

    List<LabelIDPair> idPairs;
    DocType doctype;

    @Override
    public String toString() {
        return "Path{" +
                "idPairs=" + idPairs +
                ", doctype=" + doctype +
                '}';
    }
}
