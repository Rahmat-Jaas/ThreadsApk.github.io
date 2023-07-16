package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest;

/* renamed from: X.3iR  reason: invalid class name and case insensitive filesystem */
public final class C63843iR {
    public static final C63843iR A00 = new C63843iR();

    public static final List A01(Context context, FragmentActivity fragmentActivity, C10300i6 r5, String str) {
        AnonymousClass0wJ.A1M(r5, 0, fragmentActivity);
        boolean z = r5 instanceof UserSession;
        UserSession userSession = r5;
        if (z) {
            if (str == null) {
                str = "";
            }
            UserSession A02 = C05030Qo.A02(r5);
            userSession = A02;
            if (!C04220Ms.A0I(str, "active_account")) {
                if (C04220Ms.A0I(str, "inactive_logged_in_accounts")) {
                    return A00.A06(context, A02);
                }
                ArrayList A0v = AnonymousClass0wJ.A0v();
                C63843iR r1 = A00;
                A0v.addAll(r1.A09(fragmentActivity, A02));
                A0v.addAll(r1.A06(context, A02));
                return A0v;
            }
        }
        return A00.A09(fragmentActivity, userSession);
    }

    public static final List A02(Context context, FragmentActivity fragmentActivity, C10300i6 r5, String str, String str2) {
        AnonymousClass0wJ.A1M(r5, 0, fragmentActivity);
        C04220Ms.A0B(str2, 4);
        boolean z = r5 instanceof UserSession;
        UserSession userSession = r5;
        if (z) {
            if (str == null) {
                str = "";
            }
            UserSession A02 = C05030Qo.A02(r5);
            userSession = A02;
            if (!C04220Ms.A0I(str, "active_account")) {
                if (C04220Ms.A0I(str, "inactive_logged_in_accounts")) {
                    return A00.A07(context, A02, str2);
                }
                ArrayList A0v = AnonymousClass0wJ.A0v();
                C63843iR r1 = A00;
                A0v.addAll(r1.A0A(fragmentActivity, A02, str2));
                A0v.addAll(r1.A07(context, A02, str2));
                return A0v;
            }
        }
        return A00.A0A(fragmentActivity, userSession, str2);
    }

    public static final List A05(Context context, C10300i6 r4, String str, String str2) {
        C04220Ms.A0B(str2, 3);
        if (!(r4 instanceof UserSession)) {
            return AnonymousClass0wJ.A0v();
        }
        UserSession A02 = C05030Qo.A02(r4);
        if (C04220Ms.A0I(str, "active_account")) {
            return A00.A08(context, A02, str2);
        }
        if (C04220Ms.A0I(str, "inactive_logged_in_accounts")) {
            return A0C(A02);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.addAll(A00.A08(context, A02, str2));
        A0v.addAll(A0C(A02));
        return A0v;
    }

    private final List A0A(FragmentActivity fragmentActivity, C10300i6 r8, String str) {
        String str2;
        if (r8 instanceof UserSession) {
            str2 = ((UserSession) r8).getUserId();
        } else {
            str2 = null;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass3H2 r0 : C63693i8.A03(C18230wP.A09(fragmentActivity), r8, str, str2)) {
            AnonymousClass3VA r1 = r0.A01;
            A0v.add(A00(r1.A01.A02, r1.A00, "Facebook", "Facebook", "active_account"));
        }
        return A0v;
    }

    public static final List A0B(C10300i6 r6, String str) {
        if (!(r6 instanceof UserSession)) {
            return AnonymousClass0wJ.A0v();
        }
        UserSession A02 = C05030Qo.A02(r6);
        if (C04220Ms.A0I(str, "active_account")) {
            String str2 = C61793Vp.A00(A02).A04;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            if (AnonymousClass0hA.A08(str2)) {
                return A0v;
            }
            A0v.add(A00(A02.getUserId(), str2, "Instagram", "Instagram", "active_account"));
            return A0v;
        } else if (C04220Ms.A0I(str, "inactive_logged_in_accounts")) {
            return A0C(A02);
        } else {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            String str3 = C61793Vp.A00(A02).A04;
            ArrayList A0v3 = AnonymousClass0wJ.A0v();
            if (!AnonymousClass0hA.A08(str3)) {
                A0v3.add(A00(A02.getUserId(), str3, "Instagram", "Instagram", "active_account"));
            }
            A0v2.addAll(A0v3);
            A0v2.addAll(A0C(A02));
            return A0v2;
        }
    }

    private final void A0D(UserSession userSession, List list) {
        if (userSession != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add(new C61243Sl(C311624m.FACEBOOK, AnonymousClass24G.SAVED_ACCOUNTS));
            ReplicatedStorageRequest replicatedStorageRequest = new ReplicatedStorageRequest(A0v);
            userSession.getUserId();
            for (AnonymousClass3HZ r0 : C54742zw.A00(C18230wP.A0h(), "FxNativeAuthDataHelper", new C81124nC(userSession), replicatedStorageRequest)) {
                list.add(A00(r0.A02, r0.A01, "Facebook", "Facebook", "inactive_logged_in_accounts"));
            }
        }
    }

    public static final Object A00(String str, String str2, String str3, String str4, String str5) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("user_id", str);
        A0y.put("auth_token", str2);
        A0y.put("account_type", str3);
        A0y.put("app_source", str4);
        A0y.put("account_source", str5);
        return A0y;
    }

