package X;

import android.os.Build;

/* renamed from: X.094  reason: invalid class name */
public final class AnonymousClass094 implements AnonymousClass001 {
    public final AnonymousClass00C A00;
    public final /* synthetic */ AnonymousClass00F A01;

    public AnonymousClass094(AnonymousClass00C r1, AnonymousClass00F r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void cancel() {
        AnonymousClass00F r3 = this.A01;
        AnonymousClass8AL A002 = r3.A05;
        AnonymousClass00C r2 = this.A00;
        A002.remove(r2);
        r2.A02.remove(this);
        if (Build.VERSION.SDK_INT >= 33) {
            r2.A00 = null;
            r3.A03();
        }
    }
}
