package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cA  reason: invalid class name */
public final class AnonymousClass1cA extends C34640IcN implements C82424pb, C82034oy, C82024ox {
    public static final String __redex_internal_original_name = "AccountLinkingChildGroupManagementFragment";
    public AnonymousClass1fN A00;
    public UserSession A01;
    public AnonymousClass3Fo A02;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.CtO(true);
        r3.CtT(true);
        r3.setTitle(requireActivity().getString(2131820851));
    }

    public final String getModuleName() {
        return "account_linking_child_group_management";
    }

    public static void A00(AnonymousClass1cA r5, C72144Mm r6, boolean z) {
        UserSession userSession = r5.A01;
        Long A0d = AnonymousClass0wJ.A0d(r6.A01());
        C04220Ms.A0B(userSession, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_my_main_account_disconnect_attempt"), 1357);
        C77494gf.A00(A0I, userSession);
        A0I.A0S("account_id_clicked", A0d);
        A0I.Bb4();
        UserSession userSession2 = r5.A01;
        String A012 = r6.A01();
        H1T A0N = AnonymousClass0wJ.A0N(userSession2);
        C18200wM.A1N(A0N, "multiple_accounts/unlink_from_main_accounts/");
        C32165H8c A0T = C18200wM.A0T(A0N, "main_account_ids", A012);
        if (!z) {
            C63873iU.A0F(A0T, r5, r6, 0);
            r5.schedule(A0T);
            return;
        }
        C31155GhB.A05(A0T, 245, 3, true, false);
    }

    public final void CAL(String str, String str2) {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            C72144Mm r5 = (C72144Mm) it.next();
            if (r5.A01().equals(str2)) {
                C63813iO.A0D(getContext(), C18220wO.A0k(this, AnonymousClass0wJ.A0Y(this.A01).BK7(), r5.A02(), 2131820846), 1);
                A00(this, r5, true);
                AnonymousClass49X.A02(this.A01);
                C18190wL.A19(this);
                return;
            }
        }
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        C18190wL.A19(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        List list;
        int A022 = C14030oh.A02(-1415752113);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0wJ.A0W(this);
        this.A00 = new AnonymousClass1fN(requireContext(), this, this);
        AccountFamily A023 = C62813an.A02(C62813an.A01(this.A01), this.A01);
        if (A023 != null) {
            list = C50492t5.A00(A023.A04);
        } else {
            list = null;
        }
        AnonymousClass1fN r1 = this.A00;
        ArrayList arrayList = r1.A00;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        AnonymousClass1fN.A00(r1);
        this.A02 = new AnonymousClass3Fo(this.A01);
        C14030oh.A09(432970682, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1332168234);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.account_linking_child_group_management_fragment);
        ((AbsListView) A0H.requireViewById(R.id.list_view)).setAdapter(this.A00);
        C14030oh.A09(2143795414, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1562959792);
        super.onDestroy();
        AnonymousClass49X.A02(this.A01);
        C14030oh.A09(1854044197, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-806016793);
        super.onStart();
        this.A02.A00(requireActivity(), false);
        C14030oh.A09(2079227626, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List<C72144Mm> emptyList;
        super.onViewCreated(view, bundle);
        if (this.A00.isEmpty()) {
            AnonymousClass3JQ.A00(requireContext(), C18220wO.A0O(this, 2));
        }
        AccountFamily A022 = C62813an.A02(C62813an.A01(this.A01), this.A01);
        if (A022 != null) {
            emptyList = C50492t5.A00(A022.A04);
        } else {
            emptyList = Collections.emptyList();
        }
        UserSession userSession = this.A01;
        HashSet hashSet = new HashSet(emptyList.size());
        for (C72144Mm A012 : emptyList) {
            hashSet.add(AnonymousClass0wJ.A0d(A012.A01()));
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0W(userSession), "ig_my_main_account_impression"), 1359);
        C77494gf.A00(A0I, userSession);
        A0I.A00.A7d(hashSet, "array_current_main_account_ids");
        A0I.Bb4();
    }
}
