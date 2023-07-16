package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kf  reason: invalid class name and case insensitive filesystem */
public final class C24811kf extends AnonymousClass1lO {
    public final AnonymousClass3IU A00;

    public C24811kf(AnonymousClass3IU r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final Class modelClass() {
        return AnonymousClass1l8.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C198312a r4 = (C198312a) m5o;
        C04220Ms.A0B(r4, 1);
        AnonymousClass0wJ.A18(r4.A00, 225, this, r4);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C198312a(C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_fb_comment_title_bar, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
