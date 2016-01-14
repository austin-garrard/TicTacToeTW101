import com.thoughtworks.tictactoe.GameInput;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameInputTest {

    private BufferedReader bufferedReader;
    private GameInput gameInput;

    @Before
    public void setup() {
        bufferedReader = mock(BufferedReader.class);
        gameInput = new GameInput(bufferedReader);
    }

    @Test
    public void shouldReadDesiredLocation() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        int desiredLocation = gameInput.readDesiredLocation();
        assertThat(desiredLocation, is(1));
    }


}
