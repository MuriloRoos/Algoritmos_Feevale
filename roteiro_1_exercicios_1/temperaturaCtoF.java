public class temperaturaCtoF{
    public static void main(String[] args) {
        float temperaturaCelcius = 25;
        float temperaturaFahrenheit;
        
        temperaturaFahrenheit = (temperaturaCelcius * 9/5) + 32;

        System.out.println("esta é a temperatura em Celcius " + temperaturaCelcius + " e esta é convertida em Fahrenheit " + temperaturaFahrenheit);
    }
}