package com.github.liachmodded.githubaccessmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * Created by liach on 11/28/2015.
 *
 * @author liach
 */
@Mod(modid = "githubaccessmod", name = "GitHubAccessMod")
public class GitHubAccessMod {
  @Mod.EventHandler
  public void onPreInit(FMLPreInitializationEvent event) {

  }

  @Mod.EventHandler
  public void onServerInit(FMLServerStartingEvent event) {
    event.registerServerCommand(new CommandGitHub());
  }
}
