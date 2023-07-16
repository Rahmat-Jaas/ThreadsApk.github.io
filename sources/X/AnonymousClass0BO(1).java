package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0BO  reason: invalid class name */
public final class AnonymousClass0BO implements CallerContextable, AnonymousClass0RJ {
    public static final String __redex_internal_original_name = "MultipleAccountHelperImpl";
    public final AnonymousClass0RL A00;
    public final C07540bg A01;
    public final boolean A02;
    public final AnonymousClass3GU A03;
    public final AnonymousClass0RK A04;

    public final AnonymousClass0R6 A0C(Activity activity, UserSession userSession, String str, boolean z) {
        C04220Ms.A0B(activity, 0);
        C04220Ms.A0B(userSession, 1);
        if (!A0M(activity, userSession)) {
            return new AnonymousClass0R6((Bundle) null, false);
        }
        return A00(userSession, str, z);
    }

    public final User A0D(User user) {
        Object obj;
        C04220Ms.A0B(user, 0);
        AnonymousClass0RL r0 = this.A00;
        List A042 = r0.A04(user);
        Map map = r0.A03;
        Number number = (Number) map.get(user);
        Iterator it = A042.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Number number2 = (Number) map.get(obj);
            if (number != null && number2 != null && number2.longValue() <= number.longValue()) {
                break;
            }
        }
        User user2 = (User) obj;
        if (user2 == null) {
            return (User) AnonymousClass00J.A0D(A042);
        }
        return user2;
    }

    public final void A0H(Context context, Intent intent, UserSession userSession, User user, String str) {
        C04220Ms.A0B(context, 0);
        C04220Ms.A0B(userSession, 1);
        C04220Ms.A0B(user, 2);
        C04220Ms.A0B(str, 3);
        A0I(context, intent, userSession, user, str, true);
    }

    public final void A0I(Context context, Intent intent, UserSession userSession, User user, String str, boolean z) {
        C04220Ms.A0B(context, 0);
        C04220Ms.A0B(str, 3);
        A0J(context, intent, userSession, user, str, z, false);
    }

    public final boolean A0M(Activity activity, UserSession userSession) {
        if (!AnonymousClass2RP.A00(userSession)) {
            this.A03.A00(activity);
            return false;
        } else if (AnonymousClass3X5.A01(activity, userSession)) {
            return true;
        } else {
            this.A03.A01(userSession, activity, false);
            return false;
        }
    }

    public final boolean A0N(Context context, UserSession userSession, User user) {
        C04220Ms.A0B(context, 0);
        C04220Ms.A0B(userSession, 1);
        C04220Ms.A0B(user, 2);
        if (!AnonymousClass3X5.A01(context, userSession)) {
            C15730rn A012 = C15730rn.A01("ig_account_switch_blocked", (String) null);
            AnonymousClass3X5.A00(context, A012, userSession);
            C12090lI.A00(userSession).Cd7(A012);
            this.A03.A01(userSession, context, false);
            return false;
        } else if (!C04220Ms.A0I(user.getId(), userSession.getUserId())) {
            return true;
        } else {
            C10450iM.A04("MultipleAccountUtil_duplicateAccountSwitch", "Tried to switch to same user twice", 1);
            return false;
        }
    }

    private final AnonymousClass0R6 A00(UserSession userSession, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
        bundle.putBoolean("SHOULD_START_AT_SAC_REG_FLOW", z);
        bundle.putBoolean("is_current_user_fb_connected", A0A(userSession));
        C04620Ok r4 = C06810aP.A01;
        bundle.putString("current_username", r4.A01(userSession).BK7());
        bundle.putString("last_accessed_user_id", userSession.getUserId());
        bundle.putBoolean("multiple_accounts_logged_in", userSession.multipleAccountHelper.A0L());
        if ("settings".equals(str)) {
            bundle.putString("lined_fb_user_id", A01(userSession));
            bundle.putString("cached_fb_access_token", C62963bD.A01(CallerContext.A00(AnonymousClass0BO.class), userSession, "ig_add_account_flow_sdk"));
            bundle.putString("page_id_for_suma_new_biz_account", r4.A01(userSession).A16());
            bundle.putString("entry_point", str);
        }
        bundle.putString("current_user_id", userSession.getUserId());
        bundle.putString("cached_ig_access_token", C61793Vp.A00(userSession).A02());
        bundle.putString("last_logged_in_ig_access_token", userSession.token);
        A07(bundle, userSession);
        return new AnonymousClass0R6(bundle, true);
    }

    public static final List A02(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (user != null) {
                arrayList.add(new C72144Mm(user));
            }
        }
        return arrayList;
    }

    public static final void A08(UserSession userSession, User user, String str) {
        AnonymousClass01V r1 = AnonymousClass01V.A0p;
        if (r1 != null) {
            r1.markerStart(31784965);
            C63643hy.A04(new C05120Qz(r1, userSession, user, str));
        }
    }

    public final int A0B() {
        return this.A00.A03.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.instagram.user.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.user.model.User A0E(java.lang.String r5) {
        /*
            r4 = this;
            X.0RL r0 = r4.A00
            java.util.Map r0 = r0.A03
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0020
            java.lang.String r2 = r0.getId()
        L_0x0020:
            boolean r0 = X.C04220Ms.A0I(r2, r5)
            if (r0 == 0) goto L_0x000c
            r2 = r1
        L_0x0027:
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BO.A0E(java.lang.String):com.instagram.user.model.User");
    }

    public final List A0F() {
        return A02(this.A00.A04((User) null));
    }

    public final List A0G(String str) {
        String id;
        Set<User> keySet = this.A00.A03.keySet();
        ArrayList arrayList = new ArrayList();
        for (User user : keySet) {
            if (!(user == null || C04220Ms.A0I(str, user.getId()) || (id = user.getId()) == null)) {
                arrayList.add(id);
            }
        }
        return arrayList;
    }

    public final void A0K(User user) {
        AnonymousClass0RL r2 = this.A00;
        if (r2.A03.containsKey(user)) {
            Map map = r2.A01;
            Object obj = map.get(user);
            if (obj != null) {
                map.put(user, obj);
                Map map2 = r2.A02;
                map2.put(user, map2.get(user));
                AnonymousClass0RL.A02(r2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean A0L() {
        if (this.A00.A03.size() <= 1) {
            return false;
        }
        return true;
    }

    public final boolean A0O(String str) {
        List<User> A042 = this.A00.A04((User) null);
        if (!(A042 instanceof Collection) || !A042.isEmpty()) {
            for (User id : A042) {
                if (C04220Ms.A0I(id.getId(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass0BO(AnonymousClass3GU r1, AnonymousClass0RL r2, AnonymousClass0RK r3, C07540bg r4, boolean z) {
        this.A00 = r2;
        this.A01 = r4;
        this.A04 = r3;
        this.A03 = r1;
        this.A02 = z;
    }

    public static final String A01(UserSession userSession) {
        return C35692Ol.A00(userSession).A02(CallerContext.A00(AnonymousClass0BO.class), "ig_add_account_flow");
    }

    public static final void A03(Context context, Uri uri) {
        Intent A022 = C62333Yi.A01().A02(context);
        A022.setData(uri);
        C10650ih.A02(context, A022);
    }

    public static final void A04(Context context, AnonymousClass0BO r4, UserSession userSession, User user) {
        C38040KHr A002 = AnonymousClass2LP.A00();
        userSession.getUserId();
        user.getId();
        A002.CWx(new AnonymousClass0P9());
        AnonymousClass0RL r0 = r4.A00;
        r0.A00.A00.edit().putString("last_seen_user_id", userSession.getUserId()).apply();
        r4.A04.A01(context, AnonymousClass0RA.A0C.A05(r4), userSession, user);
    }

    public static final void A05(Context context, AnonymousClass0BO r4, UserSession userSession, User user) {
        C38040KHr A002 = AnonymousClass2LP.A00();
        user.getId();
        user.BK7();
        C06810aP.A01.A01(userSession).BK7();
        A002.CWx(new AnonymousClass0PB((Runnable) new AnonymousClass0R2(context, r4, userSession, user)));
    }

    public static final void A07(Bundle bundle, UserSession userSession) {
        bundle.putString("current_user_id", userSession.getUserId());
        bundle.putString("cached_ig_access_token", C61793Vp.A00(userSession).A02());
        bundle.putString("last_logged_in_ig_access_token", userSession.token);
    }

    public static final void A09(User user, User user2) {
        C38040KHr A002 = AnonymousClass2LP.A00();
        user2.getId();
        user2.BK7();
        user.BK7();
        A002.CWx(new AnonymousClass0PB((Runnable) null));
    }

    public static final boolean A0A(UserSession userSession) {
        return C35692Ol.A00(userSession).A05(CallerContext.A00(AnonymousClass0BO.class), "ig_add_account_flow");
    }

    public final void A0J(Context context, Intent intent, UserSession userSession, User user, String str, boolean z, boolean z2) {
        String str2 = str;
        C04220Ms.A0B(str2, 3);
        double currentTimeMillis = (double) System.currentTimeMillis();
        User user2 = user;
        UserSession userSession2 = userSession;
        A08(userSession2, user2, str2);
        String obj = UUID.randomUUID().toString();
        if (intent != null) {
            intent.putExtra("EXTRA_SWITCHED_FROM_USER", C06810aP.A01.A01(userSession2).BK7());
            obj = intent.getStringExtra("event_session_id");
        }
        USLEBaseShape0S0000000 A002 = C32372Bo.A00(C13330nS.A01((C11630kW) null, userSession2));
        A002.A0T("entry_point", str2);
        A002.A0T("to_pk", user2.getId());
        A002.A0T("from_pk", userSession2.getUserId());
        A002.Bb4();
        C37084JkG.A00(userSession2);
        A04(context, this, userSession2, user2);
        if (z) {
            USLEBaseShape0S0000000 A003 = AnonymousClass2C0.A00(new C13330nS(C10690il.A03, userSession2));
            A003.A0Q("is_badge_shown", true);
            A003.A0S("raw_target_account_id", Long.valueOf(Long.parseLong(user2.getId())));
            A003.A0S("target_identity_id", Long.valueOf(Long.parseLong(user2.getId())));
            A003.A0O(C05110Qy.A00(str2), "entry_point");
            A003.A0R(TraceFieldType.StartTime, Double.valueOf(currentTimeMillis));
            A003.A0T("event_session_id", obj);
            A003.A0Q("is_logged_in", true);
            A003.A0O(AnonymousClass28R.INTRA_APP, "switch_type");
            A003.A0Q("is_cds", false);
            A003.A0Q("is_sso_enabled", true);
            A003.A0Q("is_tooltip_shown", false);
            A003.A0T("tooltip_type", "");
            A003.A0O(C317028q.INSTAGRAM, "initiator_account_type");
            A003.A0O((C021109v) null, "initiator_identity_type");
            A003.A0R("end_time", Double.valueOf((double) System.currentTimeMillis()));
            A003.Bb4();
        }
        C38040KHr A004 = AnonymousClass2LP.A00();
        user2.getId();
        user2.BK7();
        A004.CWx(new AnonymousClass0PB(intent));
        if (intent != null && z2) {
            A03(context, intent.getData());
        }
        if (C10600ic.A00 != null) {
            C09120et A005 = C09120et.A3D.A00();
            Set A0E = A005.A0E();
            ArrayList arrayList = new ArrayList();
            for (Object next : A0E) {
                if (!C04220Ms.A0I(next, user2.getId())) {
                    arrayList.add(next);
                }
            }
            A005.A0G(AnonymousClass00J.A0c(arrayList));
        }
    }
}
