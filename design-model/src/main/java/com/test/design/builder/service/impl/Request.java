package com.test.design.builder.service.impl;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.http.HttpMethod;
import org.springframework.http.CacheControl;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URL;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.service.impl
 * @ClassName: Request
 * @Author shanqi
 * @Date: 2020/1/21 11:27
 * 变种builder模式
 */
public final class Request {
    final HttpUrl url;
    final String method;
    final Headers headers;
    final RequestBody body;
    final Object tag;
    private volatile CacheControl cacheControl;

    /**
     * 构造必须通过builder创建
     * @param builder
     */
    Request(Request.Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.tag = builder.tag != null ? builder.tag : this;
    }

    public Request.Builder newBuilder() {
        return new Request.Builder(this);
    }

    @Override
    public String toString() {
        return "Request{method=" + this.method + ", url=" + this.url + ", tag=" + (this.tag != this ? this.tag : null) + '}';
    }

    /**
     * 内部类实现Builder
     */
    public static class Builder {
        HttpUrl url;
        String method;
        Headers.Builder headers;
        RequestBody body;
        Object tag;

        public Builder() {
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        /**
         * 为什么在builder中会有这样一个构造方法，
         * 既然我们在创造builder的时候request是空的，那我们什么时候会用到这个方法呢？
         * @param request
         */
        Builder(Request request) {
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            this.tag = request.tag;
            this.headers = request.headers.newBuilder();
        }

        public Request.Builder url(HttpUrl url) {
            if (url == null) {
                throw new NullPointerException("url == null");
            } else {
                this.url = url;
                return this;
            }
        }

        public Request.Builder url(String url) {
            if (url == null) {
                throw new NullPointerException("url == null");
            } else {
                if (url.regionMatches(true, 0, "ws:", 0, 3)) {
                    url = "http:" + url.substring(3);
                } else if (url.regionMatches(true, 0, "wss:", 0, 4)) {
                    url = "https:" + url.substring(4);
                }

                HttpUrl parsed = HttpUrl.parse(url);
                if (parsed == null) {
                    throw new IllegalArgumentException("unexpected url: " + url);
                } else {
                    return this.url(parsed);
                }
            }
        }

        public Request.Builder url(URL url) {
            if (url == null) {
                throw new NullPointerException("url == null");
            } else {
                HttpUrl parsed = HttpUrl.get(url);
                if (parsed == null) {
                    throw new IllegalArgumentException("unexpected url: " + url);
                } else {
                    return this.url(parsed);
                }
            }
        }

        public Request.Builder header(String name, String value) {
            this.headers.set(name, value);
            return this;
        }

        public Request.Builder addHeader(String name, String value) {
            this.headers.add(name, value);
            return this;
        }

        public Request.Builder removeHeader(String name) {
            this.headers.removeAll(name);
            return this;
        }

        public Request.Builder headers(Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public Request.Builder cacheControl(CacheControl cacheControl) {
            String value = cacheControl.toString();
            return value.isEmpty() ? this.removeHeader("Cache-Control") : this.header("Cache-Control", value);
        }

        public Request.Builder get() {
            return this.method("GET", (RequestBody)null);
        }

        public Request.Builder head() {
            return this.method("HEAD", (RequestBody)null);
        }

        public Request.Builder post(RequestBody body) {
            return this.method("POST", body);
        }

        public Request.Builder put(RequestBody body) {
            return this.method("PUT", body);
        }

        public Request.Builder patch(RequestBody body) {
            return this.method("PATCH", body);
        }

        public Request.Builder method(String method, @Nullable RequestBody body) {
            if (method == null) {
                throw new NullPointerException("method == null");
            } else if (method.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (body != null && !HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException("method " + method + " must not have a request body.");
            } else if (body == null && HttpMethod.requiresRequestBody(method)) {
                throw new IllegalArgumentException("method " + method + " must have a request body.");
            } else {
                this.method = method;
                this.body = body;
                return this;
            }
        }

        public Request.Builder tag(Object tag) {
            this.tag = tag;
            return this;
        }


        public Request build() {
            if (this.url == null) {
                throw new IllegalStateException("url == null");
            } else {
                return new Request(this);
            }
        }
    }
}
