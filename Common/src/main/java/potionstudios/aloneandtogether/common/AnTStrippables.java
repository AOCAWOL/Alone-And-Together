package potionstudios.aloneandtogether.common;

import net.minecraft.world.level.block.Block;
import potionstudios.aloneandtogether.AloneAndTogether;
import potionstudios.aloneandtogether.common.blocks.AnTBlocks;
import potionstudios.aloneandtogether.mixin.access.AxeItemAccess;

import java.util.IdentityHashMap;
import java.util.Map;

import static potionstudios.aloneandtogether.common.blocks.AnTBlocks.*;

public class AnTStrippables {

    public static void makeStrippableLogs() {
        AloneAndTogether.LOGGER.debug("Alone And Together: Adding strippable Blocks...");

        Map<Block, Block> stripables = new IdentityHashMap<>(AxeItemAccess.getStripables());

        stripables.put(BOGGLED_ROOTS, BOGGLED_STRIPPED_ROOTS);
        
        AxeItemAccess.setStripables(stripables);
    }
}
