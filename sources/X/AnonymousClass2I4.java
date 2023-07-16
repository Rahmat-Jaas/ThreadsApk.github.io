package X;

import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.2I4  reason: invalid class name */
public final class AnonymousClass2I4 {
    public static final Object A00(C63893iY r22) {
        C63893iY r0 = r22;
        C04220Ms.A0B(r0, 0);
        AnonymousClass3HX A01 = C63893iY.A01(r0, 0);
        C10300i6 A0E = C63913ic.A0E(A01);
        C18200wM.A1R(A0E);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("dyi_ui_source", "standalone");
        A0y.put("should_dismiss", "true");
        HashMap A02 = C37067Jjv.A02(A0y);
        Integer num = C66883yU.A0F;
        Integer num2 = AnonymousClass006.A00;
        C66883yU r7 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num2, num, num2, (Integer) null, (Integer) null, false, false, false);
        C95245zh r4 = new C95245zh(13784);
        r4.A04.put(45, "unified_dyi.landing_page");
        IgBloksScreenConfig A0N = C18190wL.A0N(A0E);
        A0N.A0P = "com.bloks.www.fx.settings.unified_dyi.landing_page";
        A0N.A01 = r7;
        C63743iE r1 = new C63743iE(A02, Collections.emptyMap(), "com.bloks.www.fx.settings.unified_dyi.landing_page");
        r4.A0V();
        r1.A03 = r4;
        r1.A0E(A01.A00, A0N);
        return null;
    }
}
