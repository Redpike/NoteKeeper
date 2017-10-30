package pl.com.redpike.NoteKeeper.presentation.component;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.viritin.layouts.MVerticalLayout;
import pl.com.redpike.NoteKeeper.config.RedpikeTheme;

public class ApplicationMenuContentLayout extends HorizontalLayout {

    private MenuLayout menuLayout;
    private VerticalLayout contentLayout;

    public ApplicationMenuContentLayout() {
        initComponents();
        initLayout();
    }

    private void initComponents() {
        menuLayout = new MenuLayout();
        contentLayout = new MVerticalLayout();
    }

    private void initLayout() {
        setSizeFull();
        addStyleName(RedpikeTheme.MENU_CONTENT_CONTAINER);
        addComponents(menuLayout, contentLayout);
        setExpandRatio(contentLayout, 0.8f);
    }

    public VerticalLayout getContentLayout() {
        return contentLayout;
    }
}
