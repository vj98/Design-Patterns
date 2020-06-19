class CarEarlyInstantiation {
    private static CarEarlyInstantiation obj = new CarEarlyInstantiation(); // Early, instance will be created at load time

    private CarEarlyInstantiation() {}

    public static CarEarlyInstantiation getCar() {
        return obj;
    }

    public void doSomething() {
        System.out.println("In Early Instantiation");
    }
}