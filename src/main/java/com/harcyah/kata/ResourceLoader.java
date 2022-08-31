package com.harcyah.kata;

import com.google.common.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ResourceLoader {

    public static InputStream loadStream(String name) throws IOException {
        URL resource = ResourceLoader.class.getResource(name);
        return resource.openStream();
    }

    public static String loadString(String name) throws IOException {
        URL resource = ResourceLoader.class.getResource(name);
        return Resources.toString(resource, StandardCharsets.UTF_8);
    }

    public static List<String> loadLines(String name) throws IOException {
        URL resource = ResourceLoader.class.getResource(name);
        return Resources.readLines(resource, StandardCharsets.UTF_8);
    }

}
