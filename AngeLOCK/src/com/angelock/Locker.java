package com.angelock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Locker implements Lock {

	@Override
	public boolean encript(String key, Path source, Path destination) throws IOException {
		byte[] srcByteArray = Files.readAllBytes(source);
		byte[] password = key.getBytes();
		int keyLen = password.length;
		
		for (int i = 0; i < srcByteArray.length; ++i)
		{
			int pIndex = i % keyLen;
			
			srcByteArray[i] ^= password[pIndex];
			srcByteArray[i] ^= i;
			srcByteArray[i] ^= pIndex;
		}
		
		Files.write(destination, srcByteArray);
		return true;
	}

	@Override
	public boolean decript(String key, Path source, Path destination) throws IOException {
		byte[] srcByteArray = Files.readAllBytes(source);
		byte[] password = key.getBytes();
		int keyLen = password.length;
		
		for (int i = 0; i < srcByteArray.length; ++i)
		{
			int pIndex = i % keyLen;
			
			srcByteArray[i] ^= pIndex;
			srcByteArray[i] ^= i;
			srcByteArray[i] ^= password[pIndex];			
		}
		
		Files.write(destination, srcByteArray);
		return true;
	}

	@Override
	public boolean isKeyValid(String key, Path pathToFile) {

		return false;
	}
	

}
