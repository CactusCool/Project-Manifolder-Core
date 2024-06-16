package projectmanifolder.pmcore;

import net.minecraft.block.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.SidedProxy;
import projectmanifolder.pmcore.common.CommonProxy;
import projectmanifolder.pmcore.common.block.*;


@Mod(modid = PMInternalTags.MODID, version = PMInternalTags.VERSION, name = PMInternalTags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")

public class PMCore {

    public static final Logger LOGGER = LogManager.getLogger(PMInternalTags.MODID);

    public static final String MODID = "pmcore";
    public static final String NAME = "Project Manifolder Core";
    public static final String VERSION = "0.0.1";


    @SidedProxy(modId = MODID,
            clientSide = "projectmanifolder.pmcore.common.ClientProxy",
            serverSide = "projectmanifolder.pmcore.common.CommonProxy")
    public static CommonProxy proxy;



    @Mod.Instance
    public static PMCore instance;


    @EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc. (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        // register to the event bus so that we can listen to events
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("I am " + PMInternalTags.MODNAME + " + at version " + PMInternalTags.VERSION);
        proxy.preInit(event);
    }


    //add creative tab
    public static final CreativeTabs creativeTab = new CreativeTabs("ProjectManifolderCore") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.myfirstblock);
        }
    };



    @EventHandler
    // load "Do your mod setup. Build whatever data structures you care about." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
    }
}


/*
@SubscribeEvent
    // Register recipes here (Remove if not needed)
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {

    }
 */