package com.ardananjungkusuma.latihanretrofit.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Repo{
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("html_url")
    private String htmlUrl;

    public Integer getId() {
        return id;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getName() {
        return name;
    }
}
