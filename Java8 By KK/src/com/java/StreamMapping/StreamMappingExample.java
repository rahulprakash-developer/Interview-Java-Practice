package com.java.StreamMapping;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMappingExample {
	public static void main(String[] args) {
		List<String> uriList = new ArrayList<>();
		uriList.add("C:\\MyFile1.txt");
		uriList.add("D:\\MyFile2.txt");
		uriList.add("E:\\MyFile3.txt");

		Stream<Path> map = uriList.stream().map(uri -> Paths.get(uri));
		map.forEach(System.out::println);

		System.out.println("------------------------");

		List<Details> details = new ArrayList<Details>();
		List<String> part1 = new ArrayList<>();
		part1.add("Part1");
		part1.add("Part2");
		part1.add("Part3");

		List<String> part2 = new ArrayList<>();
		part2.add("Part1");
		part2.add("Part2");
		part2.add("Part3");
		part2.add("Part4");

		Details details1 = new Details(10001, part1);
		Details details2 = new Details(10002, part2);

		details.add(details1);
		details.add(details2);

		Stream<String> flatMap = details.stream().flatMap(detail -> detail.getParts().stream());
		flatMap.forEach(System.out::println);
	}

}
