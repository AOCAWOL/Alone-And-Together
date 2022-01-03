package potionstudios.aloneandtogether.mixin;

import potionstudios.aloneandtogether.AloneAndTogether;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraftforge.event.world.ChunkEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ChunkEvent.class, remap = false)
public class MixinForgeExample {
    
    @Inject(method = "<init>(Lnet/minecraft/world/level/chunk/ChunkAccess;)V", at = @At("RETURN"), remap = false)
    private void test2(ChunkAccess chunk, CallbackInfo ci) {
        AloneAndTogether.LOGGER.info("Hello from Forge's Chunk Load Event!");
    }
}
