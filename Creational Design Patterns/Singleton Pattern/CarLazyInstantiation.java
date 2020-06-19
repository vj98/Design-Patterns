class CarLazyInstantiation {
    private static CarLazyInstantiation obj;

    private CarLazyInstantiation(){}

    public static CarLazyInstantiation getCar() {
        if (obj == null) {
            synchronized(CarLazyInstantiation.class) {
                if (obj == null) {
                    obj = new CarLazyInstantiation();
                }
            }
        }
        return obj;
    }

    public void doSomething() {
        System.out.println("In Lazy Instantiation");
    }
}