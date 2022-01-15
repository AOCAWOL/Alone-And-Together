package potionstudios.aloneandtogether.client.textures;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import potionstudios.aloneandtogether.AloneAndTogether;
import potionstudios.aloneandtogether.common.blocks.AnTBlocks;

import java.util.Map;

public class AnTCutoutRenders {
    public static void renderCutOuts(Map<Block, RenderType> map) {
        AloneAndTogether.LOGGER.debug("Alone And Together: Rendering Texture Cutouts...");
        map.put(AnTBlocks.BOGGLED_DOOR, RenderType.cutoutMipped());

        //leaves
        map.put(AnTBlocks.BOGGLED_LEAVES, RenderType.cutoutMipped());


        AloneAndTogether.LOGGER.debug("Alone And Together: Texture Cutouts Rendered!");

    }
}
