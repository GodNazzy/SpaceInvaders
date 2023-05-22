package Application;

import Application.controller.GameController;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameLoop {

    private final GameController controller;
    private ScheduledExecutorService executor;
    public GameLoop(GameController controller) {
        this.controller = controller;
    }

    public void start() {
        if (executor != null)
            return;
        for(int i= 0; i<3;i++) {
            executor = Executors.newSingleThreadScheduledExecutor();
            executor.scheduleAtFixedRate(() -> controller.update(),
                    0, 60, TimeUnit.MILLISECONDS);
        }
    }
}