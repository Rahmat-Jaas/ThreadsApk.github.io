package X;

import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Db  reason: invalid class name and case insensitive filesystem */
public final class C120907Db {
    public static C120907Db A04;
    public static final AtomicBoolean A05 = new AtomicBoolean();
    public AnonymousClass4z6 A00 = new AnonymousClass4z6(AnonymousClass7DL.A00().A00.getLooper(), this);
    public List A01;
    public final Context A02;
    public final JQR A03;

    public static synchronized void A00(C120907Db r2) {
        synchronized (r2) {
            A05.set(false);
            r2.A01 = AnonymousClass0wJ.A0v();
        }
    }

    public C120907Db(Context context, JQR jqr) {
        this.A03 = jqr;
        this.A02 = context;
    }
}
