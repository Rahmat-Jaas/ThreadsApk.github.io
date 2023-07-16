package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.0yB  reason: invalid class name and case insensitive filesystem */
public final class C18930yB extends FrameLayout {
    public E2V A00;
    public SearchEditText A01;

    public ImageView getBackButton() {
        return this.A00.A0P;
    }

    public SearchEditText getEditText() {
        return this.A01;
    }

    public C18930yB(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.action_bar, this);
        E2V e2v = new E2V((View.OnClickListener) null, C18240wQ.A0G(this, R.id.action_bar_container));
        this.A00 = e2v;
        e2v.CtT(true);
        this.A00.A0P.setBackground((Drawable) null);
        this.A00.CtP(false);
        SearchEditText searchEditText = (SearchEditText) this.A00.A0Q(false).getEditText();
        this.A01 = searchEditText;
        searchEditText.setSearchIconEnabled(false);
    }
}
