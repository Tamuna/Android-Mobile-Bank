package ge.bog.mbank.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * created by tamuna
 */
public class RetrofitInstance {
    private static Retrofit retrofit;
    private static String BASE_URL = "https://api.fintech.ge/";

    public static Retrofit getRetofitInstance() {

        if (retrofit == null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new RequestInterceptor())
                    .build();
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

}
