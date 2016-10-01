package info.androidhive.retrofit.rest;

import java.util.List;

import info.androidhive.retrofit.model.MoviesResponse;
import info.androidhive.retrofit.model.MyTransaction;
import info.androidhive.retrofit.model.Partners;
import info.androidhive.retrofit.model.Student;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("mutulfundcompanies")
    Call<Partners> getPartners();

    @POST("client_trans/{user_id}")
    Call<List<MyTransaction>> getTransaction(@Path("user_id") String id);

    @GET("api/RetrofitAndroidArrayResponse")
    Call<List<Student>> getStudentDetails(@Path("user_id") String id);

}
