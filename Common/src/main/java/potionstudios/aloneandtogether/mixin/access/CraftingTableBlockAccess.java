package potionstudios.aloneandtogether.mixin.access;

import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(CraftingTableBlock.class)
public interface CraftingTableBlockAccess {

    @Invoker("<init>")
    static CraftingTableBlock create(BlockBehaviour.Properties properties) {
        throw new Error("Mixin did not apply!");
    }
}
