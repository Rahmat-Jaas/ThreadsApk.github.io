package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.facebook.redex.IDxCListenerShape15S1100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.5xX  reason: invalid class name */
public final class AnonymousClass5xX extends C34640IcN implements C21735BzM, C21659By5, C144018hh {
    public static final /* synthetic */ AnonymousClass0A5[] A0J = {C86134wK.A0x(AnonymousClass5xX.class, "startTimeInSeconds", "getStartTimeInSeconds()J")};
    public static final String __redex_internal_original_name = "AdsConsentGrowthBottomSheetFragment";
    public IgdsBottomButtonLayout A00;
    public View A01;
    public RecyclerView A02;
    public boolean A03 = true;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = A00(this, 6);
    public final C04530Oa A08;
    public final C04530Oa A09 = A00(this, 8);
    public final C04530Oa A0A = A00(this, 9);
    public final C04530Oa A0B = A00(this, 10);
    public final C04530Oa A0C = A00(this, 11);
    public final C04530Oa A0D = AnonymousClass3W9.A00(this);
    public final C04530Oa A0E;
    public final C04530Oa A0F;
    public final C04530Oa A0G;
    public final C86024w9 A0H;
    public final C04530Oa A0I = A00(this, 5);

    public final void Bmq() {
    }

    public final String getModuleName() {
        return C18170wI.A00(946);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C86114wI.A1A(getViewLifecycleOwner(), ((AnonymousClass58W) this.A0E.getValue()).A01, this, 282);
    }

    public static C04530Oa A00(Object obj, int i) {
        return C62373Zc.A03(new KtLambdaShape27S0100000_I2_7(obj, i));
    }

    public static final void A01(Fragment fragment, AnonymousClass5xX r1, boolean z) {
        BottomSheetFragment bottomSheetFragment;
        C37383Jqm jqm;
        r1.A03 = z;
        Fragment fragment2 = fragment.mParentFragment;
        if ((fragment2 instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment2) != null && (jqm = bottomSheetFragment.A02) != null) {
            jqm.A06();
        }
    }

    public static final void A02(AnonymousClass5xX r6) {
        ((Map) r6.A08.getValue()).put(C18170wI.A00(165), String.valueOf((System.currentTimeMillis() / ((long) 1000)) - C18190wL.A08(C86114wI.A0i(r6, r6.A0H, A0J, 0))));
    }

