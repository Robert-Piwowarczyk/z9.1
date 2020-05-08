public class OverclockablePart extends ComputerPart {
    private int clockSpeed;
    private int temperature;

    public OverclockablePart(String computerName, String producerName,
                             int serialNumber, int clockSpeed, int temperature) {
        super(computerName, producerName, serialNumber);
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
