package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Wj  reason: invalid class name and case insensitive filesystem */
public final class C61923Wj {
    public static C562936n A01(Integer num, Set set) {
        String str;
        AnonymousClass24G r2;
        C311624m r1;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            int[] iArr = C549431a.A00;
            int ordinal = ((C307822y) it.next()).ordinal();
            int i = iArr[ordinal];
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 6) {
                str = "account_manager";
            } else {
                str = "content_provider";
            }
            A0y.put("resolver_type", str);
            if (num.intValue() != 1) {
                r2 = AnonymousClass24G.ACTIVE_ACCOUNT;
            } else {
                r2 = AnonymousClass24G.SAVED_ACCOUNTS;
            }
            switch (iArr[ordinal]) {
                case 1:
                    r1 = C311624m.FACEBOOK;
                    break;
                case 2:
                    r1 = C311624m.FACEBOOK_DEBUG;
                    break;
                case 3:
                    r1 = C311624m.FACEBOOK_LITE;
                    break;
                case 4:
                    r1 = C311624m.INSTAGRAM;
                    break;
                case 5:
                    r1 = C311624m.MESSENGER;
                    break;
                case 6:
                    r1 = C311624m.MLITE;
                    break;
                case 7:
                    r1 = C311624m.OCULUS;
                    break;
            }
            A0v.add(new C57633Bv((String) null, A0y, r1, r2));
        }
        return new C562936n(A0v);
    }

    public static List A00(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3HZ r5 = (AnonymousClass3HZ) it.next();
                C307822y A02 = A02(r5.A04);
                if (A02 != null) {
                    Map map = r5.A03;
                    A0v.add(new AnonymousClass3H2(new AnonymousClass4n9(A02), new AnonymousClass3VA(r5.A01, new AnonymousClass3VD(r5.A02, C18220wO.A0r(FXPFAccessLibraryDebugFragment.NAME, map), C18210wN.A0g("profile_pic_url", map)))));
                }
            }
        }
        return A0v;
    }

    public static C307822y A02(C311624m r0) {
        switch (r0.ordinal()) {
            case 0:
                return C307822y.A01;
            case 1:
                return C307822y.A02;
            case 2:
                return C307822y.A03;
            case 3:
                return C307822y.A04;
            case 4:
                return C307822y.A06;
            case 5:
                return C307822y.A05;
            default:
                return null;
        }
    }
}
