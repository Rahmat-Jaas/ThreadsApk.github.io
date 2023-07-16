package X;

import android.graphics.RectF;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.4Ps  reason: invalid class name and case insensitive filesystem */
public final class C72784Ps implements Runnable {
    public final /* synthetic */ ReelDashboardFragment A00;

    public C72784Ps(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void run() {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (reelDashboardFragment.isVisible()) {
            RectF A002 = ReelDashboardFragment.A00(reelDashboardFragment);
            ReelDashboardFragment.A01(reelDashboardFragment).A0R((RectF) null, A002, reelDashboardFragment, new C71544Jf(A002, this));
        }
    }
}
