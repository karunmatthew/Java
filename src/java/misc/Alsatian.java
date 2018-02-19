package java.misc;

import java.io.IOException;

public class Alsatian extends Dog{

	
	Alsatian(int serialNo, String type) throws IOException
	{
		super(serialNo, type);
	}
	
	
	@Override
	public String getGenus() {
		return "Alsatious";
	}

}
