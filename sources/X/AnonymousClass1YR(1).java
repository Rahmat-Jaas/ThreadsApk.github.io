package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YR  reason: invalid class name */
public final class AnonymousClass1YR extends C34640IcN {
    public static final String __redex_internal_original_name = "DirectInboxMessageSettingsFragment";
    public RecyclerView A00;
    public IgLinearLayout A01;
    public UserSession A02;
    public boolean A03;

    public final String getModuleName() {
        return "DIRECT_INBOX_BUSINESS_TOOLS";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0I(view, R.id.direct_inbox_message_settings_recycler_view);
        C04220Ms.A0B(recyclerView, 0);
        this.A00 = recyclerView;
        recyclerView.setAdapter(new I7T(this.A03));
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
            IgLinearLayout igLinearLayout = (IgLinearLayout) AnonymousClass0wJ.A0I(view, R.id.direct_inbox_message_settings_armadillo_title_container);
            C04220Ms.A0B(igLinearLayout, 0);
            this.A01 = igLinearLayout;
            if (this.A03) {
                TextView textView = (TextView) AnonymousClass0wJ.A0I(igLinearLayout, R.id.direct_inbox_message_setting_armadillo_title);
                IgLinearLayout igLinearLayout2 = this.A01;
                if (igLinearLayout2 != null) {
                    C18200wM.A15(requireContext(), textView, 2131825925);
                    C18200wM.A15(requireContext(), (TextView) AnonymousClass0wJ.A0I(igLinearLayout2, R.id.direct_inbox_message_setting_armadillo_subtitle), 2131825924);
                    IgLinearLayout igLinearLayout3 = this.A01;
                    if (igLinearLayout3 != null) {
                        igLinearLayout3.setVisibility(0);
                        return;
                    }
                }
                str = "titleContainer";
            } else {
                return;
            }
        } else {
            str = "recyclerView";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1844826827);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        C14030oh.A09(1258873148, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(234145258);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_message_settings_panel, viewGroup, false);
        C14030oh.A09(832282754, A022);
        return inflate;
    }
}
