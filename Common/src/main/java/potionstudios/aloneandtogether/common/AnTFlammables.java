package potionstudios.aloneandtogether.common;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import potionstudios.aloneandtogether.common.blocks.AnTBlocks;
import potionstudios.aloneandtogether.mixin.access.FireBlockAccess;

public class AnTFlammables {

    public static void flammableBlock(Block block, int flameOdds, int burnOdds) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        ((FireBlockAccess) fire).ant_setFlammable(block, flameOdds, burnOdds);
    }


    public static void makeFlammables() {
        flammableBlock(AnTBlocks.BOGGLED_PLANKS, 5, 20);
        flammableBlock(AnTBlocks.BOGGLED_ROOTS, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_FENCE, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_WOOD, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_WOOD_WALL, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_FENCE_GATE, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_SLAB, 5, 20);
        flammableBlock(AnTBlocks.BOGGLED_PRESSURE_PLATE, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_STAIRS, 5, 20);
        flammableBlock(AnTBlocks.BOGGLED_TRAP_DOOR, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_BUTTON, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_BOOKSHELF, 5, 20);
        flammableBlock(AnTBlocks.BOGGLED_DOOR, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_STRIPPED_ROOTS, 5, 5);
        flammableBlock(AnTBlocks.BOGGLED_LEAVES, 30, 60);
    }
}
