package mobi.rayson.annotation;


public class Apple {

    @FruitProvider(id = 1, name = "红富士", address = "陕西西安市")
    public String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
