package ZadanieTelevisor;

/**
 * Created by Kasia on 28.12.2016.
 */
public class Televisor {
  //  String result="wyłączony"; // pole klasy określające, że telewizor jest włączony czy wyłączony
      String status; // pole klasy określające, że telewizor jest włączony czy wyłączony


    String turnOn (){// metoda włączająca telewizor
        status="włączony"; //co ma pokazać metoda
        return status;

    }

    String turnOff(){//metoda wyłączająca telewizor
        status="wyłączony";//co ma pokazać metoda
        return status;
    }

    void showStatus() {//metoda wyświetlająca info czy telewizor jest włączony czy wyłączony
        if (status == "wyłączony") {
            System.out.println("Telewizor wyłączony");

        } else {
            System.out.println("Telewizor włączony");
        }

    }
    }
