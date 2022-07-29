package gameplay;

import data.GameStates;
import data.Sign;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static data.GameStates.*;
import static data.Sign.*;
import static draw.Draw.drawField;
import static gameplay.TestUtils.textToArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static utils.Utils.SIZE;


class GamePlayTest {

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnTie() {
        final int size = 3;
        //Arrange

        Sign[][] field = new Sign[size][size];

        field[0][0] = CROSS;
        field[0][1] = ZERO;
        field[0][2] = CROSS;

        field[1][0] = ZERO;
        field[1][1] = CROSS;
        field[1][2] = CROSS;

        field[2][0] = ZERO;
        field[2][1] = CROSS;
        field[2][2] = ZERO;

        GamePlay gamePlay = new GamePlay(field, size);

        drawField(field);

        GameStates expected = TIE;
        String expectedMessage = TIE.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");
    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnCross_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = textToArray("test_data_cross_wins.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_X;
        String expectedMessage = WINNER_X.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");
    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnZero_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = textToArray("test_data_zeros_wins.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_0;
        String expectedMessage = WINNER_0.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(ZERO);
        String actualMessage = gamePlay.checkGameState(ZERO).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");
    }

    @Test
    void ame_FillsFieldWithSignsChecksWinner_Field3X3_ReturnGameIsContinue_LoadFile() {
        final int size = 3;

        Sign[][] field = new Sign[size][size];

        field[0][0] = CROSS;
        field[0][1] = ZERO;
        field[0][2] = CROSS;

        field[1][0] = ZERO;
        field[1][1] = CROSS;
        field[1][2] = CROSS;

        field[2][0] = ZERO;
        field[2][1] = CROSS;
        field[2][2] = EMPTY;

        GamePlay gamePlay = new GamePlay(field, size);
        drawField(field);

        GameStates expected = GAME_IS_CONTINUE;
        String expectedMessage = GAME_IS_CONTINUE.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");
    }

    @Test
    void checkSignState() {
        Sign expected = EMPTY;
        Sign actual = getSign('P');

        Sign expectedQuit = QUIT;
        Sign actualQuit = getSign('Q');

        assertEquals(expected, actual);
        assertEquals(expectedQuit, actualQuit);
    }

    @Test
    void checkOppositeSignState() {
        Sign expected = ZERO;
        Sign actual = Sign.getOppositeSign(CROSS);

        assertEquals(expected, actual);
    }

    @Test
    void checkGameState() throws IOException {

        Sign[][] testArray = textToArray("test_data_zeros_wins.txt", SIZE);

        GamePlay gamePlay = new GamePlay(testArray, SIZE);
        drawField(testArray);

        Sign testData = CROSS;

        GameStates expected = TIE;

        GameStates actual = gamePlay.checkGameState(testData);

        assertEquals(expected, actual);
    }

    @Test
    void checkInputCoordinatesWhenCoordinateBiggerThanSize() throws IOException {

        GamePlay gamePlay = new GamePlay(SIZE);
        int x = 4;
        int y = 3;

        boolean expected = false;

        boolean actual = gamePlay.inputTurnsCoordinates(x, y, CROSS);

        assertEquals(expected, actual);
    }

    @Test
    void checkInputCoordinatesWhenSignIsNotEmpty() throws IOException {
        Sign[][] testArray = textToArray("test_data_zeros_wins.txt", SIZE);

        GamePlay gamePlay = new GamePlay(testArray, SIZE);
        drawField(testArray);

        int x = 2;
        int y = 2;

        boolean expected = false;

        boolean actual = gamePlay.inputTurnsCoordinates(x, y, CROSS);

        assertEquals(expected, actual);
    }

    @Test
    void checkInputCoordinatesWhenSignIsEmpty() {

        GamePlay gamePlay = new GamePlay(SIZE);
        int x = 2;
        int y = 2;

        Sign testData = CROSS;

        boolean expected = true;
        boolean actual = gamePlay.inputTurnsCoordinates(x, y, testData);

        assertEquals(expected, actual);
        Sign actualSign = gamePlay.getField()[x][y];
        assertEquals(testData, actualSign);
    }

    @Test
    void checkMethodGameCalled() {
        GamePlay gamePlay = mock(GamePlay.class);
        gamePlay.game();
        verify(gamePlay, times(1)).game();
    }

}