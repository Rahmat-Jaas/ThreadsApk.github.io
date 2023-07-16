package X;

import android.app.Application;
import com.facebook.redex.IDxCFactoryShape111S0000000_I2;
import com.facebook.redex.IDxCFactoryShape203S0200000_I2;
import com.facebook.redex.IDxCFactoryShape2S0001000_I2;

/* renamed from: X.0aC  reason: invalid class name and case insensitive filesystem */
public final class C06690aC implements AnonymousClass0P4 {
    public final int A00;
    public final Application A01;
    public final C07390bR A02;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }

    /* JADX INFO: finally extract failed */
    public final AnonymousClass0OM A7o(AnonymousClass0OM r8, AnonymousClass0Z8 r9) {
        C04220Ms.A0B(r9, 0);
        C04220Ms.A0B(r8, 1);
        Integer num = AnonymousClass006.A1C;
        Application application = this.A01;
        C07390bR r3 = this.A02;
        int i = this.A00;
        C13810oL.A01("Config.createSoftErrorConfig", -381904326);
        try {
            AnonymousClass0OC r2 = new AnonymousClass0OC(AnonymousClass006.A0f);
            r2.A00 = new IDxCFactoryShape2S0001000_I2(i, 0);
            r2.A02 = AnonymousClass006.A0C;
            r2.A01(AnonymousClass0ND.LARGE_REPORT, new IDxCFactoryShape111S0000000_I2(15));
            r2.A01 = new IDxCFactoryShape203S0200000_I2(5, application, r3);
            C13810oL.A00(2099011714);
            r9.A00(r2, num);
            r8.A00(r2.A00());
            return r8;
        } catch (Throwable th) {
            C13810oL.A00(1402673606);
            throw th;
        }
    }

    public C06690aC(Application application, C07390bR r2, int i) {
        this.A01 = application;
        this.A02 = r2;
        this.A00 = i;
    }
}
