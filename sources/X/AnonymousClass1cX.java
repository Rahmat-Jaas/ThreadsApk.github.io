package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.1cX  reason: invalid class name */
public final class AnonymousClass1cX extends C34640IcN implements C82424pb, C27987Ewb, C84264sr {
    public static final String __redex_internal_original_name = "SwitchToBusinessAccountFragment";
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public C84654td A05;
    public C24711ju A06;
    public AnonymousClass10K A07;
    public C10300i6 A08;
    public ReboundViewPager A09;
    public IgdsBottomButtonLayout A0A;
    public UserSession A0B;
    public RefreshSpinner A0C;
    public SpinnerImageView A0D;
    public String A0E;
    public boolean A0F;
    public CirclePageIndicator A0G;
    public User A0H;
    public final Handler A0I = AnonymousClass0wJ.A0F();

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CA4(int i, int i2, boolean z) {
    }

    public final void CIi(C23881Czs czs, float f, float f2) {
    }

    public final void CIn(C23881Czs czs, C23881Czs czs2) {
    }

    public final /* synthetic */ void CSd(int i, float f) {
    }

    public final void CUX(View view) {
    }

    public final String getModuleName() {
        return "switch_to_business_account";
    }

    public static void A00(AnonymousClass1cX r10) {
        AnonymousClass10K r1 = r10.A07;
        r1.A05.BcE(new C37408JrQ("intro", r1.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        ((BusinessConversionActivity) r10.A05).Bel((Bundle) null);
    }

    public static void A01(AnonymousClass1cX r18) {
        ImageUrl imageUrl;
        SlideCardViewModel slideCardViewModel;
        C18880y3 r11;
        String A0k;
        int i;
        C10300i6 r5;
        C10300i6 r1;
        AnonymousClass1cX r0 = r18;
        r0.A09.A0N(r0);
        r0.A09.A0N(r0.A0G);
        User user = r0.A0H;
        if (user != null) {
            imageUrl = user.B4M();
        } else {
            imageUrl = null;
        }
        boolean z = AnonymousClass0wJ.A0R(r0.A05).A0J;
        boolean A062 = C67293zJ.A06(r0.A05);
        if (A062 || (r1 = r0.A08) == null || !C67333zN.A06(r1, 36313252702979469L, true)) {
            if ("edit_profile".equals(r0.A0E) && (r5 = r0.A08) != null) {
                Object A002 = C67333zN.A00(r5, AnonymousClass0e5.A00(36318677246677683L), true);
                C04220Ms.A06(A002);
                if (AnonymousClass0wJ.A1X(A002)) {
                    C10300i6 r12 = r0.A08;
                    Context requireContext = r0.requireContext();
                    ReboundViewPager reboundViewPager = r0.A09;
                    AnonymousClass0wJ.A1M(r12, 0, reboundViewPager);
                    r11 = new C18880y3(reboundViewPager, (BusinessFlowAnalyticsLogger) null, (C10300i6) null, "", AnonymousClass3LK.A01(r12, (SlideCardViewModel) null, C06750aI.A17(new C63283hB(AnonymousClass006.A0N, requireContext.getString(2131838164), requireContext.getString(2131838163), R.drawable.instagram_mail_pano_outline_24, R.drawable.ig_illustrations_illo_contact_buttons), C63283hB.A00(requireContext), new C63283hB(AnonymousClass006.A0C, requireContext.getString(2131834040), requireContext.getString(2131834039), R.drawable.instagram_ads_pano_outline_24, R.drawable.ig_illustrations_illo_ads_megaphone)), false), true, false);
                }
            }
            C10300i6 r6 = r0.A08;
            Context requireContext2 = r0.requireContext();
            ReboundViewPager reboundViewPager2 = r0.A09;
            if (A062) {
                imageUrl = null;
            }
            C04220Ms.A0B(r6, 0);
            boolean A1Z = C18200wM.A1Z(reboundViewPager2);
            if (!z) {
                if (!A062) {
                    A0k = AnonymousClass0wJ.A0k(requireContext2, 2131827966);
                    i = 2131827965;
                } else {
                    A0k = AnonymousClass0wJ.A0k(requireContext2, 2131838051);
                    i = 2131838050;
                }
                slideCardViewModel = new SlideCardViewModel(imageUrl, A0k, AnonymousClass0wJ.A0k(requireContext2, i), 0);
            } else {
                slideCardViewModel = null;
            }
            boolean z2 = !A062;
            r11 = new C18880y3(reboundViewPager2, (BusinessFlowAnalyticsLogger) null, (C10300i6) null, "", AnonymousClass3LK.A01(r6, slideCardViewModel, AnonymousClass3LK.A00(requireContext2, r6, AnonymousClass266.A07, z2), z2), A1Z, z2);
        } else {
            C10300i6 r8 = r0.A08;
            Context requireContext3 = r0.requireContext();
            ReboundViewPager reboundViewPager3 = r0.A09;
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r0.A07.A05;
            String str = r0.A0E;
            C18180wK.A1P(r8, 0, reboundViewPager3);
            C04220Ms.A0B(str, 5);
            r11 = new C18880y3(reboundViewPager3, businessFlowAnalyticsLogger, r8, str, AnonymousClass3LK.A01(r8, new SlideCardViewModel(imageUrl, requireContext3.getString(2131838051), requireContext3.getString(2131838050), 0), AnonymousClass3LK.A00(requireContext3, r8, AnonymousClass266.A07, true), true), false, true);
            J61.A00.A00 = new C67443zY(r0, r11);
            AnonymousClass0gN.A00().AKp(new AnonymousClass1m5());
        }
        r0.A01 = r11.getCount();
        r0.A09.setAdapter((Adapter) r11);
        r0.A09.A0I(r0.A00);
        r0.A0G.setVisibility(0);
        r0.A0G.A03(r0.A00, r0.A01);
    }

    public final void CCX() {
        int i;
        if (this.A09 == null || (i = this.A00) == this.A01 - 1) {
            this.A07.A00("continue", -1);
            A00(this);
            return;
        }
        this.A07.A00("continue", i + 1);
        this.A09.A0J(this.A00 + 1, 0.1f);
    }

    public final void CJ9() {
        this.A05.ACI();
    }

    public final void COK(int i, int i2) {
        int i3 = this.A01;
        if (i == i3 - 1 && i2 == i3) {
            this.A0I.post(new C72414Ob(this));
        } else {
            this.A07.A00("swipe", i2);
        }
    }

    public final C10300i6 getSession() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r2 != X.C311924p.CONVERSION_FLOW) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r10 = this;
            X.10K r1 = r10.A07
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A05
            java.lang.String r2 = "intro"
            r4 = 0
            java.lang.String r3 = r1.A08
            X.JrQ r1 = new X.JrQ
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.BbZ(r1)
            X.4td r0 = r10.A05
            if (r0 == 0) goto L_0x0023
            X.24p r2 = r0.Aiz()
            X.24p r1 = X.C311924p.CONVERSION_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r2 = 1
            if (r0 == 0) goto L_0x003d
            com.instagram.service.session.UserSession r0 = r10.A0B
            if (r0 == 0) goto L_0x003d
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            X.266 r1 = r0.A0g()
            X.266 r0 = X.AnonymousClass266.A06
            if (r1 == r0) goto L_0x003d
            X.4td r0 = r10.A05
            r0.ACI()
            return r2
        L_0x003d:
            X.4td r0 = r10.A05
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.CfG(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cX.onBackPressed():boolean");
    }

    public final void C9s(int i, int i2) {
        if (isResumed()) {
            this.A00 = i;
            C24711ju r2 = this.A06;
            boolean z = true;
            if (!this.A0F || i != this.A01 - 1) {
                z = false;
            }
            r2.A03(z);
        }
    }

    public final void onAttach(Context context) {
        C84654td r1;
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof C84654td) {
            r1 = (C84654td) requireActivity;
        } else {
            r1 = null;
        }
        r1.getClass();
        this.A05 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0076, code lost:
        if (r5.A0B == null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -1399349909(0xffffffffac979d6b, float:-4.309155E-12)
            int r2 = X.C14030oh.A02(r0)
            super.onCreate(r6)
            android.os.Bundle r0 = r5.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r0)
            r5.A08 = r0
            java.lang.String r4 = X.C18190wL.A0k(r5)
            java.lang.String r0 = "entry_point should not be null"
            X.AnonymousClass7Ko.A07(r4, r0)
            r5.A0E = r4
            X.0i6 r3 = r5.A08
            X.4td r1 = r5.A05
            X.3xa r0 = new X.3xa
            r0.<init>(r1, r3, r4)
            X.7IU r1 = new X.7IU
            r1.<init>((X.C147138nS) r0, (X.AnonymousClass06C) r5)
            java.lang.Class<X.10K> r0 = X.AnonymousClass10K.class
            X.3ak r0 = r1.A01(r0)
            X.10K r0 = (X.AnonymousClass10K) r0
            r5.A07 = r0
            X.Jjq r3 = new X.Jjq
            r3.<init>()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.1jw r0 = new X.1jw
            r0.<init>(r1)
            r3.A0D(r0)
            r5.registerLifecycleListenerSet(r3)
            X.0i6 r1 = r5.A08
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x005d
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r1)
            r5.A0B = r0
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            r5.A0H = r0
        L_0x005d:
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "entry_position"
            int r0 = r1.getInt(r0)
            r5.A00 = r0
            java.lang.String r1 = r5.A0E
            java.lang.String r0 = "branded_content_settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            com.instagram.service.session.UserSession r1 = r5.A0B
            r0 = 1
            if (r1 != 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r5.A0F = r0
            r0 = -1753577522(0xffffffff977a87ce, float:-8.0950766E-25)
            X.C14030oh.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cX.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = -204460011(0xfffffffff3d03015, float:-3.2988677E31)
            int r4 = X.C14030oh.A02(r0)
            r0 = 2131497303(0x7f0c1157, float:1.8618195E38)
            r2 = 0
            android.view.View r1 = r8.inflate(r0, r9, r2)
            r7.A02 = r1
            r0 = 2131303605(0x7f091cb5, float:1.822533E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r6 = X.C18230wP.A0W(r1, r0)
            r7.A0A = r6
            r3 = 2131824396(0x7f110f0c, float:1.9281619E38)
            boolean r1 = r7.A0F
            r0 = -1
            if (r1 == 0) goto L_0x0025
            r0 = 2131831881(0x7f112c49, float:1.92968E38)
        L_0x0025:
            X.1ju r5 = new X.1ju
            r5.<init>((X.C84264sr) r7, (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r6, (int) r3, (int) r0)
            r7.A06 = r5
            boolean r0 = r7.A0F
            r3 = 1
            if (r0 == 0) goto L_0x0113
            int r1 = r7.A00
            int r0 = r7.A01
            int r0 = r0 - r3
            if (r1 != r0) goto L_0x0113
        L_0x0038:
            r5.A03(r3)
            X.1ju r0 = r7.A06
            r7.registerLifecycleListener(r0)
            android.view.View r1 = r7.A02
            r0 = 2131307215(0x7f092acf, float:1.8232651E38)
            android.view.ViewGroup r0 = X.C18220wO.A0J(r1, r0)
            r7.A03 = r0
            android.view.View r1 = r7.A02
            r0 = 2131299271(0x7f090bc7, float:1.8216539E38)
            android.view.View r1 = r1.requireViewById(r0)
            r7.requireContext()
            r0 = 173(0xad, float:2.42E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r7)
            android.view.View r1 = r7.A02
            r0 = 2131307338(0x7f092b4a, float:1.82329E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.spinner.RefreshSpinner r0 = (com.instagram.ui.widget.spinner.RefreshSpinner) r0
            r7.A0C = r0
            android.view.View r1 = r7.A02
            r0 = 2131304002(0x7f091e42, float:1.8226134E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = (com.instagram.ui.widget.pageindicator.CirclePageIndicator) r0
            r7.A0G = r0
            android.view.View r1 = r7.A02
            r0 = 2131302727(0x7f091947, float:1.8223548E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r7.A0D = r0
            android.view.View r1 = r7.A02
            r0 = 2131306102(0x7f092676, float:1.8230394E38)
            int r3 = X.C18230wP.A03(r1, r0)
            android.view.View r1 = r7.A02
            r0 = 2131307830(0x7f092d36, float:1.8233898E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r7.A09 = r0
            android.view.View r1 = r7.A02
            r0 = 2131303783(0x7f091d67, float:1.822569E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r1, r0)
            r7.A04 = r0
            X.10K r1 = r7.A07
            X.0i6 r0 = r1.A07
            boolean r0 = r0 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0111
            java.lang.String r1 = r1.A08
            java.lang.String r0 = "activity_feed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "feed_persistent_icon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0111
        L_0x00be:
            r1 = 1
        L_0x00bf:
            android.widget.TextView r0 = r7.A04
            if (r1 == 0) goto L_0x010d
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A04
            r0 = 2131831875(0x7f112c43, float:1.9296788E38)
            r1.setText(r0)
            android.widget.TextView r1 = r7.A04
            r0 = 174(0xae, float:2.44E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r7)
        L_0x00d5:
            X.4td r0 = r7.A05
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x00f0
            android.view.ViewGroup r0 = r7.A03
            r0.setVisibility(r2)
            A01(r7)
        L_0x00e7:
            android.view.View r1 = r7.A02
            r0 = 1755916923(0x68a92a7b, float:6.3909085E24)
            X.C14030oh.A09(r0, r4)
            return r1
        L_0x00f0:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r7.A0D
            r0.setVisibility(r2)
            X.1ju r0 = r7.A06
            r0.A01()
            android.content.Context r3 = r7.requireContext()
            X.06E r2 = X.AnonymousClass06E.A00(r7)
            X.0i6 r1 = r7.A08
            X.42l r0 = new X.42l
            r0.<init>(r7)
            X.C67203z9.A02(r3, r2, r0, r1)
            goto L_0x00e7
        L_0x010d:
            r0.setVisibility(r3)
            goto L_0x00d5
        L_0x0111:
            r1 = 0
            goto L_0x00bf
        L_0x0113:
            r3 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cX.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1048415081);
        super.onDestroyView();
        unregisterLifecycleListener(this.A06);
        this.A02 = null;
        this.A0A = null;
        this.A06 = null;
        this.A0G = null;
        this.A09 = null;
        this.A0C = null;
        this.A04 = null;
        this.A03 = null;
        this.A0D = null;
        C14030oh.A09(359349168, A022);
    }

    public final void onResume() {
        C10300i6 r3;
        View A0C2;
        VideoView videoView;
        int A022 = C14030oh.A02(2033050891);
        super.onResume();
        int i = this.A00;
        if (!(this.A09 == null || C67293zJ.A06(this.A05) || (r3 = this.A08) == null || !C67333zN.A06(r3, 36313252702979469L, false) || (A0C2 = this.A09.A0C(i)) == null || (videoView = (VideoView) A0C2.findViewById(R.id.video)) == null)) {
            videoView.start();
        }
        C14030oh.A09(-228071721, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass10K r1 = this.A07;
        r1.A05.Bdt(new C37408JrQ("intro", r1.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        C880856r r12 = this.A07.A04;
        C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.String>");
        C18210wN.A16(this, r12, 8);
        C880856r r13 = this.A07.A01;
        C04220Ms.A0C(r13, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
        C18210wN.A16(this, r13, 9);
        C880856r r14 = this.A07.A00;
        C04220Ms.A0C(r14, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        C18210wN.A16(this, r14, 10);
        if (this.A04 != null) {
            C880856r r15 = this.A07.A02;
            C04220Ms.A0C(r15, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.user.model.User>");
            C18210wN.A16(this, r15, 11);
            C880856r r16 = this.A07.A03;
            C04220Ms.A0C(r16, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
            C18210wN.A16(this, r16, 12);
        }
    }
}
