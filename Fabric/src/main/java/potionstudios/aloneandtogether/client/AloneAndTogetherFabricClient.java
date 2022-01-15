package potionstudios.aloneandtogether.client;

import net.fabricmc.api.ClientModInitializer;
import potionstudios.aloneandtogether.AloneAndTogether;

public class AloneAndTogetherFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AloneAndTogether.clientLoad();
    }
}
