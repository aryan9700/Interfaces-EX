public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar() {
        this.engine = new PowerEngine();
        this.player = new CDplayer();
    }

    public void changeEngine() {
        this.engine = new ElectricEngine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accel() {
        engine.accel();
    }

    public void MediaStart() {
        player.start();
    }

    public void MediaStop() {
        player.stop();
    }

    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();
        car.MediaStart();
        car.changeEngine();
        car.start();
        car.MediaStart();
    }

}
