package pl.com.redpike.NoteKeeper.webapp.presentation.abstracts;

public abstract class AbstractPresenter<VIEW extends View> implements Presenter {

    private VIEW view;

    @Override
    public VIEW getView() {
        return this.view;
    }

    @Override
    public void setView(View view) {
        this.view = (VIEW) view;
    }
}
