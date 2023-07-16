package com.facebook.redex;

import X.AnonymousClass135;
import X.C04220Ms;
import X.C83604rg;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;

public class IDxListenerShape477S0100000_1_I2 implements C83604rg {
    public Object A00;
    public final int A01;

    public static final void A00(IDxListenerShape477S0100000_1_I2 iDxListenerShape477S0100000_1_I2, String str) {
        C04220Ms.A0B(str, 0);
        FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) ((AnonymousClass135) iDxListenerShape477S0100000_1_I2.A00).A01.A02.getValue();
        fanClubMemberListViewModel.A0E.CrC(str);
        fanClubMemberListViewModel.A04.A02(str);
    }

    public IDxListenerShape477S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onSearchCleared(String str) {
        if (this.A01 == 0) {
            CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A00;
            CategorySearchFragment.A07(categorySearchFragment, "clear_category_search_box", (String) null);
            categorySearchFragment.mSearchBox.A07("", false);
            CategorySearchFragment.A06(categorySearchFragment);
        }
    }

    public final void onSearchTextChanged(String str) {
        if (this.A01 != 0) {
            A00(this, str);
        }
    }
}
