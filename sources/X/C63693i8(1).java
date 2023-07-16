package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3i8  reason: invalid class name and case insensitive filesystem */
public final class C63693i8 {
    public static final C63693i8 A00 = new C63693i8();

    public static final List A07(Context context, C10300i6 r6, String str, C307822y r8) {
        Integer num;
        AnonymousClass4VE r1 = new AnonymousClass4VE(r6, (String) null);
        C57723Cf r0 = new C57723Cf();
        r0.A02 = r1;
        C63053bO r2 = new C63053bO(r0);
        if (!A09(str, r1)) {
            C81124nC r5 = new C81124nC(r6);
            String name = r8.name();
            String str2 = "SAVED_ACCOUNTS";
            try {
                int intValue = AnonymousClass006.A01.intValue();
                if (intValue == 0) {
                    str2 = "ACTIVE_ACCOUNT";
                } else if (intValue == 1) {
                    str2 = "SAVED_ACCOUNT";
                } else if (intValue == 2) {
                    str2 = "INACTIVE_LOGGED_IN_ACCOUNT";
                }
            } catch (IllegalArgumentException unused) {
            }
            if (AnonymousClass8bQ.A0n(A02())) {
                num = AnonymousClass006.A04;
            } else {
                num = AnonymousClass006.A03;
            }
            r5.A04(num, name, str2, str);
            r2.A02.Bj7(str);
            return AnonymousClass0wJ.A0v();
        } else if (!C18210wN.A1S(36317182598057484L)) {
            return C63053bO.A01(context, C18180wK.A0n(r8), r2, true);
        } else {
            return C61923Wj.A00(new AnonymousClass3YQ().A02(context, str, C61923Wj.A01(AnonymousClass006.A01, C18250wR.A0c(r8)), new C81124nC(r6)));
        }
    }

    public static boolean A08(C10300i6 r3) {
        C04220Ms.A0B(r3, 1);
        return !A09("ig_android_access_library_fx_fetch_active_msgr_token", new AnonymousClass4VE(r3, (String) null));
    }

    public static final List A06(Context context, C10300i6 r9, String str, String str2, C307822y r12) {
        Integer num;
        Integer num2;
        AnonymousClass4VE r1 = new AnonymousClass4VE(r9, str2);
        C57723Cf r0 = new C57723Cf();
        r0.A02 = r1;
        C63053bO r4 = new C63053bO(r0);
        if (!A09(str, r1)) {
            C81124nC r3 = new C81124nC(r9);
            String name = r12.name();
            String str3 = "ACTIVE";
            try {
                int intValue = AnonymousClass006.A00.intValue();
                if (intValue == 0) {
                    str3 = "ACTIVE_ACCOUNT";
                } else if (intValue == 1) {
                    str3 = "SAVED_ACCOUNT";
                } else if (intValue == 2) {
                    str3 = "INACTIVE_LOGGED_IN_ACCOUNT";
                }
            } catch (IllegalArgumentException unused) {
            }
            if (AnonymousClass8bQ.A0n(A02())) {
                num = AnonymousClass006.A04;
            } else {
                num = AnonymousClass006.A03;
            }
            r3.A04(num, name, str3, str);
            C81124nC r32 = new C81124nC(r9);
            String str4 = "SAVED_ACCOUNTS";
            try {
                int intValue2 = AnonymousClass006.A01.intValue();
                if (intValue2 == 0) {
                    str4 = "ACTIVE_ACCOUNT";
                } else if (intValue2 == 1) {
                    str4 = "SAVED_ACCOUNT";
                } else if (intValue2 == 2) {
                    str4 = "INACTIVE_LOGGED_IN_ACCOUNT";
                }
            } catch (IllegalArgumentException unused2) {
            }
            if (AnonymousClass8bQ.A0n(A02())) {
                num2 = AnonymousClass006.A04;
            } else {
                num2 = AnonymousClass006.A03;
            }
            r32.A04(num2, name, str4, str);
            r4.A02.Bj7(str);
            return AnonymousClass0wJ.A0v();
        } else if (!C18210wN.A1S(36317182598057484L)) {
            return C63053bO.A01(context, Collections.singletonList(r12), r4, false);
        } else {
            return C02260Al.A10(C06750aI.A17(C61923Wj.A00(new AnonymousClass3YQ().A02(context, str, C61923Wj.A01(AnonymousClass006.A01, C18250wR.A0c(r12)), new C81124nC(r9))), C61923Wj.A00(new AnonymousClass3YQ().A02(context, str, C61923Wj.A01(AnonymousClass006.A00, C18250wR.A0c(r12)), new C81124nC(r9)))));
        }
    }

    public static final ListenableFuture A00(Context context, C10300i6 r3, String str) {
        AnonymousClass0wJ.A1N(context, r3);
        C04220Ms.A0B(str, 2);
        if (!A09(str, (AnonymousClass4VE) null)) {
            return new AnonymousClass5ro(AnonymousClass0wJ.A0v());
        }
        return AnonymousClass2QQ.A00(context, r3, C311624m.FACEBOOK, AnonymousClass24G.ACTIVE_ACCOUNT);
    }

    public static final ListenableFuture A01(Context context, C10300i6 r3, String str) {
        AnonymousClass0wJ.A1N(context, r3);
        C04220Ms.A0B(str, 2);
        if (!A09(str, (AnonymousClass4VE) null)) {
            return new AnonymousClass5ro(AnonymousClass0wJ.A0v());
        }
        return AnonymousClass2QQ.A00(context, r3, C311624m.MESSENGER, AnonymousClass24G.ACTIVE_ACCOUNT);
    }

