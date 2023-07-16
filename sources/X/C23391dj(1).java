package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.brandedcontent.model.BrandedContentGatingInfo;
import com.instagram.brandedcontent.model.BrandedContentProjectMetadata;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1dj  reason: invalid class name and case insensitive filesystem */
public final class C23391dj extends I5x implements C82424pb, C33659Hs6, CallerContextable {
    public static final CallerContext A0V = CallerContext.A00(C23391dj.class);
    public static final String __redex_internal_original_name = "ShareAdvancedSettingsFragment";
    public int A00 = 75;
    public BrandedContentGatingInfo A01 = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null);
    public AnonymousClass3In A02;
    public C30564GJu A03;
    public C26141q7 A04;
    public UserSession A05;
    public C67263zF A06;
    public AnonymousClass4MA A07;
    public C62153Xk A08;
    public C62153Xk A09;
    public AnonymousClass1fC A0A;
    public AnonymousClass4MC A0B;
    public AnonymousClass4MC A0C;
    public AnonymousClass4MC A0D;
    public C63293hC A0E;
    public Date A0F;
    public List A0G = AnonymousClass0wJ.A0v();
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final List A0Q = AnonymousClass0wJ.A0v();
    public final List A0R = AnonymousClass0wJ.A0v();
    public final C82394pY A0S = new IDxEListenerShape223S0100000_1_I2(this, 29);
    public final C82394pY A0T = new IDxEListenerShape223S0100000_1_I2(this, 30);
    public final DateFormat A0U = new SimpleDateFormat("EEE, LLL d, h:mma z", Locale.US);

    public final void BtA(Date date) {
    }

    public final String getModuleName() {
        return "advanced_post_settings";
    }

    public static void A01(C23391dj r6) {
        AnonymousClass3LY.A00(r6.A05).A04(new E6R(r6.A01, (BrandedContentProjectMetadata) null, r6.A0G, r6.A0L));
        C62153Xk r4 = r6.A09;
        r4.getClass();
        r4.A04 = C19476Awz.A00(r6.requireContext(), (BrandedContentProjectMetadata) null, r6.A05, r6.A0G, r6.A0L);
        r6.A09.A08 = r6.A0G.isEmpty();
        r6.A0A.notifyDataSetChanged();
    }

    public static void A02(C23391dj r3, boolean z) {
        String str;
        AnonymousClass4MC r0 = r3.A0C;
        r0.getClass();
        r0.A0C = z;
        C67263zF r2 = r3.A06;
        if (r2 == null) {
            r2 = C60303Om.A00(r3.A05);
            r3.A06 = r2;
        }
        r2.A04(r3.A05, "feed_composer", z);
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r3.A05), "settings_ig_fb_post_sharing"), 2691);
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0I2.A0T("to_value", str);
        A0I2.Bb4();
        r3.A0A.notifyDataSetChanged();
        AnonymousClass3LY.A00(r3.A05).A04(new AnonymousClass46J(z));
    }

    private void A03(Object obj) {
        this.A0R.add(obj);
        this.A0Q.add(obj);
    }

    private boolean A04() {
        if (this.A08 != null) {
            return false;
        }
        UserSession userSession = this.A05;
        C04220Ms.A0B(userSession, 0);
        if (C63073bQ.A00(userSession).A00 == 0 || !C63073bQ.A03(userSession)) {
            return false;
        }
        UserSession userSession2 = this.A05;
        C04220Ms.A0B(userSession2, 0);
        if (!C63073bQ.A03(userSession2) || C63073bQ.A00(this.A05).A03() == null || (!this.A0J && !C63073bQ.A00(this.A05).A0E())) {
            return true;
        }
        return false;
    }

    public final C10300i6 A0I() {
        return this.A05;
    }

    public final void BuV(Date date) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.add(12, 20);
            if (date.compareTo(instance.getTime()) < 0) {
                date = instance.getTime();
            }
            Calendar instance2 = Calendar.getInstance();
            instance2.add(5, this.A00);
            if (date.compareTo(instance2.getTime()) > 0) {
                date = instance2.getTime();
            }
            this.A0F = date;
            AnonymousClass3LY.A00(this.A05).A04(new AnonymousClass46I(date));
            AnonymousClass4MC r1 = this.A0D;
            if (r1 != null) {
                r1.A0B = this.A0U.format(date);
                if (this.A0M) {
                    this.A0A.setItems(this.A0Q);
                    this.A0M = false;
                }
                this.A0A.notifyDataSetChanged();
            }
        }
        C30564GJu gJu = this.A03;
        if (gJu != null) {
            gJu.A00();
        }
        AnonymousClass3In r0 = this.A02;
        if (r0 != null) {
            Integer num = AnonymousClass006.A03;
            r0.A04(num);
            this.A02.A01(num);
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass3In r2 = this.A02;
        if (r2 == null) {
            return false;
        }
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A00, "content_scheduling_cancel"), 462);
        if (!AnonymousClass0wJ.A1U(A0I2)) {
            return false;
        }
        C18210wN.A1B(A0I2, C34482Js.A00(r2.A01));
        C18190wL.A1I(A0I2, "post_share_sheet");
        A0I2.Bb4();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0538, code lost:
        if (r15.A0L != false) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x055e, code lost:
        if (X.C63803iN.A05(r8, r7, 36321138262940212L).booleanValue() == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0246, code lost:
        if (X.C62183Xq.A00(r15.A05) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x035d, code lost:
        if (r12 == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x036e, code lost:
        if (X.C63803iN.A05(r8, r15.A05, 36321138262940212L).booleanValue() != false) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0370, code lost:
        A03(X.AnonymousClass4MA.A01(new com.facebook.redex.IDxCListenerShape205S0100000_4_I2((java.lang.Object) r15, 288), X.AnonymousClass0wJ.A0B(r15).getString(2131821324)));
        A03(new X.C63293hC((java.lang.CharSequence) getString(2131821316)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x03c6, code lost:
        if (r5.A01(r15.A05).A2p() != false) goto L_0x03c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = 1798601884(0x6b347c9c, float:2.181951E26)
            int r4 = X.C14030oh.A02(r0)
            r15 = r21
            r0 = r22
            super.onCreate(r0)
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "MEDIA_IS_ALL_VIDEOS"
            boolean r12 = r1.getBoolean(r0)
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "ARGUMENT_MEDIA_IS_ALL_PHOTOS"
            boolean r11 = r1.getBoolean(r0)
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "IS_CLOSE_FRIENDS_MEDIA"
            boolean r0 = r1.getBoolean(r0)
            r15.A0K = r0
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "HAS_PRODUCT_TAGS"
            boolean r0 = r1.getBoolean(r0)
            r15.A0I = r0
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "COMMENTS_DISABLED"
            boolean r0 = r1.getBoolean(r0)
            r15.A0H = r0
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "LIKE_AND_VIEW_COUNTS_DISABLED"
            boolean r0 = r1.getBoolean(r0)
            r15.A0N = r0
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "ARGUMENT_CONTENT_SCHEDULING_DATE_MS"
            long r1 = r1.getLong(r0)
            r3 = 0
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            r15.A0F = r0
            r15.A0M = r3
        L_0x006c:
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "MEDIA_HAS_MUSIC_SELECTED"
            boolean r0 = r1.getBoolean(r0)
            r15.A0O = r0
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0W(r15)
            r15.A05 = r0
            X.3Ej r5 = X.C35762Os.A00()
            com.instagram.service.session.UserSession r2 = r15.A05
            r1 = 4
            com.facebook.redex.IDxAListenerShape459S0100000_1_I2 r0 = new com.facebook.redex.IDxAListenerShape459S0100000_1_I2
            r0.<init>(r15, r1)
            X.1q7 r0 = r5.A00(r15, r2, r0)
            r15.A04 = r0
            com.instagram.service.session.UserSession r0 = r15.A05
            X.49i r0 = X.C63073bQ.A00(r0)
            boolean r0 = r0.A0F()
            r15.A0J = r0
            android.os.Bundle r1 = r15.requireArguments()
            r0 = 320(0x140, float:4.48E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            r0.getClass()
            r15.A0G = r0
            android.os.Bundle r1 = r15.requireArguments()
            r0 = 217(0xd9, float:3.04E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r15.A0L = r0
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "BRANDED_CONTENT_GATING_INFO"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.brandedcontent.model.BrandedContentGatingInfo r0 = (com.instagram.brandedcontent.model.BrandedContentGatingInfo) r0
            if (r0 == 0) goto L_0x00cf
            r15.A01 = r0
        L_0x00cf:
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "PARTNER_BOOST_ENABLED"
            boolean r0 = r1.getBoolean(r0)
            r15.A0P = r0
            android.content.Context r2 = r15.requireContext()
            com.instagram.service.session.UserSession r1 = r15.A05
            X.1fC r0 = new X.1fC
            r0.<init>(r2, r1, r15)
            r15.A0A = r0
            java.lang.String r2 = "advanced_post_settings"
            X.AKG r1 = r15.A04
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x00f2
            r1.A00 = r2
        L_0x00f2:
            com.instagram.service.session.UserSession r0 = r15.A05
            r2 = 1
            boolean r0 = X.C62363Zb.A03(r0, r2)
            if (r0 == 0) goto L_0x01ae
            com.instagram.service.session.UserSession r0 = r15.A05
            X.Dsp r0 = X.C25567Do3.A02(r0)
            X.9zz r0 = r0.A06
            java.lang.Integer r5 = X.C34472Jr.A00(r0)
            com.instagram.service.session.UserSession r0 = r15.A05
            X.3In r1 = new X.3In
            r1.<init>(r15, r0, r5)
            r15.A02 = r1
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1.A02(r0)
            X.3In r6 = r15.A02
            r6.getClass()
            X.0nS r1 = r6.A00
            java.lang.String r0 = "content_scheduling_view_component"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 468(0x1d4, float:6.56E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0146
            java.lang.Integer r0 = r6.A01
            java.lang.String r0 = X.C34482Js.A00(r0)
            X.C18210wN.A1B(r5, r0)
            java.lang.String r0 = "post_share_sheet"
            X.C18190wL.A1I(r5, r0)
            java.lang.String r1 = "schedule"
            java.lang.String r0 = "component"
            r5.A0T(r0, r1)
            r5.Bb4()
        L_0x0146:
            r1 = 2131824364(0x7f110eec, float:1.9281554E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r15.A03(r0)
            androidx.fragment.app.FragmentActivity r14 = r15.requireActivity()
            com.instagram.service.session.UserSession r5 = r15.A05
            android.content.Context r1 = r15.requireContext()
            r0 = 2131824368(0x7f110ef0, float:1.9281562E38)
            java.lang.String r17 = r1.getString(r0)
            android.content.Context r1 = r15.requireContext()
            r0 = 2131824367(0x7f110eef, float:1.928156E38)
            java.lang.String r18 = r1.getString(r0)
            X.GJu r13 = new X.GJu
            r19 = r3
            r20 = r2
            r16 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r15.A03 = r13
            java.util.Date r1 = r15.A0F
            if (r1 == 0) goto L_0x059a
            java.text.DateFormat r0 = r15.A0U
            java.lang.String r6 = r0.format(r1)
        L_0x0184:
            java.util.Date r0 = r15.A0F
            boolean r5 = X.AnonymousClass0wJ.A1W(r0)
            r0 = 10
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r1.<init>((java.lang.Object) r15, (int) r0)
            X.4MC r0 = new X.4MC
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r1, (java.lang.CharSequence) r6, (boolean) r5)
            r15.A0D = r0
            r15.A03(r0)
            r0 = 2131824363(0x7f110eeb, float:1.9281552E38)
            java.lang.String r0 = r15.getString(r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            X.3hC r0 = new X.3hC
            r0.<init>((android.text.SpannableStringBuilder) r1)
            r15.A03(r0)
        L_0x01ae:
            r1 = 2131824742(0x7f111066, float:1.928232E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r15.A03(r0)
            r1 = 2131824745(0x7f111069, float:1.9282327E38)
            r0 = 11
            X.4MC r1 = X.AnonymousClass4MC.A05(r15, r0, r1, r3)
            boolean r0 = r15.A0N
            r1.A0C = r0
            r15.A03(r1)
            r0 = 2131824740(0x7f111064, float:1.9282316E38)
            java.lang.String r1 = r15.getString(r0)
            r0 = 2131824743(0x7f111067, float:1.9282323E38)
            java.lang.String r5 = r15.getString(r0)
            android.text.SpannableStringBuilder r0 = X.C18200wM.A0E(r1)
            java.lang.String r6 = " "
            android.text.SpannableStringBuilder r0 = r0.append(r6)
            android.text.SpannableStringBuilder r1 = r0.append(r5)
            r0 = 6
            X.AnonymousClass3Zw.A02(r1, r15, r5, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((android.text.SpannableStringBuilder) r1)
            r15.A03(r0)
            r1 = 2131824185(0x7f110e39, float:1.928119E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r15.A03(r0)
            r0 = 2131836967(0x7f114027, float:1.9307116E38)
            r9 = 12
            X.4MC r1 = X.AnonymousClass4MC.A05(r15, r9, r0, r3)
            boolean r0 = r15.A0H
            r1.A0C = r0
            r15.A03(r1)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r15)
            r0 = 2131836968(0x7f114028, float:1.9307118E38)
            java.lang.String r1 = r1.getString(r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r15.A03(r0)
            com.instagram.service.session.UserSession r0 = r15.A05
            X.C04220Ms.A0B(r0, r3)
            X.0Ok r5 = X.C06810aP.A01
            boolean r0 = X.C18200wM.A1X(r0, r5)
            if (r0 != 0) goto L_0x02fc
            com.instagram.service.session.UserSession r0 = r15.A05
            boolean r0 = X.C67253zE.A02(r0)
            if (r0 != 0) goto L_0x02fc
            r8 = 2131827380(0x7f111ab4, float:1.928767E38)
            com.instagram.service.session.UserSession r0 = r15.A05
            boolean r0 = X.C67373zR.A08(r0)
            if (r0 == 0) goto L_0x0248
            com.instagram.service.session.UserSession r0 = r15.A05
            boolean r0 = X.C62183Xq.A00(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0249
        L_0x0248:
            r7 = 0
        L_0x0249:
            r1 = 9
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((java.lang.Object) r15, (int) r1)
            X.4MC r0 = X.AnonymousClass4MC.A04(r0, r15, r9, r8, r7)
            r15.A0C = r0
            boolean r0 = r15.A0J
            if (r0 != 0) goto L_0x0266
            com.instagram.service.session.UserSession r0 = r15.A05
            X.49i r0 = X.C63073bQ.A00(r0)
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x026a
        L_0x0266:
            boolean r0 = r15.A0K
            if (r0 == 0) goto L_0x028f
        L_0x026a:
            X.4MC r0 = r15.A0C
            r0.A0C = r3
            r0.A0F = r2
            boolean r0 = r15.A0J
            if (r0 != 0) goto L_0x028f
            com.instagram.service.session.UserSession r0 = r15.A05
            X.49i r0 = X.C63073bQ.A00(r0)
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x028f
            X.4As r7 = new X.4As
            r7.<init>(r15)
            X.4MC r1 = r15.A0C
            r0 = 68
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r7, r15, r0)
            r1.A06 = r0
        L_0x028f:
            java.util.List r9 = r15.A0R
            r0 = 2131832747(0x7f112fab, float:1.9298557E38)
            java.lang.String r0 = r15.getString(r0)
            X.C63613hu.A02(r0, r9)
            X.4MC r0 = r15.A0C
            r9.add(r0)
            boolean r0 = r15.A0J
            if (r0 == 0) goto L_0x0562
            com.instagram.service.session.UserSession r8 = r15.A05
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36327314425915348(0x810f80000027d4, double:3.036878149078386E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r7, r8, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0562
            com.instagram.service.session.UserSession r0 = r15.A05
            X.49i r0 = X.C63073bQ.A00(r0)
            android.content.Context r10 = r15.requireContext()
            androidx.fragment.app.FragmentActivity r8 = r15.requireActivity()
            r7 = 2131827377(0x7f111ab1, float:1.9287665E38)
            com.instagram.service.session.UserSession r1 = r0.A05
            r0 = 2131835668(0x7f113b14, float:1.9304481E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r10, r0)
            android.text.SpannableStringBuilder r1 = X.C63143c0.A01(r10, r8, r1, r0, r7)
        L_0x02d5:
            X.3hC r0 = new X.3hC
            r0.<init>((android.text.SpannableStringBuilder) r1)
            r15.A0E = r0
            r9.add(r0)
            boolean r0 = r15.A04()
            if (r0 == 0) goto L_0x02fc
            X.3Xk r7 = r15.A08
            if (r7 != 0) goto L_0x02f9
            r1 = 2131827378(0x7f111ab2, float:1.9287667E38)
            r0 = 310(0x136, float:4.34E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r15, r0)
            X.3Xk r7 = new X.3Xk
            r7.<init>((android.view.View.OnClickListener) r0, (int) r1)
            r15.A08 = r7
        L_0x02f9:
            r9.add(r7)
        L_0x02fc:
            if (r11 != 0) goto L_0x054b
            com.instagram.service.session.UserSession r7 = r15.A05
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36313738034284201(0x810327000006a9, double:3.0282923843431076E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r8, r7, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x054b
            r3 = 1
        L_0x0312:
            r1 = 2131820833(0x7f110121, float:1.9274392E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r15.A03(r0)
            if (r3 == 0) goto L_0x035d
            r3 = 2131823101(0x7f1109fd, float:1.9278992E38)
            com.instagram.service.session.UserSession r0 = r15.A05
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "generate_captions_for_feed_videos"
            boolean r1 = r1.getBoolean(r0, r2)
            r0 = 13
            X.4MC r0 = X.AnonymousClass4MC.A05(r15, r0, r3, r1)
            r15.A03(r0)
            r0 = 2131837801(0x7f114369, float:1.9308807E38)
            java.lang.String r1 = r15.getString(r0)
            r0 = 2131829580(0x7f11234c, float:1.9292133E38)
            java.lang.String r3 = r15.getString(r0)
            android.text.SpannableStringBuilder r0 = X.C18200wM.A0E(r1)
            android.text.SpannableStringBuilder r0 = r0.append(r6)
            android.text.SpannableStringBuilder r1 = r0.append(r3)
            r0 = 5
            X.AnonymousClass3Zw.A02(r1, r15, r3, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((android.text.SpannableStringBuilder) r1)
            r15.A03(r0)
        L_0x035d:
            if (r12 != 0) goto L_0x0398
        L_0x035f:
            com.instagram.service.session.UserSession r3 = r15.A05
            r0 = 36321138262940212(0x8109e200001a34, double:3.032972318743498E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r8, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0398
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r15)
            r0 = 2131821324(0x7f11030c, float:1.9275388E38)
            java.lang.String r3 = r1.getString(r0)
            r1 = 288(0x120, float:4.04E-43)
            com.facebook.redex.IDxCListenerShape205S0100000_4_I2 r0 = new com.facebook.redex.IDxCListenerShape205S0100000_4_I2
            r0.<init>((java.lang.Object) r15, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A01(r0, r3)
            r15.A03(r0)
            r0 = 2131821316(0x7f110304, float:1.9275372E38)
            java.lang.String r1 = r15.getString(r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r15.A03(r0)
        L_0x0398:
            X.0m7 r3 = r15.getParentFragmentManager()
            r0 = 3
            com.facebook.redex.IDxRListenerShape541S0100000_1_I2 r1 = new com.facebook.redex.IDxRListenerShape541S0100000_1_I2
            r1.<init>(r15, r0)
            java.lang.String r0 = "request_key_audience_restrictions"
            r3.A0y(r1, r15, r0)
            com.instagram.service.session.UserSession r0 = r15.A05
            boolean r0 = X.C25771Drk.A00(r0)
            if (r0 == 0) goto L_0x0446
            com.instagram.service.session.UserSession r0 = r15.A05
            boolean r0 = X.C25771Drk.A02(r0)
            if (r0 != 0) goto L_0x0446
            boolean r0 = r15.A0I
            if (r0 == 0) goto L_0x03c8
            com.instagram.service.session.UserSession r0 = r15.A05
            com.instagram.user.model.User r0 = r5.A01(r0)
            boolean r0 = r0.A2p()
            r9 = 0
            if (r0 == 0) goto L_0x03c9
        L_0x03c8:
            r9 = 1
        L_0x03c9:
            r0 = 2131822521(0x7f1107b9, float:1.9277816E38)
            X.3hu r3 = new X.3hu
            r3.<init>((int) r0)
            com.instagram.service.session.UserSession r1 = r15.A05
            X.0TJ r0 = X.C18180wK.A0J(r1)
            r5 = 36320670111766672(0x81097500041890, double:3.032676258056258E-306)
            boolean r0 = X.C63803iN.A0E(r0, r1, r5)
            if (r0 == 0) goto L_0x0544
            r15.A03(r3)
        L_0x03e5:
            com.instagram.service.session.UserSession r0 = r15.A05
            boolean r0 = X.C24013D5o.A00(r0)
            r8 = 0
            r7 = 2131821090(0x7f110222, float:1.9274913E38)
            if (r0 == 0) goto L_0x04e2
            r1 = 290(0x122, float:4.06E-43)
            com.facebook.redex.IDxCListenerShape205S0100000_4_I2 r0 = new com.facebook.redex.IDxCListenerShape205S0100000_4_I2
            r0.<init>((java.lang.Object) r15, (int) r1)
            X.3Xk r1 = new X.3Xk
            r1.<init>((android.view.View.OnClickListener) r0, (int) r7)
            r15.A09 = r1
            java.util.List r0 = r15.A0G
            boolean r0 = r0.isEmpty()
            r1.A08 = r0
            X.3Xk r7 = r15.A09
            r0 = r9 ^ 1
            r7.A07 = r0
            com.instagram.service.session.UserSession r3 = r15.A05
            java.util.List r2 = r15.A0G
            android.content.Context r1 = r15.requireContext()
            boolean r0 = r15.A0L
            java.lang.String r0 = X.C19476Awz.A00(r1, r8, r3, r2, r0)
            r7.A04 = r0
        L_0x041d:
            com.instagram.service.session.UserSession r1 = r15.A05
            X.0TJ r0 = X.C18180wK.A0J(r1)
            boolean r0 = X.C63803iN.A0E(r0, r1, r5)
            if (r0 == 0) goto L_0x04d9
            X.3Xk r0 = r15.A09
            r15.A03(r0)
        L_0x042e:
            com.instagram.service.session.UserSession r3 = r15.A05
            java.lang.Integer r2 = X.AnonymousClass006.A0F
            java.lang.Integer r1 = X.AnonymousClass006.A01
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.C62873b3.A02(r15, r3, r2, r1, r0)
            com.instagram.service.session.UserSession r0 = r15.A05
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.46W> r1 = X.AnonymousClass46W.class
            X.4pY r0 = r15.A0S
            r2.A01(r0, r1)
        L_0x0446:
            com.instagram.service.session.UserSession r3 = r15.A05
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311277018022396(0x8100ea000001fc, double:3.026736027749425E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04b7
            com.instagram.service.session.UserSession r0 = r15.A05
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            java.lang.String r1 = "feed"
            java.util.Set r0 = r0.A0H(r1)
            java.util.ArrayList r6 = X.C18200wM.A0s(r0)
            com.instagram.service.session.UserSession r0 = r15.A05
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            boolean r1 = r0.A0R(r1)
            java.util.List r5 = r15.A0R
            r0 = 2131835596(0x7f113acc, float:1.9304335E38)
            X.C63613hu.A04(r5, r0)
            if (r1 == 0) goto L_0x04d1
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r15)
            r2 = 2131689684(0x7f0f00d4, float:1.900839E38)
            int r1 = r6.size()
            int r0 = r6.size()
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r2 = r3.getQuantityString(r2, r1, r0)
        L_0x0494:
            r1 = 289(0x121, float:4.05E-43)
            com.facebook.redex.IDxCListenerShape205S0100000_4_I2 r0 = new com.facebook.redex.IDxCListenerShape205S0100000_4_I2
            r0.<init>((java.lang.Object) r15, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A01(r0, r2)
            r15.A07 = r0
            r5.add(r0)
            r0 = 2131835594(0x7f113aca, float:1.930433E38)
            X.C63293hC.A01(r15, r5, r0)
            com.instagram.service.session.UserSession r0 = r15.A05
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.7rO> r1 = X.C131087rO.class
            X.4pY r0 = r15.A0T
            r2.A01(r0, r1)
        L_0x04b7:
            boolean r0 = r15.A0M
            X.1fC r1 = r15.A0A
            if (r0 == 0) goto L_0x04ce
            java.util.List r0 = r15.A0R
        L_0x04bf:
            r1.setItems(r0)
            X.1fC r0 = r15.A0A
            r15.A0F(r0)
            r0 = -497062139(0xffffffffe25f6f05, float:-1.0304059E21)
            X.C14030oh.A09(r0, r4)
            return
        L_0x04ce:
            java.util.List r0 = r15.A0Q
            goto L_0x04bf
        L_0x04d1:
            r0 = 2131835595(0x7f113acb, float:1.9304333E38)
            java.lang.String r2 = r15.getString(r0)
            goto L_0x0494
        L_0x04d9:
            java.util.List r1 = r15.A0R
            X.3Xk r0 = r15.A09
            r1.add(r0)
            goto L_0x042e
        L_0x04e2:
            boolean r3 = r15.A0L
            r0 = 8
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r1.<init>((java.lang.Object) r15, (int) r0)
            r0 = 13
            X.4MC r1 = X.AnonymousClass4MC.A04(r1, r15, r0, r7, r3)
            r15.A0B = r1
            if (r9 != 0) goto L_0x04fa
            r1.A0E = r2
            r0 = 0
            r1.A0C = r0
        L_0x04fa:
            com.instagram.service.session.UserSession r1 = r15.A05
            X.0TJ r0 = X.C18180wK.A0J(r1)
            boolean r0 = X.C63803iN.A0E(r0, r1, r5)
            if (r0 == 0) goto L_0x053c
            X.4MC r0 = r15.A0B
            r15.A03(r0)
        L_0x050b:
            r2 = 2131821032(0x7f1101e8, float:1.9274796E38)
            r1 = 291(0x123, float:4.08E-43)
            com.facebook.redex.IDxCListenerShape205S0100000_4_I2 r0 = new com.facebook.redex.IDxCListenerShape205S0100000_4_I2
            r0.<init>((java.lang.Object) r15, (int) r1)
            X.3Xk r7 = new X.3Xk
            r7.<init>((android.view.View.OnClickListener) r0, (int) r2)
            r15.A09 = r7
            com.instagram.service.session.UserSession r3 = r15.A05
            java.util.List r2 = r15.A0G
            android.content.Context r1 = r15.requireContext()
            boolean r0 = r15.A0L
            java.lang.String r0 = X.C19476Awz.A00(r1, r8, r3, r2, r0)
            r7.A04 = r0
            X.3Xk r1 = r15.A09
            java.util.List r0 = r15.A0G
            boolean r0 = r0.isEmpty()
            r1.A08 = r0
            boolean r0 = r15.A0L
            if (r0 == 0) goto L_0x042e
            goto L_0x041d
        L_0x053c:
            java.util.List r1 = r15.A0R
            X.4MC r0 = r15.A0B
            r1.add(r0)
            goto L_0x050b
        L_0x0544:
            java.util.List r0 = r15.A0R
            r0.add(r3)
            goto L_0x03e5
        L_0x054b:
            if (r12 != 0) goto L_0x0398
            com.instagram.service.session.UserSession r7 = r15.A05
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36321138262940212(0x8109e200001a34, double:3.032972318743498E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r8, r7, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x035f
            goto L_0x0312
        L_0x0562:
            boolean r0 = r15.A0J
            if (r0 != 0) goto L_0x058d
            com.instagram.service.session.UserSession r0 = r15.A05
            X.49i r0 = X.C63073bQ.A00(r0)
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x058d
            X.4As r10 = new X.4As
            r10.<init>(r15)
            com.instagram.service.session.UserSession r0 = r15.A05
            X.49i r8 = X.C63073bQ.A00(r0)
            android.content.Context r7 = r15.requireContext()
            androidx.fragment.app.FragmentActivity r1 = r15.requireActivity()
            java.lang.String r0 = "advanced_setting_description"
            android.text.SpannableStringBuilder r1 = r8.A02(r7, r1, r10, r0)
            goto L_0x02d5
        L_0x058d:
            r0 = 2131827379(0x7f111ab3, float:1.9287669E38)
            java.lang.String r0 = r15.getString(r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            goto L_0x02d5
        L_0x059a:
            r0 = 2131824366(0x7f110eee, float:1.9281558E38)
            java.lang.String r6 = r15.getString(r0)
            goto L_0x0184
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23391dj.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1552801219);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fragment_share_advanced_settings);
        C14030oh.A09(1483763957, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1904689074);
        super.onDestroy();
        C38039KHq A002 = AnonymousClass3LY.A00(this.A05);
        A002.A02(this.A0T, C131087rO.class);
        A002.A02(this.A0S, AnonymousClass46W.class);
        C14030oh.A09(958758479, A022);
    }

    public final void onDestroyView() {
        String str;
        int A022 = C14030oh.A02(-304663314);
        super.onDestroyView();
        if (C19514Axb.A04(this.A05) && !C25771Drk.A02(this.A05)) {
            UserSession userSession = this.A05;
            boolean z = this.A0P;
            if (this.A0G.isEmpty()) {
                str = null;
            } else {
                str = ((BrandedContentTag) this.A0G.get(0)).A01;
            }
            C25788Ds1.A06(this, userSession, str, "feed", false, z);
        }
        C14030oh.A09(-1803072224, A022);
    }

    public final void onResume() {
        C62153Xk r2;
        Resources A0B2;
        int i;
        int A022 = C14030oh.A02(638015436);
        super.onResume();
        if (A04() && this.A0M) {
            List list = this.A0R;
            int indexOf = list.indexOf(this.A0C) + 2;
            C62153Xk r22 = this.A08;
            if (r22 == null) {
                r22 = new C62153Xk((View.OnClickListener) C18190wL.A0H(this, 310), 2131827378);
                this.A08 = r22;
            }
            list.add(indexOf, r22);
            this.A0A.setItems(list);
            A0F(this.A0A);
        }
        if (this.A08 != null) {
            int A062 = C18200wM.A06(this.A05, C63803iN.A05(AnonymousClass0TJ.A05, this.A05, 36325317266121774L).booleanValue() ? 1 : 0);
            if (A062 == 80) {
                r2 = this.A08;
                A0B2 = AnonymousClass0wJ.A0B(this);
                i = 2131837423;
            } else if (A062 == 40) {
                r2 = this.A08;
                A0B2 = AnonymousClass0wJ.A0B(this);
                i = 2131837420;
            } else {
                if (A062 == 10) {
                    r2 = this.A08;
                    A0B2 = AnonymousClass0wJ.A0B(this);
                    i = 2131837422;
                }
                this.A0A.notifyDataSetChanged();
            }
            r2.A04 = A0B2.getString(i);
            this.A0A.notifyDataSetChanged();
        }
        C14030oh.A09(-1759611423, A022);
    }
}
