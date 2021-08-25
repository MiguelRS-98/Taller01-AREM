package edu.escuelaing.arem;

import spark.Request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * This class is the stock service of API.
 * @author daniel
 */
public abstract class HttpStockService 
{
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final HttpStockService _instanced = createService();
    /**
     * This method get the instance for the service.
     * @return Service.
     */
    public static HttpStockService getService()
    {
        return _instanced;
    }
    /**
     * This method create the service.
     * @return URL AlphaAdvantage.
     */
    public static HttpStockService createService()
    {
        return new AlphaAdvantageHttpStockService();
    }
    /**
     * This method get the information of JSON.
     * @param req Data user.
     * @return Response of server.
     * @throws IOException Exception if dont found data.
     */
    public String getStockInfoAsJSON(Request req) throws IOException 
    {
        URL obj = new URL("");
        String responseStr = "none";
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {             String inputLine;
        StringBuffer response;
            try ( // success
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }
            response.append(inputLine);
            // print result
            System.out.println();
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return responseStr;
    }
    /**
     * This method get the URL.
     * @return URL of service.
     */
    public abstract String getURL();
}