package org.acme.config;

import java.util.ArrayList;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;

public class MyConfigSourceProvider implements ConfigSourceProvider {

	@Override
	public Iterable<ConfigSource> getConfigSources(ClassLoader forClassLoader) {
		return new ArrayList<>();
	}
}