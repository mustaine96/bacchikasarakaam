package org.mule.examples;

import org.mule.api.MuleMessage;

public interface Filter {

	boolean accept(MuleMessage message);

}
