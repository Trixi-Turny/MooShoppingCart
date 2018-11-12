package com.moo.cart;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.moo.cart.models.DummyCart;
import com.moo.cart.models.DummyItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.ResponseTransformer;
import spark.Spark;

import java.util.Collections;

import static spark.Spark.*;

public class ApplicationMain {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationMain.class);

    private static final Gson GSON = new Gson();
    private static final ResponseTransformer JSON_TRANSFORMER = GSON::toJson;
    private static final String JSON = "application/json";

    public static void main(String[] Args) {
        startServer();
    }

    public static int startServer() {
        Spark.init();

        initializeRoutes();

        exception(JsonSyntaxException.class, ApplicationMain::handleInvalidInput);
        LOG.debug("Created exception handlers");

        Spark.awaitInitialization();
        LOG.debug("Ready");
        return Spark.port();
    }

    private static void initializeRoutes() {
        // Set response type to always be JSON
        before((request, response) -> response.type(JSON));
        DummyCart cart = new DummyCart();

        path("/health", () -> get("", (req, res) -> "healthy"));

        path("/cart", () -> {
            get("/:id", (req, res) -> cart.addItem(new DummyItem(req.params("id"))), JSON_TRANSFORMER);
        });

        path("/cart", () -> {
            get("/", (req, res) -> cart.getCart(), JSON_TRANSFORMER);
        });

        path("/empty", () -> {
            get("/", (req, res) -> cart.clearCart(), JSON_TRANSFORMER);
        });



        LOG.debug("Initialised routes");
    }

    private static void handleInvalidInput(Exception e, Request request, Response response) {
        response.status(400);
        errorResponse(e, request, response);
    }

    private static void errorResponse(Exception e, Request request, Response response) {
        response.type(JSON);
        response.body(GSON.toJson(Collections.singletonMap("error", e.getMessage())));
    }

    /**
     * For testing, as we want to start and stop the server.
     */
    public static void stopServer() {
        LOG.debug("Asking server to stop");
        Spark.stop();
    }




}
