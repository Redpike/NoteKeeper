package pl.com.redpike.NoteKeeper.presentation.component;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

public class ApplicationLayout extends VerticalLayout {

    private ApplicationHeaderLayout applicationHeaderLayout;
    private ApplicationMenuContentLayout applicationMenuContentLayout;
    private ApplicationFooterLayout applicationFooterLayout;

    public ApplicationLayout() {
        initComponents();
        initLayout();
    }

    private void initComponents() {
        setSpacing(false);
        setMargin(false);
        setSizeFull();
        applicationHeaderLayout = new ApplicationHeaderLayout();
        applicationMenuContentLayout = new ApplicationMenuContentLayout();
        applicationFooterLayout = new ApplicationFooterLayout();
    }

    private void initLayout() {
        addComponents(applicationHeaderLayout, applicationMenuContentLayout, applicationFooterLayout);
        setExpandRatio(applicationMenuContentLayout, 0.8f);
    }

    public ApplicationMenuContentLayout getApplicationMenuContentLayout() {
        return applicationMenuContentLayout;
    }
}
