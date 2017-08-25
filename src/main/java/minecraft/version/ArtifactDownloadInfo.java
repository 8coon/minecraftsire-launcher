package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;


public class ArtifactDownloadInfo {

    private ArtifactInfo artifact;
    private Map<String, ArtifactInfo> classifiers;

    @JsonCreator
    public ArtifactDownloadInfo(
            @JsonProperty("artifact") ArtifactInfo artifact,
            @JsonProperty("classifiers") Map<String, ArtifactInfo> classifiers
    ) {
        this.artifact = artifact;
        this.classifiers = classifiers;
    }

    public ArtifactInfo getArtifact() {
        return artifact;
    }

    public Map<String, ArtifactInfo> getClassifiers() {
        return classifiers;
    }

}
