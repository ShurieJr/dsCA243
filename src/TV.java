public class TV {
    //data fields
    private int channel;
    private int volume;
    private boolean status;

    //constructors
    TV() {
        channel = 1;
        volume = 0;
        status = false;
    }

    //    TV(int chn , int vol , boolean sts){
//        channel = chn;
//        volume = vol;
//        status = sts;
//    }
    //getter & setter
    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getStatus() {
        return status;
    }

    public void setChannel(int ch) {
        if (status) {
            if (ch >= 1 && ch <= 120)
                channel = ch;
            else
                System.out.println("channel must between 1-120");
        } else
            System.out.println("turn on the tv!");

    }

    //methods
    //channel Up
    void channelUp() {
        if (status) {
            if (channel < 120)
                channel++;
            else
                channel = 1;
        } else
            System.out.println("turn on the tv!");
    }

    void channelDown() {
        if (status) {
            if (channel > 1)
                channel--;
            else
                channel = 120;
        } else
            System.out.println("turn on the tv!");
    }

    void volumeUp() {
        if (status) {
            if (volume < 7)
                volume++;
            else
                System.out.println("maximum value!");
        } else
            System.out.println("turn on the tv!");
    }

    void volumeDown() {
        if (status) {
            if (volume > 0)
                volume--;
            else
                System.out.println("minimum volume");
        } else
            System.out.println("turn on the tv!");
    }

    void turnOn() {
        if (status == false)
            status = true;
        else
            System.out.println("Tv already turned on!");
    }

    void turnOff() {
        if (status)
            status = false;
        else
            System.out.println("tv already turned off!");
    }



    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", status=" + status +
                '}';
    }
}
