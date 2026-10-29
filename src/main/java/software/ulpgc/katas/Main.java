package software.ulpgc.katas;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;

public class Main {
    static void main() {
        Javalin javalin = Javalin.create(c->create(c))
                .start(8081);
    }

    private static void create(JavalinConfig config) {
        config.routes.get("/hola", c->c.result("Hola Mundo"));
    }
}
