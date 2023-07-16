package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.1i3  reason: invalid class name */
public final class AnonymousClass1i3 extends C63873iU {
    public final /* synthetic */ UserDetailFragment A00;

    public AnonymousClass1i3(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A03 = C14030oh.A03(-1969661189);
        C63813iO.A03(C10600ic.A00, "fail_send_confirm_email", 2131827051, 0);
        C14030oh.A0A(-941362784, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1892014868);
        C50242sg.A00(this.A00.mView, false);
        C14030oh.A0A(1845311875, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1507615030);
        C50242sg.A00(this.A00.mView, true);
        C14030oh.A0A(-1144388279, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1123444212);
        C22011Ta r6 = (C22011Ta) obj;
        int A032 = C14030oh.A03(1737794248);
        UserDetailFragment userDetailFragment = this.A00;
        AnonymousClass3LY.A00(userDetailFragment.A0Y).CWx(new C688645t());
        User A0Y = AnonymousClass0wJ.A0Y(userDetailFragment.A0Y);
        A0Y.A1e();
        C18210wN.A1J(userDetailFragment.A0Y, A0Y);
        C62973bE.A03(userDetailFragment.getContext(), r6.A00, r6.A01);
        C14030oh.A0A(-1132228706, A032);
        C14030oh.A0A(-1796434507, A03);
    }
}
