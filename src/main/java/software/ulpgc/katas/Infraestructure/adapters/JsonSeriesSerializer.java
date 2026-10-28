package software.ulpgc.katas.Infraestructure.adapters;

import com.google.gson.Gson;
import software.ulpgc.katas.aplication.ports.SeriesSerializer;

public class JsonSeriesSerializer implements SeriesSerializer {

    @Override
    public String serializer(int[] series) {
        return new Gson().toJson(series);
    }
}
