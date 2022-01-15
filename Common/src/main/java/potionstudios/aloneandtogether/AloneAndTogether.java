package potionstudios.aloneandtogether;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import potionstudios.aloneandtogether.client.textures.AnTCutoutRenders;
import potionstudios.aloneandtogether.common.AnTCompostables;
import potionstudios.aloneandtogether.common.AnTFlammables;
import potionstudios.aloneandtogether.common.AnTStrippables;
import potionstudios.aloneandtogether.mixin.access.ItemBlockRenderTypeAccess;

public class AloneAndTogether {
    public static final String MOD_ID = "aloneandtogether";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    

    public static void clientLoad(){
        LOGGER.debug("Alone And Together: \"Client Setup\" Event Starting...");
        AnTCutoutRenders.renderCutOuts(ItemBlockRenderTypeAccess.getTypeByBlock());
        LOGGER.info("Alone And Together: \"Client Setup\" Event Complete!");
    }

    public static void threadSafeLoadFinish(){
        AnTCompostables.makeCompostables();
        AnTFlammables.makeFlammables();
        AnTStrippables.makeStrippableLogs();
    }

    public static void init() {
        
    }
}