package projectmanifolder.pmcore.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.*;
import projectmanifolder.pmcore.PMInternalTags;
import projectmanifolder.pmcore.*;

public class myfirstblock extends Block{

    public static final ResourceLocation MY_FIRST_BLOCK = new ResourceLocation(PMInternalTags.MODID, "myfirstblock");

    public myfirstblock() {
        super(Material.IRON);
        setRegistryName(MY_FIRST_BLOCK);
        setTranslationKey(PMInternalTags.MODID + ".gigablock");
        setHarvestLevel("pickaxe", 1);
        setHardness(500);
        setCreativeTab(PMCore.creativeTab);
    }
}
