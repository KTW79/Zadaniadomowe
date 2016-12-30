package ZadanieTelevisor;

import ZadanieTelevisor.Televisor;

/**
 * Created by Kasia on 28.12.2016.
 */
public class TestTelevisor {
    public static void main(String[] args) {

    Televisor televisor = new Televisor();//tworzę obiekt wyłączonego telewizora
     televisor.status="wyłączony";

     televisor.showStatus();//pokazuje status

     televisor.turnOn();//włącza i pokazuje status po włączeniu
     televisor.showStatus();

     televisor.turnOff();//wyłącza i pokazuje status po wyłączeniu
     televisor.showStatus();






    }
}
