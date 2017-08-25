package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LibraryExtractInfo {

    private List<String> exclude;

    @JsonCreator
    public LibraryExtractInfo(
            @JsonProperty("exclude") List<String> exclude
    ) {
        this.exclude = exclude;
    }

    public List<String> getExclude() {
        return exclude;
    }

}
