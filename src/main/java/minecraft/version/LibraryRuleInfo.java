package minecraft.version;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LibraryRuleInfo {

    public static final String ALLOW = "allow";
    public static final String DISALLOW = "disallow";

    private String action;
    private LibraryRuleOSInfo os;

    @JsonCreator
    public LibraryRuleInfo(
            @JsonProperty("action") String action,
            @JsonProperty("os") LibraryRuleOSInfo os
    ) {
        this.action = action;
        this.os = os;
    }

    public String getAction() {
        return action;
    }

    public LibraryRuleOSInfo getOs() {
        return os;
    }


    public boolean isInitialAllowed() {
        return LibraryRuleInfo.ALLOW.equalsIgnoreCase(action);
    }

    public boolean isInitialDisallowed() {
        return LibraryRuleInfo.DISALLOW.equalsIgnoreCase(action);
    }

}
