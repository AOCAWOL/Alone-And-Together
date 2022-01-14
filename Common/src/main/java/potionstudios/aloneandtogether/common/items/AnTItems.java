package potionstudios.aloneandtogether.common.items;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import potionstudios.aloneandtogether.common.blocks.AnTBlocks;
import potionstudios.aloneandtogether.util.RegistryObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import static potionstudios.aloneandtogether.common.items.AnTCreativeTab.CREATIVE_TAB;


public class AnTItems {
    public static final List<RegistryObject<Item>> ITEMS = new ArrayList<>();

    //boggled
    public static final Item BOGGLED_PLANKS = createBlockItem(AnTBlocks.BOGGLED_PLANKS, new Item.Properties().tab(CREATIVE_TAB), "boggled_planks");

    public static final Item BOGGLED_THORNS = createBlockItem(AnTBlocks.BOGGLED_THORNS, new Item.Properties().tab(CREATIVE_TAB), "boggled_thorns");


    public static Item createItem(Item item, String id) {
            ITEMS.add(new RegistryObject<>(item, id));
            return item;
    }

    public static Item createBlockItem(Block block, Item.Properties props, String id) {
        return createItem(new BlockItem(block, props), id);
    }

    public static void bootStrap(Consumer<Collection<RegistryObject<Item>>> registryStrategy) {
        registryStrategy.accept(ITEMS);
    }
}
