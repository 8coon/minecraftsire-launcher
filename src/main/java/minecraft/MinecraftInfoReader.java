package minecraft;


import com.fasterxml.jackson.databind.ObjectMapper;
import minecraft.version.VersionInfo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class MinecraftInfoReader {

    private VersionInfo versionInfo;


    public MinecraftInfoReader(InputStream is) throws IOException {
        versionInfo = (new ObjectMapper()).readerFor(VersionInfo.class).readValue(is);
    }

    public MinecraftInfoReader(File file) throws IOException {
        versionInfo = (new ObjectMapper()).readerFor(VersionInfo.class).readValue(file);
    }


    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

}
