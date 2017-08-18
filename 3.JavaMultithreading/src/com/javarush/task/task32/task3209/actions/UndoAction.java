package com.javarush.task.task32.task3209.actions;


import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by user on 23.07.2017.
 */
public class UndoAction extends AbstractAction {
    private View view;
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public UndoAction (View view) {this.view = view;}
}
