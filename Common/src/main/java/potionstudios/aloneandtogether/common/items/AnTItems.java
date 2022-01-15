package potionstudios.aloneandtogether.common.items;

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
    public static final Item BOGGLED_ROOTS = createBlockItem(AnTBlocks.BOGGLED_ROOTS, new Item.Properties().tab(CREATIVE_TAB), "boggled_roots");
    public static final Item BOGGLED_FENCE = createBlockItem(AnTBlocks.BOGGLED_FENCE, new Item.Properties().tab(CREATIVE_TAB), "boggled_fence");
    public static final Item BOGGLED_WOOD = createBlockItem(AnTBlocks.BOGGLED_WOOD, new Item.Properties().tab(CREATIVE_TAB), "boggled_wood");
    public static final Item BOGGLED_WOOD_WALL = createBlockItem(AnTBlocks.BOGGLED_WOOD_WALL, new Item.Properties().tab(CREATIVE_TAB), "boggled_wood_wall");
    public static final Item BOGGLED_FENCE_GATE = createBlockItem(AnTBlocks.BOGGLED_FENCE_GATE, new Item.Properties().tab(CREATIVE_TAB), "boggled_gate");
    public static final Item BOGGLED_SLAB = createBlockItem(AnTBlocks.BOGGLED_SLAB, new Item.Properties().tab(CREATIVE_TAB), "boggled_slab");
    public static final Item BOGGLED_PRESSURE_PLATE = createBlockItem(AnTBlocks.BOGGLED_PRESSURE_PLATE, new Item.Properties().tab(CREATIVE_TAB), "boggled_pressure_plate");
    public static final Item BOGGLED_STAIRS = createBlockItem(AnTBlocks.BOGGLED_STAIRS, new Item.Properties().tab(CREATIVE_TAB), "boggled_stairs");
    public static final Item BOGGLED_TRAP_DOOR = createBlockItem(AnTBlocks.BOGGLED_TRAP_DOOR, new Item.Properties().tab(CREATIVE_TAB), "boggled_trapdoor");
    public static final Item BOGGLED_CRAFTING_TABLE = createBlockItem(AnTBlocks.BOGGLED_CRAFTING_TABLE, new Item.Properties().tab(CREATIVE_TAB), "boggled_crafting_table");
    public static final Item BOGGLED_BUTTON = createBlockItem(AnTBlocks.BOGGLED_BUTTON, new Item.Properties().tab(CREATIVE_TAB), "boggled_button");
    public static final Item BOGGLED_BOOKSHELF = createBlockItem(AnTBlocks.BOGGLED_BOOKSHELF, new Item.Properties().tab(CREATIVE_TAB), "boggled_bookshelf");
    public static final Item BOGGLED_DOOR = createBlockItem(AnTBlocks.BOGGLED_DOOR, new Item.Properties().tab(CREATIVE_TAB), "boggled_door");
    public static final Item BOGGLED_STRIPPED_ROOTS = createBlockItem(AnTBlocks.BOGGLED_STRIPPED_ROOTS, new Item.Properties().tab(CREATIVE_TAB), "boggled_stripped_roots");
    public static final Item BOGGLED_LEAVES = createBlockItem(AnTBlocks.BOGGLED_LEAVES, new Item.Properties().tab(CREATIVE_TAB), "boggled_leaves");


    public static final Item BOGGLED_THORNS = createBlockItem(AnTBlocks.BOGGLED_THORNS, new Item.Properties().tab(CREATIVE_TAB), "boggled_thorns");

    public static final Item BOGGLED_VINES = createBlockItem(AnTBlocks.BOGGLED_VINES, new Item.Properties().tab(CREATIVE_TAB), "boggled_vines");


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
