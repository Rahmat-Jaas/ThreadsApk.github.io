package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3bO  reason: invalid class name and case insensitive filesystem */
public final class C63053bO {
    public final C15780rs A00;
    public final AnonymousClass3YU A01;
    public final C84644tb A02;
    public final AnonymousClass3ZN A03;
    public final AnonymousClass3E0 A04;

    public C63053bO(C57723Cf r5) {
        AnonymousClass3E0 r3 = r5.A04;
        AnonymousClass3YU r2 = r5.A01;
        C84644tb r1 = r5.A02;
        AnonymousClass3ZN r0 = r5.A03;
        this.A04 = r3;
        this.A01 = r2;
        this.A02 = r1;
        this.A03 = r0;
        this.A00 = r5.A00;
    }

    public static ContentProviderClient A00(Context context, C62273Yb r7, C63053bO r8) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                try {
                    if (!packageManager.getApplicationInfo(r7.A02, 0).enabled) {
                        A0y.put("app_not_installed", "app_disabled");
                        r8.A02.CLn(A0y, r7);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    A0y.put("app_not_installed", e.getMessage());
                    r8.A02.CLn(A0y, r7);
                    return null;
                }
            }
            Uri uri = r7.A00;
            C04220Ms.A0B(uri, 1);
            return r8.A00.A03(context, uri);
        } catch (SecurityException unused) {
            r8.A02.CLm(r7);
            return null;
        }
    }

    public static List A01(Context context, List list, C63053bO r15, boolean z) {
        ArrayList<C62273Yb> arrayList;
        List list2;
        C84644tb r4 = r15.A02;
        r4.onStart();
        r4.Bkl(list);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            if (z) {
                C04220Ms.A0B(next, 0);
                List list3 = C60983Rj.A04;
                arrayList = AnonymousClass0wJ.A0v();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    C62273Yb.A00(next, arrayList, it);
                }
            } else {
                C04220Ms.A0B(next, 0);
                List list4 = C60983Rj.A00;
                arrayList = AnonymousClass0wJ.A0v();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    C62273Yb.A00(next, arrayList, it2);
                }
            }
            for (C62273Yb r5 : arrayList) {
                r4.Blm(r5);
                ContentProviderClient A002 = A00(context, r5, r15);
                if (A002 != null) {
                    r4.CLo(r5);
                    try {
                        AnonymousClass3YU r6 = r15.A01;
                        if (r5.A04 == C307822y.A04) {
                            list2 = r6.A01(A002, (String) null, r5, r4);
                        } else {
                            Cursor A003 = AnonymousClass3YU.A00(A002, (String) null, r5, r4);
                            ArrayList A0v2 = AnonymousClass0wJ.A0v();
                            list2 = A0v2;
                            if (A003 != null) {
                                list2 = A0v2;
                                if (A003.moveToNext()) {
                                    try {
                                        String string = A003.getString(1);
                                        ArrayList A0v3 = AnonymousClass0wJ.A0v();
                                        if (string != null) {
                                            JSONArray jSONArray = new JSONArray(string);
                                            for (int i = 0; i < jSONArray.length(); i++) {
                                                C18210wN.A1O(jSONArray.get(i), A0v3);
                                            }
                                        }
                                        Iterator it3 = A0v3.iterator();
                                        while (it3.hasNext()) {
                                            JSONObject A0j = C18250wR.A0j(C18180wK.A0k(it3));
                                            JSONObject jSONObject = A0j.getJSONObject("profile");
                                            A0v2.add(new AnonymousClass3H2(r5, new AnonymousClass3VA(A0j.getString("access_token"), new AnonymousClass3VD(jSONObject.getString(FXPFAccessLibraryDebugFragment.UID), jSONObject.getString(FXPFAccessLibraryDebugFragment.NAME), ""))));
                                        }
                                    } catch (JSONException e) {
                                        r4.CLj(e, r5);
                                    } catch (Throwable th) {
                                        A003.close();
                                        throw th;
                                    }
                                    A003.close();
                                    list2 = A0v2;
                                }
                            }
                        }
                        A0v.addAll(list2);
                        r4.CLl(r5);
                    } catch (RemoteException e2) {
                        r4.CLj(e2, r5);
                    }
                } else {
                    r4.CLn((Map) null, r5);
                }
            }
        }
        return A0v;
    }

    public static void A02(Context context, String str, String str2, List list, C62273Yb r24, C63053bO r25) {
        List list2;
        Integer num;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C62273Yb r1 = r24;
        C63053bO r7 = r25;
        ContentProviderClient A002 = A00(context, r1, r7);
        String str3 = str;
        if (A002 != null) {
            AnonymousClass3ZN r3 = r7.A03;
            Integer num2 = AnonymousClass006.A00;
            List A0h = C18210wN.A0h("ACTIVE");
            Map A003 = AnonymousClass3ZN.A00("waterfall_id", str3, r3);
            String str4 = str2;
            if (!A0v.isEmpty() && A0h != null && !A0h.isEmpty()) {
                Iterator it = A0v.iterator();
                while (it.hasNext()) {
                    String A0t = C18220wO.A0t(it);
                    Iterator it2 = A0h.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3ZN.A01(C320229w.FETCH_START, num2, A0t, C18220wO.A0t(it2), (String) null, (String) null, C18210wN.A0g("waterfall_id", A003), str4, A003, r3);
                    }
                }
            }
            C84644tb r6 = r7.A02;
            r6.CLo(r1);
            try {
                List<AnonymousClass3H2> A012 = r7.A01.A01(A002, str3, r1, r6);
                for (AnonymousClass3H2 r72 : A012) {
                    C18210wN.A1O(r72.A00.A04, A0v);
                }
                if (A012.isEmpty()) {
                    r6.CLk(r1);
                    ArrayList arrayList = A0v;
                    AnonymousClass3ZN r13 = r3;
                    String str5 = str4;
                    r13.A09(AnonymousClass006.A0N, str5, arrayList, C18210wN.A0h("ACTIVE"), AnonymousClass3ZN.A00("waterfall_id", str3, r3));
                    return;
                }
                list.addAll(A012);
                r6.CLl(r1);
                List A0h2 = C18210wN.A0h("ACTIVE");
                Map A004 = AnonymousClass3ZN.A00("waterfall_id", str3, r3);
                if (!A0v.isEmpty() && A0h2 != null && !A0h2.isEmpty()) {
                    Iterator it3 = A0v.iterator();
                    while (it3.hasNext()) {
                        String A0t2 = C18220wO.A0t(it3);
                        Iterator it4 = A0h2.iterator();
                        while (it4.hasNext()) {
                            AnonymousClass3ZN.A01(C320229w.FETCH_SUCCESS, num2, A0t2, C18220wO.A0t(it4), (String) null, (String) null, C18210wN.A0g("waterfall_id", A004), str4, A004, r3);
                        }
                    }
                }
                A002.close();
            } catch (RemoteException e) {
                r6.CLj(e, r1);
                list2 = C18210wN.A0h("ACTIVE");
                num = AnonymousClass006.A1C;
                ArrayList arrayList2 = A0v;
                r3.A09(num, str4, arrayList2, list2, AnonymousClass3ZN.A00("waterfall_id", str3, r3));
            } catch (SecurityException unused) {
                r6.CLm(r1);
                list2 = C18210wN.A0h("ACTIVE");
                num = AnonymousClass006.A15;
                ArrayList arrayList22 = A0v;
                r3.A09(num, str4, arrayList22, list2, AnonymousClass3ZN.A00("waterfall_id", str3, r3));
            }
        } else {
            r7.A02.CLn((Map) null, r1);
            r7.A03.A02("waterfall_id", str3);
            A0v.isEmpty();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048 A[Catch:{ RemoteException -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[Catch:{ RemoteException -> 0x0070 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.content.Context r6, java.util.List r7, X.C62273Yb r8, X.C311624m r9, X.AnonymousClass24G r10, X.C63053bO r11) {
        /*
            android.content.ContentProviderClient r4 = A00(r6, r8, r11)
            if (r4 == 0) goto L_0x0083
            X.4tb r5 = r11.A02     // Catch:{ RemoteException -> 0x0070 }
            r6 = 0
            android.database.Cursor r3 = X.AnonymousClass3YU.A00(r4, r6, r8, r5)     // Catch:{ RemoteException -> 0x0070 }
            if (r3 == 0) goto L_0x003a
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()     // Catch:{ RemoteException -> 0x0070 }
            X.22y r1 = r8.A04     // Catch:{ RemoteException -> 0x0070 }
            java.util.Map r0 = X.C549531b.A00     // Catch:{ RemoteException -> 0x0070 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ RemoteException -> 0x0070 }
            X.4t7 r1 = (X.C84424t7) r1     // Catch:{ RemoteException -> 0x0070 }
        L_0x001d:
            boolean r0 = r3.moveToNext()     // Catch:{ 4Va -> 0x002d }
            if (r0 == 0) goto L_0x003f
            X.3HZ r0 = r1.D7a(r3, r9, r10)     // Catch:{ 4Va -> 0x002d }
            if (r0 == 0) goto L_0x001d
            r2.add(r0)     // Catch:{ 4Va -> 0x002d }
            goto L_0x001d
        L_0x002d:
            r0 = move-exception
            r5.CQY(r8, r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0037
        L_0x0032:
            r0 = move-exception
            r3.close()     // Catch:{ RemoteException -> 0x0070 }
            throw r0     // Catch:{ RemoteException -> 0x0070 }
        L_0x0037:
            r3.close()     // Catch:{ RemoteException -> 0x0070 }
        L_0x003a:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()     // Catch:{ RemoteException -> 0x0070 }
            goto L_0x0042
        L_0x003f:
            r3.close()     // Catch:{ RemoteException -> 0x0070 }
        L_0x0042:
            boolean r0 = r2.isEmpty()     // Catch:{ RemoteException -> 0x0070 }
            if (r0 == 0) goto L_0x005a
            X.3ZN r1 = r11.A03     // Catch:{ RemoteException -> 0x0070 }
            java.lang.String r3 = r9.name()     // Catch:{ RemoteException -> 0x0070 }
            java.lang.String r4 = r10.name()     // Catch:{ RemoteException -> 0x0070 }
            java.lang.Integer r2 = X.AnonymousClass006.A0N     // Catch:{ RemoteException -> 0x0070 }
            java.lang.String r5 = "LITE_PROVIDER"
            r1.A05(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x0070 }
            return
        L_0x005a:
            r7.addAll(r2)     // Catch:{ RemoteException -> 0x0070 }
            X.3ZN r3 = r11.A03     // Catch:{ RemoteException -> 0x0070 }
            java.lang.String r2 = r9.name()     // Catch:{ RemoteException -> 0x0070 }
            java.lang.String r1 = r10.name()     // Catch:{ RemoteException -> 0x0070 }
            java.lang.String r0 = "LITE_PROVIDER"
            r3.A0E(r2, r1, r0, r6)     // Catch:{ RemoteException -> 0x0070 }
            r4.close()     // Catch:{ RemoteException -> 0x0070 }
            return
        L_0x0070:
            X.3ZN r0 = r11.A03
            java.lang.String r2 = r9.name()
            java.lang.String r3 = r10.name()
            java.lang.Integer r1 = X.AnonymousClass006.A15
            r5 = 0
            java.lang.String r4 = "LITE_PROVIDER"
            r0.A05(r1, r2, r3, r4, r5)
            return
        L_0x0083:
            X.3ZN r0 = r11.A03
            java.lang.String r2 = r9.name()
            java.lang.String r3 = r10.name()
            java.lang.Integer r1 = X.AnonymousClass006.A0u
            r5 = 0
            java.lang.String r4 = "LITE_PROVIDER"
            r0.A05(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63053bO.A03(android.content.Context, java.util.List, X.3Yb, X.24m, X.24G, X.3bO):void");
    }
}
