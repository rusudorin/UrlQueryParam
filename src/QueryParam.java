
public class QueryParam {

    private String key;
    private String value;

    public QueryParam(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getQueryParam() {
        return key + "=" + value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
