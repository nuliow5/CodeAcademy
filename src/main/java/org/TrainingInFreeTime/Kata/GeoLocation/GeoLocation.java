package org.TrainingInFreeTime.Kata.GeoLocation;

import java.util.Random;

public class GeoLocation {
    Random random = new Random();
    private static final double ROUND = 1000000.0;
    private final double lat;
    private final double lon;

    private static int numLocations = 0;

    GeoLocation() {
        this.lat = Math.round(range180Random() * ROUND) / ROUND;
        this.lon = Math.round(range180Random() * ROUND) / ROUND;


        numLocations++;
    }

    public GeoLocation(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
        numLocations++;
    }

    GeoLocation(GeoLocation geoLocation) {
        this.lat = geoLocation.getLat() + range02() * random.nextDouble();
        this.lon = geoLocation.getLon() + range02() * random.nextDouble();
        numLocations++;
    }

    public static int getNumLocations() {
        return numLocations;
    }

    public double range180Random() {
        double rangeMin = -90;
        double rangeMax = 90;
        double range = rangeMin + (rangeMax - rangeMin);
        return range * random.nextDouble();
    }

    public double range02() {
        double rangeMin = -0.1;
        double rangeMax = 0.1;
        return rangeMin + (rangeMax - rangeMin);

    }

    public double getLat() {
        return Math.round(lat * ROUND) / ROUND;

    }

    public double getLon() {
        return Math.round(lon * ROUND) / ROUND;
    }

    public void print() {
        System.out.println("[" + getLat() + ", " + getLon() + "]");
    }

    public static double distanceOldNotWorking(GeoLocation firstGeoLocation, GeoLocation secondGeoLocation) {

        double dLat = Math.toRadians(secondGeoLocation.getLat() - firstGeoLocation.getLat());
        double dLon = Math.toRadians(secondGeoLocation.getLon() - firstGeoLocation.getLon());

        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(firstGeoLocation.getLat()) *
                        Math.cos(secondGeoLocation.getLat());
        double rad = 6371;
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return rad * c;

    }

    public static double distance(GeoLocation geo1, GeoLocation geo2) {
        double distance;
        double dLat;
        double dLon;
        double R = 6371; // Radius of the Earth in km
        double deg2rad = Math.PI / 180;

        dLat = deg2rad * (geo2.getLat() - geo1.getLat());
        dLon = deg2rad * (geo2.getLon() - geo1.getLon());
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(deg2rad*(geo1.getLat())) *
                Math.cos(deg2rad*(geo2.getLat())) * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        distance = R * c; // Distance in km
        return Math.round(distance * 10.0) / 10.0;
    }
}
