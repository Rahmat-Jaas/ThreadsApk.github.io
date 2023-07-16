package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.7UY  reason: invalid class name */
public final class AnonymousClass7UY implements C142718fT {
    public final /* synthetic */ ScrollingLogic A00;
    public final /* synthetic */ AnonymousClass0YY A01;

    public AnonymousClass7UY(ScrollingLogic scrollingLogic, AnonymousClass0YY r2) {
        this.A00 = scrollingLogic;
        this.A01 = r2;
    }

    public final float CgC(float f) {
        ScrollingLogic scrollingLogic = this.A00;
        long j = ((AnonymousClass7KC) this.A01.invoke(C86124wJ.A0O(scrollingLogic.A00(f)))).A00;
        if (scrollingLogic.A02 == C967266l.Horizontal) {
            return AnonymousClass7KC.A01(j);
        }
        return AnonymousClass7KC.A02(j);
    }
}
