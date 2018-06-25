package firma.moja.com.omdbapitest.net;

import java.util.Map;

import firma.moja.com.omdbapitest.net.model.OMDBResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface OMDBApiEndpoint {

    //http://www.omdbapi.com/?apikey=[yourkey]&s=Batman
    @GET("/")
    Call<OMDBResponse> searchOMDB(@QueryMap Map<String, String> options);


}
