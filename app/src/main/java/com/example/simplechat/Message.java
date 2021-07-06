package com.example.simplechat;

import com.parse.ParseClassName;
import com.parse.ParseObject;

// Model class of a message. Contains the body text and user_id,
@ParseClassName("Message")
public class Message extends ParseObject {
    public static final String USER_ID_KEY = "userId";
    public static final String BODY_KEY = "body";

    // Gets user Id
    public String getUserId() {
        return getString(USER_ID_KEY);
    }

    // Gets the body key
    public String getBody() {
        return getString(BODY_KEY);
    }

    // Sets the user Id
    public void setUserId(String userId) {
        put(USER_ID_KEY, userId);
    }

    // Sets the body key
    public void setBody(String body) {
        put(BODY_KEY, body);
    }
}