public class Application {

    public Application() {

    }

    public void start() {
        MainWindow main_window = new MainWindow();
    }

    public void exit() {

    }

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

}
