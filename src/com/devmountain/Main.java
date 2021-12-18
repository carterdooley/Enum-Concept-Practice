package com.devmountain;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        DisplayShipCrew(ShipCrewJob.Captain);
        whoIsInCharge(Carter, Berg);

    }

    static CrewMember Seth = new CrewMember(ShipCrewJob.Captain, "Seth");
    static CrewMember Carter = new CrewMember(ShipCrewJob.Engineer, "Carter");
    static CrewMember Blaine = new CrewMember(ShipCrewJob.DeckWorker, "Blaine");
    static CrewMember Berg = new CrewMember(ShipCrewJob.Chef, "Berg");





    static public void DisplayShipCrew(ShipCrewJob job){
        switch (job){
            case Captain -> {
                System.out.println("Drives the ship and manages the crew");
                break;
            }
            case DeckWorker -> {
                System.out.println("Works on the deck of the ship. Ex. Could be fishermen or a drill-ship.");
                break;
            }
            case Chef -> {
                System.out.println("Cooks the food for the crew while out at sea.");
                break;
            }
            case Engineer -> {
                System.out.println("Keeps the engine on working condition and tends to any engine problems.");
                break;
            }
        }
    }



    static void whoIsInCharge(CrewMember member1, CrewMember member2){
        CrewMember theBoss = null;
                if (member1.job.compareTo(member2.job) < 0){
                    theBoss = member1;
                    System.out.println(theBoss.name + " Is higher in command");
                } else {
                    theBoss = member2;
                    System.out.println(theBoss.name + " Is higher in command");
                }
    }






}
