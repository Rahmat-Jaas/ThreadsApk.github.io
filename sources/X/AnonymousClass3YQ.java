package X;

import java.util.ArrayList;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest;

/* renamed from: X.3YQ  reason: invalid class name */
public final class AnonymousClass3YQ {
    public final void A03(C10300i6 r8, AnonymousClass224 r9, String str, String str2) {
        C10300i6 r2 = r8;
        C04220Ms.A0B(r8, 1);
        String str3 = str;
        if (str != null) {
            AnonymousClass0gN.A00().AKp(new C25221mj(r2, r9, this, str3, str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.C63173fJ.A05(X.AnonymousClass0TJ.A05, 18300980202375710L) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(android.content.Context r35, java.lang.String r36, X.C562936n r37, X.AnonymousClass3ZN r38) {
        /*
            r34 = this;
            r22 = 1
            r0 = 3
            r8 = r36
            X.C04220Ms.A0B(r8, r0)
            r0 = 36317182598057484(0x81064900000e0c, double:3.030470740343477E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            if (r0 != 0) goto L_0x0021
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18300980202375710(0x4104a500010a1e, double:1.8933312221544143E-307)
            boolean r1 = X.C63173fJ.A05(r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r6 = 0
            if (r0 == 0) goto L_0x022d
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r2 = X.C18190wL.A0n(r0)
            java.lang.String r0 = "3.0"
            r7 = r38
            r7.A00 = r0
            r0 = 36317182598188557(0x81064900020e0d, double:3.030470740426368E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3 = r37
            if (r0 == 0) goto L_0x004f
            libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest r0 = A00(r3)
            java.util.List r1 = X.C54742zw.A00(r2, r8, r7, r0)
            boolean r0 = X.C18190wL.A1a(r1)
            if (r0 == 0) goto L_0x004f
            return r1
        L_0x004f:
            java.util.ArrayList r21 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r3.A00
            java.util.Iterator r20 = r0.iterator()
        L_0x0059:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r1 = r20.next()
            X.C04220Ms.A06(r1)
            X.3Bv r1 = (X.C57633Bv) r1
            X.24m r0 = r1.A01
            r32 = r0
            java.lang.String r2 = r32.name()
            X.24G r0 = r1.A02
            r31 = r0
            java.lang.String r1 = r31.name()
            java.lang.String r9 = "resolver_type"
            java.lang.String r5 = "default"
            java.util.Map r0 = X.AnonymousClass3ZN.A00(r9, r5, r7)
            r7.A0D(r2, r1, r8, r0)
            X.3Cf r0 = new X.3Cf
            r0.<init>()
            X.3bO r12 = new X.3bO
            r12.<init>(r0)
            java.util.ArrayList r19 = X.AnonymousClass0wJ.A0v()
            X.22y r3 = X.C61923Wj.A02(r32)
            if (r3 == 0) goto L_0x0211
            X.24G r18 = X.AnonymousClass24G.SAVED_ACCOUNTS
            r33 = r35
            r1 = r31
            r0 = r18
            if (r1 != r0) goto L_0x018d
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.4tb r11 = r12.A02
            r11.onStart()
            r11.Bkl(r0)
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = X.C60983Rj.A00
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x00bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c5
            X.C62273Yb.A00(r3, r2, r1)
            goto L_0x00bb
        L_0x00c5:
            java.util.Iterator r17 = r2.iterator()
        L_0x00c9:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r4 = r17.next()
            X.3Yb r4 = (X.C62273Yb) r4
            r11.Blm(r4)
            r0 = r33
            android.content.ContentProviderClient r2 = X.C63053bO.A00(r0, r4, r12)
            if (r2 == 0) goto L_0x0188
            r11.CLo(r4)
            X.3YU r0 = r12.A01     // Catch:{ RemoteException -> 0x0182 }
            r30 = r0
            X.22y r14 = r4.A04     // Catch:{ RemoteException -> 0x0182 }
            X.22y r0 = X.C307822y.A04     // Catch:{ RemoteException -> 0x0182 }
            if (r14 != r0) goto L_0x00fc
            X.24G r1 = X.AnonymousClass24G.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ RemoteException -> 0x0182 }
            r0 = r30
            java.util.List r3 = r0.A02(r2, r4, r1, r11)     // Catch:{ RemoteException -> 0x0182 }
        L_0x00f5:
            r10.addAll(r3)     // Catch:{ RemoteException -> 0x0182 }
            r11.CLl(r4)     // Catch:{ RemoteException -> 0x0182 }
            goto L_0x00c9
        L_0x00fc:
            android.database.Cursor r13 = X.AnonymousClass3YU.A00(r2, r6, r4, r11)     // Catch:{ RemoteException -> 0x0182 }
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()     // Catch:{ RemoteException -> 0x0182 }
            if (r13 == 0) goto L_0x00f5
            boolean r0 = r13.moveToNext()     // Catch:{ RemoteException -> 0x0182 }
            if (r0 == 0) goto L_0x00f5
            r0 = r22
            java.lang.String r0 = r13.getString(r0)     // Catch:{ JSONException -> 0x0174 }
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()     // Catch:{ JSONException -> 0x0174 }
            if (r0 == 0) goto L_0x012e
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0174 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0174 }
            r1 = 0
        L_0x011e:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0174 }
            if (r1 >= r0) goto L_0x012e
            java.lang.Object r0 = r2.get(r1)     // Catch:{ JSONException -> 0x0174 }
            X.C18210wN.A1O(r0, r15)     // Catch:{ JSONException -> 0x0174 }
            int r1 = r1 + 1
            goto L_0x011e
        L_0x012e:
            java.util.Iterator r16 = r15.iterator()     // Catch:{ JSONException -> 0x0174 }
        L_0x0132:
            boolean r0 = r16.hasNext()     // Catch:{ JSONException -> 0x0174 }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = X.C18180wK.A0k(r16)     // Catch:{ JSONException -> 0x0174 }
            org.json.JSONObject r1 = X.C18250wR.A0j(r0)     // Catch:{ JSONException -> 0x0174 }
            java.lang.String r0 = "profile"
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0174 }
            java.lang.String r0 = "uid"
            java.lang.String r24 = r2.getString(r0)     // Catch:{ JSONException -> 0x0174 }
            java.lang.String r0 = "access_token"
            java.lang.String r25 = r1.getString(r0)     // Catch:{ JSONException -> 0x0174 }
            java.lang.String r26 = "FACEBOOK"
            java.util.Map r0 = X.AnonymousClass3YU.A00     // Catch:{ JSONException -> 0x0174 }
            java.lang.Object r1 = r0.get(r14)     // Catch:{ JSONException -> 0x0174 }
            X.24m r1 = (X.C311624m) r1     // Catch:{ JSONException -> 0x0174 }
            X.4W5 r15 = new X.4W5     // Catch:{ JSONException -> 0x0174 }
            r0 = r30
            r15.<init>(r0, r2)     // Catch:{ JSONException -> 0x0174 }
            X.3HZ r0 = new X.3HZ     // Catch:{ JSONException -> 0x0174 }
            r23 = r0
            r27 = r15
            r28 = r1
            r29 = r18
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x0174 }
            r3.add(r0)     // Catch:{ JSONException -> 0x0174 }
            goto L_0x0132
        L_0x0174:
            r0 = move-exception
            r11.CLj(r0, r4)     // Catch:{ all -> 0x017d }
        L_0x0178:
            r13.close()     // Catch:{ RemoteException -> 0x0182 }
            goto L_0x00f5
        L_0x017d:
            r0 = move-exception
            r13.close()     // Catch:{ RemoteException -> 0x0182 }
            throw r0     // Catch:{ RemoteException -> 0x0182 }
        L_0x0182:
            r0 = move-exception
            r11.CLj(r0, r4)
            goto L_0x00c9
        L_0x0188:
            r11.CLn(r6, r4)
            goto L_0x00c9
        L_0x018d:
            java.util.List r2 = java.util.Collections.singletonList(r3)
            X.4tb r10 = r12.A02
            r10.onStart()
            java.util.ArrayList r0 = X.C18200wM.A0s(r2)
            r10.Bkl(r0)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.3E0 r1 = r12.A04
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            java.util.List r0 = r1.A00(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x01b0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r3 = r11.next()
            X.3Yb r3 = (X.C62273Yb) r3
            r10.Blm(r3)
            r0 = r33
            android.content.ContentProviderClient r2 = X.C63053bO.A00(r0, r3, r12)
            if (r2 == 0) goto L_0x01eb
            r10.CLo(r3)
            X.3YU r1 = r12.A01     // Catch:{ RemoteException -> 0x01e6 }
            X.24G r0 = X.AnonymousClass24G.ACTIVE_ACCOUNT     // Catch:{ RemoteException -> 0x01e6 }
            java.util.List r1 = r1.A02(r2, r3, r0, r10)     // Catch:{ RemoteException -> 0x01e6 }
            boolean r0 = r1.isEmpty()     // Catch:{ RemoteException -> 0x01e6 }
            if (r0 == 0) goto L_0x01dc
            r10.CLk(r3)     // Catch:{ RemoteException -> 0x01e6 }
            goto L_0x01b0
        L_0x01dc:
            r4.addAll(r1)     // Catch:{ RemoteException -> 0x01e6 }
            r10.CLl(r3)     // Catch:{ RemoteException -> 0x01e6 }
            r2.close()     // Catch:{ RemoteException -> 0x01e6 }
            goto L_0x01b0
        L_0x01e6:
            r0 = move-exception
            r10.CLj(r0, r3)
            goto L_0x01b0
        L_0x01eb:
            r10.CLn(r6, r3)
            goto L_0x01b0
        L_0x01ef:
            java.util.List r10 = java.util.Collections.unmodifiableList(r4)
        L_0x01f3:
            r0 = r19
            r0.addAll(r10)
            boolean r0 = r19.isEmpty()
            java.lang.String r2 = r32.toString()
            if (r0 == 0) goto L_0x021a
            java.lang.String r3 = r31.toString()
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            java.util.Map r5 = X.AnonymousClass3ZN.A00(r9, r5, r7)
            r0 = r7
            r4 = r8
            r0.A05(r1, r2, r3, r4, r5)
        L_0x0211:
            r1 = r21
            r0 = r19
            r1.addAll(r0)
            goto L_0x0059
        L_0x021a:
            java.lang.String r1 = r31.toString()
            java.util.Map r0 = X.AnonymousClass3ZN.A00(r9, r5, r7)
            r7.A0E(r2, r1, r8, r0)
            goto L_0x0211
        L_0x0226:
            boolean r0 = X.C18250wR.A1K(r21)
            if (r0 == 0) goto L_0x022d
            return r21
        L_0x022d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YQ.A02(android.content.Context, java.lang.String, X.36n, X.3ZN):java.util.List");
    }

    public static ReplicatedStorageRequest A00(C562936n r6) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C57633Bv r0 : r6.A00) {
            A0v.add(new C61243Sl(r0.A00, r0.A01, r0.A02));
        }
        return new ReplicatedStorageRequest(A0v);
    }
}
