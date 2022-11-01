public class EnglishCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new EnglishStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new EnglishStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new EnglishStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new EnglishStyleCaffeLatte();
                break;
        }

        return coffee;
    }
}