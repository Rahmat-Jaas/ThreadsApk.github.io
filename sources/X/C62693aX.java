package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.3aX  reason: invalid class name and case insensitive filesystem */
public final class C62693aX {
    public C29371xr A00;
    public AnonymousClass369 A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final C22302CTd A04;
    public final UserSession A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public static AnonymousClass4MA A00(C62693aX r2, int i, int i2) {
        return new AnonymousClass4MA((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r2, i), i2);
    }

    public static void A01(C62693aX r4) {
        UserSession userSession = r4.A05;
        C22302CTd cTd = r4.A04;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(cTd, userSession), "ig_camera_clips_open_controls"), 881);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(C171799zz.A2l, "entry_point");
            A0I.A0T("camera_session_id", (String) null);
            A0I.A0O(AnonymousClass6BO.ACTION, "event_type");
            C18240wQ.A15(A0I, cTd.getModuleName());
            C18240wQ.A13(D3Q.NO_CAMERA_SESSION, A0I);
            A0I.A0Q("is_crosspost", (Boolean) null);
            A0I.Bb4();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: X.3Xk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.3Xk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.4MA} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r1 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03bd, code lost:
        r0 = r2.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0120, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0122, code lost:
        r1.A04 = r0;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0124, code lost:
        if (r17 == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        r1.A02 = r13.A03.getDrawable(com.instagram.barcelona.R.drawable.instagram_story_mention_pano_outline_24);
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r14, java.util.List r15, boolean r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            if (r16 == 0) goto L_0x0008
            r0 = 2131827928(0x7f111cd8, float:1.9288782E38)
            X.C63613hu.A04(r15, r0)
        L_0x0008:
            com.instagram.service.session.UserSession r8 = r13.A05
            X.CTd r7 = r13.A04
            X.367 r9 = new X.367
            r9.<init>(r13)
            java.lang.String r10 = r13.A06
            boolean r11 = r13.A07
            boolean r12 = r13.A02
            X.1xr r6 = new X.1xr
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A00 = r6
            if (r17 == 0) goto L_0x0025
            r0 = 2131232771(0x7f080803, float:1.808166E38)
            r6.A03 = r0
        L_0x0025:
            r15.add(r6)
            if (r16 == 0) goto L_0x0033
            X.C63273h9.A03(r15)
            r0 = 2131835554(0x7f113aa2, float:1.930425E38)
            X.C63613hu.A04(r15, r0)
        L_0x0033:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36313299947619749(0x8102c1000005a5, double:3.028015336572475E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x007d
            r4 = 2131829644(0x7f11238c, float:1.9292263E38)
            r1 = 198(0xc6, float:2.77E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = new com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1
            r0.<init>((X.C62693aX) r13, (int) r1)
            X.3Xk r2 = new X.3Xk
            r2.<init>((android.view.View.OnClickListener) r0, (int) r4)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r8)
            X.MeW r0 = r0.A05
            java.lang.Boolean r0 = r0.As2()
            if (r0 == 0) goto L_0x0064
            boolean r1 = r0.booleanValue()
            r0 = 2131831986(0x7f112cb2, float:1.9297013E38)
            if (r1 != 0) goto L_0x0067
        L_0x0064:
            r0 = 2131831950(0x7f112c8e, float:1.929694E38)
        L_0x0067:
            java.lang.String r0 = r7.getString(r0)
            r2.A04 = r0
            if (r17 == 0) goto L_0x007a
            androidx.fragment.app.FragmentActivity r1 = r13.A03
            r0 = 2131232746(0x7f0807ea, float:1.808161E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A02 = r0
        L_0x007a:
            r15.add(r2)
        L_0x007d:
            r0 = 2342155956973995235(0x2081026f000004e3, double:4.059606179197576E-152)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 != 0) goto L_0x0093
            r0 = 36312947761153252(0x81026f000d04e4, double:3.027792612432921E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x00a6
        L_0x0093:
            r1 = 2131831620(0x7f112b44, float:1.929627E38)
            r0 = 189(0xbd, float:2.65E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x00a3
            r0 = 2131232587(0x7f08074b, float:1.8081287E38)
            r1.A01 = r0
        L_0x00a3:
            r15.add(r1)
        L_0x00a6:
            r6 = 2131824171(0x7f110e2b, float:1.9281162E38)
            X.0Ok r4 = X.C06810aP.A01
            X.9tz r0 = X.C18200wM.A0a(r8, r4)
            X.9tz r5 = X.C169839tz.PrivacyStatusPublic
            if (r0 != r5) goto L_0x03d2
            r1 = 194(0xc2, float:2.72E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = new com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1
            r0.<init>((X.C62693aX) r13, (int) r1)
            X.3Xk r2 = new X.3Xk
            r2.<init>((android.view.View.OnClickListener) r0, (int) r6)
            android.content.Context r1 = r7.getContext()
            com.instagram.user.model.User r0 = r4.A01(r8)
            com.instagram.api.schemas.CommentAudienceControlType r0 = r0.A0F()
            java.lang.String r0 = X.C54512zZ.A00(r1, r0)
            r2.A04 = r0
            if (r17 == 0) goto L_0x00de
            androidx.fragment.app.FragmentActivity r1 = r13.A03
            r0 = 2131232486(0x7f0806e6, float:1.8081083E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A02 = r0
        L_0x00de:
            r15.add(r2)
            r1 = 2131832740(0x7f112fa4, float:1.9298542E38)
            r0 = 190(0xbe, float:2.66E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x00f1
            r0 = 2131232841(0x7f080849, float:1.8081803E38)
            r1.A01 = r0
        L_0x00f1:
            r15.add(r1)
            X.MeW r0 = X.C18240wQ.A0W(r8, r4)
            java.lang.String r0 = r0.AQO()
            r2 = 2131830391(0x7f112677, float:1.9293778E38)
            if (r0 == 0) goto L_0x03c3
            r1 = 202(0xca, float:2.83E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = new com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1
            r0.<init>((X.C62693aX) r13, (int) r1)
            X.3Xk r1 = new X.3Xk
            r1.<init>((android.view.View.OnClickListener) r0, (int) r2)
            android.content.Context r2 = r7.getContext()
            X.MeW r0 = X.C18240wQ.A0W(r8, r4)
            java.lang.String r6 = r0.AQO()
            int r0 = r6.hashCode()
            switch(r0) {
                case -1990355071: goto L_0x039a;
                case 109935: goto L_0x03a6;
                case 281977195: goto L_0x03b2;
                default: goto L_0x0120;
            }
        L_0x0120:
            java.lang.String r0 = ""
        L_0x0122:
            r1.A04 = r0
            if (r17 == 0) goto L_0x0131
            androidx.fragment.app.FragmentActivity r2 = r13.A03
            r0 = 2131233063(0x7f080927, float:1.8082253E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r1.A02 = r0
        L_0x0131:
            r15.add(r1)
            r1 = 2131835586(0x7f113ac2, float:1.9304315E38)
            r0 = 204(0xcc, float:2.86E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0144
            r0 = 2131232844(0x7f08084c, float:1.8081809E38)
            r1.A01 = r0
        L_0x0144:
            r15.add(r1)
            r2 = 0
            X.C04220Ms.A0B(r8, r2)
            r0 = 36319153988047830(0x810814000013d6, double:3.031717455311522E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x0169
            r1 = 2131834310(0x7f1135c6, float:1.9301727E38)
            r0 = 206(0xce, float:2.89E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0166
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            r1.A01 = r0
        L_0x0166:
            r15.add(r1)
        L_0x0169:
            X.9tz r0 = X.C18200wM.A0a(r8, r4)
            if (r0 != r5) goto L_0x0182
            r1 = 2131835533(0x7f113a8d, float:1.9304207E38)
            r0 = 207(0xcf, float:2.9E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x017f
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            r1.A01 = r0
        L_0x017f:
            r15.add(r1)
        L_0x0182:
            r1 = 2131829932(0x7f1124ac, float:1.9292847E38)
            r0 = 205(0xcd, float:2.87E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0192
            r0 = 2131232754(0x7f0807f2, float:1.8081626E38)
            r1.A01 = r0
        L_0x0192:
            r15.add(r1)
            if (r18 == 0) goto L_0x01aa
            r1 = 2131821742(0x7f1104ae, float:1.9276236E38)
            r0 = 184(0xb8, float:2.58E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x01a7
            r0 = 2131232600(0x7f080758, float:1.8081314E38)
            r1.A01 = r0
        L_0x01a7:
            r15.add(r1)
        L_0x01aa:
            r0 = 36316503993224345(0x8105ab00000c99, double:3.0300415879144774E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x0385
            X.9tz r1 = X.C18200wM.A0a(r8, r4)
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            if (r1 != r0) goto L_0x0385
        L_0x01bd:
            X.4Xs r1 = X.AnonymousClass4Xs.A00
            java.lang.Class<X.363> r0 = X.AnonymousClass363.class
            java.lang.Object r0 = r8.A01(r0, r1)
            X.363 r0 = (X.AnonymousClass363) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01de
            r1 = 2131829144(0x7f112198, float:1.9291249E38)
            r0 = 183(0xb7, float:2.56E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x01db
            r0 = 2131233005(0x7f0808ed, float:1.8082135E38)
            r1.A01 = r0
        L_0x01db:
            r15.add(r1)
        L_0x01de:
            r1 = 2131827929(0x7f111cd9, float:1.9288784E38)
            r0 = 182(0xb6, float:2.55E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x01ee
            r0 = 2131233125(0x7f080965, float:1.8082379E38)
            r1.A01 = r0
        L_0x01ee:
            r15.add(r1)
            r1 = 2131830498(0x7f1126e2, float:1.9293995E38)
            r0 = 186(0xba, float:2.6E-43)
            X.4MA r5 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x020a
            boolean r1 = X.C35242Mr.A00(r8)
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            if (r1 == 0) goto L_0x0208
            r0 = 2131232248(0x7f0805f8, float:1.80806E38)
        L_0x0208:
            r5.A01 = r0
        L_0x020a:
            r15.add(r5)
            com.instagram.user.model.User r0 = r4.A01(r8)
            boolean r0 = r0.BZi()
            if (r0 == 0) goto L_0x0235
            r0 = 36319205527655402(0x810820000013ea, double:3.031750049166884E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x0235
            r1 = 2131822918(0x7f110946, float:1.927862E38)
            r0 = 185(0xb9, float:2.59E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0232
            r0 = 2131233161(0x7f080989, float:1.8082452E38)
            r1.A01 = r0
        L_0x0232:
            r15.add(r1)
        L_0x0235:
            X.H7n r0 = X.AnonymousClass3WI.A00(r8)
            X.4UE r0 = r0.A0F
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x024f
            X.49L r0 = X.AnonymousClass2MV.A00(r8)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x026e
        L_0x024f:
            X.49L r0 = X.AnonymousClass2MV.A00(r8)
            boolean r4 = r0.A02()
            r1 = 2131826833(0x7f111891, float:1.9286562E38)
            r0 = 188(0xbc, float:2.63E-43)
            if (r4 == 0) goto L_0x0260
            r0 = 187(0xbb, float:2.62E-43)
        L_0x0260:
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x026b
            r0 = 2131232281(0x7f080619, float:1.8080667E38)
            r1.A01 = r0
        L_0x026b:
            r15.add(r1)
        L_0x026e:
            if (r16 == 0) goto L_0x0279
            X.C63273h9.A03(r15)
            r0 = 2131835535(0x7f113a8f, float:1.9304211E38)
            X.C63613hu.A04(r15, r0)
        L_0x0279:
            X.JXd r0 = X.C36480JXd.A02
            if (r0 == 0) goto L_0x0299
            r0 = 2131834935(0x7f113837, float:1.9302994E38)
            java.lang.String r4 = r7.getString(r0)
            r1 = 197(0xc5, float:2.76E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = new com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1
            r0.<init>((X.C62693aX) r13, (int) r1)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r4)
            if (r17 == 0) goto L_0x0296
            r0 = 2131232935(0x7f0808a7, float:1.8081993E38)
            r1.A01 = r0
        L_0x0296:
            r15.add(r1)
        L_0x0299:
            r1 = 2131827930(0x7f111cda, float:1.9288787E38)
            r0 = 200(0xc8, float:2.8E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x02a9
            r0 = 2131232463(0x7f0806cf, float:1.8081036E38)
            r1.A01 = r0
        L_0x02a9:
            r15.add(r1)
            r1 = 2131831618(0x7f112b42, float:1.9296267E38)
            r0 = 201(0xc9, float:2.82E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x02bc
            r0 = 2131232228(0x7f0805e4, float:1.808056E38)
            r1.A01 = r0
        L_0x02bc:
            r15.add(r1)
            r1 = 2131820898(0x7f110162, float:1.9274524E38)
            r0 = 196(0xc4, float:2.75E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x02cf
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
            r1.A01 = r0
        L_0x02cf:
            r15.add(r1)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r0 = 36315202618132949(0x81047c000009d5, double:3.0292185930664617E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x0326
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)
            java.lang.String r0 = "user_consent_query_loaded"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0326
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)
            java.lang.String r0 = "user_consent_query_first_party_tracking"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0326
            r0 = 36316409504074848(0x81059500020c60, double:3.029981832595858E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 != 0) goto L_0x0326
            r1 = 2131835539(0x7f113a93, float:1.930422E38)
            r0 = 191(0xbf, float:2.68E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0314
            r0 = 2131232493(0x7f0806ed, float:1.8081097E38)
            r1.A01 = r0
        L_0x0314:
            r4.add(r1)
            if (r14 == 0) goto L_0x0326
            X.3hC r1 = new X.3hC
            r1.<init>((java.lang.CharSequence) r14)
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
            r1.A00 = r0
            r4.add(r1)
        L_0x0326:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x033d
            r1 = 2131835540(0x7f113a94, float:1.9304221E38)
            r0 = 192(0xc0, float:2.69E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x033a
            r0 = 2131232370(0x7f080672, float:1.8080847E38)
            r1.A01 = r0
        L_0x033a:
            r4.add(r1)
        L_0x033d:
            r0 = 36316409504074848(0x81059500020c60, double:3.029981832595858E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x0366
            r0 = 36316409504533607(0x81059500090c67, double:3.029981832885979E-306)
            boolean r0 = X.C63803iN.A0E(r3, r8, r0)
            if (r0 == 0) goto L_0x0366
            r1 = 2131821453(0x7f11038d, float:1.927565E38)
            r0 = 199(0xc7, float:2.79E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0363
            r0 = 2131232525(0x7f08070d, float:1.8081162E38)
            r1.A01 = r0
        L_0x0363:
            r4.add(r1)
        L_0x0366:
            if (r16 == 0) goto L_0x0381
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0381
            r1 = 2131835538(0x7f113a92, float:1.9304217E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r4.add(r2, r0)
            X.3h9 r0 = new X.3h9
            r0.<init>()
            r4.add(r2, r0)
        L_0x0381:
            r15.addAll(r4)
            return
        L_0x0385:
            r1 = 2131828235(0x7f111e0b, float:1.9289405E38)
            r0 = 193(0xc1, float:2.7E-43)
            X.4MA r1 = A00(r13, r0, r1)
            if (r17 == 0) goto L_0x0395
            r0 = 2131232647(0x7f080787, float:1.808141E38)
            r1.A01 = r0
        L_0x0395:
            r15.add(r1)
            goto L_0x01bd
        L_0x039a:
            java.lang.String r0 = "people_you_follow"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0120
            r0 = 2131835569(0x7f113ab1, float:1.930428E38)
            goto L_0x03bd
        L_0x03a6:
            java.lang.String r0 = "off"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0120
            r0 = 2131835568(0x7f113ab0, float:1.9304278E38)
            goto L_0x03bd
        L_0x03b2:
            java.lang.String r0 = "everyone"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0120
            r0 = 2131835566(0x7f113aae, float:1.9304274E38)
        L_0x03bd:
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0122
        L_0x03c3:
            r0 = 203(0xcb, float:2.84E-43)
            X.4MA r1 = A00(r13, r0, r2)
            if (r17 == 0) goto L_0x0131
            r0 = 2131233063(0x7f080927, float:1.8082253E38)
            r1.A01 = r0
            goto L_0x0131
        L_0x03d2:
            r0 = 195(0xc3, float:2.73E-43)
            X.4MA r2 = A00(r13, r0, r6)
            if (r17 == 0) goto L_0x00de
            r0 = 2131232486(0x7f0806e6, float:1.8081083E38)
            r2.A01 = r0
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62693aX.A03(java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }

    public C62693aX(C22302CTd cTd, UserSession userSession, String str, boolean z, boolean z2) {
        this.A04 = cTd;
        this.A05 = userSession;
        this.A03 = cTd.getActivity();
        userSession.getUserId();
        this.A06 = str;
        this.A07 = z;
        this.A08 = z2;
    }

    public static void A02(C62693aX r6) {
        UserSession userSession = r6.A05;
        C62423Zt.A02(userSession);
        C62423Zt.A03(userSession, "privacy", "comment_controls_entered");
        C63743iE A022 = C63743iE.A02("com.instagram.settings.privacy.comments", AnonymousClass0wJ.A0y());
        FragmentActivity fragmentActivity = r6.A03;
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18230wP.A1A(r6.A04, A0N, 2131824171);
        C63743iE.A07(fragmentActivity, A0N, A022);
    }
}
