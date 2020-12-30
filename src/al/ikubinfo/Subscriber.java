package al.ikubinfo;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String channelName, String videoTitle ) {
        System.out.println(this.name + ", [" + channelName + "] uploaded a new video: " + videoTitle.toUpperCase());
    }

}
