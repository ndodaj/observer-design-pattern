package al.ikubinfo;

public class Youtube {

    public static void main(String[] args) {
        YoutubeChannel j4l = new YoutubeChannel("Java 4 Life");

        Subscriber sub1 = new Subscriber("John Doe");
        Subscriber sub2 = new Subscriber("Lorem Ipsum");
        Subscriber sub3 = new Subscriber("Nick Smith");

        j4l.subscribe(sub1);
        j4l.subscribe(sub2);
        j4l.subscribe(sub3);

        j4l.upload("Spring microservices");

        System.out.println("------------------------------");
        j4l.unsubscribe(sub1);
        j4l.upload("OCP");


    }

}
