package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass919;
import X.C12560m7;
import X.C18180wK;
import X.C18190wL;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

public final class InjectMediaToolFragmentAdapter extends AnonymousClass919 {
    public final int tabCount;
    public final UserSession userSession;

    public int getCount() {
        return this.tabCount;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InjectMediaToolFragmentAdapter(C12560m7 r1, UserSession userSession2, int i) {
        super(r1);
        AnonymousClass0wJ.A1O(r1, userSession2);
        this.userSession = userSession2;
        this.tabCount = i;
    }

    public Fragment createItem(int i) {
        String str;
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, this.userSession.token);
        InjectMediaFragment injectMediaFragment = new InjectMediaFragment();
        if (i == 0) {
            str = "organic";
        } else if (i == 1) {
            str = "ads";
        } else if (i == 2) {
            str = "netego";
        } else {
            throw C18190wL.A0a("Invalid Position");
        }
        A06.putString("content_type_key", str);
        injectMediaFragment.setArguments(A06);
        return injectMediaFragment;
    }
}
