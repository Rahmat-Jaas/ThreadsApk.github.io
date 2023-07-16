package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import com.instagram.universalcreationsheet.UniversalCreationMenuFragment;

/* renamed from: X.3G7  reason: invalid class name */
public final class AnonymousClass3G7 {
    public C37383Jqm A00;
    public Integer A01;
    public final Activity A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final BY0 A05 = new BY0(this);
    public final boolean A06;

    public /* synthetic */ AnonymousClass3G7(Activity activity, C11630kW r3, UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 2);
        this.A02 = activity;
        this.A04 = userSession;
        this.A03 = r3;
        this.A06 = z;
    }

    public final void A00() {
        Bundle A062 = C18180wK.A06();
        UserSession userSession = this.A04;
        C18190wL.A13(A062, userSession.token);
        A062.putBoolean("show_only_main_options", this.A06);
        A062.putBoolean("is_group_profile", false);
        UniversalCreationMenuFragment universalCreationMenuFragment = new UniversalCreationMenuFragment();
        universalCreationMenuFragment.setArguments(A062);
        universalCreationMenuFragment.A02 = this.A05;
        C37032Jj9 A0Y = C18200wM.A0Y(userSession, false);
        C18250wR.A1A(A0Y, this, 9);
        A0Y.A0I = universalCreationMenuFragment;
        Activity activity = this.A02;
        A0Y.A0O = activity.getResources().getString(2131837287);
        this.A00 = C37383Jqm.A00(activity, universalCreationMenuFragment, A0Y.A00());
    }
}
