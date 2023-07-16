package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.5uS  reason: invalid class name */
public final class AnonymousClass5uS extends AnonymousClass4TI {
    public final Context A00;
    public final C22261Ud A01;

    public AnonymousClass5uS(Context context, C22261Ud r3) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = r3;
    }

    public final void A03() {
        C10300i6 r0 = this.A01.A00;
        C04220Ms.A06(r0);
        UserSession A03 = C05030Qo.A03(r0);
        Context context = this.A00;
        C83484rS r5 = GQH.A03;
        C04220Ms.A06(r5);
        String A002 = I17.A00(54);
        String A003 = C28174Ezk.A00(32);
        if (A03 == null || !C63803iN.A0E(AnonymousClass0TJ.A05, A03, 36317457479175864L)) {
            C1184470y.A01(context, A003);
            C1184470y.A01(context, A002);
            if (A03 == null) {
                return;
            }
        } else {
            C1184470y.A00(context, r5, A003);
            C1184470y.A00(context, r5, A002);
        }
        r5.CwT(new FU1(A03));
    }
}
