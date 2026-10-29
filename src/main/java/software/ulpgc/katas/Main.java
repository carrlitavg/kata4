package software.ulpgc.katas;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import software.ulpgc.katas.Infraestructure.adapters.JsonSeriesSerializer;
import software.ulpgc.katas.Infraestructure.adapters.endpoints.FibonacciEndPoint;
import software.ulpgc.katas.Infraestructure.adapters.endpoints.HolaEndPoint;
import software.ulpgc.katas.aplication.usecases.FibonacciCalculationUseCase;

public class Main {
    static void main() {
        Javalin javalin = Javalin.create(c->create(c))
                .start(8081);
    }

    private static void create(JavalinConfig config) {
        config.routes.get("/hola/{name}", context -> HolaEndPoint.use(context).execute());
        config.routes.get("/fibonacci", context -> FibonacciEndPoint.use(new FibonacciCalculationUseCase(new JsonSeriesSerializer()), context).execute());
    }
}
