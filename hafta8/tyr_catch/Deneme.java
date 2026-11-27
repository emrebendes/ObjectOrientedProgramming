public class Deneme {
    public double doSomething(int x, int y) throws Exception {
        if (y > x)
            throw new Exception("y xden büyük olmamalı");
        return x / y;
    }

}
