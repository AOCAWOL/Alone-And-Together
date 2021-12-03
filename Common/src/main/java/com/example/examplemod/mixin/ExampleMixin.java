package com.example.examplemod.mixin;

import com.example.examplemod.CommonClass;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import net.minecraft.core.RegistryAccess;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.ServerResources;
import net.minecraft.server.level.progress.ChunkProgressListener;
import net.minecraft.server.level.progress.ChunkProgressListenerFactory;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.server.players.GameProfileCache;
import net.minecraft.world.level.storage.LevelStorageSource;
import net.minecraft.world.level.storage.WorldData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.net.Proxy;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
    
    @Inject(method = "<init>", at = @At("RETURN"))
    private void example(Thread $$0, RegistryAccess.RegistryHolder $$1, LevelStorageSource.LevelStorageAccess $$2, WorldData $$3, PackRepository $$4, Proxy $$5, DataFixer $$6, ServerResources $$7, MinecraftSessionService $$8, GameProfileRepository $$9, GameProfileCache $$10, ChunkProgressListenerFactory $$11, CallbackInfo ci) {
        CommonClass.LOGGER.info("Hello from server init!");
    }
    
    @Inject(method = "createLevels", at = @At("HEAD"))
    private void example1(ChunkProgressListener $$0, CallbackInfo ci) {
        CommonClass.LOGGER.info("Creeating levels...");
    
    }
}
