package X;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0io  reason: invalid class name and case insensitive filesystem */
public final class C10720io {
    public final GHO A00;

    public final C31152Gh4 A02(String str) {
        if (str == null) {
            str = "0";
        }
        return this.A00.A00(AnonymousClass00U.A0L("ig_pigeon_sampling_policy_v2_", str));
    }

    public C10720io(Context context) {
        this.A00 = C60833Qr.A00(context);
    }

    public static boolean A00(C31152Gh4 gh4, String str) {
        return gh4.A0C(Collections.emptySet()).contains(str);
    }

    public final int A01(String str, String str2) {
        C31152Gh4 A02 = A02(str2);
        if (A00(A02, str)) {
            return -2;
        }
        return A02.A07(str, -1);
    }

    public final String A03(String str) {
        return A02(str).A0A("__config_checksum__", (String) null);
    }

    public final void A04(String str, String str2, Map map, Set set) {
        Number number;
        C31029Gdw A09 = A02(str2).A09();
        A09.A04();
        A09.A0A("__config_checksum__", str);
        for (String str3 : map.keySet()) {
            if (!(str3 == null || (number = (Number) map.get(str3)) == null)) {
                A09.A08(str3, number.intValue());
            }
        }
        A09.A0C(set);
        A09.A03();
        A03(str2);
        set.size();
        map.size();
    }
}
