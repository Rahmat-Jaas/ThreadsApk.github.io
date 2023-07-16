package X;

import com.instagram.service.session.UserSession;
import com.instagram.wellbeing.reporting.common.intf.IDxRListenerShape68S0200000_1_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2I0  reason: invalid class name */
public final class AnonymousClass2I0 {
    public static final Object A00(AnonymousClass601 r16, C63893iY r17) {
        C29009Fg4 fg4;
        AnonymousClass25O r7;
        C11630kW r13;
        Map map;
        String str;
        String str2;
        AnonymousClass601 r5 = r16;
        C63893iY r0 = r17;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r5);
        C127397h3 A03 = C63893iY.A03(r0, 0);
        String A0O = A03.A0O(36, "");
        C04220Ms.A06(A0O);
        C29008Fg3 A00 = C54452zT.A00(C63913ic.A0M(Integer.valueOf(A03.A0H(40, 0))));
        C04220Ms.A0C(A00, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXObjectType");
        String A0M = C63913ic.A0M(Integer.valueOf(A03.A0H(38, 0)));
        C29009Fg4[] values = C29009Fg4.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fg4 = null;
                break;
            }
            fg4 = values[i];
            if (C04220Ms.A0I(fg4.A00, A0M)) {
                break;
            }
            i++;
        }
        C04220Ms.A0C(fg4, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXLocation");
        String A0M2 = C63913ic.A0M(Integer.valueOf(A03.A0H(35, 0)));
        AnonymousClass25O[] values2 = AnonymousClass25O.values();
        int length2 = values2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                r7 = null;
                break;
            }
            r7 = values2[i2];
            if (r7.A00.equals(A0M2)) {
                break;
            }
            i2++;
        }
        C04220Ms.A0C(r7, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXEntryPoint");
        boolean A0T = A03.A0T(44, false);
        C109326jp A0L = A03.A0L(41);
        String A0N = A03.A0N(42);
        if (A0N == null) {
            r13 = C63913ic.A0A(r5);
        } else {
            r13 = new AnonymousClass43K(A0N);
        }
        Object obj = A03.A04.get(43);
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        C37232Jmy jmy = new C37232Jmy(C63913ic.A05(r5), r13, (UserSession) C63913ic.A0F(r5), fg4, A00, A0O);
        jmy.A07(r7);
        if (map != null) {
            ArrayList A0w = C18220wO.A0w(map);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object key = A0o.getKey();
                Object value = A0o.getValue();
                if (key == null || (str = key.toString()) == null) {
                    str = "";
                }
                if (value == null || (str2 = value.toString()) == null) {
                    str2 = "";
                }
                jmy.A08(str, str2);
                A0w.add(jmy);
            }
        }
        if (A0L != null) {
            jmy.A03 = new IDxRListenerShape68S0200000_1_I2(r5, A0L, 0);
        }
        if (A0T) {
            jmy.A08 = A1Z;
            jmy.A06();
            return null;
        }
        jmy.A06();
        return null;
    }
}