    public static final List A03(Context context, C10300i6 r2, String str, String str2) {
        AnonymousClass0wJ.A1N(context, r2);
        C04220Ms.A0B(str, 2);
        return A05(context, r2, str, str2, AnonymousClass4WM.A07(C307822y.A01));
    }

    public static final List A04(Context context, C10300i6 r2, String str, String str2) {
        AnonymousClass0wJ.A1N(context, r2);
        C04220Ms.A0B(str, 2);
        return A05(context, r2, str, str2, AnonymousClass4WM.A07(C307822y.A05));
    }

    public static final List A05(Context context, C10300i6 r8, String str, String str2, Set set) {
        List unmodifiableList;
        Integer num;
        AnonymousClass0wJ.A1O(set, r8);
        String str3 = str;
        C04220Ms.A0B(str, 3);
        AnonymousClass4VE r2 = new AnonymousClass4VE(r8, str2);
        C57723Cf r1 = new C57723Cf();
        r1.A02 = r2;
        r1.A03 = new C81124nC(r8);
        C63053bO r9 = new C63053bO(r1);
        if (!A09(str3, r2)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C81124nC r4 = new C81124nC(r8);
                String name = ((C307822y) it.next()).name();
                String str4 = "ACTIVE";
                try {
                    int intValue = AnonymousClass006.A00.intValue();
                    if (intValue == 0) {
                        str4 = "ACTIVE_ACCOUNT";
                    } else if (intValue == 1) {
                        str4 = "SAVED_ACCOUNT";
                    } else if (intValue == 2) {
                        str4 = "INACTIVE_LOGGED_IN_ACCOUNT";
                    }
                } catch (IllegalArgumentException unused) {
                }
                if (AnonymousClass8bQ.A0n(A02())) {
                    num = AnonymousClass006.A04;
                } else {
                    num = AnonymousClass006.A03;
                }
                r4.A04(num, name, str4, str3);
            }
            r9.A02.Bj7(str3);
            return AnonymousClass0ZV.A00;
        }
        Context context2 = context;
        if (C18210wN.A1S(36317182598057484L)) {
            unmodifiableList = C61923Wj.A00(new AnonymousClass3YQ().A02(context, str3, C61923Wj.A01(AnonymousClass006.A00, set), new C81124nC(r8)));
        } else {
            String A0h = C18230wP.A0h();
            C84644tb r22 = r9.A02;
            r22.onStart();
            r22.Bkl(C18200wM.A0s(set));
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (C62273Yb r82 : r9.A04.A00(set)) {
                r22.Blm(r82);
                C63053bO.A02(context2, A0h, str3, A0v, r82, r9);
            }
            unmodifiableList = Collections.unmodifiableList(A0v);
        }
        C04220Ms.A06(unmodifiableList);
        return unmodifiableList;
    }

    public static final String A02() {
        String A03 = C07960cV.A03(C08960ea.A00(18864149199061149L));
        C04220Ms.A06(A03);
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (r6 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r6 != null) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(java.lang.String r5, X.AnonymousClass4VE r6) {
        /*
            r0 = 18301199245707919(0x4104d800010a8f, double:1.8934177995827304E-307)
            X.0ea r0 = X.C08960ea.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0090
            boolean r0 = X.AnonymousClass8bQ.A0n(r5)
            r3 = 0
            if (r0 == 0) goto L_0x0018
            return r3
        L_0x0018:
            r0 = 18301199246101137(0x4104d800070a91, double:1.8934177997381508E-307)
            X.0ea r0 = X.C08960ea.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 == 0) goto L_0x0062
            r0 = 18864149199585442(0x4304d8000800a2, double:2.115925185613769E-307)
            X.0ea r0 = X.C08960ea.A00(r0)
            java.lang.String r0 = X.C07960cV.A03(r0)
            X.C04220Ms.A06(r0)
            java.lang.String r2 = "AccessControlRuleV2"
            org.json.JSONObject r1 = X.C18250wR.A0j(r0)     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            java.util.Map r0 = X.C313925w.A02     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            X.25w r0 = (X.C313925w) r0     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            int r0 = r0.A00     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            boolean r0 = r1.has(r0)     // Catch:{ NullPointerException -> 0x005e, JSONException -> 0x0084, Exception -> 0x005a }
            if (r0 == 0) goto L_0x008a
            return r4
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "Exception"
            goto L_0x0087
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "NullPointerException"
            goto L_0x0087
        L_0x0062:
            java.lang.String r0 = A02()
            if (r5 == 0) goto L_0x0081
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0081 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0081 }
            r1 = 0
        L_0x006e:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0081 }
            if (r1 >= r0) goto L_0x0081
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x0081 }
            boolean r0 = r5.equals(r0)     // Catch:{ JSONException -> 0x0081 }
            if (r0 != 0) goto L_0x0090
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0081:
            if (r6 == 0) goto L_0x008f
            goto L_0x008c
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "JSONException"
        L_0x0087:
            X.AnonymousClass0LU.A0E(r2, r0, r1)
        L_0x008a:
            if (r6 == 0) goto L_0x008f
        L_0x008c:
            r6.Bj7(r5)
        L_0x008f:
            r4 = 0
        L_0x0090:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63693i8.A09(java.lang.String, X.4VE):boolean");
    }
}
