package com.company;

import com.company.Station.EndStation;
import com.company.Station.ForthStation;
import com.company.Station.SecondStation;

public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.start(" первой");
        bus.stop("второй");
        SecondStation secondStation = new SecondStation();
        secondStation.sitAtBus(1,1);
        bus.start("второй");
        bus.stop(" четвертая");
        ForthStation forthStation = new ForthStation();
        forthStation.backFromBus(1,1);
        forthStation.sitAtBus(4);
        bus.start("четвертой");
        EndStation endStation = new EndStation();
        bus.stop("конечная ");
        endStation.backFromBus(4);

    }
}
