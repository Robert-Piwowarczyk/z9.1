import java.util.InputMismatchException;

public class CPU extends OverclockablePart {
    public CPU(String computerName, String producerName, int serialNumber, int clockSpeed, int temperature) {
        super(computerName, producerName, serialNumber, clockSpeed, temperature);
    }

    @Override
    public void clockSpeedUp() {
        while (getClockSpeed() > 2500) {
            try {
                return clockSpeedUp();
                if (getClockSpeed() > 2750)
                    System.out.println("Za bardzo podkręcony procesor," +
                            " grozi przegrzaniem");
            } catch (InputMismatchException e) {
                System.out.println("Obniż taktowanie w MHz");
                System.out.println(getClockSpeed());
            }
        }
    }
}


