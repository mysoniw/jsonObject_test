package com.test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by soniw on 2016. 5. 26..
 */
public class JsonData {


	public static void main(String[] args) {
		JsonData obj = new JsonData();
		obj.run();
	}
	private void run() {

		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string from file to Object
			Result result = mapper.readValue(new File("src/jsondata.json"), Result.class);
			System.out.println(result);

			// Convert JSON string to Object
			String jsonInString = "{}";
			Result result1 = mapper.readValue(jsonInString, Result.class);


			//Pretty print
			String prettyItem1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
			System.out.println(prettyItem1);

			Map<String,Object> map = result.getResponse().getBody().getItems().getItem();
			List<String> lists = new ArrayList<String>(map.keySet());
			for(String key : lists) {
				System.out.println(key +" : " + map.get(key));
			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
