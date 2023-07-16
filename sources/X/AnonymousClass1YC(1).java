package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.facebook.redex.IDxObserverShape27S0400000_1_I2;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YC  reason: invalid class name */
public final class AnonymousClass1YC extends C34640IcN {
    public static final String __redex_internal_original_name = "AddAccountBottomSheetFragment";
    public AnonymousClass3FR A00;
    public UserSession A01;
    public String A02;
    public FxSsoViewModel A03;

    public final String getModuleName() {
        return "add_account_bottom_sheet";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1512729380);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C18180wK.A0V(requireArguments);
        this.A02 = requireArguments.getString("AddAccountBottomSheetFragment.ARGUMENT_ENTRY_POINT");
        this.A00 = new AnonymousClass3FR(requireActivity(), this.A01, true);
        this.A03 = C18200wM.A0X(this);
        C14030oh.A09(472094527, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int i;
        AnonymousClass0TJ r2;
        int A022 = C14030oh.A02(-1739718917);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            igdsBottomButtonLayout = null;
            i = -792248591;
        } else {
            UserSession userSession = this.A01;
            AnonymousClass0BO r3 = userSession.multipleAccountHelper;
            Bundle bundle2 = r3.A0C(activity, userSession, this.A02, false).A00;
            igdsBottomButtonLayout = new IgdsBottomButtonLayout(requireContext());
            igdsBottomButtonLayout.setPrimaryAction(activity.getResources().getString(2131830112), new IDxCListenerShape41S0300000_1_I2(bundle2, activity, this, 58));
            AnonymousClass3FR r1 = this.A00;
            if (r1 != null) {
                boolean z = r1.A01;
                C10300i6 r5 = r1.A00;
                if (z) {
                    r2 = AnonymousClass0TJ.A05;
                } else {
                    r2 = AnonymousClass0TJ.A06;
                }
                if (C63803iN.A05(r2, r5, 36314889085520081L).booleanValue()) {
                    this.A03.A02(requireActivity(), bundle2, this.A01);
                    C18230wP.A0J(this.A03.A03).A0C(activity, new IDxObserverShape27S0400000_1_I2(3, bundle2, activity, igdsBottomButtonLayout, this));
                }
            }
            igdsBottomButtonLayout.setSecondaryAction(activity.getResources().getString(2131824549), new IDxCListenerShape41S0300000_1_I2(59, (Object) this, (Object) activity, (Object) r3));
            i = -1566353457;
        }
        C14030oh.A09(i, A022);
        return igdsBottomButtonLayout;
    }
}
