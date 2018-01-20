package com.rattanak.jsonutils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Rattanak on 6/7/2017.
 */

public class JSONUtils {

    public static JSONArray appendJSONArray(JSONArray a, JSONArray b) {
        try {
            if (a != null && a.length() > 0 && b != null && b.length() > 0) {
                String data = a.toString() + "#" + b.toString();
                data = data.replace("]#[", ",");
                return new JSONArray(data);
            } else if (a != null && a.length() > 0) {
                return a;
            } else if (b != null && b.length() > 0) {
                return b;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONArray optJSONArray(JSONObject object, String key) {
        try {
            return object.getJSONArray(key);
        } catch (Exception e) {
            return new JSONArray();
        }
    }

    public static JSONObject optJSONObject(JSONObject object, String key) {
        try {
            return object.getJSONObject(key);
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    public static JSONObject optJSONObject(JSONArray object, int index) {
        try {
            return object.getJSONObject(index);
        } catch (Exception e) {
            return new JSONObject();
        }
    }
}
