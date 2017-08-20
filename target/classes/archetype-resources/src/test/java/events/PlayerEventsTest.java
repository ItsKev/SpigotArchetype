package ${package}.events;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

public class PlayerEventsTest {

    @Test
    public void onPlayerJoinWithD() throws Exception {
        Player mockPlayer = mock(Player.class);
        PlayerJoinEvent playerJoinEvent = new PlayerJoinEvent(mockPlayer, "");
        when(mockPlayer.getName()).thenReturn("Dev_Kev");
        PlayerEvents playerEvents = new PlayerEvents();
        playerEvents.onPlayerJoin(playerJoinEvent);
        Mockito.verify(mockPlayer, Mockito.atLeastOnce()).sendMessage(anyString());
    }

    @Test
    public void onPlayerJoinWithoutD() throws Exception {
        Player secondMockPlayer = mock(Player.class);
        when(secondMockPlayer.getName()).thenReturn("Exceeds");
        PlayerJoinEvent playerJoinEvent = new PlayerJoinEvent(secondMockPlayer, "");
        PlayerEvents playerEvents = new PlayerEvents();
        playerEvents.onPlayerJoin(playerJoinEvent);
        Mockito.verify(secondMockPlayer, Mockito.never()).sendMessage(anyString());
    }
}