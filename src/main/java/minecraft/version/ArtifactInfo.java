package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArtifactInfo extends UrlInfo {

    private String path;

    @JsonCreator
    public ArtifactInfo(
            @JsonProperty("sha1") String sha1,
            @JsonProperty("size") int size,
            @JsonProperty("url") String url,
            @JsonProperty("path") String path
    ) {
        super(sha1, size, url);
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
