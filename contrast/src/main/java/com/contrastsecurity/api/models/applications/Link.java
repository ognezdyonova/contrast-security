package com.contrastsecurity.api.models.applications;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rel",
        "href",
        "hreflang",
        "media",
        "title",
        "type",
        "deprecation",
        "method"
})
public class Link {

    @JsonProperty("rel")
    private String rel;
    @JsonProperty("href")
    private String href;
    @JsonProperty("hreflang")
    private Object hreflang;
    @JsonProperty("media")
    private Object media;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("type")
    private Object type;
    @JsonProperty("deprecation")
    private Object deprecation;
    @JsonProperty("method")
    private String method;

    public Link() {
    }

    public Link(String rel, String href, Object hreflang, Object media, Object title, Object type, Object deprecation, String method) {
        this.rel = rel;
        this.href = href;
        this.hreflang = hreflang;
        this.media = media;
        this.title = title;
        this.type = type;
        this.deprecation = deprecation;
        this.method = method;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Object getHreflang() {
        return hreflang;
    }

    public void setHreflang(Object hreflang) {
        this.hreflang = hreflang;
    }

    public Object getMedia() {
        return media;
    }

    public void setMedia(Object media) {
        this.media = media;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getDeprecation() {
        return deprecation;
    }

    public void setDeprecation(Object deprecation) {
        this.deprecation = deprecation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Link{" +
                "rel='" + rel + '\'' +
                ", href='" + href + '\'' +
                ", hreflang=" + hreflang +
                ", media=" + media +
                ", title=" + title +
                ", type=" + type +
                ", deprecation=" + deprecation +
                ", method='" + method + '\'' +
                '}';
    }
}
