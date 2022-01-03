package potionstudios.aloneandtogether.mixin;

import potionstudios.aloneandtogether.AloneAndTogether;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MixinCommonExample {
    
    @Inject(method = "createLevels", at = @At("HEAD"))
    private void example(CallbackInfo ci) {
        AloneAndTogether.LOGGER.info("Hello from create levels!");
    }
    
}
