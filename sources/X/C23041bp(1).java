package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48;

/* renamed from: X.1bp  reason: invalid class name and case insensitive filesystem */
public final class C23041bp extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "FanClubConsiderationFragment";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public C19577Ayd A0A;
    public C19577Ayd A0B;
    public IgdsButton A0C;
    public IgdsButton A0D;
    public SpinnerImageView A0E;
    public final C04530Oa A0F;
    public final C04530Oa A0G;
    public final C04530Oa A0H;
    public final C04530Oa A0I;
    public final C04530Oa A0J;
    public final C04530Oa A0K;
    public final C04530Oa A0L;
    public final C04530Oa A0M = C80644m9.A00(this);
    public final C04530Oa A0N;

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.4tY] */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.3Dd] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r12) {
        /*
            r11 = this;
            r8 = 0
            X.C04220Ms.A0B(r12, r8)
            r7 = 1
            r12.CtT(r7)
            java.lang.String r0 = ""
            r12.setTitle(r0)
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r6 = A00(r11)
            X.8AN r5 = new X.8AN
            r5.<init>()
            java.lang.Integer r0 = r6.A00
            java.lang.Integer r3 = X.AnonymousClass006.A0C
            r4 = 0
            if (r0 != r3) goto L_0x00b8
            boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x006c
            java.lang.Integer r1 = X.AnonymousClass006.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2
            r0.<init>((java.lang.Integer) r1)
            r5.add(r0)
            com.instagram.service.session.UserSession r10 = r6.A07
            com.instagram.monetization.repository.MonetizationRepository r9 = r6.A05
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36317904152563753(0x8106f100001029, double:3.030927054318708E-306)
            boolean r0 = X.C63803iN.A0E(r2, r10, r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x006c
            X.6ew r0 = r6.A06
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "has_seen_consideration_share_screen_promo_sticker_tooltip"
            boolean r0 = r2.getBoolean(r1, r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005e
            android.content.SharedPreferences$Editor r0 = r2.edit()
            X.AnonymousClass0wJ.A13(r0, r1, r7)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 2131824617(0x7f110fe9, float:1.9282067E38)
            X.1kC r4 = X.AnonymousClass1kC.A00(r1, r0)
        L_0x005e:
            r2 = 2131232975(0x7f0808cf, float:1.8082074E38)
            r1 = 2131827100(0x7f11199c, float:1.9287103E38)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2
            r0.<init>((X.C57943Dd) r4, (java.lang.Integer) r3, (int) r2, (int) r1)
        L_0x0069:
            r5.add(r0)
        L_0x006c:
            X.AnonymousClass0OP.A11(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r2 = r5.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r2
            X.Drc r1 = X.C18240wQ.A0K()
            int r0 = r2.A01
            r1.A05 = r0
            int r0 = r2.A00
            r1.A04 = r0
            r0 = 96
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r11, r2, r0)
            r1.A0C = r0
            X.DlZ r0 = new X.DlZ
            r0.<init>(r1)
            android.view.View r4 = r12.A7Q(r0)
            java.lang.Object r3 = r2.A02
            X.3Dd r3 = (X.C57943Dd) r3
            if (r3 == 0) goto L_0x0073
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165271(0x7f070057, float:1.7944754E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.4Ss r2 = new X.4Ss
            r2.<init>(r4, r3, r11, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r2, r0)
            goto L_0x0073
        L_0x00b8:
            com.instagram.service.session.UserSession r3 = r6.A07
            X.4wE r0 = r6.A0B
            java.lang.Object r0 = r0.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x00c8
            X.4tY r4 = r0.A0I()
        L_0x00c8:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320223434905425(0x81090d00001751, double:3.032393777810582E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x006c
            java.lang.Boolean r0 = r4.BTr()
            boolean r0 = X.C18190wL.A1Z(r0, r7)
            if (r0 == 0) goto L_0x006c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r0 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A00(r6)
            goto L_0x0069
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23041bp.configureActionBar(X.4u2):void");
    }

    public final String getModuleName() {
        return "FanClubFanOnboardingConsiderationFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            SpinnerImageView spinnerImageView = (SpinnerImageView) AnonymousClass0wJ.A0J(view2, R.id.loading_spinner);
            spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
            this.A0E = spinnerImageView;
            this.A01 = (IgLinearLayout) AnonymousClass0wJ.A0J(view2, R.id.subscription_info);
            this.A03 = (IgSimpleImageView) AnonymousClass0wJ.A0J(view2, R.id.facepile_icon);
            this.A09 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.fan_club_name_title);
            this.A08 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.fan_club_description);
            this.A0C = (IgdsButton) AnonymousClass0wJ.A0J(view2, R.id.cta_button);
            this.A07 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.learn_more_footer);
            this.A02 = (IgSimpleImageView) AnonymousClass0wJ.A0J(view2, R.id.refer_in_dm_icon);
            this.A0D = (IgdsButton) AnonymousClass0wJ.A0J(view2, R.id.gifting_button);
            this.A04 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.benefit_header);
            this.A05 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.customized_benefits_edit_cta);
            this.A00 = (IgLinearLayout) AnonymousClass0wJ.A0J(view2, R.id.bullet_cell_group_container);
            this.A06 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.customized_benefits_span);
            this.A0A = C18190wL.A0T(view2, R.id.fan_club_consideration_content_preview_section_stub);
            this.A0B = C18190wL.A0T(view2, R.id.fan_club_consideration_social_context_section_stub);
            C04530Oa r3 = this.A0N;
            FanClubConsiderationViewModel fanClubConsiderationViewModel = (FanClubConsiderationViewModel) r3.getValue();
            Context requireContext = requireContext();
            Object value = this.A0L.getValue();
            Object value2 = this.A0H.getValue();
            C25237DiI.A00((Integer) null, ((E5N) fanClubConsiderationViewModel.A01).A03, new KtSLambdaShape5S0401000_I2_1(requireContext, fanClubConsiderationViewModel, value, value2, (C146958n9) null, 19), AnonymousClass3J5.A00(fanClubConsiderationViewModel), 2);
            r3.getValue();
            String A0q = C18200wM.A0q(this.A0I);
            C04220Ms.A06(A0q);
            if (!AnonymousClass3R0.A00.contains(A0q)) {
                C18250wR.A13(C10770iu.A00(), AnonymousClass00U.A0L("Unexpected origin: ", A0q), 1062876315);
            }
            AnonymousClass061 r12 = AnonymousClass061.STARTED;
            AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r12, (Object) this, (C146958n9) null, 41), AnonymousClass067.A00(viewLifecycleOwner), 3);
            return;
        }
        throw C18190wL.A0a("Required value was null.");
    }

    public static FanClubConsiderationViewModel A00(C23041bp r0) {
        return (FanClubConsiderationViewModel) r0.A0N.getValue();
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0M);
    }

    public final boolean onBackPressed() {
        IgdsButton igdsButton = this.A0C;
        if (igdsButton == null || igdsButton.isEnabled()) {
            return false;
        }
        C25828Dsm A0W = C18190wL.A0W(requireActivity());
        A0W.A0L(2131827166);
        A0W.A0K(2131827165);
        A0W.A0P((DialogInterface.OnClickListener) null, 2131827164);
        A0W.A0R(C18220wO.A0O(this, 58), AnonymousClass25l.RED, 2131827163);
        AnonymousClass0wJ.A1K(A0W);
        return true;
    }

    public C23041bp() {
        KtLambdaShape68S0100000_I2_48 ktLambdaShape68S0100000_I2_48 = new KtLambdaShape68S0100000_I2_48(this, 48);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape68S0100000_I2_48(new KtLambdaShape68S0100000_I2_48(this, 44), 45));
        this.A0N = C18220wO.A0M(new KtLambdaShape68S0100000_I2_48(A012, 46), ktLambdaShape68S0100000_I2_48, C18250wR.A0d(A012, (Object) null, 36), C18210wN.A0l(FanClubConsiderationViewModel.class));
        this.A0G = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 39));
        this.A0I = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 41));
        this.A0K = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 43));
        this.A0L = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 47));
        this.A0H = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 40));
        this.A0J = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 42));
        this.A0F = C62373Zc.A03(new KtLambdaShape68S0100000_I2_48(this, 38));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            C18220wO.A18(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1068123879);
        C04220Ms.A0B(layoutInflater, 0);
        boolean A1X = AnonymousClass0wJ.A1X(this.A0K.getValue());
        int i = R.layout.fan_club_consideration;
        if (A1X) {
            i = R.layout.fan_club_consideration_bottom_sheet;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C14030oh.A09(717157249, A022);
        return inflate;
    }
}
