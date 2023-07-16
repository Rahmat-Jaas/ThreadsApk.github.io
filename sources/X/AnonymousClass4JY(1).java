package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.4JY  reason: invalid class name */
public final class AnonymousClass4JY implements C83734rt {
    public static final void A00(C84844tx r5, C28291u0 r6, C202813y r7) {
        if (r5 instanceof C28321u4) {
            C130667qT A06 = ((C28321u4) r5).A06();
            A06.A01.put(R.id.bloks_action_listener, new C57253Ai(r7.A01.getContext(), A06, r5, r6, r7));
        }
    }

    public final /* bridge */ /* synthetic */ void AAl(M5O m5o, C84844tx r2, C28291u0 r3) {
        A00(r2, r3, (C202813y) m5o);
    }

    public final View Bhn(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.bloks_megaphone);
        A0H.setTag(new C202813y(A0H));
        return A0H;
    }
}
