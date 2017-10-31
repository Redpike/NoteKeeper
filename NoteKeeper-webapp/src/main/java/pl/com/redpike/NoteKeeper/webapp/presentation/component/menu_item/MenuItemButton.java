package pl.com.redpike.NoteKeeper.webapp.presentation.component.menu_item;

import com.vaadin.server.Resource;
import org.vaadin.viritin.button.MButton;

public class MenuItemButton extends MButton {

    private int order;

    public MenuItemButton() {
        super();
    }

    public MenuItemButton withOrder(int order) {
        this.setOrder(order);
        return this;
    }

    public int getOrder() {
        return order;
    }

    private void setOrder(int order) {
        this.order = order;
    }

    @Override
    public MenuItemButton withCaption(String caption) {
        super.withCaption(caption);
        return this;
    }

    @Override
    public MenuItemButton withIcon(Resource icon) {
        super.withIcon(icon);
        return this;
    }

    @Override
    public MenuItemButton withStyleName(String... styleName) {
        super.withStyleName(styleName);
        return this;
    }

    @Override
    public MenuItemButton withListener(ClickListener clickListener) {
        super.withListener(clickListener);
        return this;
    }
}
