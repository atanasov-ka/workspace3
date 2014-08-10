package com.angelock;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		
		if (args.length == 0)
		{
			invalidArgument();
			return;
		}
		
		Lock locker = new Locker();
		
		switch (args[0]) {
		case "help":

			break;

		case "lock":
			try {
				System.out.println(lock(args, locker));
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
		case "unlock":
			System.out.println(unlock(args, locker));
			break;
		default:
			invalidArgument();
		}
	}

	private static String unlock(String[] args, Lock locker) {
		String key = args[1];
		Path source = Paths.get(args[2]);
		Path destination = Paths.get(args[3]);
		
		if (!source.toFile().isFile())
			return "The file is not valid";
		
		//if (!locker.isKeyValid(key, source))
		//	return "The key is not valid!";
		
		try {
			if (!locker.decript(key, source, destination))
				return "Cannot decript!";
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return "OK";
	}

	private static String lock(String[] args, Lock locker) throws IOException {
		String key = args[1];
		Path source = Paths.get(args[2]);
		Path destination = Paths.get(args[3]);
		
		if (!source.toFile().isFile())
			return "The file is not valid";
		
		if (!locker.encript(key, source, destination))
			return "Cannot encript";
				
		return "OK";
	}

	private static void invalidArgument() {
		System.err.println("See -help");
	}
}
