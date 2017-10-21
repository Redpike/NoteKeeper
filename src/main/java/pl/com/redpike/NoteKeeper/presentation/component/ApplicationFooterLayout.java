package pl.com.redpike.NoteKeeper.presentation.component;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import pl.com.redpike.NoteKeeper.config.RedpikeTheme;

public class ApplicationFooterLayout extends HorizontalLayout {

    public ApplicationFooterLayout() {
        initComponets();
        initLayout();
    }

    private void initComponets() {

    }

    private void initLayout() {
        setWidth(100, Unit.PERCENTAGE);
        addComponent(new Label("Copyright by Redpike@2017"));
        addStyleName(RedpikeTheme.FOOTER_CONTAINER);
    }
}
