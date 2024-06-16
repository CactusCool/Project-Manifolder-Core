package projectmanifolder.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import projectmanifolder.Tags;

public class myfirstblock extends Block{
    public myfirstblock() {
        super(Material.IRON);
        setRegistryName(Tags.MODID, "myfirstblock");
        setTranslationKey(Tags.MODID + ".block");
        setHarvestLevel("pickaxe", 0);
        setHardness(500.0f);
    }
}
