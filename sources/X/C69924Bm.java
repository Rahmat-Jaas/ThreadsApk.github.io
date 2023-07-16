package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedUtil$loadAndLaunchThread$lifecycleObserver$1;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Bm  reason: invalid class name and case insensitive filesystem */
public final class C69924Bm implements C83534rZ {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ BroadcastChannelActivityFeedUtil$loadAndLaunchThread$lifecycleObserver$1 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C18330wh A04;

    public C69924Bm(FragmentActivity fragmentActivity, C11630kW r2, BroadcastChannelActivityFeedUtil$loadAndLaunchThread$lifecycleObserver$1 broadcastChannelActivityFeedUtil$loadAndLaunchThread$lifecycleObserver$1, UserSession userSession, C18330wh r5) {
        this.A00 = fragmentActivity;
        this.A02 = broadcastChannelActivityFeedUtil$loadAndLaunchThread$lifecycleObserver$1;
        this.A04 = r5;
        this.A03 = userSession;
        this.A01 = r2;
    }

    public final void CN7(I0W i0w) {
        FragmentActivity fragmentActivity = this.A00;
        if (!fragmentActivity.isDestroyed()) {
            fragmentActivity.mLifecycleRegistry.A08(this.A02);
            this.A04.dismiss();
            C18240wQ.A0o();
            throw null;
        }
    }

    public final void onFailure() {
        FragmentActivity fragmentActivity = this.A00;
        if (!fragmentActivity.isDestroyed()) {
            fragmentActivity.mLifecycleRegistry.A08(this.A02);
            this.A04.dismiss();
            C63733iD A022 = C63733iD.A02();
            A022.A0E = "direct_broadcast_chat_activity_feed_item_fetch_thread_failure";
            C63733iD.A07(fragmentActivity, A022, 2131827947);
            C63733iD.A09(C38040KHr.A01, A022);
        }
    }
}
