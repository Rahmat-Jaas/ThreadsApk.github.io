package X;

import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;
import java.io.File;

/* renamed from: X.0YE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0YE implements C04090Mf {
    public final /* synthetic */ AnonymousClass0OK A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass0YE(AnonymousClass0OK r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void C9M(AnonymousClass0ND r8, AnonymousClass0PC r9) {
        File file;
        AnonymousClass0OK r4 = this.A00;
        boolean z = this.A01;
        C04560Oe r1 = r4.A0B;
        if (r1 == null) {
            r1 = new IDxLProviderShape84S0100000_I2(r4, 4);
            r4.A0B = r1;
        }
        C04840Pi r6 = (C04840Pi) r1.get();
        String str = r4.A03().A06;
        C13810oL.A01("processCurrentSession", 1350327514);
        try {
            synchronized (C04840Pi.A05) {
                File[] A04 = r6.A00.A04(str);
                int length = A04.length - 1;
                if (length >= 0) {
                    File file2 = A04[length];
                    if (length > 0) {
                        file = A04[length - 1];
                    } else {
                        file = null;
                    }
                    C04840Pi.A00(r8, r6, file2, file);
                }
            }
            C13810oL.A00(-1481600502);
            if (z) {
                C04560Oe r0 = r4.A0E;
                if (r0 == null) {
                    r0 = new C04020Ly(r4);
                    r4.A0E = r0;
                }
                ((C04910Pt) r0.get()).A03(r8, false);
            }
        } catch (Throwable th) {
            C13810oL.A00(-1769843556);
            throw th;
        }
    }
}
