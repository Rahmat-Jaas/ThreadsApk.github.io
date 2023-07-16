package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: X.7MC  reason: invalid class name */
public final class AnonymousClass7MC implements Drawable.Callback {
    public final /* synthetic */ AnonymousClass545 A00;

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C04220Ms.A0B(runnable, 1);
        ((Handler) AnonymousClass73J.A00.getValue()).postAtTime(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C04220Ms.A0B(runnable, 1);
        ((Handler) AnonymousClass73J.A00.getValue()).removeCallbacks(runnable);
    }

    public AnonymousClass7MC(AnonymousClass545 r1) {
        this.A00 = r1;
    }

    public final void invalidateDrawable(Drawable drawable) {
        long j;
        AnonymousClass545 r4 = this.A00;
        C147368pE r1 = r4.A01;
        C147368pE.A03(r1, AnonymousClass0wJ.A04(r1.getValue()) + 1);
        Drawable drawable2 = r4.A00;
        if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
            j = AnonymousClass7JK.A01;
        } else {
            j = C86104wH.A0C((float) drawable2.getIntrinsicWidth(), (float) drawable2.getIntrinsicHeight());
        }
        r4.A02.CrC(new AnonymousClass7JK(j));
    }
}
