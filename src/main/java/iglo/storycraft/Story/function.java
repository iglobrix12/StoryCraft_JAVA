package iglo.storycraft.Story;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import java.util.concurrent.TimeUnit;

public class function {

    public static void SayEntitySay(String name, String text) {
        Minecraft.getInstance().player.sendSystemMessage(Component.nullToEmpty("[" + name + "] " + text));
    }

    public static void SayPlayer(String text) {
        Minecraft.getInstance().player.sendSystemMessage(Component.nullToEmpty(text));
    }
    public static void tickmili(int time) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(time);
    }
    public static void tickmin(int time) throws InterruptedException {
        TimeUnit.MINUTES.sleep(time);
    }
    public static void tick(int time) throws InterruptedException {
        TimeUnit.SECONDS.sleep(time);
    }
}