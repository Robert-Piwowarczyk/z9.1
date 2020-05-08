public class ComputerPart {
    private String computerName;
    private String producerName;
    private int serialNumber;

    public ComputerPart(String computerName, String producerName, int serialNumber) {
        this.computerName = computerName;
        this.producerName = producerName;
        this.serialNumber = serialNumber;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void clockSpeedUp() {
    }
}
