package org.delusion.superspeeder;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


@Mod(modid=Reference.modid,version=Reference.version, name=Reference.name)
public class TestMod {

  @SidedProxy(clientSide = "org.delusion.superspeeder.proxy.ClientProxy", serverSide = "org.delusion.superspeeder.proxy.ServerProxy")
    public static CommonProxy proxy;
  
  @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
  
  @Mod.Instance
  public TestMod test_mod_instance;
  
  @Mod.EventHandler
  public static void init(FMLInitializationEvent event) {
    proxy.init(event);
  }
  
  @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