    public final void Bmo() {
        if (this.A03) {
            AnonymousClass3ED r2 = new AnonymousClass3ED(this, AnonymousClass0wJ.A0X(this.A0D));
            A02(this);
            r2.A00("ig_cg_bottomsheet_dismiss", (Map) this.A08.getValue());
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0D);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return !recyclerView.canScrollVertically(-1);
        }
        C04220Ms.A0E("recyclerView");
        throw null;
    }

    public AnonymousClass5xX() {
        KtLambdaShape27S0100000_I2_7 ktLambdaShape27S0100000_I2_7 = new KtLambdaShape27S0100000_I2_7(this, 15);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape27S0100000_I2_7(new KtLambdaShape27S0100000_I2_7(this, 12), 13));
        this.A0E = C18220wO.A0M(new KtLambdaShape27S0100000_I2_7(A012, 14), ktLambdaShape27S0100000_I2_7, C86154wM.A11((Object) null, A012, 34), C18210wN.A0l(AnonymousClass58W.class));
        this.A08 = A00(this, 7);
        this.A04 = A00(this, 2);
        this.A06 = A00(this, 4);
        this.A05 = A00(this, 3);
        this.A0F = A00(this, 16);
        this.A0G = C62373Zc.A03(AnonymousClass8HK.A00);
        this.A0H = new AnonymousClass4Um();
    }

    public final void C1m(String str) {
        String str2;
        A02(this);
        A01(this, this, false);
        AnonymousClass7DY r3 = (AnonymousClass7DY) this.A05.getValue();
        r3.A00.A00("ig_cg_bottomsheet_learn_more_click", r3.A02);
        if (C04220Ms.A0I(str, "activity_feed_notification_3PD_content")) {
            str2 = "ig_activity_feed_notification";
        } else {
            str2 = "ig_3pd_trial_30_day_megaphone";
        }
        AnonymousClass7DY.A00(r3, str2);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1615376363);
        super.onCreate(bundle);
        ((AnonymousClass58W) this.A0E.getValue()).A00 = this;
        C14030oh.A09(-2018605993, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C57943Dd A002;
        int i;
        C57943Dd A003;
        int i2;
        int A022 = C14030oh.A02(1255363179);
        C04220Ms.A0B(layoutInflater, 0);
        this.A03 = true;
        View inflate = layoutInflater.inflate(R.layout.layout_ads_consent_growth_bottomsheet, viewGroup, false);
        C04220Ms.A0C(inflate, C28174Ezk.A00(3));
        ((C30938GbW) this.A0G.getValue()).A04(inflate, C35004Ikn.A00(this));
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        this.A0H.CrD(this, Long.valueOf(currentTimeMillis), A0J[0]);
        C107556gw r9 = (C107556gw) this.A0F.getValue();
        Map map = (Map) this.A08.getValue();
        String A004 = AnonymousClass000.A00(922);
        AnonymousClass0wJ.A1M(inflate, 0, map);
        C30938GbW gbW = r9.A01;
        C37021Jix A005 = C37284Jnx.A00(new KtCSuperShape0S1100000_I2(map), Unit.A00, A004);
        A005.A01(r9.A00);
        gbW.A03(inflate, A005.A02());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0I(inflate, R.id.recycler_view);
        this.A02 = recyclerView;
        if (recyclerView == null) {
            C04220Ms.A0E("recyclerView");
            throw null;
        }
        C18200wM.A1H(recyclerView, 1);
        C18240wQ.A12(recyclerView, this.A04);
        recyclerView.setItemAnimator((M0E) null);
        recyclerView.setClipToPadding(false);
        View A0I2 = AnonymousClass0wJ.A0I(inflate, R.id.button_container);
        this.A01 = A0I2;
        this.A00 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(A0I2, R.id.bottom_button);
        String A0q = C18200wM.A0q(this.A0B);
        if (A0q != null) {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
            if (igdsBottomButtonLayout == null) {
                C04220Ms.A0E("button");
                throw null;
            }
            Context requireContext = requireContext();
            String str = ((AnonymousClass58W) this.A0E.getValue()).A03;
            if (C04220Ms.A0I(str, C18170wI.A00(244))) {
                i2 = 2131821206;
            } else if (C04220Ms.A0I(str, "3pd_trial_inline_opt_in")) {
                i2 = 2131821207;
            } else if (C04220Ms.A0I(str, "3pd_trial_inline_opt_out")) {
                i2 = 2131821205;
            } else if (C04220Ms.A0I(str, C18170wI.A00(370))) {
                i2 = 2131827469;
            } else if (C04220Ms.A0I(str, C18170wI.A00(369))) {
                i2 = 2131827462;
            } else if (C04220Ms.A0I(str, C18170wI.A00(294))) {
                i2 = 2131820968;
            } else {
                A003 = AnonymousClass2LU.A00("");
                igdsBottomButtonLayout.setPrimaryAction(C59523Ld.A00(requireContext, A003), new IDxCListenerShape15S1100000_2_I2(A0q, this, 4));
            }
            A003 = new AnonymousClass1kC(new Object[0], i2);
            igdsBottomButtonLayout.setPrimaryAction(C59523Ld.A00(requireContext, A003), new IDxCListenerShape15S1100000_2_I2(A0q, this, 4));
        }
        if (this.A0C.getValue() != null) {
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
            if (igdsBottomButtonLayout2 == null) {
                C04220Ms.A0E("button");
                throw null;
            }
            Context requireContext2 = requireContext();
            String str2 = ((AnonymousClass58W) this.A0E.getValue()).A04;
            if (C04220Ms.A0I(str2, C18170wI.A00(559))) {
                i = 2131821209;
            } else if (C04220Ms.A0I(str2, C18170wI.A00(558))) {
                i = 2131821208;
            } else if (C04220Ms.A0I(str2, C18170wI.A00(785))) {
                i = 2131820973;
            } else {
                A002 = AnonymousClass2LU.A00("");
                igdsBottomButtonLayout2.setSecondaryAction(C59523Ld.A00(requireContext2, A002), C86134wK.A0P(this, 79));
            }
            A002 = new AnonymousClass1kC(new Object[0], i);
            igdsBottomButtonLayout2.setSecondaryAction(C59523Ld.A00(requireContext2, A002), C86134wK.A0P(this, 79));
        }
        C14030oh.A09(-671069711, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-716663230);
        super.onDestroy();
        ((AnonymousClass58W) this.A0E.getValue()).A00 = null;
        C14030oh.A09(621993729, A022);
    }
}
