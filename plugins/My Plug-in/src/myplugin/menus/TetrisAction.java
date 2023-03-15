package myplugin.menus;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.impl.InitialNodeImpl;
import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.ActivityNode;
import myplugin.tetris.Tetris;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TetrisAction extends MDAction {

    public TetrisAction(String id, String name) {
        super(id, name, null, null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        ActivityNode node;
        node<

        EventQueue.invokeLater(() -> {

            Tetris game = new Tetris();
            game.setVisible(true);

            game.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("closing...");
                    game.dispose();
                }
            });
        });
    }
}