    public static final List A03(Context context, C10300i6 r8, String str) {
        String str2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (r8 instanceof UserSession) {
            str2 = C05030Qo.A02(r8).getUserId();
        } else {
            str2 = null;
        }
        for (AnonymousClass3H2 r0 : C63693i8.A04(context, r8, str, str2)) {
            AnonymousClass3VA r1 = r0.A01;
            A0v.add(A00(r1.A01.A02, r1.A00, "Facebook", "Messenger", "active_account"));
        }
        return A0v;
    }

    public static final List A04(Context context, C10300i6 r8, String str) {
        String str2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (r8 instanceof UserSession) {
            str2 = C05030Qo.A02(r8).getUserId();
        } else {
            str2 = null;
        }
        C04220Ms.A0B(str, 2);
        for (AnonymousClass3H2 r0 : C63693i8.A05(context, r8, str, str2, AnonymousClass4WM.A07(C307822y.A09))) {
            AnonymousClass3VA r1 = r0.A01;
            A0v.add(A00(r1.A01.A02, r1.A00, "FRL", "Oculus", "active_account"));
        }
        return A0v;
    }

    private final List A06(Context context, UserSession userSession) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (A0E()) {
            A0D(userSession, A0v);
        }
        if (A0v.isEmpty()) {
            C57723Cf r3 = new C57723Cf();
            r3.A02 = new AnonymousClass4VE(userSession, (String) null);
            for (AnonymousClass3H2 r0 : C63053bO.A01(context, C18180wK.A0n(C307822y.A01), new C63053bO(r3), false)) {
                AnonymousClass3VA r1 = r0.A01;
                A0v.add(A00(r1.A01.A02, r1.A00, "Facebook", "Facebook", "inactive_logged_in_accounts"));
            }
        }
        return A0v;
    }

    private final List A07(Context context, UserSession userSession, String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (A0E()) {
            if (!C63693i8.A09(str, new AnonymousClass4VE(userSession, userSession.getUserId()))) {
                userSession.getUserId();
                new C81124nC(userSession).A04(AnonymousClass006.A03, "FACEBOOK", "SAVED_ACCOUNTS", str);
            } else {
                A0D(userSession, A0v);
            }
        }
        if (A0v.isEmpty()) {
            for (AnonymousClass3H2 r0 : C63693i8.A06(context, userSession, str, userSession.getUserId(), C307822y.A01)) {
                AnonymousClass3VA r1 = r0.A01;
                A0v.add(A00(r1.A01.A02, r1.A00, "Facebook", "Facebook", "inactive_logged_in_accounts"));
            }
        }
        return A0v;
    }

    private final List A08(Context context, UserSession userSession, String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass3H2 r0 : C63693i8.A05(context, userSession, str, userSession.getUserId(), new HashSet(C18180wK.A0n(C307822y.A04)))) {
            AnonymousClass3VA r1 = r0.A01;
            A0v.add(A00(r1.A01.A02, r1.A00, "Facebook", "Messenger", "active_account"));
        }
        return A0v;
    }

    private final List A09(FragmentActivity fragmentActivity, C10300i6 r7) {
        String str;
        String str2;
        String str3;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Context applicationContext = fragmentActivity.getApplicationContext();
        Boolean valueOf = Boolean.valueOf(A0E());
        if (r7 instanceof UserSession) {
            str = ((UserSession) r7).getUserId();
        } else {
            str = null;
        }
        AnonymousClass3AB A002 = AnonymousClass2OO.A00(applicationContext, r7, valueOf, str);
        if (A002 != null) {
            C566037v r0 = A002.A00;
            if (r0 != null) {
                str2 = r0.A01;
            } else {
                str2 = null;
            }
            if (!AnonymousClass0hA.A08(str2) && !AnonymousClass0hA.A08(A002.A02)) {
                C566037v r02 = A002.A00;
                if (r02 != null) {
                    str3 = r02.A01;
                } else {
                    str3 = null;
                }
                A0v.add(A00(str3, A002.A02, "Facebook", "Facebook", "active_account"));
            }
        }
        return A0v;
    }

    public static final List A0C(UserSession userSession) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = userSession.multipleAccountHelper.A0G((String) null).iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (!AnonymousClass0hA.A08(A0k) && !C18250wR.A1J(userSession, A0k)) {
                AnonymousClass0RA.A0C.A09(new AnonymousClass4KJ(), new AnonymousClass4KK(A0v, A0k), new AnonymousClass4KN(), A0k);
            }
        }
        return A0v;
    }

    public static final boolean A0E() {
        if (C18210wN.A1S(36316014367280061L) || C18210wN.A1S(36316014367411135L) || C07960cV.A05(C08960ea.A00(18301620152765381L)) || C07960cV.A05(C08960ea.A00(18301620152896455L))) {
            return true;
        }
        return false;
    }
}
