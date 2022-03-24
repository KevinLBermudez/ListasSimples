package listClassNodes;

public class NodeSimpleLists {

    private String data;
    private NodeSimpleLists promter;

    public void setPromter(NodeSimpleLists promter) {
        this.promter = promter;
    }

    public NodeSimpleLists(String data) {
        this.data = data;
        this.promter = null;
    }

    public String getData() {
        return data;
    }

    public NodeSimpleLists getPromter() {
        return promter;
    }

}
