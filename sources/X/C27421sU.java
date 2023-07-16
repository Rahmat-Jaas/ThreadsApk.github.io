package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.1sU  reason: invalid class name and case insensitive filesystem */
public final class C27421sU extends AnonymousClass1iV {
    public final /* synthetic */ UserDetailFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27421sU(UserDetailFragment userDetailFragment) {
        super(userDetailFragment.getContext());
        this.A00 = userDetailFragment;
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1487713506);
        super.onFinish();
        C50242sg.A00(this.A00.mView, false);
        C14030oh.A0A(-1239935471, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(325611410);
        super.onStart();
        C50242sg.A00(this.A00.mView, true);
        C14030oh.A0A(-1970983029, A03);
    }
}
