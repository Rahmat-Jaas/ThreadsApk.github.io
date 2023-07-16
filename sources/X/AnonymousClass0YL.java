package X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;

/* renamed from: X.0YL  reason: invalid class name */
public final class AnonymousClass0YL implements AnonymousClass0OB {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass0YL(Application application, boolean z, boolean z2, boolean z3) {
        this.A00 = application;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r13) {
        AnonymousClass0YK r2 = new AnonymousClass0YK(r13, this);
        AnonymousClass0Q4 A032 = r13.A03();
        C04100Mg A022 = r13.A02();
        Application application = this.A00;
        boolean z = this.A03;
        C06930ac r4 = new C06930ac(application, r2, z, this.A02);
        String str = (String) r13.A0T.get();
        boolean z2 = this.A01;
        C04560Oe r7 = r13.A0X;
        C04560Oe r8 = r13.A0R;
        C04560Oe r9 = r13.A0Q;
        C04560Oe r1 = r13.A03;
        if (r1 == null) {
            r1 = new IDxLProviderShape84S0100000_I2(r13, 1);
            r13.A03 = r1;
        }
        return new C06910aa((C019809f) r1.get(), new AnonymousClass0YE(r13, true), A022, r4, A032, str, r7, r8, r9, z2, z);
    }
}
