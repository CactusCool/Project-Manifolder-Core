package projectmanifolder.pmcore.common;

//custom imports
import net.minecraft.item.*;
import projectmanifolder.pmcore.*;
import projectmanifolder.pmcore.common.block.myfirstblock;


import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    // Register blocks here (Remove if not needed)
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new myfirstblock());
    }

    @SubscribeEvent
    // Register items here (Remove if not needed)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.myfirstblock).setRegistryName(myfirstblock.MY_FIRST_BLOCK));
    }

}
