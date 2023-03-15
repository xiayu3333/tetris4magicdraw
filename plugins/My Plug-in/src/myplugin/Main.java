package myplugin;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.plugins.Plugin;
import myplugin.menus.MainMenuConfiguration;
import myplugin.menus.*;

public class Main extends Plugin
{
	@Override
	public void init() {
		Application.getInstance().getGUILog().showMessage("Tetris Plugin initiated!");
		createMainMenuAction();
	}
	private void createMainMenuAction() {
		TetrisAction action = new TetrisAction("Tetris Plugin", "Tetris");

		MainMenuConfiguration configurator = new MainMenuConfiguration(action);
		ActionsConfiguratorsManager.getInstance().addMainMenuConfigurator(configurator);
	}


	@Override
	public boolean close() {
		return true;
	}

	@Override
	public boolean isSupported() {
		return true;
	}
}


