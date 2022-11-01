public class SpanishCoffeeShop extends CoffeeShop {

    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new SpanishStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new SpanishStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new SpanishStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new SpanishStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}