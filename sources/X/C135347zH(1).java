package X;

import android.view.ContextThemeWrapper;

/* renamed from: X.7zH  reason: invalid class name and case insensitive filesystem */
public final class C135347zH implements Runnable {
    public final /* synthetic */ AnonymousClass5j8 A00;

    public C135347zH(AnonymousClass5j8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass77R A0M = AnonymousClass7Kz.A0M();
        AnonymousClass5j8 r0 = this.A00;
        ContextThemeWrapper contextThemeWrapper = r0.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("wrapperContext");
            throw null;
        } else {
            AnonymousClass77R.A00(contextThemeWrapper, AnonymousClass5j8.A03(r0), A0M);
        }
    }
}
