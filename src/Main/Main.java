package Main;

import Main.Engine.EngineConfig;
import Main.Window.Window;

public class Main {
    public static void main(String[] args) {
        EngineConfig engineConfig = new EngineConfig();
        Window window = new Window();
        window.CreateWindow("My Game", 1920, 1080, true);
    }

}