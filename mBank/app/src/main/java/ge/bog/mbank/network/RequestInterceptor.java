package ge.bog.mbank.network;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * created by tamuna
 */
public class RequestInterceptor implements Interceptor {
    public static String sessionId = "";

    @Override
    public Response intercept(Chain chain) throws IOException {
        HttpUrl url = chain.request().url().newBuilder().addPathSegment(sessionId).build();
        Request request = chain.request().newBuilder()
                .url(url)
                .header("Accept", "Application/json")
                .build();
        Response response = chain.proceed(request);

        return response;
    }
}
