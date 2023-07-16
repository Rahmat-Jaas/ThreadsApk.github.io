package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.1dX  reason: invalid class name */
public final class AnonymousClass1dX extends C34640IcN implements C83164qt {
    public static final String __redex_internal_original_name = "FollowListSortingOptionsFragment";
    public C83164qt A00;
    public C309523p A01;
    public AnonymousClass11N A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void CLT(C309523p r4) {
        C04220Ms.A0B(r4, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, AnonymousClass0wJ.A0U(this.A03)), "follow_list_did_select_sorting_option"), 652);
        if (r4 != C309523p.DEFAULT) {
            A0I.A0T("order", r4.A00);
        }
        A0I.Bb4();
        C83164qt r0 = this.A00;
        if (r0 != null) {
            r0.CLT(r4);
        }
        C18180wK.A13(this);
    }

    public final String getModuleName() {
        return "follow_list_sorting_selection";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(650541067);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("FollowListSortingOptionsFragment.SortingType");
        C04220Ms.A0C(serializable, "null cannot be cast to non-null type com.instagram.user.userlist.model.SortingType");
        this.A01 = (C309523p) serializable;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C309523p[] values = C309523p.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C309523p r3 = values[i];
            String A002 = C50572tD.A00(requireContext(), r3);
            C309523p r0 = this.A01;
            if (r0 == null) {
                C04220Ms.A0E("sortingTypeSelected");
                throw null;
            } else {
                A0v.add(new AnonymousClass3B2(r3, A002, C18180wK.A1Z(r3, r0)));
                i++;
            }
        }
        this.A02 = new AnonymousClass11N(this, A0v);
        C14030oh.A09(-654152053, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-124025906);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.follow_list_sorting_options_fragment, false);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(A0D, R.id.follow_list_sorting_options_recycler_view);
        requireContext();
        C18190wL.A1D(recyclerView);
        AnonymousClass11N r0 = this.A02;
        if (r0 == null) {
            C04220Ms.A0E("followListSortingOptionsListAdapter");
            throw null;
        }
        recyclerView.setAdapter(r0);
        C14030oh.A09(1828178741, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(756779747);
        super.onResume();
        AnonymousClass7JU.A04(AnonymousClass0wJ.A0K(requireView(), R.id.follow_list_sorting_options_fragment_title), 500);
        C14030oh.A09(1081064923, A022);
    }
}
