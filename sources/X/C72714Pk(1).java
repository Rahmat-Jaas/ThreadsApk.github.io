package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.4Pk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72714Pk implements Runnable {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C72714Pk(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void run() {
        if (this.A00.isAdded()) {
            throw C18210wN.A0W("tryToNavigateToTabWithIdentifier");
        }
    }
}
