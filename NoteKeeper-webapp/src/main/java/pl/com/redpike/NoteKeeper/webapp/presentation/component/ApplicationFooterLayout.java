package pl.com.redpike.NoteKeeper.webapp.presentation.component;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import org.vaadin.viritin.label.MLabel;
import pl.com.redpike.NoteKeeper.webapp.config.RedpikeTheme;

public class ApplicationFooterLayout extends HorizontalLayout {

    private Label footerLabel;

    public ApplicationFooterLayout() {
        initComponets();
        initLayout();
    }

    private void initComponets() {
        footerLabel = new MLabel()
                .withContent("Copyright by Redpike@2017");
    }

    private void initLayout() {
        setHeight(30, Unit.PIXELS);
        setWidth(100, Unit.PERCENTAGE);
        addComponent(footerLabel);
        addStyleName(RedpikeTheme.FOOTER_CONTAINER);
        setComponentAlignment(footerLabel, Alignment.MIDDLE_CENTER);
    }
}
