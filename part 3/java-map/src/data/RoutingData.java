package data;

import com.graphhopper.util.PointList;

public class RoutingData {

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getTurnDescription() {
        return turnDescription;
    }

    public void setTurnDescription(String turnDescription) {
        this.turnDescription = turnDescription;
    }

    public PointList getPointList() {
        return pointList;
    }

    public void setPointList(PointList pointList) {
        this.pointList = pointList;
    }

    public RoutingData(double distance, String turnDescription, PointList pointList) {
        this.distance = distance;
        this.turnDescription = turnDescription;
        this.pointList = pointList;
    }

    public RoutingData() {
    }

    private double distance;
    private String turnDescription;
    private PointList pointList;
}
