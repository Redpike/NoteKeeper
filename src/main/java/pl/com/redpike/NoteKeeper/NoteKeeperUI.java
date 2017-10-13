package pl.com.redpike.NoteKeeper;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
@SpringViewDisplay
@Theme("redpike")
public class NoteKeeperUI extends UI implements ViewDisplay {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello!"));
    }

    @Override
    public void showView(View view) {

    }
}
