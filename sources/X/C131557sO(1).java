package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.7sO  reason: invalid class name and case insensitive filesystem */
public final class C131557sO implements C10390iG {
    public static C131557sO A01;
    public final File A00;

    public static synchronized C131557sO A00(Context context) {
        C131557sO r0;
        synchronized (C131557sO.class) {
            if (A01 == null) {
                C131557sO r02 = new C131557sO(context.getApplicationContext());
                A01 = r02;
                C691847d.A02(r02);
            }
            r0 = A01;
        }
        return r0;
    }

    public C131557sO(Context context) {
        this.A00 = C91285fx.A00(context).AOC((C109746kY) null, 2096512767);
    }

    public final boolean A01(File file) {
        if (C691847d.A05() || C03690Kh.A01().A08() || file.isFile()) {
            return AnonymousClass0IV.A00(file);
        }
        if (file.renameTo(C86154wM.A0U(this.A00, C18180wK.A0e())) || AnonymousClass0IV.A00(file)) {
            return true;
        }
        return false;
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(373480272);
        AnonymousClass0gN.A00().AKp(new AnonymousClass612(this));
        C14030oh.A0A(-964227816, A03);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-1900303012, C14030oh.A03(-1854555647));
    }
}
