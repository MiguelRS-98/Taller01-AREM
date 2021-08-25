package edu.escuelaing.arem;

/**
 * This class create the URL IEXApis.
 * @author daniel
 */
public class IEXCloudHttpStockService extends HttpStockService
{
    String stockServ = "fb";
    /**
     * This method ger the URL IEXApis.
     * @return URL IEXApis.
     */
    @Override
    public String getURL() 
    {
        return "https://cloud.iexapis.com/stable/tops?token=pk_44e4f3ef011a4da5bad5780a73581615&symbols="+stockServ;
    }
    /**
     * This method set the sock by IEXApis.
     * @param stockServ Stock Server IEXApis.
     */
    public void stockService(String stockServ) 
    {
        this.stockServ = stockServ;    
    }
}   