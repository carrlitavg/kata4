package software.ulpgc.katas.Infraestructure.adapters.endpoints;

import software.ulpgc.katas.Infraestructure.adapters.EndPoint;

import io.javalin.http.Context;

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
