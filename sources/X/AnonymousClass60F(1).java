package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.60F  reason: invalid class name */
public final class AnonymousClass60F extends AnonymousClass1lO {
    public final AnonymousClass0ZU A00;

    public final Class modelClass() {
        return AnonymousClass60Z.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass60Z r4 = (AnonymousClass60Z) mfV;
        C88715Ai r5 = (C88715Ai) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r5);
        IgdsHeadline igdsHeadline = r5.A00;
        igdsHeadline.A08(R.drawable.instagram_gift_box_outline_96, A1Z);
        igdsHeadline.setBody((CharSequence) r4.A01);
        String str = r4.A00;
        if (str != null && !AnonymousClass8bQ.A0n(str)) {
            igdsHeadline.setLink(str, C86134wK.A0P(this, 82));
        }
    }

    public AnonymousClass60F(AnonymousClass0ZU r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C88715Ai(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_empty_state, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
