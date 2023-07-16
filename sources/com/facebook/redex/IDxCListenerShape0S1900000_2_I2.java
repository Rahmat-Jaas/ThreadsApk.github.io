package com.facebook.redex;

import X.AnonymousClass6BF;
import X.AnonymousClass6VS;
import X.BKU;
import X.C145018jf;
import X.C15680ri;
import X.C20066BMj;
import X.C25917DvL;
import X.C27950Ew0;
import android.content.DialogInterface;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCListenerShape0S1900000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public String A09;
    public final int A0A;

    public IDxCListenerShape0S1900000_2_I2(C15680ri r1, BKU bku, C20066BMj bMj, SearchContext searchContext, UserSession userSession, C27950Ew0 ew0, C25917DvL dvL, User user, C145018jf r9, String str, int i) {
        this.A0A = i;
        if (i != 0) {
            this.A08 = dvL;
            this.A07 = userSession;
            this.A06 = user;
        } else {
            this.A06 = user;
            this.A07 = userSession;
            this.A08 = dvL;
        }
        this.A00 = ew0;
        this.A02 = bku;
        this.A03 = bMj;
        this.A01 = r1;
        this.A05 = r9;
        this.A09 = str;
        this.A04 = searchContext;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        User user;
        UserSession userSession;
        C25917DvL dvL;
        if (this.A0A != 0) {
            dvL = (C25917DvL) this.A08;
            userSession = (UserSession) this.A07;
            user = (User) this.A06;
        } else {
            user = (User) this.A06;
            userSession = (UserSession) this.A07;
            AnonymousClass6VS.A00(AnonymousClass6BF.USER_SELECTED_CONTINUE_ON_DIALOG, userSession, user);
            dvL = (C25917DvL) this.A08;
        }
        BKU bku = (BKU) this.A02;
        C20066BMj bMj = (C20066BMj) this.A03;
        C15680ri r0 = (C15680ri) this.A01;
        String str = this.A09;
        C25917DvL.A01(r0, bku, bMj, (SearchContext) this.A04, userSession, (C27950Ew0) this.A00, dvL, user, str);
    }
}
