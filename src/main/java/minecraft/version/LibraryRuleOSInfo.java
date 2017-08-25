package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LibraryRuleOSInfo {

    public static final String WINDOWS = "windows";
    public static final String LINUX = "linux";
    public static final String OSX = "osx";

    private String name;

    @JsonCreator
    public LibraryRuleOSInfo(
            @JsonProperty("name") String name
    ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isForWindows() {
        return WINDOWS.equalsIgnoreCase(name);
    }

    public boolean isForLinux() {
        return LINUX.equalsIgnoreCase(name);
    }

    public boolean isForOSX() {
        return OSX.equalsIgnoreCase(name);
    }

}
