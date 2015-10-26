import java.util.ArrayList;
import java.util.List;

public class UrlQueryParam {

    public SimpleUrl url;
    public List<QueryParam> queryParams;

    public UrlQueryParam(String url) {
        this.url = new SimpleUrl(url);
        queryParams = new ArrayList<>();
    }

    public UrlQueryParam(SimpleUrl url) {
        this.url = url;
        queryParams = new ArrayList<>();
    }

    public UrlQueryParam(String url, List<QueryParam> queryParams) {
        this.url = new SimpleUrl(url);
        this.queryParams = queryParams;
    }

    public UrlQueryParam(SimpleUrl url, List<QueryParam> queryParams) {
        this.url = url;
        this.queryParams = queryParams;
    }

    public void add(QueryParam queryParam) {
        queryParams.add(queryParam);
    }

    public void remove(String key) {
        for (QueryParam queryParam : queryParams) {
            if (queryParam.getKey().equals(key)) {
                queryParams.remove(queryParam);
                break;
            }
        }
    }

    public String getEntireUrl() {
        String returnUrl = url.getUrl() + "?";

        for (QueryParam queryParam : queryParams) {
            returnUrl += queryParam.getQueryParam() + "&";
        }

        return returnUrl.substring(0, returnUrl.length() - 2);
    }
}
