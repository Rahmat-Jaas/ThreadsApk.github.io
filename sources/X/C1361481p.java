package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.81p  reason: invalid class name and case insensitive filesystem */
public final class C1361481p implements Runnable {
    public final /* synthetic */ AnonymousClass5x0 A00;
    public final /* synthetic */ AnonymousClass6U0 A01;

    public C1361481p(AnonymousClass5x0 r1, AnonymousClass6U0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass5x0 r2 = this.A00;
        boolean z = ((C962864e) this.A01).A00;
        C25786Drz A0Q = C18180wK.A0Q(r2.getActivity(), AnonymousClass0wJ.A0U(r2.A04));
        A0Q.A03 = AnonymousClass6S1.A00(UserMonetizationProductType.USER_PAY, r2.A00, (String) null, r2.A01, false);
        if (!z) {
            A0Q.A0C = false;
        }
        A0Q.A05();
    }
}
