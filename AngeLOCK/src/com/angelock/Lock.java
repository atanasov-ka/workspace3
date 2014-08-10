package com.angelock;

import java.io.IOException;
import java.nio.file.Path;

public interface Lock {
	public boolean encript(String key, Path source, Path destination) throws IOException;
	public boolean decript(String key, Path source, Path destination) throws IOException;
	public boolean isKeyValid(String key, Path pathToFile);
}
