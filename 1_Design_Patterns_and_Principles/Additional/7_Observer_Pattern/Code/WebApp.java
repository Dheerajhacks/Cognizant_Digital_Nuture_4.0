public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    public void update(String stockName) {
        System.out.println(appName + " received update for stock: " + stockName);
    }
    
}
