package corgitaco.modid;

import net.fabricmc.api.ModInitializer;

public class ModIDFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ModID.init();
    }
}
