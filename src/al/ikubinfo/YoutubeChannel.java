package al.ikubinfo;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private final List<Observer> subscribers;
    private String channelName;

    public YoutubeChannel(String channelName) {
        subscribers = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer newSubscriber) {
        subscribers.add(newSubscriber);
    }

    @Override
    public void unsubscribe(Observer deletedSubscriber) {
        subscribers.remove(deletedSubscriber);
    }

    @Override
    public void notifySubscribers(String channelName, String videoTitle) {
        subscribers.forEach(observer -> observer.update(channelName, videoTitle));
    }

    public void upload(String videoTitle) {
        notifySubscribers(this.channelName, videoTitle);
    }


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }


}
