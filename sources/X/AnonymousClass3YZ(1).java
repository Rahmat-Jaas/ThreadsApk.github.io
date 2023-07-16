package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3YZ  reason: invalid class name */
public final class AnonymousClass3YZ {
    public final Map A00 = AnonymousClass0wJ.A0y();
    public final Map A01 = AnonymousClass0wJ.A0y();

    public static final void A01(AnonymousClass3YZ r6) {
        ArrayList A0s = C18200wM.A0s(r6.A00.values());
        C08350dD A002 = C08360dF.A00();
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        Iterator A0t = C18190wL.A0t(A0K, "nonce_list", A0s);
        while (A0t.hasNext()) {
            C61173Se r2 = (C61173Se) A0t.next();
            if (r2 != null) {
                A0K.A0J();
                String str = r2.A02;
                if (str != null) {
                    A0K.A0d("user_id", str);
                }
                String str2 = r2.A01;
                if (str2 != null) {
                    A0K.A0d("nonce", str2);
                }
                A0K.A0c("last_updated_at", r2.A00);
                A0K.A0G();
            }
        }
        A0K.A0F();
        C18180wK.A0v(C18220wO.A0B(A002), "two_fac_trusted_device_nonce_user_map", C18180wK.A0h(A0K, A0d));
    }

    public AnonymousClass3YZ() {
        A00(this);
    }

    public static final void A00(AnonymousClass3YZ r4) {
        String A0h = C18200wM.A0h(C18200wM.A0C(), "two_fac_trusted_device_nonce_user_map");
        if (A0h != null && A0h.length() != 0) {
            try {
                List<C61173Se> list = C36212Ql.parseFromJson(C18180wK.A0L(A0h)).A00;
                if (list != null) {
                    for (C61173Se r2 : list) {
                        Map map = r4.A00;
                        String str = r2.A02;
                        C04220Ms.A06(str);
                        map.put(str, r2);
                    }
                }
            } catch (IOException e) {
                C10450iM.A07("Two fac secure nonce manager", e);
            }
        }
    }

    public final void A02(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        this.A00.put(str, new C61173Se(str, str2, System.currentTimeMillis()));
        try {
            A01(this);
        } catch (IOException e) {
            C10450iM.A07("Two fac secure nonce manager", e);
        }
    }

    public final void A03(String str, String str2) {
        boolean A1Y = AnonymousClass0wJ.A1Y(str, str2);
        Map map = this.A01;
        List list = (List) map.get(str);
        if (list == null) {
            list = new LinkedList();
            map.put(str, list);
        }
        if (list.size() >= 10) {
            list.remove(A1Y ? 1 : 0);
        }
        list.add(str2);
    }
}
