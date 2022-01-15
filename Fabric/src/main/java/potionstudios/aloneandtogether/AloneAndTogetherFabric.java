package potionstudios.aloneandtogether;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import potionstudios.aloneandtogether.common.blocks.AnTBlocks;
import potionstudios.aloneandtogether.common.items.AnTCreativeTab;
import potionstudios.aloneandtogether.common.items.AnTItems;

public class AloneAndTogetherFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        AloneAndTogether.init();
        AnTBlocks.bootStrap(registryObjects -> registryObjects.forEach(registryObject -> Registry.register(Registry.BLOCK, new ResourceLocation(AloneAndTogether.MOD_ID, registryObject.id()), registryObject.object())));
        AnTCreativeTab.init(FabricItemGroupBuilder.build(new ResourceLocation(AloneAndTogether.MOD_ID, "at"), () -> new ItemStack(Items.IRON_NUGGET)));
        AnTItems.bootStrap(registryObjects -> registryObjects.forEach(registryObject -> Registry.register(Registry.ITEM, new ResourceLocation(AloneAndTogether.MOD_ID, registryObject.id()), registryObject.object())));
        AloneAndTogether.threadSafeLoadFinish();
    }
}
