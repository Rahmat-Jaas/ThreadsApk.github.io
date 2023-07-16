package X;

import android.util.SparseArray;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: X.2Gi  reason: invalid class name and case insensitive filesystem */
public final class C33602Gi {
    public static final Object A00(AnonymousClass601 r29, C63893iY r30) {
        String str;
        AnonymousClass601 r7 = r29;
        C63893iY r6 = r30;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r7);
        int nextInt = new Random().nextInt();
        C63913ic.A0G(r7);
        AnonymousClass01V r2 = AnonymousClass01V.A0p;
        r2.markerStart(537729057, nextInt);
        r2.markerPoint(537729057, nextInt, "parse_parameters_start");
        AnonymousClass3HX r0 = r7.A00;
        if (r0 == null || r0.A00 == null) {
            str = "null_param_androidContext";
        } else {
            C127397h3 A02 = C63893iY.A02(r6, 0);
            if (A02 == null) {
                str = "null_param_screenOptions";
            } else {
                Object A0B = C63893iY.A0B(r6, A1Z ? 1 : 0);
                A0B.getClass();
                C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
                C121997Jj r62 = (C121997Jj) A0B;
                String A0N = A02.A0N(38);
                if (A0N == null) {
                    str = "null_param_screenId";
                } else {
                    int A0H = A02.A0H(40, -1);
                    if (-1 == A0H) {
                        str = "invalid_param_ttiMarkerId";
                    } else {
                        Map map = (Map) C61043Rr.A00(r7, C63893iY.A01, C18230wP.A0V(A02));
                        if (map == null) {
                            str = "null_param_analyticsExtras";
                        } else {
                            r2.markerPoint(537729057, nextInt, "parse_parameters_end");
                            C66843yQ r11 = new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, (String) null, (String) null, (HashMap) null, AnonymousClass0wJ.A0v(), map, (Map) null, (Map) null, -1, A0H, -1, -1, false, false);
                            IgBloksScreenConfig A0N2 = C18190wL.A0N(C63913ic.A0F(r7));
                            A0N2.A0Q = A0N;
                            r2.markerPoint(537729057, nextInt, "cds_push_invocation_start");
                            try {
                                C63123bZ.A02(C63913ic.A05(r7), r11, r62, A0N2.A04(), (C82374pW) null, (Integer) null, A0N, 32);
                                r2.markerPoint(537729057, nextInt, "cds_push_invocation_end");
                                r2.markerEnd(537729057, nextInt, 2);
                                return null;
                            } catch (IllegalStateException unused) {
                                r2.markerPoint(537729057, nextInt, "cds_push_exception_IllegalStateException");
                                r2.markerEnd(537729057, nextInt, 3);
                                return null;
                            }
                        }
                    }
                }
            }
        }
        r2.markerPoint(537729057, nextInt, str);
        r2.markerEnd(537729057, nextInt, 3);
        return null;
    }
}
