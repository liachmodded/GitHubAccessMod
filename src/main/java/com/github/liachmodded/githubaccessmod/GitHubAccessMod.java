package com.github.liachmodded.githubaccessmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.eclipse.egit.github.core.client.GitHubClient;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by liach on 11/28/2015.
 *
 * @author liach
 */
@Mod(
   modid = GitHubAccessMod.MOD_ID,
   name = GitHubAccessMod.NAME,
   version = GitHubAccessMod.VERSION
)
public class GitHubAccessMod {

  @Mod.Instance
  public static GitHubAccessMod instance;

  public static final String MOD_ID = "gitHubaccessmod";

  public static final String NAME = "GitHubAccessMod";

  public static final String VERSION = "0.1";

  private static final String CONFIG_NAME = NAME + ".dat";

  public File configFile;

  public GitHubClient ghClient = new GitHubClient();

  @Mod.EventHandler
  public void onPreInit(FMLPreInitializationEvent event) {
    File dir = event.getModConfigurationDirectory();
    configFile = new File(dir, GitHubAccessMod.CONFIG_NAME);

  }

  @Mod.EventHandler
  public void onServerInit(FMLServerStartingEvent event) {
    event.registerServerCommand(new CommandGitHub());
  }

  private void loadUserInfo() {
    try {
      Scanner scan = new Scanner(configFile);
    } catch (FileNotFoundException ex) {

    }
  }
}
