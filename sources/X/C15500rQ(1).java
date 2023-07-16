package X;

import android.content.Context;
import com.facebook.redex.IDxObjectShape118S0200000_I2;
import java.lang.ref.WeakReference;

/* renamed from: X.0rQ  reason: invalid class name and case insensitive filesystem */
public final class C15500rQ implements C10880j7 {
    public final C11190jg A00;
    public final WeakReference A01;

    public final void A02() {
        C11190jg r2 = this.A00;
        synchronized (r2) {
            r2.A01.edit().putBoolean("phone_id_synced", true).apply();
        }
    }

    public final synchronized String BJN() {
        return this.A00.A03((C10300i6) this.A01.get());
    }

    public static /* synthetic */ C15500rQ A00(Context context, C10300i6 r2) {
        return new C15500rQ(context, r2);
    }

    public static C15500rQ A01(C10300i6 r4) {
        return (C15500rQ) r4.A01(C15500rQ.class, new IDxObjectShape118S0200000_I2(0, C10600ic.A00, r4));
    }

    public final AnonymousClass3FH B1K() {
        return this.A00.A02((C10300i6) this.A01.get());
    }

    public C15500rQ(Context context, C10300i6 r3) {
        this.A00 = C11190jg.A00(context);
        this.A01 = new WeakReference(r3);
    }
}
