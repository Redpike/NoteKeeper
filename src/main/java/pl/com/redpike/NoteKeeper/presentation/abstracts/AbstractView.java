package pl.com.redpike.NoteKeeper.presentation.abstracts;

import com.vaadin.ui.VerticalLayout;

public abstract class AbstractView<PRESENTER extends Presenter> extends VerticalLayout implements View {

    private final PRESENTER presenter;

    protected AbstractView(PRESENTER presenter) {
        this.presenter = presenter;
        this.presenter.setView(this);
        setMargin(false);
    }

    @Override
    public PRESENTER getPresenter() {
        return this.presenter;
    }
}
