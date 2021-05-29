package com.dream.info;

import lombok.Data;

@Data
public class Image {
    public String url;
    public int width;
    public int height;
    public String caption;
    public String credit;
    public Object photographer;
    public Object peerUrls;
}
