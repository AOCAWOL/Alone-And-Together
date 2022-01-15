package potionstudios.aloneandtogether;

import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import potionstudios.aloneandtogether.common.blocks.AnTBlocks;
import potionstudios.aloneandtogether.common.items.AnTCreativeTab;
import potionstudios.aloneandtogether.common.items.AnTItems;
import potionstudios.aloneandtogether.util.RegistryObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.Collection;

@Mod(AloneAndTogether.MOD_ID)
public class AloneAndTogetherForge {

    public AloneAndTogetherForge() {
        AloneAndTogether.init();

        AnTCreativeTab.init(new CreativeModeTab("aloneandtogether.at") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items.IRON_NUGGET);
            }

            @Override
            public boolean hasSearchBar() {
                return true;
            }

            @Override
            public boolean canScroll() {
                return true;
            }

            @Override
            public ResourceLocation getBackgroundImage() {
                return new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png");
            }
        });

        for (Block blocks : Registry.BLOCK){
            String name = Registry.BLOCK.getKey(blocks).toString();
            if (name.contains("boggled")) {
                System.out.println(name);
            }
        }

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        bootStrap(eventBus);
        eventBus.addListener(this::commonLoad);
        eventBus.addListener(this::loadFinish);
        eventBus.addListener(this::clientLoad);
    }

    private void bootStrap(IEventBus eventBus) {
        AnTBlocks.bootStrap(registryObjects -> register(Block.class, eventBus, registryObjects));
        AnTItems.bootStrap(registryObjects -> register(Item.class, eventBus, registryObjects));
    }

        private <T extends IForgeRegistryEntry<T>> void register(Class clazz, IEventBus eventBus, Collection<RegistryObject<T>> registryObjects) {
            registryObjects.forEach(blockRegistryObject -> blockRegistryObject.object().setRegistryName(new ResourceLocation(AloneAndTogether.MOD_ID, blockRegistryObject.id())));
            eventBus.addGenericListener(clazz, (RegistryEvent.Register<T> event) -> {
                for (RegistryObject<T> registryObject : registryObjects) {
                    event.getRegistry().register(registryObject.object());
                }
            });
        }

    private void commonLoad(FMLCommonSetupEvent event) {
    }

    private void loadFinish(FMLLoadCompleteEvent event) {
        AloneAndTogether.threadSafeLoadFinish();
    }

    private void clientLoad(FMLClientSetupEvent event) {
        AloneAndTogether.clientLoad();
    }
}