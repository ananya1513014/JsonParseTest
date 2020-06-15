package com.codes.smarter;

import com.codes.smarter.bo.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class JsonParser {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JsonParser.class, args);
		ObjectMapper objectMapper = new ObjectMapper();
		Root root = objectMapper.readValue(new File(System.getProperty("user.dir") + "/src/main/resources/foodyo_output.json"), Root.class);

		int level = 0;

		for (Recommendations recommendation : root.getBody().getRecommendations()) {

			printByLevel(level);
			System.out.println(recommendation.getRestaurantName());

			for (Menu menu : recommendation.getMenu()) {
				level++;
				if (menu.getType().equals("sectionheader")) {

					for (Children_1 children_1 : menu.getChildren()) {
						level++;
						if (children_1.getType().equals("item") && children_1.getSelected() == 1) {
							printByLevel(level);
							System.out.println(children_1.getName());
						}
						iterateChildren(children_1.getChildren(), level);
						level--;
					}
				}
				level--;
			}
		}
	}

	public static void iterateChildren(List<Children_2> children_2List, int level) {
		if (children_2List == null) return;
		else {
			for (Children_2 children_2 : children_2List) {
				level++;
				if (children_2.getSelected() == 1) {
					printByLevel(level);
					System.out.println(children_2.getName());
					iterateChildren(children_2.getChildren(), level);
				}
				level--;
			}
		}
	}

	public static void printByLevel(int level) {
		if (level == 0) return;
		for (int i = 0; i < level; i++) {
			System.out.print("--");
		}
		System.out.print(">");
	}
}
