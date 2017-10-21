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
        menuLayout.setWidth(100, Unit.PERCENTAGE);
        menuLayout.setHeight(100, Unit.PERCENTAGE);

        contentLayout = new MVerticalLayout()
                .withFullSize();
    }

    private void initLayout() {
        addStyleName(RedpikeTheme.MENU_CONTENT_CONTAINER);
        addComponents(menuLayout, contentLayout);
        setExpandRatio(menuLayout, 0.15f);
        setExpandRatio(contentLayout, 0.85f);
    }

    public VerticalLayout getContentLayout() {
        return contentLayout;
    }
}
