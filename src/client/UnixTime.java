package client;

import java.util.Date;

public class UnixTime {
	private static Date unixEpoch = new Date(0);
	
	public static int getNow() {
		return (int)System.currentTimeMillis() / 1000;
	}
	
	public static int GetFromDateTime(Date d)
    {
		return (int)(d.getTime() - unixEpoch.getTime()) / 1000;
    }
	
	public static Date ConvertToDate(int unixTime)
    {
        return new Date(unixTime - unixEpoch.getTime() / 1000);
    }
}
