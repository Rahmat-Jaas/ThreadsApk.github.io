package X;

import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;

/* renamed from: X.1hJ  reason: invalid class name */
public final class AnonymousClass1hJ extends C63873iU {
    public final String A00;
    public final /* synthetic */ ShortUrlReelLoadingFragment A01;

    public AnonymousClass1hJ(ShortUrlReelLoadingFragment shortUrlReelLoadingFragment, String str) {
        this.A01 = shortUrlReelLoadingFragment;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A03 = C14030oh.A03(85446051);
        ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01;
        shortUrlReelLoadingFragment.mLoadingSpinner.setLoadingStatus(AnonymousClass69F.FAILED);
        AnonymousClass0wJ.A17(shortUrlReelLoadingFragment.mLoadingSpinner, 339, this);
        C63813iO.A03(shortUrlReelLoadingFragment.getActivity(), "unknown_error_occured", 2131837305, 0);
        C14030oh.A0A(992090156, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(397053986);
        AnonymousClass1U0 r5 = (AnonymousClass1U0) obj;
        int A032 = C14030oh.A03(168789099);
        if (r5 != null) {
            C25586DoM.A02(this.A01.A00, r5.A04, "short_url_to_profile_and_launch_reel", "short_url_reel_loading_fragment");
            C60113Ns.A00();
            throw null;
        }
        C14030oh.A0A(-73599571, A032);
        C14030oh.A0A(956623604, A03);
    }
}
