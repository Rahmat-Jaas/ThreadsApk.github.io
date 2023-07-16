package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.3Wi  reason: invalid class name and case insensitive filesystem */
public final class C61913Wi {
    public static void A00(Context context, C13330nS r16, C37383Jqm jqm, C37032Jj9 jj9, UserSession userSession, User user, C84404t5 r21, C307722x r22, C83204qx r23, String str, JSONObject jSONObject, boolean z) {
        Context context2 = context;
        if (context != null) {
            C25745DrH A02 = C25745DrH.A00.A02(context);
            UserSession userSession2 = userSession;
            C37383Jqm jqm2 = jqm;
            C37032Jj9 jj92 = jj9;
            User user2 = user;
            C307722x r11 = r22;
            JSONObject jSONObject2 = jSONObject;
            boolean z2 = z;
            if (C28161tl.A04(userSession2).getInt("restrict_info_bottomsheet_shown_count", 0) >= 1) {
                C13330nS r5 = r16;
                C84404t5 r10 = r21;
                String str2 = str;
                if (jqm == null || z) {
                    A01(context2, r5, jqm2, jj92, userSession2, user2, r10, r11, str2, jSONObject2);
                } else if (A02 != null) {
                    ((C35189Ipf) A02).A0B = new C72034Lu(context, r16, userSession2, user2, r10, r11, str2, jSONObject2);
                    A02.A0C();
                }
            } else {
                AnonymousClass1dG A00 = C36480JXd.A02.A01().A00(user2.B4M(), userSession2, r11, user2.getId(), user2.BK7(), jSONObject2, false, z2);
                A00.A05 = r23;
                if (jqm2 == null || jj92 == null || A02 == null || !((C35189Ipf) A02).A0M) {
                    C37032Jj9 A0L = C18210wN.A0L(userSession2);
                    A0L.A0J = null;
                    C18200wM.A16(context2, A00, A0L);
                    return;
                }
                jj92.A0I = A00;
                jqm2.A09(A00, jj92);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r20, X.C13330nS r21, X.C37383Jqm r22, X.C37032Jj9 r23, com.instagram.service.session.UserSession r24, com.instagram.user.model.User r25, X.C84404t5 r26, X.C307722x r27, java.lang.String r28, org.json.JSONObject r29) {
        /*
            r4 = r20
            X.Dsm r2 = X.C18190wL.A0W(r4)
            r1 = 2131834931(0x7f113833, float:1.9302986E38)
            r9 = r25
            java.lang.String r0 = r9.BK7()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r4, r0, r1)
            r2.A02 = r0
            r1 = 2131826195(0x7f111613, float:1.9285268E38)
            r0 = 41
            r5 = r21
            r11 = r27
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r5, r11, r9, r0)
            r2.A0P(r0, r1)
            r0 = 2131834929(0x7f113831, float:1.9302982E38)
            X.3jd r3 = new X.3jd
            r6 = r22
            r7 = r23
            r8 = r24
            r10 = r26
            r12 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.A0N(r3, r0)
            r1 = 10
            com.facebook.redex.IDxDListenerShape320S0100000_1_I2 r0 = new com.facebook.redex.IDxDListenerShape320S0100000_1_I2
            r0.<init>(r10, r1)
            r2.A0e(r0)
            int r0 = r11.ordinal()
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0053;
                case 2: goto L_0x004b;
                case 3: goto L_0x007b;
                case 4: goto L_0x004b;
                case 5: goto L_0x004b;
                case 6: goto L_0x004b;
                case 7: goto L_0x007b;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.String r1 = "restrict_error"
            java.lang.String r0 = "Entry point not supported for optimistic restrict flow."
            X.C10450iM.A03(r1, r0)
            return
        L_0x0053:
            r1 = 2131834926(0x7f11382e, float:1.9302976E38)
            java.lang.String r0 = r9.BK7()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r4, r0, r1)
            r2.A0p(r0)
            r1 = 2131834927(0x7f11382f, float:1.9302978E38)
            r0 = 189(0xbd, float:2.65E-43)
            X.C18180wK.A1N(r2, r10, r0, r1)
            goto L_0x0092
        L_0x006a:
            boolean r0 = X.C35432Nk.A00(r8)
            if (r0 == 0) goto L_0x0074
            r1 = 2131834908(0x7f11381c, float:1.930294E38)
            goto L_0x0087
        L_0x0074:
            r0 = 2131834928(0x7f113830, float:1.930298E38)
            r2.A0K(r0)
            goto L_0x0092
        L_0x007b:
            boolean r0 = X.C35432Nk.A00(r8)
            r1 = 2131834930(0x7f113832, float:1.9302984E38)
            if (r0 == 0) goto L_0x0087
            r1 = 2131834909(0x7f11381d, float:1.9302942E38)
        L_0x0087:
            java.lang.String r0 = r9.BK7()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r4, r0, r1)
            r2.A0p(r0)
        L_0x0092:
            X.JXd r13 = X.C36480JXd.A02
            r0 = r4
            androidx.core.app.ComponentActivity r0 = (androidx.core.app.ComponentActivity) r0
            X.06E r15 = X.AnonymousClass06E.A00(r0)
            java.lang.String r18 = r9.getId()
            if (r29 == 0) goto L_0x00bb
            java.lang.String r20 = r12.toString()
        L_0x00a5:
            X.4NI r17 = new X.4NI
            r21 = r17
            r22 = r4
            r23 = r5
            r24 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r19 = r28
            r14 = r4
            r16 = r8
            r13.A04(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x00bb:
            r20 = 0
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61913Wi.A01(android.content.Context, X.0nS, X.Jqm, X.Jj9, com.instagram.service.session.UserSession, com.instagram.user.model.User, X.4t5, X.22x, java.lang.String, org.json.JSONObject):void");
    }
}
