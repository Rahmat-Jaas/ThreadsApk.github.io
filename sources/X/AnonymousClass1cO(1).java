package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxPCleanerShape338S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.1cO  reason: invalid class name */
public class AnonymousClass1cO extends C34640IcN implements C82424pb, C82034oy, C83724rs {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBloksFragment";
    public ViewGroup A00;
    public C121247Ez A01;
    public QuickPromotionSlot A02;
    public boolean A03;
    public boolean A04;
    public C28291u0 A05;
    public C28321u4 A06;
    public boolean A07;
    public final C04530Oa A08 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.CtO(false);
    }

    public String getModuleName() {
        return "quick promotion";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C28291u0 r6;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28321u4 r5 = this.A06;
        if (r5 != null && (r6 = this.A05) != null) {
            C130667qT A062 = r5.A06();
            A062.A01.put(R.id.bloks_action_listener, new C57253Ai(requireContext(), A062, r5, r6, this));
        }
    }

    public final C28321u4 A00() {
        if (this instanceof C28411uE) {
            Bundle requireArguments = requireArguments();
            UserSession A0V = C18180wK.A0V(requireArguments);
            String string = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT");
            if (string == null) {
                string = "MAIN_FEED";
            }
            return new C28311u3((ViewGroup) null, this, this, QuickPromotionSlot.valueOf(string), A0V);
        }
        UserSession A0X = AnonymousClass0wJ.A0X(this.A08);
        QuickPromotionSlot quickPromotionSlot = this.A02;
        if (A0X == null || quickPromotionSlot == null) {
            return null;
        }
        Handler A0F = AnonymousClass0wJ.A0F();
        C61833Vz A002 = C36622Sa.A00();
        C36622Sa.A00();
        return A002.A04(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, (C82904qS) null, (C83704rq) null, new IDxPCleanerShape338S0200000_1_I2(1, A0F, this), (AnonymousClass47H) null, (C561335x) null, (Boolean) null), quickPromotionSlot, A0X);
    }

    public final void C1l(C121247Ez r3, C57253Ai r4) {
        Context context;
        this.A01 = r3;
        C28291u0 r1 = this.A05;
        if (r1 != null) {
            C28321u4 A002 = A00();
            if (A002 != null) {
                A002.CEB(r1);
            }
            View view = this.mView;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            LLF llf = new LLF(context);
            C121247Ez r0 = this.A01;
            if (r0 != null) {
                r0.A06(llf);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.addView(llf);
            }
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public final boolean onBackPressed() {
        C28321u4 r1;
        if (this instanceof C28411uE) {
            return false;
        }
        if (this.A07 && (r1 = this.A06) != null) {
            r1.CEA(this.A05);
        }
        return !this.A07;
    }

    public final void C54(String str) {
        if (isAdded()) {
            C18190wL.A19(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        C28291u0 r1;
        int A022 = C14030oh.A02(1331936430);
        super.onCreate(bundle);
        C24731jw.A00(this);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT");
        if (string != null) {
            this.A02 = QuickPromotionSlot.valueOf(string);
            String string2 = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION");
            if (!(string2 == null || string2.length() == 0)) {
                try {
                    r1 = AnonymousClass3WT.parseFromJson(C18180wK.A0L(string2));
                    if (r1 != null) {
                        this.A07 = AnonymousClass0wJ.A1W(r1.A08.A00);
                        this.A05 = r1;
                        C28321u4 A002 = A00();
                        this.A06 = A002;
                        registerLifecycleListener(A002);
                        C14030oh.A09(-831535102, A022);
                        return;
                    }
                } catch (IOException unused) {
                    C10450iM.A03("IG-QP", "Error parsing fullscreen bloks interstitial promotion");
                }
            }
            r1 = null;
            this.A05 = r1;
            C28321u4 A0022 = A00();
            this.A06 = A0022;
            registerLifecycleListener(A0022);
            C14030oh.A09(-831535102, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-1000319115, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2121546853);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        if (inflate != null) {
            this.A00 = C18240wQ.A0G(inflate, R.id.bloks_container);
        } else {
            inflate = null;
        }
        C14030oh.A09(-1305749622, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1224591180);
        unregisterLifecycleListener(this.A06);
        super.onDestroy();
        C14030oh.A09(82508835, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1807098315);
        C121247Ez r0 = this.A01;
        if (r0 != null) {
            r0.A04();
        }
        this.A01 = null;
        this.A00 = null;
        super.onDestroyView();
        C14030oh.A09(333408857, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1489650485);
        super.onResume();
        if (this.A05 == null || this.A04) {
            if (isAdded()) {
                C18190wL.A19(this);
            }
            this.A03 = true;
        }
        C14030oh.A09(151990368, A022);
    }
}
