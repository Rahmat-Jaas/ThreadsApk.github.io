package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.4Rs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73264Rs implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserDetailFragment A01;

    public /* synthetic */ C73264Rs(View view, UserDetailFragment userDetailFragment) {
        this.A01 = userDetailFragment;
        this.A00 = view;
    }

    public final void run() {
        UserDetailFragment userDetailFragment = this.A01;
        View view = this.A00;
        C25553Dnn A002 = AnonymousClass4DS.A00(userDetailFragment.requireActivity(), 2131827097);
        C18230wP.A15(view, A002);
        C18200wM.A1Q(A002);
    }
}
