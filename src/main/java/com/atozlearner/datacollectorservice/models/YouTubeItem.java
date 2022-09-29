package com.atozlearner.datacollectorservice.models;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class YouTubeItem {

    private String kind;
    private String etag;
    private String channelId;
    private JsonArray items;


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
