package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4ID  reason: invalid class name */
public final class AnonymousClass4ID implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        RecentAdActivityFragment recentAdActivityFragment = new RecentAdActivityFragment();
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, this.A01);
        A0Q.A03 = recentAdActivityFragment;
        A0Q.A05();
    }

    public AnonymousClass4ID(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
