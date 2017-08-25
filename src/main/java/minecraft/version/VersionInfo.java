package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true /* Для свойства "logging"ы */)
public class VersionInfo {

    private AssetIndexInfo assetIndex;
    private String assets;
    private DownloadsInfo downloads;
    private String id;
    private List<LibraryInfo> libraries;
    private String mainClass;
    private String minecraftArguments;
    private String minimumLauncherVersion;
    private String releaseTime;
    private String time;
    private String type;

    @JsonCreator
    public VersionInfo(
            @JsonProperty("assetIndex") AssetIndexInfo assetIndex,
            @JsonProperty("assets") String assets,
            @JsonProperty("downloads") DownloadsInfo downloads,
            @JsonProperty("id") String id,
            @JsonProperty("libraries") List<LibraryInfo> libraries,
            @JsonProperty("mainClass") String mainClass,
            @JsonProperty("minecraftArguments") String minecraftArguments,
            @JsonProperty("minimumLauncherVersion") String minimumLauncherVersion,
            @JsonProperty("releaseTime") String releaseTime,
            @JsonProperty("time") String time,
            @JsonProperty("type") String type
    ) {
        this.assetIndex = assetIndex;
        this.assets = assets;
        this.downloads = downloads;
        this.id = id;
        this.libraries = libraries;
        this.mainClass = mainClass;
        this.minecraftArguments = minecraftArguments;
        this.minimumLauncherVersion = minimumLauncherVersion;
        this.releaseTime = releaseTime;
        this.time = time;
        this.type = type;
    }

    public AssetIndexInfo getAssetIndex() {
        return assetIndex;
    }

    public String getAssets() {
        return assets;
    }

    public DownloadsInfo getDownloads() {
        return downloads;
    }

    public String getId() {
        return id;
    }

    public List<LibraryInfo> getLibraries() {
        return libraries;
    }

    public String getMainClass() {
        return mainClass;
    }

    public String getMinecraftArguments() {
        return minecraftArguments;
    }

    public String getMinimumLauncherVersion() {
        return minimumLauncherVersion;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

}
