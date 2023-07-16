package X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;
import java.util.concurrent.Executor;

/* renamed from: X.0Ly  reason: invalid class name and case insensitive filesystem */
public final class C04020Ly extends C06010Xh {
    public final /* synthetic */ AnonymousClass0OK A00;

    public C04020Ly(AnonymousClass0OK r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        AnonymousClass0Y6 r6;
        C13810oL.A01("ReportSender", -1300134333);
        try {
            AnonymousClass0OK r2 = this.A00;
            if (r2.A0A == null && r2.A0K > 0 && r2.A04()) {
                r2.A0A = new IDxLProviderShape84S0100000_I2(r2, 2);
            }
            C04560Oe r3 = r2.A0A;
            Application application = r2.A0L;
            C04560Oe r10 = r2.A0X;
            C04560Oe r11 = r2.A0R;
            C04560Oe r12 = r2.A0Q;
            C04560Oe r13 = r2.A0W;
            C04560Oe r1 = r2.A05;
            if (r1 == null) {
                r1 = new IDxLProviderShape84S0100000_I2(r2, 7);
                r2.A05 = r1;
            }
            C07430bV r7 = (C07430bV) r1.get();
            C04560Oe r14 = r2.A0B;
            if (r14 == null) {
                r14 = new IDxLProviderShape84S0100000_I2(r2, 4);
                r2.A0B = r14;
            }
            C04560Oe r0 = r2.A04;
            if (r0 == null) {
                r0 = new C04030Lz(r2);
                r2.A04 = r0;
            }
            C04320Nd r5 = (C04320Nd) r0.get();
            C04560Oe r15 = r2.A0D;
            if (r15 == null) {
                r15 = new IDxLProviderShape84S0100000_I2(r2, 5);
                r2.A0D = r15;
            }
            Executor executor = (Executor) r15.get();
            if (r3 == null) {
                r6 = null;
            } else {
                r6 = (AnonymousClass0Y6) r3.get();
            }
            return new C04910Pt(application, r5, r6, r7, AnonymousClass0OJ.A00, executor, r10, r11, r12, r13, r14, r2.A0Y, r2.A0a);
        } finally {
            C13810oL.A00(-635862247);
        }
    }
}
