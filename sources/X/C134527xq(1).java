package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDListenerShape34S1200000_2_I2;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: X.7xq  reason: invalid class name and case insensitive filesystem */
public final class C134527xq implements C2J {
    public AnonymousClass3TR A00;
    public final J58 A01 = new J58();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.BZI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bfj(android.content.Context r16, X.C11630kW r17, com.instagram.service.session.UserSession r18, java.util.List r19, java.util.Set r20, int r21) {
        /*
            r15 = this;
            r3 = 0
            r9 = r18
            X.C04220Ms.A0B(r9, r3)
            r2 = 1
            r0 = 2
            r8 = r17
            r6 = r20
            X.C18180wK.A1Q(r8, r0, r6)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00c1
            r4 = r19
            if (r19 == 0) goto L_0x00c1
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00c1
            X.0TJ r5 = X.AnonymousClass0TJ.A06
            r0 = 36322594256854454(0x810b3500001db6, double:3.0338930951576815E-306)
            boolean r0 = X.C63803iN.A0E(r5, r9, r0)
            if (r0 == 0) goto L_0x00c1
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36885544210465184(0x830b35000301a0, double:3.3899049126386225E-306)
            java.lang.String r14 = X.C63803iN.A0C(r5, r9, r0)
            java.util.Iterator r7 = r6.iterator()
        L_0x003b:
            boolean r0 = r7.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.Object r5 = r7.next()
            r0 = r5
            X.BZI r0 = (X.BZI) r0
            com.instagram.user.model.User r0 = r0.A0J
            if (r0 == 0) goto L_0x0051
            java.lang.String r6 = r0.getId()
        L_0x0051:
            java.lang.Object r0 = r4.get(r3)
            long r0 = X.C18190wL.A08(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C04220Ms.A0I(r6, r0)
            if (r0 == 0) goto L_0x003b
            r6 = r5
        L_0x0064:
            X.BZI r6 = (X.BZI) r6
            if (r6 == 0) goto L_0x00c1
            com.instagram.user.model.User r10 = r6.A0J
            if (r10 == 0) goto L_0x00c1
            java.lang.String r0 = "toast"
            boolean r0 = r14.equals(r0)
            r12 = r15
            r7 = r16
            if (r0 == 0) goto L_0x00c2
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r13 = X.C18190wL.A0n(r0)
            X.79D r11 = new X.79D
            r11.<init>(r8, r9)
            X.3iD r1 = new X.3iD
            r1.<init>()
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.A01 = r0
            r0 = r21
            r1.A02 = r0
            r3 = 2131837507(0x7f114243, float:1.930821E38)
            java.lang.String r0 = r10.BK7()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r7, r0, r3)
            r1.A0A = r0
            r0 = 2131837506(0x7f114242, float:1.9308209E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r7, r0)
            r1.A0D = r0
            X.22b r0 = X.AnonymousClass22b.ICON
            r1.A0E(r0)
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r1.A03 = r0
            X.7vy r6 = new X.7vy
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A07 = r6
            r1.A0I = r2
            X.C63733iD.A0A(r1)
        L_0x00c1:
            return
        L_0x00c2:
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00c1
            r0 = 558(0x22e, float:7.82E-43)
            java.lang.String r5 = X.I17.A00(r0)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r15
            r6 = r14
            A00(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134527xq.Bfj(android.content.Context, X.0kW, com.instagram.service.session.UserSession, java.util.List, java.util.Set, int):void");
    }

    public final void Bfk(Context context, C11630kW r14, UserSession userSession, C170759vW r16) {
        C04220Ms.A0B(userSession, 0);
        C170759vW r6 = r16;
        C04220Ms.A0B(r6, 3);
        if (C28161tl.A04(userSession).getInt("contact_point_update_upsells_view_count", 0) < 2) {
            C972868t r7 = C972868t.CONTACT_POINT_UPDATE;
            if (!C102506Vl.A00(r7).A01(userSession) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321048068626912L)) {
                String A0n = C18190wL.A0n(UUID.randomUUID());
                AnonymousClass79D r5 = new AnonymousClass79D(r14, userSession);
                AnonymousClass694 r4 = AnonymousClass694.VULNERABLE_PHONE;
                r5.A01(r6, r7, AnonymousClass006.A01, AnonymousClass006.A00, A0n, C18220wO.A0y());
                C102506Vl.A00(r7).A00(userSession);
                SharedPreferences A04 = C28161tl.A04(userSession);
                A04.edit().putInt("contact_point_update_upsells_view_count", A04.getInt("contact_point_update_upsells_view_count", 0) + 1).apply();
                C37032Jj9 jj9 = new C37032Jj9(userSession);
                jj9.A0J = new IDxDListenerShape34S1200000_2_I2(r6, r5, A0n, 0);
                C37383Jqm A002 = jj9.A00();
                C94805wm r2 = new C94805wm();
                Bundle A06 = C18180wK.A06();
                A06.putString(C86144wL.A0n(), A0n);
                A06.putSerializable("entrypoint", r6);
                A06.putSerializable("copy_version", r4);
                r2.setArguments(A06);
                C37383Jqm.A00(context, r2, A002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0073, code lost:
        if (r7 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bfq(android.content.Context r25, X.C11630kW r26, com.instagram.service.session.UserSession r27, com.instagram.user.model.User r28, X.C170759vW r29, java.lang.String r30) {
        /*
            r24 = this;
            r11 = 0
            r6 = 1
            r10 = 2
            r5 = 3
            r23 = r29
            r0 = r23
            X.C04220Ms.A0B(r0, r5)
            X.68t r18 = X.C972868t.UNLIKED_YOUR_ACTIVITY
            X.6s8 r0 = X.C102506Vl.A00(r18)
            r4 = r27
            boolean r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x01a5
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r15 = X.C18190wL.A0n(r0)
            X.79D r14 = new X.79D
            r0 = r26
            r14.<init>(r0, r4)
            long r0 = X.C18190wL.A07()
            java.lang.String r3 = X.C86134wK.A0p(r28)
            com.instagram.wellbeing.upsells.constants.UnlikeData r9 = new com.instagram.wellbeing.upsells.constants.UnlikeData
            r17 = r30
            r2 = r17
            r9.<init>(r0, r2, r3)
            android.content.SharedPreferences r0 = X.C28161tl.A04(r4)     // Catch:{ 6Cb -> 0x00c0 }
            java.lang.String r13 = "unliked_your_activity_upsells_unlike_data"
            r12 = 0
            java.lang.String r8 = r0.getString(r13, r12)     // Catch:{ 6Cb -> 0x00c0 }
            if (r8 == 0) goto L_0x0075
            X.Kq4 r7 = X.C36975Ji8.A03     // Catch:{ 6Cb -> 0x00c0 }
            X.76V r3 = r7.A02     // Catch:{ 6Cb -> 0x00c0 }
            java.lang.Class<com.instagram.wellbeing.upsells.constants.UnlikeData> r0 = com.instagram.wellbeing.upsells.constants.UnlikeData.class
            X.0FL r1 = X.C86154wM.A16(r0)     // Catch:{ 6Cb -> 0x00c0 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            X.0Ai r2 = X.C18210wN.A0l(r0)     // Catch:{ 6Cb -> 0x00c0 }
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ 6Cb -> 0x00c0 }
            X.C04220Ms.A0B(r1, r10)     // Catch:{ 6Cb -> 0x00c0 }
            X.0AD r0 = new X.0AD     // Catch:{ 6Cb -> 0x00c0 }
            r0.<init>(r1, r12, r2, r11)     // Catch:{ 6Cb -> 0x00c0 }
            X.8sP r0 = X.AnonymousClass72C.A00(r0, r3)     // Catch:{ 6Cb -> 0x00c0 }
            java.lang.Object r1 = r7.A00(r8, r0)     // Catch:{ 6Cb -> 0x00c0 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.wellbeing.upsells.constants.UnlikeData>"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ 6Cb -> 0x00c0 }
            java.util.List r7 = X.C03940Lk.A01(r1)     // Catch:{ 6Cb -> 0x00c0 }
            if (r7 != 0) goto L_0x0079
        L_0x0075:
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()     // Catch:{ 6Cb -> 0x00c0 }
        L_0x0079:
            int r0 = r7.size()
            if (r0 < r5) goto L_0x0082
            r7.remove(r11)
        L_0x0082:
            r7.add(r9)
            X.1tl r16 = X.AnonymousClass3WS.A01(r4)
            X.Kq4 r8 = X.C36975Ji8.A03
            X.76V r3 = r8.A02
            java.lang.Class<com.instagram.wellbeing.upsells.constants.UnlikeData> r0 = com.instagram.wellbeing.upsells.constants.UnlikeData.class
            X.0FL r1 = X.C86154wM.A16(r0)
            java.lang.Class<java.util.List> r0 = java.util.List.class
            X.0Ai r2 = X.C18210wN.A0l(r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            X.C04220Ms.A0B(r1, r10)
            X.0AD r0 = new X.0AD
            r0.<init>(r1, r12, r2, r11)
            X.0JX r9 = r0.A03
            java.util.List r2 = r0.A01
            X.0AD r1 = r0.A02
            X.0AD r0 = new X.0AD
            r0.<init>(r2, r1, r9, r10)
            X.8sP r0 = X.AnonymousClass72C.A00(r0, r3)
            java.lang.String r1 = r8.A01(r7, r0)
            android.content.SharedPreferences$Editor r0 = X.C28161tl.A02(r16)
            X.C18180wK.A0v(r0, r13, r1)
            goto L_0x00cc
        L_0x00c0:
            r2 = move-exception
            java.lang.String r1 = "UpsellsPluginImpl"
            java.lang.String r0 = "Failed to parse unliked data from user preferences"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            java.util.List r7 = X.C18180wK.A0n(r9)
        L_0x00cc:
            int r0 = r7.size()
            if (r0 < r5) goto L_0x01a5
            java.util.List r0 = X.AnonymousClass00J.A0Q(r7, r5)
            java.lang.Object r8 = r0.get(r11)
            com.instagram.wellbeing.upsells.constants.UnlikeData r8 = (com.instagram.wellbeing.upsells.constants.UnlikeData) r8
            java.lang.Object r7 = r0.get(r6)
            com.instagram.wellbeing.upsells.constants.UnlikeData r7 = (com.instagram.wellbeing.upsells.constants.UnlikeData) r7
            java.lang.Object r9 = r0.get(r10)
            com.instagram.wellbeing.upsells.constants.UnlikeData r9 = (com.instagram.wellbeing.upsells.constants.UnlikeData) r9
            long r0 = r8.A00
            long r2 = r9.A00
            long r2 = r2 - r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r10 = r10.toSeconds(r0)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a5
            java.lang.String r2 = r8.A02
            java.lang.String r1 = r7.A02
            java.lang.String r0 = r9.A02
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.Set r0 = X.AnonymousClass4WM.A08(r0)
            int r0 = r0.size()
            if (r0 != r5) goto L_0x01a5
            java.lang.String r2 = r8.A01
            java.lang.String r1 = r7.A01
            java.lang.String r0 = r9.A01
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.Set r0 = X.AnonymousClass4WM.A08(r0)
            int r0 = r0.size()
            if (r0 != r6) goto L_0x01a5
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320390938892234(0x810934000417ca, double:3.032499708006324E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x01a5
            if (r28 == 0) goto L_0x01a5
            java.lang.String r6 = r28.getId()
            java.lang.String r7 = r28.BK7()
            if (r6 == 0) goto L_0x01a5
            if (r7 == 0) goto L_0x01a5
            X.6s8 r0 = X.C102506Vl.A00(r18)
            r0.A00(r4)
            java.lang.Integer r20 = X.AnonymousClass006.A00
            java.lang.String r5 = "author_id"
            kotlin.Pair r8 = X.C18180wK.A0p(r5, r6)
            java.lang.Integer r19 = X.AnonymousClass006.A01
            java.lang.String r3 = "author_username"
            kotlin.Pair r2 = X.C18180wK.A0p(r3, r7)
            java.lang.String r1 = "media_id"
            r0 = r17
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r8, r2, r0}
            java.util.Map r8 = X.AnonymousClass4WJ.A0I(r0)
            r21 = r15
            r22 = r8
            r16 = r14
            r17 = r23
            r16.A01(r17, r18, r19, r20, r21, r22)
            X.Jj9 r2 = new X.Jj9
            r2.<init>(r4)
            X.7xO r1 = new X.7xO
            r0 = r23
            r1.<init>(r0, r14, r15, r8)
            r2.A0J = r1
            X.Jqm r8 = r2.A00()
            X.5wo r4 = new X.5wo
            r4.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = X.C86144wL.A0n()
            r2.putString(r0, r15)
            java.lang.String r1 = "entrypoint"
            r0 = r23
            r2.putSerializable(r1, r0)
            r2.putString(r5, r6)
            r2.putString(r3, r7)
            r4.setArguments(r2)
            r0 = r25
            X.C37383Jqm.A00(r0, r4, r8)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134527xq.Bfq(android.content.Context, X.0kW, com.instagram.service.session.UserSession, com.instagram.user.model.User, X.9vW, java.lang.String):void");
    }

    public final void CtY(Context context, Fragment fragment, BKU bku, C21839C2o c2o, C20066BMj bMj, UserSession userSession, String str) {
        C25745DrH A0b;
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 0);
        C35196Ipm ipm = new C35196Ipm(bku, c2o, bMj, C170759vW.COMMENTS_CONTROLS, str);
        C37032Jj9 jj9 = new C37032Jj9(userSession2);
        jj9.A0O = context.getString(2131837484);
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (A0b = C18220wO.A0b(activity)) == null) {
            C10450iM.A03("UpsellsPluginImpl", I17.A00(388));
            return;
        }
        C37383Jqm A02 = C37383Jqm.A02(A0b);
        if (A02 != null) {
            Fragment A08 = A0b.A08();
            if (A08 != null) {
                ((BottomSheetFragment) A08).A0L(0);
            }
            jj9.A0M = true;
            jj9.A00 = 0.7f;
            A02.A09(ipm, jj9);
            return;
        }
        C18200wM.A16(context, ipm, jj9);
    }

    public /* synthetic */ C134527xq(C102506Vl r2, J58 j58, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public static final void A00(Context context, C11630kW r12, UserSession userSession, User user, C134527xq r15, String str, String str2) {
        UserSession userSession2 = userSession;
        String str3 = str2;
        C134437xh r9 = new C134437xh(userSession, r15, str3);
        String moduleName = r12.getModuleName();
        String BK7 = user.BK7();
        C86104wH.A1P(moduleName, 2, BK7);
        C37090JkM.A00(context, (FragmentActivity) null, (C37383Jqm) null, (C37032Jj9) null, userSession2, user, r9, moduleName, str, BK7, (JSONObject) null);
        if (C04220Ms.A0I(str3, "bottom_sheet")) {
            A01(userSession2, AnonymousClass006.A01, "bottom_sheet");
        }
    }

    public static final void A01(UserSession userSession, Integer num, String str) {
        String str2;
        C145538kf r3 = AnonymousClass6Z0.A00;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A04();
        A0O.A0J(I17.A00(490));
        A0O.A0O("upsell_type", "block");
        if (num.intValue() != 0) {
            str2 = "seen";
        } else {
            str2 = "adopted";
        }
        A0O.A0O(C18170wI.A00(63), str2);
        if (str != null) {
            A0O.A0O(I17.A00(897), str);
        }
        r3.schedule(AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class));
    }

    public C134527xq() {
    }
}
