package fileWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileWalker2 {

	public static void main(String[] args) {
		String path = "C:\\Users\\DikhshitRajkhowa\\OneDrive - Zenon\\Desktop\\nb\\";
		Path start = Paths.get(path);
		
		try(Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
			
			List<String> collect = stream
			        .map(String::valueOf)
			        .sorted()
			        .collect(Collectors.toList());
			    
			    collect.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
