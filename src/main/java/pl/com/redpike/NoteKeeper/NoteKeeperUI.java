package pl.com.redpike.NoteKeeper;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI
@SpringViewDisplay
@Theme(ValoTheme.THEME_NAME)
public class NoteKeeperUI extends UI implements ViewDisplay {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

    }

    @Override
    public void showView(View view) {

    }
}
