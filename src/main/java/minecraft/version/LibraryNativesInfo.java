package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LibraryNativesInfo {

    private String linux;
    private String osx;
    private String windows;

    @JsonCreator
    public LibraryNativesInfo(
            @JsonProperty("linux") String linux,
            @JsonProperty("osx") String osx,
            @JsonProperty("windows") String windows
    ) {
        this.linux = linux;
        this.osx = osx;
        this.windows = windows;
    }

    public String getLinuxNatives() {
        return linux;
    }

    public String getOSXNatives() {
        return osx;
    }

    public String getWindowsNatives() {
        return windows;
    }

    public String getNativesFor(String os) {
        if (LibraryRuleOSInfo.LINUX.equalsIgnoreCase(os)) {
            return this.getLinuxNatives();
        }

        if (LibraryRuleOSInfo.OSX.equalsIgnoreCase(os)) {
            return this.getOSXNatives();
        }

        if (LibraryRuleOSInfo.WINDOWS.equalsIgnoreCase(os)) {
            return this.getWindowsNatives();
        }

        return null;
    }

}
