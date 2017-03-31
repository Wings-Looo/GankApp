package com.wings.gankapp;

import org.json.JSONObject;

import java.util.LinkedHashMap;

/**
 * Created by wings on 2017/3/30.
 */

public class MapHelper {

    public static LinkedHashMap<String, Object> getMap(String mapKey, String orderBy, String page, String pageSize, String queryId) {
        LinkedHashMap<String, Object> topMap = new LinkedHashMap<>();

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("orderBy", orderBy);
        map.put("page", page);
        map.put("pageSize", pageSize);
        map.put("query", new LinkedHashMap<>().put("id.eq", queryId));
        topMap.put(mapKey, map);
        return topMap;
    }
}
