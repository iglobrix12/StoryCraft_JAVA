package iglo.storycraft.Story.script;

import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.fml.common.Mod;
import iglo.storycraft.Story.function;

@Mod.EventBusSubscriber
public class script_odin {
    public static void execute(ServerLevel world) throws InterruptedException {
        function.SayPlayer("test");
        function.SayEntitySay("test","test");
        function.tick(5);
        function.SayPlayer("test");
    }
}
