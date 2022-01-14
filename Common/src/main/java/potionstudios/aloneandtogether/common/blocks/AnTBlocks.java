package potionstudios.aloneandtogether.common.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import potionstudios.aloneandtogether.mixin.access.*;
import potionstudios.aloneandtogether.util.RegistryObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class AnTBlocks {

    public static final List<RegistryObject<Block>> BLOCKS = new ArrayList<>();

    //boggled wood
    public static final Block BOGGLED_PLANKS = createPlanks("boggled_planks");

    public static final Block BOGGLED_THORNS = createThornBlock("boggled_thorns");

    public static final Block BOGGLED_VINES = createVineBlock("boggled_vines");
    public static final Block BOGGLED_VINES_PLANT = createVinePlantBlock("boggled_vines_plant");


    static Block createPlanks(String id) {
        Block createBlock = new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createRoots(String id) {
        Block createBlock = new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPlanksStairs(BlockState blockstate, String id) {
        Block createBlock = StairBlockAccess.create(blockstate, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodenButton(String id) {
        Block createBlock = WoodButtonBlockAccess.create(BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDoor(String id) {
        Block createBlock = DoorBlockAccess.create(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTrapdoor(String id) {
        Block createBlock = TrapdoorBlockAccess.create(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createCrafingTable(String id) {
        Block createBlock = CraftingTableBlockAccess.create(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createBookshelf(String id) {
        Block createBlock = new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPlanksSlab(String id) {
        Block createBlock = new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createLog(String id){
        Block createBlock = new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createFence(String id){
        Block createBlock = new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createFenceGate(String id){
        Block createBlock = new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWood(String id){
        Block createBlock = new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodWall(String id){
        Block createBlock = new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodPressurePlate(String id){
        Block createBlock = PressurePlateBlockAccess.create(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createMossCarpet(String id){
        Block createBlock = new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_CARPET));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createMossBlock(String id){
        Block createBlock = new MossBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createThornBlock(String id){
        Block createBlock = new BoggledThorns(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createVineBlock(String id){
        Block createBlock = new BoggledVinesBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createVinePlantBlock(String id){
        Block createBlock = new BoggledVinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT));
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