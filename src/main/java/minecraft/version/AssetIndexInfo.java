package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetIndexInfo extends UrlInfo {

    public String id;
    public int totalSize;

    @JsonCreator
    public AssetIndexInfo(
            @JsonProperty("sha1") String sha1,
            @JsonProperty("size") int size,
            @JsonProperty("url") String url,
            @JsonProperty("id") String id,
            @JsonProperty("totalSize") int totalSize
    ) {
        super(sha1, size, url);
        this.id = id;
        this.totalSize = totalSize;
    }

    public String getId() {
        return id;
    }

    public int getTotalSize() {
        return totalSize;
    }

}
