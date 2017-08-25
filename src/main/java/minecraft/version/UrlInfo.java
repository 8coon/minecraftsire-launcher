package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UrlInfo {

    private String sha1;
    private int size;
    private String url;

    @JsonCreator
    public UrlInfo(
            @JsonProperty("sha1") String sha1,
            @JsonProperty("size") int size,
            @JsonProperty("url") String url
    ) {
        this.sha1 = sha1;
        this.size = size;
        this.url = url;
    }

    public String getSha1() {
        return sha1;
    }

    public int getSize() {
        return size;
    }

    public String getUrl() {
        return url;
    }

}
