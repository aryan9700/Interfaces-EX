public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stops");
    }

    @Override
    public void accel() {
        System.out.println("electric engine accelerate");
    }

}
