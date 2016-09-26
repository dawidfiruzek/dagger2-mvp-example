package pl.dawidfiruzek.dagger2mvpexample.util.injection;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import pl.dawidfiruzek.dagger2mvpexample.util.api.ApiClient;
import pl.dawidfiruzek.dagger2mvpexample.util.api.ApiServiceGenerator;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

@Module
public class NetworkModule {

    private static final String baseUrl = "https://api.github.com";

    @Provides
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder()
                .build();
    }

    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    ApiServiceGenerator provideApiServiceGenerator(Retrofit retrofit) {
        return new ApiServiceGenerator(retrofit);
    }

    @Provides @Singleton
    ApiClient provideApiClient(ApiServiceGenerator apiServiceGenerator) {
        return new ApiClient(apiServiceGenerator);
    }
}
