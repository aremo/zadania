package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AppTest {

    @Test
    public void shouldDisplaySeconds() {
        // given
        long ms = 15006;
        App app = new App();

        // when
        String result = app.formatTime(15000);

        // then
        assertThat(result, CoreMatchers.is("15 sekundy"));
    }

    @Test
    public void shouldDisplayMinutes() {
        // given
        long ms = 15006;
        App app = new App();

        // when
        String result = app.formatTime(140000);

        // then
        assertThat(result, CoreMatchers.is("2 minuty 20 sekundy"));
    }

    @Test
    public void shouldDisplayHours() {
        // given
        long ms = 15006;
        App app = new App();

        // when
        String result = app.formatTime(7000000);

        // then
        assertThat(result, CoreMatchers.is("1 godziny 56 minuty 40 sekundy"));
    }

    @Test
    public void shouldDisplayDays() {
        // given
        long ms = 15006;
        App app = new App();

        // when
        String result = app.formatTime(106800000);

        // then
        assertThat(result, CoreMatchers.is("1 dni 5 godziny 40 minuty 0 sekundy"));
    }
}
