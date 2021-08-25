package edu.escuelaing.arem;

/**
 * This class create the instance of HTTP Service.
 * @author daniel
 */
public class CurrentServiceInstance
{
    private static CurrentServiceInstance _instance = new CurrentServiceInstance();
    private HttpStockService service;
    /**
     * This method create the instance of Service AlphaAdvantage.
     */
    private CurrentServiceInstance() 
    {
        service = new AlphaAdvantageHttpStockService();
    }
    /**
     * This method get the intance of Service AlphaAdvantage.
     * @return Instance AlphaAdvantage.
     */
    public static CurrentServiceInstance getInstance() 
    {
        return _instance;
    }
    /**
     * This method get the Service AlphaAdvantage.
     * @return Service AlphaAdvantage.
     */
    public HttpStockService getService() {
        return service;
    }
}