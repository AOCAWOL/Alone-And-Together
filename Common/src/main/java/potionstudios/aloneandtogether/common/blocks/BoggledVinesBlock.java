package potionstudios.aloneandtogether.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.WeepingVinesBlock;
import net.minecraft.world.level.block.WeepingVinesPlantBlock;

public class BoggledVinesBlock extends WeepingVinesBlock {
    public BoggledVinesBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return AnTBlocks.BOGGLED_VINES_PLANT;
    }
}
