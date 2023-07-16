package X;

import android.view.View;

/* renamed from: X.7RS  reason: invalid class name */
public final class AnonymousClass7RS implements View.OnFocusChangeListener {
    public final /* synthetic */ C92325hz A00;

    public AnonymousClass7RS(C92325hz r1) {
        this.A00 = r1;
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass66H r1;
        C92325hz r2 = this.A00;
        C86114wI.A1B(r2.A04.A0B, z);
        if (Boolean.TRUE.equals(r2.A04.A07.A08())) {
            r2.A0W(AnonymousClass66H.A05, true);
        } else {
            if (!z) {
                r1 = AnonymousClass66H.A04;
            } else if (r2.A04.A0P) {
                r1 = AnonymousClass66H.A03;
            } else {
                r1 = AnonymousClass66H.A06;
            }
            r2.A0W(r1, true);
            C92325hz.A06(r2, (AnonymousClass75V) r2.A04.A06.A08());
        }
        C92325hz.A05(r2);
    }
}
