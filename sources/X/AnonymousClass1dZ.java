package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape538S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.io.File;
import java.util.Set;

/* renamed from: X.1dZ  reason: invalid class name */
public final class AnonymousClass1dZ extends I5x implements C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionDebugListFragment";
    public C65763vj A00;
    public AnonymousClass3EU A01;
    public C567538k A02;
    public UserSession A03;
    public RefreshableListView A04;
    public final Set A05 = C18200wM.A0u();

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtT(true);
        AnonymousClass4u2.A02(this, r2, 2131825617);
    }

    public final String getModuleName() {
        return "qp_debug_list";
    }

    public final C10300i6 A0I() {
        return this.A03;
    }

    public final void A0L() {
        int i;
        Set set = this.A05;
        if (set.isEmpty()) {
            for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                if (!set.contains(quickPromotionSlot) && QuickPromotionSlot.A0t != quickPromotionSlot) {
                    set.add(quickPromotionSlot);
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append(requireContext().getCacheDir());
                    A0r.append("/");
                    A0r.append(quickPromotionSlot.name());
                    File file = new File(C18180wK.A0i(RealtimeLogsProvider.LOG_SUFFIX, A0r));
                    Context context = getContext();
                    if (context != null) {
                        i = C18190wL.A03(context);
                    } else {
                        i = 1;
                    }
                    C32165H8c A002 = C60933Rd.A00(quickPromotionSlot, this.A03, AnonymousClass006.A01, i);
                    A002.A00 = new IDxACallbackShape15S0300000_1_I2(14, (Object) file, (Object) quickPromotionSlot, (Object) this);
                    schedule(A002);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-140694980);
        super.onCreate(bundle);
        this.A03 = C18180wK.A0V(this.mArguments);
        this.A01 = new AnonymousClass3EU();
        this.A02 = new C567538k();
        C14030oh.A09(-67619032, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1925060376);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.quick_promotion_slot_list_fragment);
        C14030oh.A09(-1943228566, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C65763vj r0 = new C65763vj(getContext());
        this.A00 = r0;
        A0F(r0);
        C018908v.A00(this);
        RefreshableListView refreshableListView = (RefreshableListView) this.A05;
        this.A04 = refreshableListView;
        refreshableListView.setOnItemClickListener(new IDxCListenerShape538S0100000_1_I2(this, 2));
        this.A04.setupAndEnableRefresh(C18210wN.A0H(this, 58));
        C18230wP.A17(AnonymousClass0wJ.A0L(view, R.id.slot_search_edit_text), this, 20);
        A0L();
    }
}
