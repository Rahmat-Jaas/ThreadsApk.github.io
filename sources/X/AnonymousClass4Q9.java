package X;

import android.content.Context;

/* renamed from: X.4Q9  reason: invalid class name */
public final class AnonymousClass4Q9 implements Runnable {
    public final /* synthetic */ AnonymousClass3DA A00;

    public AnonymousClass4Q9(AnonymousClass3DA r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3DA r1 = this.A00;
        Context context = r1.A05.getContext();
        if (context != null) {
            C67313zL.A02(context, C319629q.SETTINGS, r1.A04, AnonymousClass006.A0N, C63793iM.A06());
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
