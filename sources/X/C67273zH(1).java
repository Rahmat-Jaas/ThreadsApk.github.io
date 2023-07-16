package X;

import android.app.Dialog;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCSpanShape14S0100000_1_I2;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3zH  reason: invalid class name and case insensitive filesystem */
public final class C67273zH implements CallerContextable {
    public static final String __redex_internal_original_name = "StorySharingOptionsDialogController";
    public Dialog A00;
    public String A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final C34640IcN A04;
    public final UserSession A05;
    public final C84504tF A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final Integer A0O;

    private CharSequence A00(Resources resources) {
        String str;
        int i;
        int i2;
        Object[] objArr;
        String str2 = this.A0B;
        if (!(str2 == null || (str = this.A01) == null)) {
            UserSession userSession = this.A05;
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r2, userSession, 36327421800294412L)) {
                if (this.A03) {
                    if (C63803iN.A0E(r2, userSession, 36327421800556560L)) {
                        i2 = 2131827019;
                        if (C63803iN.A0E(r2, userSession, 36327421800622097L)) {
                            i2 = 2131827020;
                        }
                    } else {
                        i2 = 2131827018;
                    }
                    objArr = new Object[]{str2};
                } else {
                    if (A04() || A03()) {
                        i = 2131827033;
                        if (A05()) {
                            i = 2131827034;
                        }
                    } else {
                        i = 2131827027;
                        if (A05()) {
                            i = 2131827028;
                        }
                    }
                    objArr = new Object[]{str2, str};
                }
                Spanned A002 = C16370sw.A00(resources, objArr, i2);
                if (!A04()) {
                    return A002;
                }
                String string = this.A04.requireContext().getString(2131827005);
                IDxCSpanShape14S0100000_1_I2 iDxCSpanShape14S0100000_1_I2 = new IDxCSpanShape14S0100000_1_I2(this, 15);
                SpannableStringBuilder A0E2 = C18200wM.A0E(A002);
                AnonymousClass3Zw.A01(A0E2, iDxCSpanShape14S0100000_1_I2, string);
                return A0E2;
            }
        }
        if (str2 != null) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A05, 36322581371952561L)) {
                int i3 = 2131827009;
                if (this.A03) {
                    i3 = 2131827008;
                }
                return C18210wN.A0C(resources, str2, i3);
            }
        }
        return resources.getString(2131827007);
    }

    public static void A01(C318329d r4, C67273zH r5) {
        boolean z;
        AnonymousClass14I r3 = new AnonymousClass14I();
        int ordinal = r4.ordinal();
        if (ordinal == 2 || ordinal == 4) {
            z = true;
        } else if (ordinal == 3 || ordinal == 5) {
            z = false;
        } else {
            z = r5.A0M;
        }
        r3.A07("is_xpost_enabled", Boolean.valueOf(z));
        UserSession userSession = r5.A05;
        C49212r1.A00(r4, AnonymousClass293.STORY, AnonymousClass2AC.IG_STORY_SHARE_SHEET_SHARING_OPTIONS, r3, userSession);
    }

    public static void A02(C67273zH r11) {
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        iVw.A04("entrypoint", "ig_story_share_sheet_dialogs");
        UserSession userSession = r11.A05;
        iVw.A04("account_id", userSession.getUserId());
        iVw.A04("newly_linked", "false");
        iVw.A04("platform", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        IVw iVw2 = new IVw(k9r);
        iVw2.A04("entrypoint", "ig_story_share_sheet_dialogs");
        iVw2.A04("deeplink_destination", "cross_posting_skip_profiles_screen");
        iVw2.A00.put("deeplink_params", iVw);
        IVw A0M2 = C18180wK.A0M(k9r, iVw2);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18200wM.A1T(A0M2, A0y);
        C34640IcN icN = r11.A04;
        FragmentActivity requireActivity = icN.requireActivity();
        if (!r11.A02) {
            r11.A02 = true;
            C35682Ok.A00().A00(requireActivity, requireActivity.getWindow(), true, true, false);
            AnonymousClass4A9 A002 = C63263h8.A00(userSession, "com.bloks.www.fxcal.settings.async", A0y);
            A002.A00 = new AnonymousClass1eH(r11);
            icN.scheduleAndGetLoaderId(A002);
        }
    }

    private boolean A03() {
        if (!(this.A0B == null || this.A01 == null)) {
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A05, 36327421800425486L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A04() {
        if (!(this.A0B == null || this.A01 == null)) {
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A05, 36327421800359949L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A05() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A05, 36327421800491023L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.BKH r11) {
        /*
            r10 = this;
            java.lang.Integer r0 = r10.A0O
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0063
            r6 = 1
            X.IcN r5 = r10.A04
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r5)
            r0 = 2131823199(0x7f110a5f, float:1.927919E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r5)
            r1 = 2131823198(0x7f110a5e, float:1.9279189E38)
            java.lang.String r0 = r10.A0B
            android.text.Spanned r0 = X.C18210wN.A0C(r2, r0, r1)
            X.Dsm r3 = X.AnonymousClass0wJ.A0V(r5)
            r3.A02 = r4
            r3.A0p(r0)
            com.instagram.service.session.UserSession r0 = r10.A05
            r3.A0j(r5, r0)
            r3.A0q(r6)
            r3.A0r(r6)
            r2 = 2131835664(0x7f113b10, float:1.9304473E38)
            r1 = 63
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0P(r0, r2)
            r2 = 2131827047(0x7f111967, float:1.9286996E38)
            r1 = 64
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0N(r0, r2)
            r2 = 2131835672(0x7f113b18, float:1.930449E38)
            r0 = 157(0x9d, float:2.2E-43)
        L_0x0057:
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r1.<init>((X.C67273zH) r10, (int) r0)
        L_0x005c:
            r3.A0O(r1, r2)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x0062:
            return
        L_0x0063:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            java.lang.Integer r5 = r10.A09
            boolean r9 = r0.equals(r5)
            X.IcN r8 = r10.A04
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r8)
            r0 = 2131827039(0x7f11195f, float:1.928698E38)
            if (r9 == 0) goto L_0x0079
            r0 = 2131827040(0x7f111960, float:1.9286981E38)
        L_0x0079:
            java.lang.String r3 = r1.getString(r0)
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            if (r4 != r5) goto L_0x014b
            com.instagram.service.session.UserSession r7 = r10.A05
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36324479747498512(0x810cec00002210, double:3.035085487033245E-306)
            boolean r0 = X.C63803iN.A0E(r6, r7, r0)
            if (r0 == 0) goto L_0x014b
            X.Dsm r3 = X.AnonymousClass0wJ.A0V(r8)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r8)
            r0 = 2131827041(0x7f111961, float:1.9286983E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A02 = r0
            r3.A0j(r8, r7)
            X.C18200wM.A1O(r3)
            boolean r1 = r10.A0M
            boolean r0 = r10.A0N
            if (r1 == 0) goto L_0x00f8
            r2 = 2131827042(0x7f111962, float:1.9286985E38)
            if (r0 == 0) goto L_0x00cf
            r1 = 62
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0P(r0, r2)
            r2 = 2131827045(0x7f111965, float:1.9286992E38)
            r1 = 160(0xa0, float:2.24E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r0.<init>((X.C67273zH) r10, (int) r1)
            r3.A0N(r0, r2)
            r2 = 2131827044(0x7f111964, float:1.928699E38)
            r0 = 161(0xa1, float:2.26E-43)
            goto L_0x0057
        L_0x00cf:
            r1 = 59
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0P(r0, r2)
            r0 = 36324561351877161(0x810cff00002229, double:3.0351370939708973E-306)
            boolean r0 = X.C63803iN.A0E(r6, r7, r0)
            if (r0 == 0) goto L_0x00f1
            r2 = 2131827046(0x7f111966, float:1.9286994E38)
            r1 = 58
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0N(r0, r2)
        L_0x00f1:
            r2 = 2131827045(0x7f111965, float:1.9286992E38)
            r0 = 158(0x9e, float:2.21E-43)
            goto L_0x0057
        L_0x00f8:
            if (r0 == 0) goto L_0x0120
            r2 = 2131827048(0x7f111968, float:1.9286998E38)
            r1 = 60
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0P(r0, r2)
            r2 = 2131827044(0x7f111964, float:1.928699E38)
            r1 = 159(0x9f, float:2.23E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r0.<init>((X.C67273zH) r10, (int) r1)
            r3.A0N(r0, r2)
            r2 = 2131827043(0x7f111963, float:1.9286987E38)
            r0 = 61
        L_0x0119:
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r1.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r0)
            goto L_0x005c
        L_0x0120:
            android.content.res.Resources r0 = X.AnonymousClass0wJ.A0B(r8)
            java.lang.CharSequence r0 = r10.A00(r0)
            r3.A0p(r0)
            r2 = 2131827046(0x7f111966, float:1.9286994E38)
            r1 = 65
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0P(r0, r2)
            r2 = 2131827047(0x7f111967, float:1.9286996E38)
            r1 = 66
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r1)
            r3.A0N(r0, r2)
            r2 = 2131827043(0x7f111963, float:1.9286987E38)
            r0 = 67
            goto L_0x0119
        L_0x014b:
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r8)
            r2.A02 = r3
            boolean r7 = r10.A0M
            if (r7 == 0) goto L_0x02ad
            java.lang.CharSequence r0 = r10.A08
        L_0x0157:
            r2.A0p(r0)
            com.instagram.service.session.UserSession r0 = r10.A05
            r2.A0j(r8, r0)
            r1 = 1
            r2.A0q(r1)
            r2.A0r(r1)
            boolean r0 = r10.A03()
            if (r0 == 0) goto L_0x0179
            r6 = 2131827006(0x7f11193e, float:1.9286912E38)
            r3 = 162(0xa2, float:2.27E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r0.<init>((X.C67273zH) r10, (int) r3)
            r2.A0N(r0, r6)
        L_0x0179:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            boolean r0 = r10.A04()
            if (r0 != 0) goto L_0x0286
            boolean r0 = r10.A03()
            if (r0 != 0) goto L_0x0286
            boolean r0 = r10.A0N
            if (r7 == 0) goto L_0x026b
            if (r0 == 0) goto L_0x0267
            java.lang.String r0 = r10.A0F
            r3.add(r0)
            java.lang.String r0 = r10.A0D
        L_0x0196:
            r3.add(r0)
        L_0x0199:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x01a4
            java.lang.String r0 = r10.A0C
        L_0x01a1:
            r3.add(r0)
        L_0x01a4:
            int r0 = r3.size()
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            java.lang.Object[] r6 = r3.toArray(r0)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            int r5 = r6.length
            r4 = 0
        L_0x01b2:
            if (r4 >= r5) goto L_0x0062
            r3 = r6[r4]
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r10.A04()
            if (r0 != 0) goto L_0x0224
            boolean r0 = r10.A03()
            if (r0 != 0) goto L_0x0224
            java.lang.String r0 = r10.A0F
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = r10.A0G
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = r10.A0L
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = r10.A0I
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = r10.A0D
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = r10.A0J
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = r10.A0C
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0206
            r7 = 70
        L_0x01fe:
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r7)
            r2.A0b(r0, r3)
        L_0x0206:
            android.app.Dialog r0 = r2.A0G()
            r10.A00 = r0
            X.C13950oZ.A00(r0)
            int r4 = r4 + 1
            goto L_0x01b2
        L_0x0212:
            r0 = 8
            com.facebook.redex.IDxCListenerShape14S1200000_1_I2 r7 = new com.facebook.redex.IDxCListenerShape14S1200000_1_I2
            r7.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r3, (int) r0)
            goto L_0x0256
        L_0x021a:
            r7 = 7
            com.facebook.redex.IDxCListenerShape14S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape14S1200000_1_I2
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r3, (int) r7)
            r2.A0a(r0, r3)
            goto L_0x0206
        L_0x0224:
            java.lang.String r0 = r10.A0H
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = r10.A0E
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = r10.A0L
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x024f
            java.lang.String r0 = r10.A0K
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x024f
            java.lang.String r0 = r10.A0A
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0206
            r7 = 69
            goto L_0x01fe
        L_0x024f:
            r0 = 68
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r7 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r7.<init>((X.BKH) r11, (X.C67273zH) r10, (int) r0)
        L_0x0256:
            r2.A0c(r7, r3)
            goto L_0x0206
        L_0x025a:
            r0 = 163(0xa3, float:2.28E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r7 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r7.<init>((X.C67273zH) r10, (int) r0)
            X.25l r0 = X.AnonymousClass25l.DEFAULT
            r2.A0Y(r7, r0, r3, r1)
            goto L_0x0206
        L_0x0267:
            java.lang.String r0 = r10.A0G
            goto L_0x0196
        L_0x026b:
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = r10.A0F
            r3.add(r0)
            java.lang.String r0 = r10.A0J
            goto L_0x0196
        L_0x0276:
            java.lang.String r0 = r10.A0I
            r3.add(r0)
            java.lang.String r0 = r10.A0L
            r3.add(r0)
            if (r9 == 0) goto L_0x0199
            java.lang.String r0 = r10.A0C
            goto L_0x0196
        L_0x0286:
            boolean r0 = r10.A0N
            if (r7 == 0) goto L_0x029e
            if (r0 == 0) goto L_0x029b
            java.lang.String r0 = r10.A0E
        L_0x028e:
            r3.add(r0)
        L_0x0291:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x01a4
            java.lang.String r0 = r10.A0A
            goto L_0x01a1
        L_0x029b:
            java.lang.String r0 = r10.A0H
            goto L_0x028e
        L_0x029e:
            if (r0 == 0) goto L_0x02a3
            java.lang.String r0 = r10.A0K
            goto L_0x028e
        L_0x02a3:
            java.lang.String r0 = r10.A0L
            r3.add(r0)
            if (r9 == 0) goto L_0x0291
            java.lang.String r0 = r10.A0A
            goto L_0x028e
        L_0x02ad:
            java.lang.CharSequence r0 = r10.A07
            goto L_0x0157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67273zH.A06(X.BKH):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67273zH(X.C34640IcN r8, com.instagram.service.session.UserSession r9, X.C84504tF r10, java.lang.Integer r11, java.lang.Integer r12, boolean r13, boolean r14) {
        /*
            r7 = this;
            r7.<init>()
            r4 = 0
            r7.A02 = r4
            r7.A03 = r4
            r7.A04 = r8
            r7.A05 = r9
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r8)
            r7.A09 = r11
            r7.A0N = r13
            r7.A0M = r14
            r7.A0O = r12
            com.instagram.service.session.UserSession r2 = r7.A05
            boolean r0 = X.C60343Oq.A01(r2)
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = X.C67373zR.A01(r2)
        L_0x0024:
            r7.A0B = r0
            int r0 = r12.intValue()
            if (r0 != r4) goto L_0x003d
            boolean r0 = X.C67373zR.A0D(r9)
            r7.A03 = r0
            if (r0 == 0) goto L_0x0193
            r0 = 2131824664(0x7f111018, float:1.9282162E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x003b:
            r7.A01 = r0
        L_0x003d:
            java.lang.String r2 = r7.A0B
            if (r2 == 0) goto L_0x018a
            java.lang.String r6 = r7.A01
            if (r6 == 0) goto L_0x018a
            com.instagram.service.session.UserSession r5 = r7.A05
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36327421800294412(0x810f990003280c, double:3.036946053068068E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            if (r0 == 0) goto L_0x018a
            boolean r1 = r7.A0N
            boolean r0 = r7.A03
            if (r1 == 0) goto L_0x0114
            if (r0 == 0) goto L_0x015f
            r0 = 36327421800556560(0x810f9900072810, double:3.0369460532338516E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            if (r0 == 0) goto L_0x010f
            r0 = 36327421800622097(0x810f9900082811, double:3.0369460532752974E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            r1 = 2131827022(0x7f11194e, float:1.9286945E38)
            if (r0 == 0) goto L_0x0078
            r1 = 2131827023(0x7f11194f, float:1.9286947E38)
        L_0x0078:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
        L_0x007c:
            android.text.Spanned r0 = X.C16370sw.A00(r3, r0, r1)
            boolean r1 = r7.A04()
            if (r1 == 0) goto L_0x00a1
            X.IcN r1 = r7.A04
            android.content.Context r2 = r1.requireContext()
            r1 = 2131827005(0x7f11193d, float:1.928691E38)
            java.lang.String r4 = r2.getString(r1)
            r2 = 15
            com.facebook.redex.IDxCSpanShape14S0100000_1_I2 r1 = new com.facebook.redex.IDxCSpanShape14S0100000_1_I2
            r1.<init>(r7, r2)
            android.text.SpannableStringBuilder r0 = X.C18200wM.A0E(r0)
            X.AnonymousClass3Zw.A01(r0, r1, r4)
        L_0x00a1:
            r7.A08 = r0
            java.lang.CharSequence r0 = r7.A00(r3)
            r7.A07 = r0
            r0 = 2131827015(0x7f111947, float:1.928693E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0I = r0
            r0 = 2131827016(0x7f111948, float:1.9286933E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0L = r0
            r0 = 2131827017(0x7f111949, float:1.9286935E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0J = r0
            r0 = 2131827039(0x7f11195f, float:1.928698E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0K = r0
            r0 = 2131827011(0x7f111943, float:1.9286923E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0F = r0
            r0 = 2131827012(0x7f111944, float:1.9286925E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0D = r0
            r0 = 2131827045(0x7f111965, float:1.9286992E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0E = r0
            r0 = 2131827013(0x7f111945, float:1.9286927E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0G = r0
            r0 = 2131827014(0x7f111946, float:1.9286929E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0H = r0
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0C = r0
            r0 = 2131823054(0x7f1109ce, float:1.9278897E38)
            java.lang.String r0 = r3.getString(r0)
            r7.A0A = r0
            r7.A06 = r10
            return
        L_0x010f:
            r1 = 2131827021(0x7f11194d, float:1.9286943E38)
            goto L_0x0078
        L_0x0114:
            if (r0 == 0) goto L_0x0139
            r0 = 36327421800556560(0x810f9900072810, double:3.0369460532338516E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            if (r0 == 0) goto L_0x0134
            r0 = 36327421800622097(0x810f9900082811, double:3.0369460532752974E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            r1 = 2131827025(0x7f111951, float:1.928695E38)
            if (r0 == 0) goto L_0x0078
            r1 = 2131827026(0x7f111952, float:1.9286953E38)
            goto L_0x0078
        L_0x0134:
            r1 = 2131827024(0x7f111950, float:1.9286949E38)
            goto L_0x0078
        L_0x0139:
            boolean r0 = r7.A04()
            if (r0 != 0) goto L_0x0152
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x0152
            boolean r0 = r7.A05()
            r1 = 2131827031(0x7f111957, float:1.9286963E38)
            if (r0 == 0) goto L_0x0177
            r1 = 2131827032(0x7f111958, float:1.9286965E38)
            goto L_0x0177
        L_0x0152:
            boolean r0 = r7.A05()
            r1 = 2131827037(0x7f11195d, float:1.9286975E38)
            if (r0 == 0) goto L_0x0177
            r1 = 2131827038(0x7f11195e, float:1.9286977E38)
            goto L_0x0177
        L_0x015f:
            boolean r0 = r7.A04()
            if (r0 != 0) goto L_0x017d
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x017d
            boolean r0 = r7.A05()
            r1 = 2131827029(0x7f111955, float:1.928696E38)
            if (r0 == 0) goto L_0x0177
            r1 = 2131827030(0x7f111956, float:1.9286961E38)
        L_0x0177:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r6}
            goto L_0x007c
        L_0x017d:
            boolean r0 = r7.A05()
            r1 = 2131827035(0x7f11195b, float:1.9286971E38)
            if (r0 == 0) goto L_0x0177
            r1 = 2131827036(0x7f11195c, float:1.9286973E38)
            goto L_0x0177
        L_0x018a:
            r0 = 2131827010(0x7f111942, float:1.928692E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x00a1
        L_0x0193:
            X.3A0 r0 = X.AnonymousClass2MK.A00(r9)
            java.lang.String r2 = r0.A00
            X.3A0 r0 = X.AnonymousClass2MK.A00(r9)
            boolean r1 = r0.A01
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = X.AnonymousClass2ML.A00(r0, r2, r1)
            goto L_0x003b
        L_0x01a9:
            X.0Ok r1 = X.C06810aP.A01
            boolean r0 = X.C18200wM.A1X(r2, r1)
            if (r0 == 0) goto L_0x01bb
            com.instagram.user.model.User r0 = r1.A01(r2)
            java.lang.String r0 = r0.A18()
            goto L_0x0024
        L_0x01bb:
            boolean r0 = X.C67363zQ.A0H(r2)
            if (r0 == 0) goto L_0x01c9
            X.1j1 r0 = X.C67363zQ.A01(r2)
            java.lang.String r0 = r0.A02
            goto L_0x0024
        L_0x01c9:
            X.1z6 r2 = X.C35692Ol.A00(r2)
            java.lang.Class<X.3zH> r0 = X.C67273zH.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_android_linking_cache_ig_stories_share_sheet"
            fxcache.model.FxCalAccount r0 = r2.A01(r1, r0)
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = r0.A04
            goto L_0x0024
        L_0x01df:
            r0 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67273zH.<init>(X.IcN, com.instagram.service.session.UserSession, X.4tF, java.lang.Integer, java.lang.Integer, boolean, boolean):void");
    }
}
