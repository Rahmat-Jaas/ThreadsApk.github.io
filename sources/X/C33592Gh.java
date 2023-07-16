package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.redex.IDxCRunnableShape615S0100000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.2Gh  reason: invalid class name and case insensitive filesystem */
public final class C33592Gh {
    public static final Object A00(AnonymousClass601 r36, C63893iY r37) {
        String str;
        Context context;
        AnonymousClass601 r10 = r36;
        C63893iY r8 = r37;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r10);
        int nextInt = new Random().nextInt();
        C63913ic.A0G(r10);
        AnonymousClass01V r4 = AnonymousClass01V.A0p;
        r4.markerStart(537738084, nextInt);
        r4.markerPoint(537738084, nextInt, "parse_parameters_start");
        AnonymousClass3HX r12 = r10.A00;
        if (r12 == null || (context = r12.A00) == null) {
            str = "null_param_androidContext";
        } else {
            List list = r8.A00;
            C127397h3 r13 = (C127397h3) list.get(0);
            if (r13 == null) {
                str = "null_param_openSyncScreenOptions";
            } else {
                Object A0B = C63893iY.A0B(r8, A1Z ? 1 : 0);
                A0B.getClass();
                C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
                C121997Jj r7 = (C121997Jj) A0B;
                C127397h3 r1 = (C127397h3) list.get(2);
                if (r1 == null) {
                    str = "null_param_openScreenOptions";
                } else {
                    String A0N = r13.A0N(38);
                    if (A0N == null) {
                        str = "null_param_screenId";
                    } else {
                        int A0H = r13.A0H(40, -1);
                        if (-1 == A0H) {
                            str = "invalid_param_ttiMarkerId";
                        } else {
                            boolean A0T = r13.A0T(41, false);
                            C66883yU A02 = C66883yU.A02(r12, r1);
                            if (A0T && (context instanceof Activity)) {
                                A02.A00 = new CdsOpenScreenCallerDismissCallback(new IDxCRunnableShape615S0100000_1_I2(context, 0));
                            }
                            Map map = (Map) C61043Rr.A00(r10, C63893iY.A01, C18230wP.A0V(r13));
                            if (map == null) {
                                str = "null_param_analyticsExtras";
                            } else {
                                r4.markerPoint(537738084, nextInt, "parse_parameters_end");
                                String A0N2 = r13.A0N(43);
                                if (A0N2 == null) {
                                    str = "null_param_appId";
                                } else {
                                    String str2 = null;
                                    boolean z = false;
                                    ArrayList A0v = AnonymousClass0wJ.A0v();
                                    if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18310038288540163L)) {
                                        str2 = A0N2;
                                        z = true;
                                    }
                                    C66843yQ r16 = new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, str2, (String) null, (HashMap) null, A0v, map, (Map) null, (Map) null, -1, A0H, -1, -1, z, false);
                                    IgBloksScreenConfig A0N3 = C18190wL.A0N(C63913ic.A0F(r10));
                                    A0N3.A0Q = A0N;
                                    A0N3.A08 = r7;
                                    A0N3.A01 = A02;
                                    r4.markerPoint(537738084, nextInt, "cds_push_invocation_start");
                                    try {
                                        AnonymousClass3TU r30 = new AnonymousClass3TU();
                                        new LinkedHashMap();
                                        r30.A01(context, r16, A0N3, (C127397h3) null, (C82374pW) null, A0N2, 0);
                                        r4.markerPoint(537738084, nextInt, "cds_push_invocation_end");
                                        r4.markerEnd(537738084, nextInt, 2);
                                        return null;
                                    } catch (IllegalStateException unused) {
                                        r4.markerPoint(537738084, nextInt, "cds_push_exception_IllegalStateException");
                                        r4.markerEnd(537738084, nextInt, 3);
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        r4.markerPoint(537738084, nextInt, str);
        r4.markerEnd(537738084, nextInt, 3);
        return null;
    }
}
