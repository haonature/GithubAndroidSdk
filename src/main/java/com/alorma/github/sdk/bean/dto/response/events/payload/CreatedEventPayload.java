package com.alorma.github.sdk.bean.dto.response.events.payload;

import com.alorma.github.sdk.bean.dto.response.UserType;

/**
 * Created by Bernat on 05/10/2014.
 */
public class CreatedEventPayload extends DeleteEventPayload {
	public String master_branch;
	public String description;
}
