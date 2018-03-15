import edu.knoldus.TwitterOperation;

public class Application {

    public static void main(String[] args) {

        TwitterOperation twitterOperation = new TwitterOperation();


        twitterOperation.getLatestPost().thenAccept(System.out::println);


        twitterOperation.getOldToNewTweets().thenAccept(System.out::println);


        twitterOperation.higherToLowerReTweetsCount().thenAccept(System.out::println);


        twitterOperation.higherToLowerLikesCount().thenAccept(System.out::println);


        twitterOperation.getTweets("2018-03-14").thenAccept(System.out::println);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}

