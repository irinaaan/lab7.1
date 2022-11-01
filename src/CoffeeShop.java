public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.infoAboutCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
        coffee.glitterInCoffee();

        System.out.println("\nHere is your coffee! Come again!");
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}