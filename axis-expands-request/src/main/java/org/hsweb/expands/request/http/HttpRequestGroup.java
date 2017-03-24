package org.hsweb.expands.request.http;

/**
 * @author zhouhao
 */
public interface HttpRequestGroup {

    String getCookie();

    HttpRequestGroup clearCookie();

    HttpRequest request(String url);

}
