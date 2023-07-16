package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.1kS  reason: invalid class name */
public final class AnonymousClass1kS extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass488.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C200112t r5 = (C200112t) m5o;
        C04220Ms.A0B(r5, 1);
        IgTextView igTextView = r5.A01;
        C18200wM.A15(r5.A00, igTextView, 2131827189);
        igTextView.setVisibility(0);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C200112t(C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_fb_comment_thread_description_container, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
