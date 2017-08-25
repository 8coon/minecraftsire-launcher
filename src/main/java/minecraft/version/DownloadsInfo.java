package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DownloadsInfo {

    private UrlInfo client;
    private UrlInfo server;

    @JsonCreator
    public DownloadsInfo(
            @JsonProperty("client") UrlInfo client,
            @JsonProperty("server") UrlInfo server
    ) {
        this.client = client;
        this.server = server;
    }

    public UrlInfo getClient() {
        return client;
    }

    public UrlInfo getServer() {
        return server;
    }

}
