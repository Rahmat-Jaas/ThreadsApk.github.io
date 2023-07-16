package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.5ww  reason: invalid class name */
public final class AnonymousClass5ww extends C34640IcN {
    public static final String __redex_internal_original_name = "IGMerchantLoyaltyListFragment";
    public LLF A00;
    public AnonymousClass579 A01;
    public FrameLayout A02;
    public C130667qT A03;
    public C121247Ez A04;
    public C30938GbW A05;
    public String A06;
    public final C04530Oa A07 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "merchant_loyalty_list_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (FrameLayout) view.requireViewById(R.id.merchant_loyalty_container);
        this.A00 = new LLF(requireContext());
        C30938GbW gbW = this.A05;
        if (gbW == null) {
            str = "viewpointManager";
        } else {
            gbW.A04(this.A02, C35004Ikn.A00(this));
            AnonymousClass579 r0 = this.A01;
            if (r0 != null) {
                C86104wH.A1F(this, r0.A00, 288);
                AnonymousClass579 r02 = this.A01;
                if (r02 != null) {
                    A00((C570439n) r02.A00.A08(), this);
                    return;
                }
            }
            str = "igViewModel";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A00(C570439n r5, AnonymousClass5ww r6) {
        FrameLayout frameLayout;
        if (r5 != null && (frameLayout = r6.A02) != null) {
            frameLayout.setVisibility(0);
            C121247Ez r0 = r6.A04;
            frameLayout.removeAllViews();
            if (r0 != null) {
                r0.A04();
            }
            Context requireContext = r6.requireContext();
            C121997Jj r2 = r5.A02;
            C130667qT r1 = r6.A03;
            if (r1 == null) {
                C04220Ms.A0E("igBloksHost");
                throw null;
            }
            C121247Ez A002 = new C58513Fy(requireContext, r2, r1).A00();
            r6.A04 = A002;
            LLF llf = r6.A00;
            if (llf != null) {
                A002.A06(llf);
                if (frameLayout.getChildCount() == 0) {
                    frameLayout.addView(A002.A00);
                    return;
                }
                throw C18180wK.A0a(I17.A00(459));
            }
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1659153280);
        super.onCreate(bundle);
        String string = requireArguments().getString("sessionId");
        if (string != null) {
            this.A06 = string;
            this.A05 = C30938GbW.A00();
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A07);
            C30938GbW gbW = this.A05;
            if (gbW == null) {
                C04220Ms.A0E("viewpointManager");
                throw null;
            }
            this.A03 = C130667qT.A02(this, A0U, gbW);
            C62793ak A012 = C121817Ig.A00(this).A01(AnonymousClass579.class);
            C04220Ms.A0C(A012, "null cannot be cast to non-null type com.fbpay.hub.merchantloyalty.vm.MerchantLoyaltyViewModel<com.instagram.bloks.util.IgBloksRequestTask.BloksParseResponse>");
            this.A01 = (AnonymousClass579) A012;
            C14030oh.A09(1707901813, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-54980623, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1756449573);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_merchant_loyalty_list_section, viewGroup, false);
        C14030oh.A09(-1572799843, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = C14030oh.A02(1643479786);
        super.onResume();
        AnonymousClass579 r0 = this.A01;
        if (r0 == null) {
            str = "igViewModel";
        } else {
            requireContext();
            String str2 = this.A06;
            if (str2 == null) {
                str = "sessionId";
            } else {
                C1194375i r1 = r0.A02;
                Map A0O = AnonymousClass4WK.A0O(C18180wK.A0p("logging_session_id", str2));
                C94855xi r2 = new C94855xi(r1);
                AnonymousClass4A9 r02 = new AnonymousClass4A9(C63263h8.A02(r1.A01, "com.bloks.www.fbpay.merchant_loyalty_list", (String) null, A0O, 0, 0, false));
                r02.A00 = r2;
                C31155GhB.A03(r02);
                C14030oh.A09(1465279899, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
