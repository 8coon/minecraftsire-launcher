package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class LibraryInfo {

    private String name;
    private ArtifactDownloadInfo downloads;
    private List<LibraryRuleInfo> rules;
    private LibraryExtractInfo extract;
    private LibraryNativesInfo natives;

    @JsonCreator
    public LibraryInfo(
            @JsonProperty("name") String name,
            @JsonProperty("downloads") ArtifactDownloadInfo downloads,
            @JsonProperty("rules") List<LibraryRuleInfo> rules,
            @JsonProperty("extract") LibraryExtractInfo extract,
            @JsonProperty("natives") LibraryNativesInfo natives
    ) {
        this.name = name;
        this.downloads = downloads;
        this.rules = rules;
        this.extract = extract;
        this.natives = natives;
    }

    public String getName() {
        return name;
    }

    public ArtifactDownloadInfo getDownloads() {
        return downloads;
    }

    public List<LibraryRuleInfo> getRules() {
        return rules;
    }

    public LibraryExtractInfo getExtract() {
        return extract;
    }

    public LibraryNativesInfo getNatives() {
        return natives;
    }

}
