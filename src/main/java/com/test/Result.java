package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by soniw on 2016. 5. 26..
 */
@Data
public class Result {

	@JsonProperty("response")
	Responses response;
}
