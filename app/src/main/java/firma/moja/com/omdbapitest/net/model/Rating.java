package firma.moja.com.omdbapitest.net.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("Source")
    @Expose
    public String source;
    @SerializedName("Value")
    @Expose
    public String value;

}