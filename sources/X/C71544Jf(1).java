package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.4Jf  reason: invalid class name and case insensitive filesystem */
public final class C71544Jf implements C27905EvG {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ C72784Ps A01;

    public final void CBs(int i, String str) {
    }

    public C71544Jf(RectF rectF, C72784Ps r2) {
        this.A01 = r2;
        this.A00 = rectF;
    }

    public final void C1U(boolean z, String str) {
        int count;
        View A0C;
        ReelDashboardFragment reelDashboardFragment = this.A01.A00;
        C149548ty r0 = reelDashboardFragment.mPagerAdapter;
        if (r0 != null && (count = r0.getCount() - 1) == 1 && reelDashboardFragment.mPagerAdapter.getItemViewType(count) == 1 && C28161tl.A04(reelDashboardFragment.A0A).getInt("reel_dashboard_add_to_story_nux_seen_count", 0) < 3 && (A0C = reelDashboardFragment.mImageViewPager.A0C(count)) != null) {
            Context context = A0C.getContext();
            int A03 = C18220wO.A03(context.getResources());
            C25553Dnn dnn = new C25553Dnn(reelDashboardFragment.getActivity(), new C26431qd((CharSequence) context.getString(2131834166)));
            dnn.A02(A0C, 0, (int) ((((float) A0C.getHeight()) / 2.0f) + ((float) A03)), true);
            dnn.A03(D0f.BELOW_ANCHOR);
            dnn.A0D = true;
            dnn.A0B = true;
            dnn.A0A = false;
            AnonymousClass4DQ.A01(dnn, reelDashboardFragment, 12);
        }
    }

    public final void CDE(float f) {
        ReelDashboardFragment.A05(this.A00, this.A01.A00, f);
    }
}
