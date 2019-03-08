package org.mule.examples;

import java.util.Map;

import org.mule.api.MuleMessage;

public class InputDataValidator implements Filter {

	@Override
	public boolean accept(MuleMessage message) {
		Map<String, Object> payloadMap = (Map<String, Object>) message.getPayload();
		
		if (!payloadMap.containsKey("email")) 
			throw new NullPointerException("email is invalid");	
	
		
		return true;
	}
}
