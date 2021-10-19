package com.org.fil.mainframe;

import org.springframework.stereotype.Component;

@Component
public class MainframeConnectorAdoptor {
	
    public <T> EasyResponse executeRequest(String serviceName, T jsonPayload) {
        // TODO call mainframe using TEC CONNECTOR library
		return EasyResponse.builder().data("success").build();
    }

}
