package X;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.7UP  reason: invalid class name */
public final class AnonymousClass7UP implements C142698fR, C21090Boc {
    public C142718fT A00 = ScrollableKt.A00;
    public final C81784oM A01;

    public final Object AIb(C967166k r4, C146958n9 r5, AnonymousClass0YP r6) {
        return C86164wN.A0U(((ScrollingLogic) this.A01.getValue()).A03.CgB(r4, r5, C86164wN.A0p(this, r6, (C146958n9) null, 8)));
    }

    public final void AIc(float f) {
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.A01.getValue();
        scrollingLogic.A01(this.A00, 1, scrollingLogic.A00(f));
    }

    public AnonymousClass7UP(C81784oM r2) {
        this.A01 = r2;
    }
}
