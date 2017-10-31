package pl.com.redpike.NoteKeeper.webapp.presentation.component;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.viritin.label.MLabel;
import pl.com.redpike.NoteKeeper.webapp.config.ApplicationProperties;
import pl.com.redpike.NoteKeeper.webapp.config.RedpikeTheme;

public class ApplicationHeaderLayout extends HorizontalLayout {

    private Label applicationNameLabel;

    public ApplicationHeaderLayout() {
        initComponents();
        initLayout();
    }

    private void initComponents() {
        initMainLayoutComponent();

        applicationNameLabel = new MLabel()
                .withContent(ApplicationProperties.APPLICATION_NAME)
                .withStyleName(ValoTheme.LABEL_H2, RedpikeTheme.HEADER_NAME);
    }

    private void initLayout() {
        addComponent(applicationNameLabel);
        setComponentAlignment(applicationNameLabel, Alignment.MIDDLE_CENTER);
    }

    private void initMainLayoutComponent() {
        setMargin(false);
        setSpacing(true);
        setWidth(100, Unit.PERCENTAGE);
        setHeight(80, Unit.PIXELS);
        addStyleName(RedpikeTheme.HEADER_CONTAINER);
    }
}
