package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1cG  reason: invalid class name */
public final class AnonymousClass1cG extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public static final String __redex_internal_original_name = "WhatsAppLinkingFragment";
    public C84654td A00;
    public TextView A01;
    public TextView A02;
    public C24711ju A03;
    public boolean A04;
    public final C04530Oa A05 = C80644m9.A00(this);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final String getModuleName() {
        return "whats_app_linking_fragment";
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        this.A00 = C67293zJ.A01(this);
    }

    public final void CCX() {
        C04620Ok r1 = C06810aP.A01;
        C04530Oa r5 = this.A05;
        if (r1.A01(AnonymousClass0wJ.A0X(r5)).A2y()) {
            C84654td r0 = this.A00;
            if (r0 != null) {
                C18230wP.A1P(r0);
                return;
            }
            return;
        }
        UserSession A0X = AnonymousClass0wJ.A0X(r5);
        if (C63803iN.A0E(C18180wK.A0J(A0X), A0X, 36328220664015172L)) {
            C84834tw.A00(requireActivity(), C34572Kb.A00(C304921n.IG_WHATSAPP_LINK, AnonymousClass0wJ.A0X(r5)), __redex_internal_original_name, "whatsapp_linking_in_business_conversion_flow");
        } else {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("back_stack_tag", __redex_internal_original_name);
            A0y.put("entrypoint", "whatsapp_linking_in_business_conversion_flow");
            C63743iE A022 = C63743iE.A02("com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen", A0y);
            IgBloksScreenConfig A0N = C18190wL.A0N(AnonymousClass0wJ.A0U(r5));
            C18230wP.A1A(this, A0N, 2131838095);
            AnonymousClass1c8 A023 = C62853b1.A02(A0N, A022);
            C25786Drz A0Q = C18180wK.A0Q(requireActivity(), AnonymousClass0wJ.A0U(r5));
            A0Q.A07 = __redex_internal_original_name;
            A0Q.A08();
            A0Q.A03 = A023;
            A0Q.A05();
        }
        this.A04 = true;
    }

    public final void CJ9() {
        C84654td r0 = this.A00;
        if (r0 != null) {
            C18220wO.A1N(r0);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.setTitle("");
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 175);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final boolean onBackPressed() {
        C84654td r0 = this.A00;
        if (r0 == null) {
            return true;
        }
        C18230wP.A1Q(r0);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(920232911);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.whats_app_linking_fragment, viewGroup, false);
        this.A02 = C18180wK.A0G(inflate, R.id.title);
        this.A01 = C18180wK.A0G(inflate, R.id.subtitle);
        C24711ju r0 = new C24711ju((BusinessNavBar) inflate.findViewById(R.id.navigation_bar), (C84264sr) this, 2131831737, 2131831870);
        this.A03 = r0;
        registerLifecycleListener(r0);
        C14030oh.A09(502942580, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(793008175);
        C24711ju r0 = this.A03;
        if (r0 == null) {
            C04220Ms.A0E("navBarHelper");
            throw null;
        }
        unregisterLifecycleListener(r0);
        super.onDestroyView();
        C14030oh.A09(-36214982, A022);
    }

    public final void onResume() {
        TextView textView;
        int i;
        int A022 = C14030oh.A02(-1898471514);
        super.onResume();
        if (!this.A04 || !C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.A05)).A2y()) {
            boolean A2y = C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.A05)).A2y();
            C24711ju r1 = this.A03;
            if (A2y) {
                if (r1 != null) {
                    r1.A03(false);
                    C24711ju r12 = this.A03;
                    if (r12 != null) {
                        BusinessNavBar businessNavBar = r12.A00;
                        if (businessNavBar != null) {
                            businessNavBar.setPrimaryButtonText(2131831737);
                        } else {
                            IgdsBottomButtonLayout igdsBottomButtonLayout = r12.A02;
                            if (igdsBottomButtonLayout != null) {
                                igdsBottomButtonLayout.setPrimaryActionText(igdsBottomButtonLayout.getResources().getString(2131831737));
                            }
                        }
                        TextView textView2 = this.A02;
                        if (textView2 != null) {
                            textView2.setText(2131838089);
                        }
                        textView = this.A01;
                        if (textView != null) {
                            i = 2131838088;
                        }
                    }
                }
                C04220Ms.A0E("navBarHelper");
                throw null;
            }
            if (r1 != null) {
                r1.A03(true);
                C24711ju r13 = this.A03;
                if (r13 != null) {
                    BusinessNavBar businessNavBar2 = r13.A00;
                    if (businessNavBar2 != null) {
                        businessNavBar2.setPrimaryButtonText(2131824310);
                    } else {
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = r13.A02;
                        if (igdsBottomButtonLayout2 != null) {
                            igdsBottomButtonLayout2.setPrimaryActionText(igdsBottomButtonLayout2.getResources().getString(2131824310));
                        }
                    }
                    TextView textView3 = this.A02;
                    if (textView3 != null) {
                        textView3.setText(2131824312);
                    }
                    textView = this.A01;
                    if (textView != null) {
                        i = 2131824311;
                    }
                }
            }
            C04220Ms.A0E("navBarHelper");
            throw null;
            textView.setText(i);
        } else {
            AnonymousClass0wJ.A0F().post(new C72434Od(this));
            this.A04 = false;
        }
        C14030oh.A09(-277709916, A022);
    }
}
