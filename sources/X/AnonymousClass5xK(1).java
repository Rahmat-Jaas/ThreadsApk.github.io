package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxSListenerShape786S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape26S0200000_I2_10;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.5xK  reason: invalid class name */
public final class AnonymousClass5xK extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "EventTimeSelectionBottomSheetFragment";
    public C30564GJu A00;
    public C30564GJu A01;
    public final C04530Oa A02 = AnonymousClass3W9.A00(this);
    public final C04530Oa A03 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(this, 43), new KtLambdaShape67S0100000_I2_47(this, 44), new KtLambdaShape26S0200000_I2_10(33, this, (Object) null), C18210wN.A0l(AnonymousClass10I.class));

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass4u2.A07(r3, 2131826878);
        C25764Drc drc = new C25764Drc();
        drc.A00 = R.drawable.instagram_x_pano_outline_24;
        AnonymousClass4u2.A03(drc, r3);
        r3.Crj(C18190wL.A0H(this, HttpStatus.SC_GONE), R.drawable.instagram_check_pano_filled_24);
    }

    public final String getModuleName() {
        return "event_time_selection_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass10I r3 = (AnonymousClass10I) this.A03.getValue();
        C86074wE r2 = r3.A03;
        do {
        } while (!r2.ADi(r2.getValue(), ((AnonymousClass17S) r3.A06.getValue()).A01));
        FragmentActivity requireActivity = requireActivity();
        C04530Oa r22 = this.A02;
        this.A01 = new C30564GJu(requireActivity, new IDxSListenerShape786S0100000_1_I2(this, 0), AnonymousClass0wJ.A0X(r22), AnonymousClass0wJ.A0k(requireContext(), 2131826896), (String) null, false, true);
        this.A00 = new C30564GJu(requireActivity(), new IDxSListenerShape786S0100000_1_I2(this, 1), AnonymousClass0wJ.A0X(r22), AnonymousClass0wJ.A0k(requireContext(), 2131826892), (String) null, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.7Wm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.7Wm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.7Wm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r73, androidx.compose.ui.Modifier r74, X.AnonymousClass5xK r75, int r76, int r77) {
        /*
            r71 = r74
            r1 = -1120519143(0xffffffffbd363c19, float:-0.044490907)
            r0 = r73
            r0.Cvd(r1)
            r74 = r77
            r1 = r77 & 1
            if (r1 == 0) goto L_0x0012
            X.7Wm r71 = androidx.compose.ui.Modifier.A00
        L_0x0012:
            android.content.Context r8 = X.C147188nY.A0T(r0)
            r73 = r75
            r1 = r73
            X.0Oa r1 = r1.A03
            java.lang.Object r1 = r1.getValue()
            X.10I r1 = (X.AnonymousClass10I) r1
            X.4wG r1 = r1.A05
            r33 = 0
            r7 = 1
            X.4oM r31 = X.AnonymousClass7Aj.A01(r0, r1)
            r1 = 2131826896(0x7f1118d0, float:1.928669E38)
            r6 = 0
            java.lang.String r30 = X.AnonymousClass7JS.A01(r0, r1)
            r1 = 2131826892(0x7f1118cc, float:1.9286681E38)
            java.lang.String r29 = X.AnonymousClass7JS.A01(r0, r1)
            java.lang.Object r1 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r1
            if (r1 == 0) goto L_0x0303
            java.lang.Object r1 = r1.A01
        L_0x0044:
            r5 = 1157296644(0x44faf204, float:2007.563)
            boolean r2 = X.C147188nY.A0z(r0, r1, r5)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r3 = r1.A13()
            java.lang.String r9 = ""
            if (r2 != 0) goto L_0x005a
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r3 != r2) goto L_0x0079
        L_0x005a:
            java.lang.Object r2 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r2
            if (r2 == 0) goto L_0x0300
            java.lang.Object r2 = r2.A01
            java.util.Date r2 = (java.util.Date) r2
            if (r2 == 0) goto L_0x0300
            long r2 = r2.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            if (r4 == 0) goto L_0x0300
            java.lang.String r3 = X.C31171Ghr.A05(r8, r2)
        L_0x0076:
            r1.A14(r3)
        L_0x0079:
            X.AnonymousClass7W3.A0w(r1, r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r2
            if (r2 == 0) goto L_0x02fd
            java.lang.Object r2 = r2.A00
        L_0x0088:
            boolean r2 = X.C147188nY.A0z(r0, r2, r5)
            java.lang.Object r28 = r1.A13()
            if (r2 != 0) goto L_0x0098
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            r2 = r28
            if (r2 != r4) goto L_0x00b9
        L_0x0098:
            java.lang.Object r2 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r2
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r2.A00
            java.util.Date r2 = (java.util.Date) r2
            if (r2 == 0) goto L_0x00b4
            long r4 = r2.getTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            if (r2 == 0) goto L_0x00b4
            java.lang.String r9 = X.C31171Ghr.A05(r8, r4)
        L_0x00b4:
            r1.A14(r9)
            r28 = r9
        L_0x00b9:
            X.AnonymousClass7W3.A0w(r1, r6)
            r2 = r28
            java.lang.String r2 = (java.lang.String) r2
            r28 = r2
            java.lang.Object r2 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r2
            if (r2 == 0) goto L_0x02f7
            java.lang.Object r2 = r2.A01
            if (r2 == 0) goto L_0x02f7
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            r10 = 26
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r8 = r31
            r5 = r73
            r4 = r29
            r9.<init>(r8, r5, r4, r10)
            androidx.compose.ui.Modifier r27 = X.AnonymousClass7HZ.A03(r2, r9, r6)
        L_0x00e1:
            r72 = r76
            r13 = r76 & 14
            X.8ly r11 = X.AnonymousClass7KV.A05(r0)
            int r4 = r13 << 3
            r12 = r4 & 112(0x70, float:1.57E-43)
            X.534 r14 = X.C147188nY.A0a(r0)
            java.lang.Object r10 = r0.AEA(r14)
            X.534 r15 = X.AnonymousClass7DE.A07
            java.lang.Object r9 = r0.AEA(r15)
            X.534 r26 = X.AnonymousClass7DE.A0B
            r4 = r26
            java.lang.Object r8 = r0.AEA(r4)
            X.0ZU r25 = X.AnonymousClass74X.A00
            X.0YM r5 = X.C98236Es.A00(r71)
            int r12 = X.C86114wI.A01(r12)
            r4 = r25
            X.C147188nY.A0w(r0, r1, r4)
            r1.A0T = r6
            X.0YP r24 = X.AnonymousClass74X.A03
            r4 = r24
            X.0YP r23 = X.AnonymousClass7Ak.A00(r0, r11, r10, r4)
            X.0YP r22 = X.AnonymousClass74X.A02
            r4 = r22
            X.0YP r21 = X.AnonymousClass7Ak.A01(r0, r9, r4)
            r4 = r21
            X.7KP r8 = X.AnonymousClass7KP.A04(r0, r8, r4)
            int r4 = r12 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            X.C147188nY.A0x(r0, r8, r5, r4)
            int r5 = X.C86124wJ.A05(r13)
            r4 = -46186609(0xfffffffffd3f3f8f, float:-1.5888285E37)
            r0.Cvb(r4)
            r4 = r5 & 81
            r5 = 16
            if (r4 != r5) goto L_0x0160
            boolean r4 = r0.BCM()
            if (r4 == 0) goto L_0x0160
            r0.CuJ()
        L_0x014a:
            X.AnonymousClass7W3.A0v(r1, r7)
            X.8nW r1 = r0.AKE()
            if (r1 == 0) goto L_0x015f
            r75 = 27
            kotlin.jvm.internal.KtLambdaShape2S0202000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape2S0202000_I2
            r70 = r0
            r70.<init>(r71, r72, r73, r74, r75)
            r1.D9d(r0)
        L_0x015f:
            return
        L_0x0160:
            X.54z r13 = X.AnonymousClass7Kq.A02
            androidx.compose.ui.Modifier r4 = r2.Cx6(r13)
            float r12 = (float) r5
            androidx.compose.ui.Modifier r11 = X.AnonymousClass7K4.A03(r4, r12)
            r10 = 25
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r8 = r31
            r5 = r73
            r4 = r30
            r9.<init>(r8, r5, r4, r10)
            androidx.compose.ui.Modifier r16 = X.AnonymousClass7HZ.A03(r11, r9, r6)
            X.8jk r20 = X.C147188nY.A0U(r0)
            X.8cu r19 = X.AnonymousClass7KV.A05
            r5 = r20
            r4 = r19
            X.8ly r11 = X.AnonymousClass72N.A00(r5, r0, r4)
            java.lang.Object r10 = X.C147188nY.A0s(r0, r14)
            java.lang.Object r9 = r0.AEA(r15)
            r4 = r26
            java.lang.Object r8 = r0.AEA(r4)
            X.0YM r5 = X.C98236Es.A00(r16)
            r4 = r25
            X.C147188nY.A0w(r0, r1, r4)
            r1.A0T = r6
            r4 = r24
            X.AnonymousClass7Ak.A02(r0, r11, r4)
            r4 = r23
            X.AnonymousClass7Ak.A02(r0, r10, r4)
            r4 = r22
            X.AnonymousClass7Ak.A02(r0, r9, r4)
            r4 = r21
            java.lang.Integer r18 = X.AnonymousClass7KP.A05(r0, r8, r4, r5)
            X.7VA r17 = X.C147188nY.A0W(r0)
            r4 = -393553421(0xffffffffe88ad9f3, float:-5.245656E24)
            r0.Cvb(r4)
            r45 = 0
            X.7If r34 = X.AnonymousClass7J9.A00(r0)
            r44 = 2046(0x7fe, float:2.867E-42)
            r32 = r0
            r35 = r33
            r36 = r33
            r37 = r33
            r38 = r30
            r39 = r6
            r40 = r6
            r41 = r6
            r42 = r6
            r43 = r6
            r47 = r45
            r49 = r6
            X.AnonymousClass7I9.A02(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r49)
            r16 = 1065353216(0x3f800000, float:1.0)
            r5 = r17
            r4 = r16
            androidx.compose.ui.Modifier r48 = r5.DB5(r2, r4, r7)
            r67 = 6
            X.7Ee r52 = X.C121117Ee.A01(r67)
            r59 = 4028(0xfbc, float:5.644E-42)
            r47 = r0
            r49 = r33
            r50 = r33
            r51 = r33
            r53 = r3
            r54 = r6
            r55 = r6
            r56 = r6
            r57 = r6
            r58 = r6
            r60 = r45
            r62 = r45
            r64 = r6
            X.AnonymousClass7I9.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r64)
            r11 = 2131232425(0x7f0806a9, float:1.8080959E38)
            X.6uo r36 = X.AnonymousClass6QP.A00(r0, r11)
            androidx.compose.ui.Modifier r35 = X.AnonymousClass7Kq.A09(r2, r12)
            X.7KB r3 = X.C120537Bh.A00(r0)
            long r3 = r3.A0l
            r38 = 440(0x1b8, float:6.17E-43)
            r34 = r0
            r40 = r3
            X.C1190173e.A00(r34, r35, r36, r37, r38, r39, r40)
            X.AnonymousClass7W3.A0v(r1, r7)
            r65 = 0
            androidx.compose.ui.Modifier r64 = r2.Cx6(r13)
            r68 = 14
            r63 = r0
            r66 = r65
            r69 = r45
            X.AnonymousClass6ED.A00(r63, r64, r65, r66, r67, r68, r69)
            java.lang.Object r3 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r3
            if (r3 == 0) goto L_0x014a
            java.lang.Object r3 = r3.A01
            if (r3 == 0) goto L_0x014a
            androidx.compose.ui.Modifier r3 = r2.Cx6(r13)
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7K4.A03(r3, r12)
            r3 = r27
            androidx.compose.ui.Modifier r9 = r4.Cx6(r3)
            r4 = r20
            r3 = r19
            X.8ly r4 = X.C147188nY.A0e(r4, r0, r3)
            java.lang.Object r5 = X.C147188nY.A0s(r0, r14)
            java.lang.Object r8 = r0.AEA(r15)
            r3 = r26
            java.lang.Object r10 = r0.AEA(r3)
            X.0YM r9 = X.C98236Es.A00(r9)
            r3 = r25
            X.C147188nY.A0w(r0, r1, r3)
            r1.A0T = r6
            r3 = r24
            X.AnonymousClass7Ak.A02(r0, r4, r3)
            r3 = r23
            X.AnonymousClass7Ak.A02(r0, r5, r3)
            r3 = r22
            X.AnonymousClass7Ak.A02(r0, r8, r3)
            r4 = r18
            r3 = r21
            X.AnonymousClass7KP.A06(r0, r10, r4, r3, r9)
            r3 = -2059122354(0xffffffff8544494e, float:-9.22934E-36)
            r0.Cvb(r3)
            X.7If r49 = X.AnonymousClass7J9.A00(r0)
            r59 = 2046(0x7fe, float:2.867E-42)
            r48 = r33
            r52 = r33
            r53 = r29
            r62 = r45
            r64 = r6
            X.AnonymousClass7I9.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r64)
            r4 = r17
            r3 = r16
            androidx.compose.ui.Modifier r15 = r4.DB5(r2, r3, r7)
            X.7Ee r19 = X.C121117Ee.A01(r67)
            r26 = 4028(0xfbc, float:5.644E-42)
            r14 = r0
            r16 = r33
            r17 = r33
            r18 = r33
            r20 = r28
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r27 = r45
            r29 = r45
            r31 = r6
            X.AnonymousClass7I9.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31)
            X.6uo r36 = X.AnonymousClass6QP.A00(r0, r11)
            androidx.compose.ui.Modifier r35 = X.AnonymousClass7Kq.A09(r2, r12)
            X.7KB r3 = X.C120537Bh.A00(r0)
            long r3 = r3.A0l
            r40 = r3
            X.C1190173e.A00(r34, r35, r36, r37, r38, r39, r40)
            X.AnonymousClass7W3.A0v(r1, r7)
            androidx.compose.ui.Modifier r64 = r2.Cx6(r13)
            r63 = r0
            X.AnonymousClass6ED.A00(r63, r64, r65, r66, r67, r68, r69)
            goto L_0x014a
        L_0x02f7:
            X.7Wm r27 = androidx.compose.ui.Modifier.A00
            r2 = r27
            goto L_0x00e1
        L_0x02fd:
            r2 = 0
            goto L_0x0088
        L_0x0300:
            r3 = r9
            goto L_0x0076
        L_0x0303:
            r1 = r33
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xK.A00(X.8nY, androidx.compose.ui.Modifier, X.5xK, int, int):void");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final boolean onBackPressed() {
        C25745DrH A0a = C18230wP.A0a(this);
        if (A0a != null) {
            return A0a.A0I();
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-991047059);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape169S0100000_I2_2(this, 0), -2069655760);
        C14030oh.A09(940657415, A022);
        return A0L;
    }
}
