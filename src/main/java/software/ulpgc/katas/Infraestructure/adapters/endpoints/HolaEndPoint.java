package software.ulpgc.katas.Infraestructure.adapters.endpoints;

import io.javalin.http.Context;
import software.ulpgc.katas.Infraestructure.adapters.EndPoint;

public class HolaEndPoint implements EndPoint {
    private final Context context;

    public HolaEndPoint(Context context) {
        this.context = context;
    }

    public static EndPoint use(Context context) {
        return new HolaEndPoint(context);
    }

    @Override
    public void execute() {
        context.result("Hola " + context.pathParam("name") + "!!!");

    }
}
