package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape332S0100000_1_I2;
import com.facebook.redex.IDxEListenerShape509S0100000_1_I2;
import com.facebook.redex.IDxFactoryShape557S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape416S0100000_1_I2;
import com.instagram.arp.profilepicture.upsell.AvatarProfilePictureUpsellViewModel;
import com.instagram.migration.scrollingviewproxy.IDxSListenerShape170S0100000_1_I2;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1wm  reason: invalid class name and case insensitive filesystem */
public final class C29131wm extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AccountOptionsFragment";
    public AvatarProfilePictureUpsellViewModel A00;
    public C28321u4 A01;
    public AnonymousClass47H A02;
    public UserSession A03;
    public final C27930Evg A04 = new IDxEListenerShape509S0100000_1_I2(this, 1);

    public final String getModuleName() {
        return "settings_account_options";
    }

    public static void A0B(C24 c24, C29131wm r9) {
        if (c24 != null) {
            int ArL = c24.ArL();
            C27900EvB APJ = r9.getScrollingViewProxy().APJ();
            if (APJ != null) {
                for (int Aip = c24.Aip(); Aip <= ArL; Aip++) {
                    Object item = APJ.getItem(Aip);
                    if (item instanceof C29311xk) {
                        View AXO = c24.AXO(Aip);
                        r9.A02.A00(AXO, ((C29311xk) item).A00, r9.A01);
                    }
                }
            }
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        int i = 2131820836;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A03, 36316409504074848L)) {
            i = 2131832746;
        }
        C23411dm.A05(this, r5, i);
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i != 12) {
                if (i == 11) {
                    C62423Zt.A02(this.A03);
                    FragmentActivity activity = getActivity();
                    if (activity instanceof ModalActivity) {
                        activity.finish();
                        return;
                    }
                } else {
                    return;
                }
            }
            C18190wL.A19(this);
            C18190wL.A19(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1156771773);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A03 = A0W;
        C36622Sa.A00();
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put(QPTooltipAnchor.A0F, new C70864Gp());
        C04220Ms.A0B(A0W, 0);
        AnonymousClass47H r0 = new AnonymousClass47H(A0W, A0y);
        this.A02 = r0;
        registerLifecycleListener(r0);
        C61833Vz A002 = C36622Sa.A00();
        UserSession userSession = this.A03;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A02;
        C36622Sa.A00();
        C28321u4 A042 = A002.A04(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, (C82904qS) null, new IDxTListenerShape416S0100000_1_I2(this, 1), (C82914qT) null, this.A02, (C561335x) null, (Boolean) null), quickPromotionSlot, userSession);
        this.A01 = A042;
        registerLifecycleListener(A042);
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession2 = this.A03;
        C04220Ms.A0B(userSession2, 0);
        this.A00 = (AvatarProfilePictureUpsellViewModel) new AnonymousClass7IU((C147138nS) new IDxFactoryShape557S0100000_1_I2(userSession2, 0), (AnonymousClass06C) requireActivity).A01(AvatarProfilePictureUpsellViewModel.class);
        C15720rm r4 = new C15720rm("contact_point_update");
        C19335Aud.A00().Bfk(requireContext(), r4, this.A03, C170759vW.ACCOUNT_SETTINGS);
        C14030oh.A09(-2101063433, A022);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1935031280);
        super.onDestroy();
        unregisterLifecycleListener(this.A02);
        unregisterLifecycleListener(this.A01);
        C14030oh.A09(-1075549867, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3YG r3 = new AnonymousClass3YG(requireArguments(), this.A04, this, this, AnonymousClass0wJ.A0W(this));
        ArrayList A0v = AnonymousClass0wJ.A0v();
        r3.A02(AnonymousClass006.A00, "account", A0v);
        setItems(A0v);
        getScrollingViewProxy().A7b(new IDxSListenerShape170S0100000_1_I2(this, 1));
        C18200wM.A0H(this).addOnLayoutChangeListener(new IDxCListenerShape332S0100000_1_I2(this, 1));
        this.A01.A01();
        UserSession userSession = this.A03;
        C04220Ms.A0B(userSession, 1);
        new C684643x(userSession);
        getViewLifecycleOwner();
        throw C18210wN.A0W("observe");
    }
}
