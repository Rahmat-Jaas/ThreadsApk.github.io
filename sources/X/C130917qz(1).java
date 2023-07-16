package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.util.Map;

/* renamed from: X.7qz  reason: invalid class name and case insensitive filesystem */
public final class C130917qz implements C144578ij {
    public final C1198577i A00;

    public final C108136hs Cr0(AnonymousClass3HX r8, AnonymousClass7HV r9, AnonymousClass73X r10, AnonymousClass769 r11, C110486ll r12) {
        C108136hs r1;
        Map map = r11.A02;
        String A0r = C18220wO.A0r("key", map);
        if (A0r != null) {
            Object A002 = AnonymousClass6Q6.A00(r12, map);
            Object obj = map.get(DatePickerDialogModule.ARG_MODE);
            String str = r11.A00;
            boolean equals = "p".equals(obj);
            C1198577i r2 = this.A00;
            synchronized (r2) {
                if (equals) {
                    r2.A01(A0r, A002);
                    r1 = C1198577i.A00(r9, r2, A002, A0r, str);
                } else {
                    Map map2 = r2.A01;
                    Object obj2 = map2.get(A0r);
                    if (obj2 == null) {
                        map2.put(A0r, A002);
                    } else {
                        A002 = obj2;
                    }
                    r1 = C1198577i.A00(r9, r2, A002, A0r, str);
                }
            }
            map.get("debug_metadata");
            return r1;
        }
        throw C18180wK.A0a("Key not defined in data manifest");
    }

    public C130917qz(C1198577i r1) {
        this.A00 = r1;
    }
}
