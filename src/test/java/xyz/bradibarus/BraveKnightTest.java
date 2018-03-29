package xyz.bradibarus;

import org.junit.Test;
import xyz.bradibarus.knights.BraveKnight;
import xyz.bradibarus.knights.Quest;
import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightSHouldEmbarkQuest(){
        Quest moockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(moockQuest);
        knight.embarkOnQuest();
        verify(moockQuest, times(1)).embark();
    }
}
