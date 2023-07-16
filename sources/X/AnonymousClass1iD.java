package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.1iD  reason: invalid class name */
public final class AnonymousClass1iD extends C63873iU {
    public final String A00;
    public final /* synthetic */ UserDetailFragment A01;

    public AnonymousClass1iD(UserDetailFragment userDetailFragment, String str) {
        this.A01 = userDetailFragment;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(1345785950);
        C62973bE.A02(this.A01.getContext(), r3);
        C14030oh.A0A(1426988194, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-787480763);
        C50242sg.A00(this.A01.mView, false);
        C14030oh.A0A(-282783101, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1804688662);
        C50242sg.A00(this.A01.mView, true);
        C14030oh.A0A(667171059, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-923378548);
        int A032 = C14030oh.A03(-1263025965);
        this.A01.A0t.post(new C73274Rt((AnonymousClass1U3) obj, this));
        C14030oh.A0A(-839843185, A032);
        C14030oh.A0A(645626007, A03);
    }
}
