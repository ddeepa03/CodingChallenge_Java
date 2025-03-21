package org.onlinestatus;

import java.util.HashMap;
import java.util.Map;

public class OnlineStatus {
	public static int onlineCount(Map<String, String> statuses) {
        int count = 0;
        for (String status : statuses.values()) {
            if ("online".equals(status)) {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		 Map<String, String> statuses = new HashMap<>();
	        statuses.put("Alice", "online");
	        statuses.put("Bob", "offline");
	        statuses.put("Eve", "online");
	        System.out.println("Number of people who are online: " + onlineCount(statuses));
	    }
}
