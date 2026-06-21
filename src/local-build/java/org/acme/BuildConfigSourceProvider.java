package org.acme;

import java.util.List;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;

public class BuildConfigSourceProvider implements ConfigSourceProvider {

    @Override
    public Iterable<ConfigSource> getConfigSources(ClassLoader forClassLoader) {
        return List.of();
    }
}
