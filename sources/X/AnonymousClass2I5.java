package X;

import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.2I5  reason: invalid class name */
public final class AnonymousClass2I5 {
    public static final Object A00(C63893iY r22) {
        C63893iY r1 = r22;
        C04220Ms.A0B(r1, 0);
        AnonymousClass3HX A01 = C63893iY.A01(r1, 0);
        Object A0B = C63893iY.A0B(r1, 1);
        UserSession A02 = C05030Qo.A02(C63913ic.A0E(A01));
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (A0B != null) {
            A0y.put("deeplink_params", A0B);
        }
        A0y.put("should_dismiss", "true");
        HashMap A022 = C37067Jjv.A02(A0y);
        Integer num = C66883yU.A0F;
        Integer num2 = AnonymousClass006.A00;
        C66883yU r7 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num2, num, num2, (Integer) null, (Integer) null, false, false, false);
        C95245zh r4 = new C95245zh(13784);
        r4.A04.put(45, "tyi.home_page");
        IgBloksScreenConfig A0N = C18190wL.A0N(A02);
        A0N.A0P = "com.bloks.www.fx.settings.tyi.home_page";
        A0N.A01 = r7;
        C63743iE r12 = new C63743iE(A022, Collections.emptyMap(), "com.bloks.www.fx.settings.tyi.home_page");
        r4.A0V();
        r12.A03 = r4;
        r12.A0E(A01.A00, A0N);
        return null;
    }
}
