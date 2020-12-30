

package al.ikubinfo;

public interface Subject {

    void subscribe(Observer subscriber);

    void unsubscribe(Observer subscriber);

    void notifySubscribers(String channelName, String videoTitle);

    void upload(String videoTitle);

}
