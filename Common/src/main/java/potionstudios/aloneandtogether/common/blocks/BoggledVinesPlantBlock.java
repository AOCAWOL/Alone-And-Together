package potionstudios.aloneandtogether.common.blocks;

import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.WeepingVinesPlantBlock;

public class BoggledVinesPlantBlock extends WeepingVinesPlantBlock {
    public BoggledVinesPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) AnTBlocks.BOGGLED_VINES;
    }
}
