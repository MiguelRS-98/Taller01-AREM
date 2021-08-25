package edu.escuelaing.arem;

/**
 * This class create the URL AlphaAdvantage.
 * @author daniel
 */
public class AlphaAdvantageHttpStockService extends HttpStockService 
{
    String stockServ = "fb";
    /**
     * This method ger the URL AlphaAdvantage.
     * @return URL AlphaAdvantage.
     */
    @Override
    public String getURL() 
    {
        return "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+stockServ+"&apikey=FCC0VO207QGWZTKQ";
    }
    /**
     * This method set the sock by AlphaAdvantage.
     * @param stockServ Stock Server AlphaAdvantage.
     */
    public void stockService(String stockServ) 
    {
        this.stockServ = stockServ;
    }
}