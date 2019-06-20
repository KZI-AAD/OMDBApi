package firma.moja.com.omdbapitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

import firma.moja.com.omdbapitest.net.OMDBApiService;
import firma.moja.com.omdbapitest.net.model.OMDBResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private void callService(String query){
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("apikey", "VAS OMDBAPI KLJUC!");
        queryParams.put("s", query);

        Call<OMDBResponse> call = OMDBApiService.apiInterface().searchOMDB(queryParams);
        call.enqueue(new Callback<OMDBResponse>() {
            @Override
            public void onResponse(Call<OMDBResponse> call, Response<OMDBResponse> response) {
                if (response.code() == 200){
                    OMDBResponse resp = response.body();
                }
            }

            @Override
            public void onFailure(Call<OMDBResponse> call, Throwable t) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText query = findViewById(R.id.searchText);

        Button search = findViewById(R.id.searchBtn);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Unese Batman -> query.getText().toString().trim()
                callService(query.getText().toString().trim());
            }
        });

    }
}
