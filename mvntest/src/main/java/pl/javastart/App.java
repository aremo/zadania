package pl.javastart;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        app.start();
    }

    private void start() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        while (true) {
            long currentTime = System.currentTimeMillis();
            long timeDiff = currentTime - startTime;
            String formattedTimeDiff = formatTime(timeDiff);
            System.out.println(formattedTimeDiff);
            Thread.sleep(3000);
        }
    }


    protected String formatTime(long timeDiff) {
        long sekundy = timeDiff / 1000;
        long minuty = sekundy / 60;
        long godziny = minuty / 60;
        long dni = godziny / 24;

        if (sekundy < 60) {
            return sekundy + " sekundy";
        } else if (sekundy >= 60 && sekundy < 3600) {
            return minuty + " minuty " + (sekundy - minuty * 60) + " sekundy";
        } else if (sekundy >= 3600 && sekundy < 86400) {
            return godziny + " godziny " + (minuty - godziny * 60) + " minuty " + (sekundy - minuty * 60) + " sekundy";
        } else if (sekundy >= 86400 && sekundy < 31536000) {
            return dni + " dni " + (godziny - dni * 24) + " godziny " + (minuty - godziny * 60) + " minuty " + (sekundy - minuty * 60) + " sekundy";
        }

        return null;
    }
}


