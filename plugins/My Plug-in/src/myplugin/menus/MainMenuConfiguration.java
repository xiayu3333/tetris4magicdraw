package myplugin.menus;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.ActionsID;

import java.util.List;

public class MainMenuConfiguration implements AMConfigurator {

    private final TetrisAction tetrisAction;


    public MainMenuConfiguration(TetrisAction tetrisAction) {
        this.tetrisAction = tetrisAction;

    }

    @Override
    public void configure(ActionsManager actionsManager) {
        NMAction newProjectAction = actionsManager.getActionFor(ActionsID.ABOUT);
        if (newProjectAction != null) {
            ActionsCategory category = (ActionsCategory) actionsManager.getActionParent(newProjectAction);
            //category.getActions()
            category.addAction(tetrisAction);

        }
    }
}
