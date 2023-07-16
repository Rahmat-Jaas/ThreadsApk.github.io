package X;

import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.88p  reason: invalid class name and case insensitive filesystem */
public final class C1374488p extends Thread {
    public final /* synthetic */ C89405Ej A00;

    public C1374488p(C89405Ej r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass066 r4;
        UserSession userSession;
        C89405Ej r5 = this.A00;
        if (r5.A0U && (userSession = r5.A0B) != null && r5.A05 == null) {
            r5.A05 = new C107046g3(userSession);
        }
        C39730Kys kys = r5.A03;
        if (kys instanceof AnonymousClass066) {
            r4 = (AnonymousClass066) kys;
        } else {
            AnonymousClass78Q.A00(r5.A02("NULL_LIFE_CYCLE_OWNER"));
            r4 = null;
        }
        C107046g3 r1 = r5.A05;
        if (r1 != null && r4 != null) {
            if (r5.A04 == null) {
                r5.A04 = C86114wI.A0Q(r5, 12);
            }
            C108296i8 r3 = r1.A00;
            AnonymousClass3Zm.A00(new IDxACallbackShape112S0100000_2_I2(r3, 17), r3.A01);
            C1189172u.A00(new AnonymousClass82D(r4, r3.A00, r5));
        }
    }
}
