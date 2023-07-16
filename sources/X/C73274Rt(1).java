package X;

import android.os.Bundle;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.4Rt  reason: invalid class name and case insensitive filesystem */
public final class C73274Rt implements Runnable {
    public final /* synthetic */ AnonymousClass1U3 A00;
    public final /* synthetic */ AnonymousClass1iD A01;

    public C73274Rt(AnonymousClass1U3 r1, AnonymousClass1iD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1iD r1 = this.A01;
        String str = r1.A00;
        AnonymousClass3Um r0 = this.A00.A01;
        Bundle A06 = C18180wK.A06();
        r0.A00(A06);
        AnonymousClass2SL.A00(A06, str, (String) null, (String) null, false, false);
        UserDetailFragment userDetailFragment = r1.A01;
        C25786Drz A002 = C63463hW.A00(userDetailFragment.getActivity(), userDetailFragment.A0Y);
        A002.A0A(A06, new AnonymousClass1aA());
        A002.A0C(userDetailFragment, 0);
        A002.A05();
    }
}
