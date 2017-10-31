package pl.com.redpike.NoteKeeper.webapp.presentation.component.menu_item;

import com.vaadin.icons.VaadinIcons;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MenuItem {

    String name();

    String viewId();

    VaadinIcons icon();

    int order();
}
