package com.java.StreaWIthFileApi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFileTest {
	public static void main(String[] args) {
		Path path = Paths.get("test.txt");
		/*try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		try (Stream<String> lines = Files.lines(path,Charset.forName("UTF-8"))) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/*
 * Here we use Try with resource(means not required to 
 * close in finally block) no need to define in 
 * finally block this is java 7 features
 */
