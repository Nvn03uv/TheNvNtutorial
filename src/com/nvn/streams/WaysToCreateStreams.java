package com.nvn.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStreams {
	public static void main(String[] args) throws IOException {

		// Stream of values
		Stream<String> streamOfArray = Stream.of("abhisek  ", "boss   ", "chat ", "abhilasha  ");

		// Collection stram
		List<String> listString = new ArrayList<String>();
		Stream<String> streamOfArray1 = listString.stream();

		// Arrays
		Stream<String> streamOfArray2 = Arrays.stream(new String[4]);

		// staream by file
		Stream<String> streamOfArray3 = Files.lines(Paths.get(""));

		// map-filter-reduce.
		// streamOfArray.forEach(System.out::println);
		streamOfArray.map(String::toUpperCase).map(String::trim).forEach(System.out::println);

		// By list
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}
}
