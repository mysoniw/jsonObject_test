package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

/**
 * Created by soniw on 2016. 5. 26..
 */
@Data
public class Items {

	@JsonProperty("item")
	Map<String, Object> item;


}
