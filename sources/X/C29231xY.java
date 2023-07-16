package X;

import android.os.Bundle;
import android.os.Handler;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.urlhandlers.twofacsettingsexternal.TwoFacSettingsExternalUrlHandlerActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.KtLambdaShape83S0100000_I2_63;

/* renamed from: X.1xY  reason: invalid class name and case insensitive filesystem */
public final class C29231xY extends C23411dm implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacChooseSecurityMethodFragment";
    public Bundle A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C04530Oa A04 = AnonymousClass0OY.A02(C76134dW.A00);
    public final C04530Oa A05 = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 43));
    public final C04530Oa A06 = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 44));
    public final C04530Oa A07 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131837078);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 529);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.4MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.3aM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.4MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.4MC} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r2 != false) goto L_0x0022;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.C29231xY r20) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            r0 = r20
            android.os.Bundle r2 = r0.A00
            java.lang.String r13 = "twoFacResponseBundle"
            if (r2 == 0) goto L_0x033a
            java.lang.String r5 = "is_two_factor_enabled"
            boolean r6 = r2.getBoolean(r5)
            android.os.Bundle r2 = r0.A00
            if (r2 == 0) goto L_0x033a
            java.lang.String r7 = "is_totp_two_factor_enabled"
            boolean r2 = r2.getBoolean(r7)
            r3 = 0
            if (r6 != 0) goto L_0x0022
            r12 = 0
            if (r2 == 0) goto L_0x0023
        L_0x0022:
            r12 = 1
        L_0x0023:
            android.os.Bundle r4 = r0.A00
            if (r4 == 0) goto L_0x033a
            boolean r4 = r4.getBoolean(r5)
            if (r4 == 0) goto L_0x0065
            android.os.Bundle r5 = r0.A00
            if (r5 == 0) goto L_0x033a
            java.lang.String r4 = "has_reachable_email"
            boolean r4 = r5.getBoolean(r4)
            if (r4 != 0) goto L_0x0065
            r5 = 2131837008(0x7f114050, float:1.9307199E38)
            r4 = 535(0x217, float:7.5E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r4 = X.C18190wL.A0H(r0, r4)
            X.3aM r8 = new X.3aM
            r8.<init>(r4, r5)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131099734(0x7f060056, float:1.781183E38)
            int r4 = r5.getColor(r4)
            r8.A00 = r4
            android.view.ViewGroup r4 = X.C18200wM.A0H(r0)
            r4.setPadding(r3, r3, r3, r3)
            android.view.ViewGroup r4 = X.C18200wM.A0H(r0)
            r4.setClipToPadding(r3)
            r1.add(r8)
        L_0x0065:
            r4 = 2131837038(0x7f11406e, float:1.930726E38)
            if (r12 == 0) goto L_0x006d
            r4 = 2131837075(0x7f114093, float:1.9307335E38)
        L_0x006d:
            java.lang.String r4 = X.C18180wK.A0g(r0, r4)
            X.3TL r5 = new X.3TL
            r5.<init>((java.lang.CharSequence) r4)
            r8 = 1
            r5.A01 = r8
            r9 = 2131165204(0x7f070014, float:1.7944619E38)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r0)
            int r15 = r4.getDimensionPixelSize(r9)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r0)
            int r16 = r4.getDimensionPixelSize(r9)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r0)
            int r17 = r4.getDimensionPixelSize(r9)
            r9 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r0)
            int r18 = r4.getDimensionPixelSize(r9)
            r4 = 2131165204(0x7f070014, float:1.7944619E38)
            android.content.res.Resources r9 = X.AnonymousClass0wJ.A0B(r0)
            int r19 = r9.getDimensionPixelSize(r4)
            android.content.res.Resources r9 = X.AnonymousClass0wJ.A0B(r0)
            int r20 = r9.getDimensionPixelSize(r4)
            X.3Cs r14 = new X.3Cs
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r5.A06 = r14
            r9 = 2131887218(0x7f120472, float:1.9409037E38)
            r5.A03 = r9
            r1.add(r5)
            r5 = 2131837084(0x7f11409c, float:1.9307353E38)
            java.lang.String r5 = r0.getString(r5)
            android.text.SpannableStringBuilder r11 = X.C18200wM.A0E(r5)
            int r9 = X.C18220wO.A04(r0)
            r5 = 35
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r10 = X.C18730xl.A00(r0, r9, r5)
            int r9 = r11.length()
            r5 = 18
            r11.setSpan(r10, r3, r9, r5)
            r9 = 2131837036(0x7f11406c, float:1.9307256E38)
            java.lang.String r10 = X.C18180wK.A0g(r0, r9)
            r9 = 2131837037(0x7f11406d, float:1.9307258E38)
            java.lang.String r9 = X.C18180wK.A0g(r0, r9)
            if (r12 != 0) goto L_0x00f0
            r10 = r9
        L_0x00f0:
            android.text.SpannableStringBuilder r10 = X.C18190wL.A0D(r10, r11)
            X.3TL r9 = new X.3TL
            r9.<init>((java.lang.CharSequence) r10)
            r9.A01 = r8
            android.content.res.Resources r10 = X.AnonymousClass0wJ.A0B(r0)
            int r15 = r10.getDimensionPixelSize(r4)
            android.content.res.Resources r10 = X.AnonymousClass0wJ.A0B(r0)
            int r17 = r10.getDimensionPixelSize(r4)
            android.content.res.Resources r10 = X.AnonymousClass0wJ.A0B(r0)
            int r18 = r10.getDimensionPixelSize(r4)
            android.content.res.Resources r10 = X.AnonymousClass0wJ.A0B(r0)
            int r19 = r10.getDimensionPixelSize(r4)
            android.content.res.Resources r10 = X.AnonymousClass0wJ.A0B(r0)
            int r20 = r10.getDimensionPixelSize(r4)
            X.3Cs r4 = new X.3Cs
            r14 = r4
            r16 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r9.A06 = r4
            r4 = 2131887217(0x7f120471, float:1.9409035E38)
            r9.A03 = r4
            r1.add(r9)
            if (r12 == 0) goto L_0x0151
            r4 = 2131837171(0x7f1140f3, float:1.930753E38)
            X.3hu r10 = new X.3hu
            r10.<init>((int) r4)
            r9 = 2131165190(0x7f070006, float:1.794459E38)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r0)
            int r4 = r4.getDimensionPixelSize(r9)
            r10.A04 = r4
            r10.A01 = r4
            r1.add(r10)
        L_0x0151:
            android.os.Bundle r9 = r0.A00
            if (r9 == 0) goto L_0x033a
            java.lang.String r4 = "is_eligible_for_multiple_totp"
            boolean r10 = r9.getBoolean(r4)
            android.os.Bundle r9 = r0.A00
            if (r9 == 0) goto L_0x033a
            java.lang.String r4 = "eligible_for_trusted_notifications"
            boolean r11 = r9.getBoolean(r4)
            if (r10 == 0) goto L_0x030b
            if (r2 == 0) goto L_0x030b
            X.3aM r14 = new X.3aM
            r17 = 2131837117(0x7f1140bd, float:1.930742E38)
            r18 = 2131837119(0x7f1140bf, float:1.9307424E38)
            r2 = 2131837116(0x7f1140bc, float:1.9307418E38)
            java.lang.String r16 = r0.getString(r2)
            r2 = 532(0x214, float:7.45E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r15 = X.C18190wL.A0H(r0, r2)
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0183:
            r1.add(r14)
            android.os.Bundle r4 = r0.A00
            if (r4 == 0) goto L_0x033a
            java.lang.String r2 = "is_eligible_for_whatsapp_two_factor"
            boolean r2 = r4.getBoolean(r2)
            if (r2 == 0) goto L_0x01dd
            android.os.Bundle r4 = r0.A00
            if (r4 == 0) goto L_0x033a
            java.lang.String r2 = "is_whatsapp_two_factor_enabled"
            boolean r9 = r4.getBoolean(r2)
            if (r9 == 0) goto L_0x02ff
            r7 = 2131837129(0x7f1140c9, float:1.9307444E38)
            r10 = 2131837131(0x7f1140cb, float:1.9307448E38)
            android.os.Bundle r2 = r0.A00
            if (r2 == 0) goto L_0x033a
            java.lang.String r2 = X.C63833iQ.A08(r2)
            java.lang.String r4 = "****"
            java.lang.String r2 = X.C62923b9.A00(r2)
            java.lang.String r2 = X.AnonymousClass00U.A0L(r4, r2)
            X.C04220Ms.A06(r2)
            java.lang.String r4 = X.AnonymousClass0wJ.A0o(r0, r2, r10)
        L_0x01bd:
            X.C04220Ms.A09(r4)
            com.facebook.redex.IDxCListenerShape15S0110000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape15S0110000_1_I2
            r2.<init>(r3, r0, r9)
            X.4MC r7 = X.AnonymousClass4MC.A03(r2, r7, r9)
            r7.A0A = r4
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r7.A05 = r2
            r7.A00 = r2
            r1.add(r7)
        L_0x01dd:
            if (r6 == 0) goto L_0x02e0
            r2 = 2131837124(0x7f1140c4, float:1.9307434E38)
            java.lang.String r7 = r0.getString(r2)
            r5 = 2131837123(0x7f1140c3, float:1.9307432E38)
            android.os.Bundle r2 = r0.A00
            if (r2 == 0) goto L_0x033a
            java.lang.String r2 = X.C63833iQ.A08(r2)
            java.lang.String r4 = "****"
            java.lang.String r2 = X.C62923b9.A00(r2)
            java.lang.String r2 = X.AnonymousClass00U.A0L(r4, r2)
            X.C04220Ms.A06(r2)
            java.lang.String r5 = X.AnonymousClass0wJ.A0o(r0, r2, r5)
            r2 = 2131837116(0x7f1140bc, float:1.9307418E38)
            java.lang.String r4 = r0.getString(r2)
            r2 = 531(0x213, float:7.44E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r2 = X.C18190wL.A0H(r0, r2)
            X.3aM r6 = new X.3aM
            r6.<init>((android.view.View.OnClickListener) r2, (java.lang.CharSequence) r7, (java.lang.CharSequence) r5, (java.lang.String) r4)
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r5 = r2.getDimensionPixelSize(r4)
            r4 = 2131165190(0x7f070006, float:1.794459E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r6.A05 = r5
            r6.A01 = r2
        L_0x022e:
            r1.add(r6)
            if (r11 == 0) goto L_0x025c
            if (r12 == 0) goto L_0x025c
            r2 = 530(0x212, float:7.43E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r15 = X.C18190wL.A0H(r0, r2)
            r17 = 2131837138(0x7f1140d2, float:1.9307463E38)
            r18 = 2131837135(0x7f1140cf, float:1.9307456E38)
            r16 = 0
            X.3aM r14 = new X.3aM
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r14.A05 = r2
            r14.A01 = r2
            r1.add(r14)
        L_0x025c:
            android.os.Bundle r4 = r0.A00
            if (r4 == 0) goto L_0x033a
            java.lang.String r2 = "backup_codes"
            java.util.ArrayList r2 = r4.getStringArrayList(r2)
            if (r12 == 0) goto L_0x02dc
            if (r2 == 0) goto L_0x02b3
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x02b3
            if (r11 != 0) goto L_0x02b3
            r2 = 2131836998(0x7f114046, float:1.9307179E38)
            X.3hu r5 = new X.3hu
            r5.<init>((int) r2)
            r4 = 2131165190(0x7f070006, float:1.794459E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r5.A04 = r2
            r5.A01 = r2
            r5.A0E = r8
            r1.add(r5)
            r2 = 533(0x215, float:7.47E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r6 = X.C18190wL.A0H(r0, r2)
            r8 = 2131837122(0x7f1140c2, float:1.930743E38)
            r9 = 2131837121(0x7f1140c1, float:1.9307428E38)
            r7 = 0
            X.3aM r5 = new X.3aM
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r5.A05 = r2
            r5.A01 = r3
            r1.add(r5)
        L_0x02b3:
            boolean r2 = r0.A03
            if (r2 == 0) goto L_0x02dc
            r2 = 534(0x216, float:7.48E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r5 = X.C18190wL.A0H(r0, r2)
            r7 = 2131837127(0x7f1140c7, float:1.930744E38)
            r8 = 2131837126(0x7f1140c6, float:1.9307438E38)
            r6 = 0
            X.3aM r4 = new X.3aM
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r3)
            r4.A05 = r2
            r4.A01 = r2
            r1.add(r4)
        L_0x02dc:
            r0.setItems(r1)
            return
        L_0x02e0:
            r4 = 2131837124(0x7f1140c4, float:1.9307434E38)
            X.3vb r2 = X.AnonymousClass3vb.A00
            X.4MC r6 = X.AnonymousClass4MC.A04(r2, r0, r5, r4, r3)
            r2 = 2131837125(0x7f1140c5, float:1.9307436E38)
            r6.A02 = r2
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r6.A05 = r2
            r6.A00 = r2
            goto L_0x022e
        L_0x02ff:
            r7 = 2131837128(0x7f1140c8, float:1.9307442E38)
            r2 = 2131837130(0x7f1140ca, float:1.9307446E38)
            java.lang.String r4 = r0.getString(r2)
            goto L_0x01bd
        L_0x030b:
            android.os.Bundle r4 = r0.A00
            if (r4 == 0) goto L_0x033a
            boolean r9 = r4.getBoolean(r7)
            r7 = 2131837120(0x7f1140c0, float:1.9307426E38)
            X.3v2 r4 = new X.3v2
            r4.<init>(r0, r9, r6, r2)
            X.4MC r14 = X.AnonymousClass4MC.A03(r4, r7, r9)
            r4 = 2131837118(0x7f1140be, float:1.9307422E38)
            if (r2 == 0) goto L_0x0327
            r4 = 2131837119(0x7f1140bf, float:1.9307424E38)
        L_0x0327:
            r14.A02 = r4
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r0)
            int r2 = r2.getDimensionPixelSize(r4)
            r14.A05 = r2
            r14.A00 = r2
            goto L_0x0183
        L_0x033a:
            X.C04220Ms.A0E(r13)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29231xY.A0B(X.1xY):void");
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final boolean onBackPressed() {
        boolean z = false;
        if (requireActivity() instanceof TwoFacSettingsExternalUrlHandlerActivity) {
            C18190wL.A1A(this);
            return false;
        }
        Bundle bundle = this.A00;
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("is_two_factor_enabled");
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                boolean z3 = bundle2.getBoolean("is_totp_two_factor_enabled");
                if (z2 || z3) {
                    z = true;
                }
                Bundle A062 = C18180wK.A06();
                A062.putBoolean(C63833iQ.A07(326, 15, 86), z);
                C18250wR.A0B(this).A12(C63833iQ.A07(HttpStatus.SC_REQUEST_TOO_LONG, 26, 77), A062);
                getParentFragmentManager().A11(C63833iQ.A07(525, 24, 95), 1);
                return true;
            }
        }
        C04220Ms.A0E("twoFacResponseBundle");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-377397070);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        C24731jw.A02(this);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A07);
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_two_factor_enabled");
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                boolean z2 = bundle3.getBoolean("is_totp_two_factor_enabled");
                C04220Ms.A0B(A0U, 0);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, A0U), "instagram_two_fac_setup_view"), 2320);
                C63833iQ.A0D(A0I);
                A0I.A0Q("totp", C18210wN.A0R(A0I, C18190wL.A0Z(A0I, "view", "choose_method", z), "sms", z2));
                A0I.Bb4();
                C14030oh.A09(1463857758, A022);
                return;
            }
        }
        C04220Ms.A0E("twoFacResponseBundle");
        throw null;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-574363441);
        super.onResume();
        A0B(this);
        C14030oh.A09(562378047, A022);
    }

    public final void onStart() {
        ArrayList<String> stringArrayList;
        int A022 = C14030oh.A02(-393352943);
        super.onStart();
        Bundle bundle = this.A00;
        if (bundle == null) {
            C04220Ms.A0E("twoFacResponseBundle");
            throw null;
        }
        boolean z = false;
        if (bundle.getBoolean("direct_launch_backup_codes") && !this.A02 && (stringArrayList = bundle.getStringArrayList("backup_codes")) != null && !stringArrayList.isEmpty()) {
            this.A02 = true;
            this.A01 = true;
            ((Handler) this.A04.getValue()).post((Runnable) this.A05.getValue());
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("trusted_devices");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            z = true;
        }
        this.A03 = !z;
        C14030oh.A09(-1644764771, A022);
    }
}
