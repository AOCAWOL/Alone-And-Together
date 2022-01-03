package potionstudios.aloneandtogether.common.items;

import net.minecraft.world.item.CreativeModeTab;

public class AnTCreativeTab {
    public static CreativeModeTab CREATIVE_TAB = null;

    public static void init(CreativeModeTab creativeModeTab) {
        CREATIVE_TAB = creativeModeTab;
    }
}
