import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Write a description of class GPS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPS
{
    private double lat;
    private double lon;

    public GPS()
    {
        this.lat = 0;
        this.lon = 0;
    }

    public GPS (double x, double y)
    {
        this.lat = x;
        this.lon = y;
    }

    public GPS (GPS u)
    {
        this.lat = u.getLat();
        this.lon = u.getLon();
    }

    public double getLat()
    {
        return this.lat;
    }

    public double getLon()
    {
        return this.lon;
    }

    public void setLat (double l)
    {
        this.lat =l;
    }

    public void setLon (double l)
    {
        this.lon = l;
    }

    public void setGPS (double l, double lo)
    {
        this.lat =l;
        this.lon = lo;
    }

    public GPS clone()
    {
        return new GPS(this);
    }

    public boolean equals (Object o)
    {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        GPS u = (GPS) o;
        return this.lat == u.getLat() && this.lon == u.getLon();
    }
    public double distancia( GPS gps)
    {
        // Conversão de graus pra radianos das latitudes
        double firstLatToRad = Math.toRadians(this.lat);
        double secondLatToRad = Math.toRadians(gps.getLat());

        // Diferença das longitudes
        double deltaLongitudeInRad = Math.toRadians(gps.getLon()
                - this.lon);

        // Cálcula da distância entre os pontos
        return Math.acos(Math.cos(firstLatToRad) * Math.cos(secondLatToRad)
                * Math.cos(deltaLongitudeInRad) + Math.sin(firstLatToRad)
                * Math.sin(secondLatToRad))
                * 6378.137;
    }

    public boolean isNear(GPS gps, double r)
    {
        return (this.distancia(gps)<=r);
    }




}
