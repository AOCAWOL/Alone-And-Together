package potionstudios.aloneandtogether.common.blocks;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MaterialColor;
import potionstudios.aloneandtogether.AloneAndTogether;
import potionstudios.aloneandtogether.util.RegistryObject;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class AnTBlocks {

    public static final List<RegistryObject<Block>> BLOCKS = new ArrayList<>();
    
    public static final Block BOGLED_PLANKS = createPlanks("bogled_planks");


    static Block createPlanks(String id) {
        Block createBlock = new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    public static Block createBlock(Block block, String id) {
        BLOCKS.add(new RegistryObject<>(block, id));
        return block;
    }

    public static void bootStrap(Consumer<Collection<RegistryObject<Block>>> registryStrategy) {
        registryStrategy.accept(BLOCKS);
    }
}