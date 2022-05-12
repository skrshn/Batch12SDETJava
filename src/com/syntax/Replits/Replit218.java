package com.syntax.Replits;

import java.util.*;

public class Replit218 {
    static List<String> countDeviceNames(List<String> deviceNames) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < deviceNames.size(); i++) {
            if (map.containsKey(deviceNames.get(i))) {
                map.put(deviceNames.get(i), map.get(deviceNames.get(i)) + 1);
                deviceNames.set(i, deviceNames.get(i) + map.get(deviceNames.get(i)));
            } else {
                map.put(deviceNames.get(i), 0);
            }
        }
        return deviceNames;
    }

    public static void main(String[] args) {
        List<String> deviceNames = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv", "radio"));

        System.out.println(countDeviceNames(deviceNames));
    }
}
