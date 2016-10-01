package info.androidhive.retrofit.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import info.androidhive.retrofit.R;
import info.androidhive.retrofit.adapter.MoviesAdapter;
import info.androidhive.retrofit.model.MyTransaction;
import info.androidhive.retrofit.model.Partners;
import info.androidhive.retrofit.rest.ApiClient;
import info.androidhive.retrofit.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private final static String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";
    String url = "http://androidtutorialpoint.com/";
    public static final String BASE_URL = "http://www.mysiponline.com/admin-panel/AndroidApi/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY from themoviedb.org first!", Toast.LENGTH_LONG).show();
            return;
        }

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);


        Call<Partners> partnersCall = apiService.getPartners();
        partnersCall.enqueue(new Callback<Partners>() {
            @Override
            public void onResponse(Call<Partners> call, Response<Partners> response) {
                List<String> partnersList = response.body().getData();
                recyclerView.setAdapter(new MoviesAdapter(partnersList,
                        R.layout.list_item_movie, getApplicationContext()));
                Log.e(TAG, "Partners list : " + response.body().getData());
            }

            @Override
            public void onFailure(Call<Partners> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });


       /* Call<MyTransaction> myTransactionCall = apiService.getTransaction("420");
        myTransactionCall.enqueue(new Callback<MyTransaction>() {
            @Override
            public void onResponse(Call<MyTransaction> call, Response<MyTransaction> response) {
                Log.e(TAG, "Partners list : " + response.body().getFolioNo());
            }

            @Override
            public void onFailure(Call<MyTransaction> call, Throwable t) {

            }
        });*/

        getRetrofitArray();

    }

    void getRetrofitArray() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface service = retrofit.create(ApiInterface.class);

        Call<List<MyTransaction>> call = service.getTransaction("420");

        call.enqueue(new Callback<List<MyTransaction>>() {

            @Override
            public void onResponse(Call<List<MyTransaction>> call, Response<List<MyTransaction>> response) {
                try {

                    List<MyTransaction> StudentData = response.body();

                    Log.e(TAG, "MyTransaction list : " + StudentData.size());

                   /* for (int i = 0; i < StudentData.size(); i++) {

                        if (i == 0) {
                            Log.e("StudentId  :  ", ":" + StudentData.get(i).getCategoryType());
                            Log.e("StudentName  :  ", ":" + StudentData.get(i).getFolioNo());
                            Log.e("StudentMarks  : ", ":" + StudentData.get(i).getSchemeName());
                        } else if (i == 1) {
                            Log.e("StudentId  :  ", ":" + StudentData.get(i).getTrxntype());
                            Log.e("StudentName  :  ", ":" + StudentData.get(i).getCurrentInvest());
                            Log.e("StudentMarks  : ", ":" + StudentData.get(i).getGainLoss());
                        }
                    }*/


                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<MyTransaction>> call, Throwable t) {

            }
        });
    }
}
