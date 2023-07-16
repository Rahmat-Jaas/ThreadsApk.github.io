package X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;
import com.facebook.redex.IDxCListenerShape849S0100000_I2;

/* renamed from: X.0Yq  reason: invalid class name and case insensitive filesystem */
public final class C06300Yq implements AnonymousClass0OB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ boolean A01;

    public C06300Yq(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r22) {
        C019409a r8;
        AnonymousClass0ME r10;
        C06560Zx r15;
        AnonymousClass0Y6 r14;
        AnonymousClass0OK r2 = r22;
        C04560Oe r6 = r2.A02;
        C04560Oe r4 = r2.A07;
        if (r2.A0A == null && r2.A0K > 0 && r2.A04()) {
            r2.A0A = new IDxLProviderShape84S0100000_I2(r2, 2);
        }
        C04560Oe r3 = r2.A0A;
        Application application = r2.A0L;
        AnonymousClass0Q4 A03 = r2.A03();
        C04100Mg A02 = r2.A02();
        synchronized (C019409a.class) {
            r8 = C019409a.A09;
            if (r8 == null) {
                r8 = new C019409a();
                C019409a.A09 = r8;
            }
        }
        C06310Yr r13 = new C06310Yr();
        C04560Oe r1 = r2.A03;
        if (r1 == null) {
            r1 = new IDxLProviderShape84S0100000_I2(r2, 1);
            r2.A03 = r1;
        }
        C019809f r9 = (C019809f) r1.get();
        IDxCListenerShape849S0100000_I2 iDxCListenerShape849S0100000_I2 = new IDxCListenerShape849S0100000_I2(this, 0);
        C04560Oe r12 = r2.A08;
        if (r12 == null) {
            r12 = new IDxLProviderShape84S0100000_I2(r2, 3);
            r2.A08 = r12;
        }
        AnonymousClass0QI r23 = (AnonymousClass0QI) r12.get();
        if (r6 == null) {
            r10 = null;
        } else {
            r10 = (AnonymousClass0ME) r6.get();
        }
        int i = this.A00;
        boolean z = this.A01;
        C06820aQ r16 = new C06820aQ();
        if (r4 == null) {
            r15 = null;
        } else {
            r15 = (C06560Zx) r4.get();
        }
        if (r3 == null) {
            r14 = null;
        } else {
            r14 = (AnonymousClass0Y6) r3.get();
        }
        return new C07220b8(application, r8, r9, r10, A02, iDxCListenerShape849S0100000_I2, r13, r14, r15, r16, A03, r23, i, z);
    }
}
