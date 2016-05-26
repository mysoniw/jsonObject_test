package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by soniw on 2016. 5. 26..
 */
@Data
public class Body {

	@JsonProperty("items")
	Items items;

	@JsonProperty("numOfRows")
	int numOfRows;

	@JsonProperty("pageNo")
	int pageNo;

	@JsonProperty("totalCount")
	int totalCount;
}
