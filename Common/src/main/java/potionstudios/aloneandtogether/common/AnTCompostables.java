package potionstudios.aloneandtogether.common;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;
import potionstudios.aloneandtogether.AloneAndTogether;
import potionstudios.aloneandtogether.common.items.AnTItems;

public class AnTCompostables {
    public static void compostibleBlocks(float chance, ItemLike item) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

    public static void makeCompostables() {
        AloneAndTogether.LOGGER.debug("Alone And Together: Adding Compostible Blocks...");

        compostibleBlocks(0.3f, AnTItems.BOGGLED_LEAVES);

    }
}
