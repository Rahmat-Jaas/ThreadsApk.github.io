package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.428  reason: invalid class name */
public final class AnonymousClass428 implements C82164pB {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C63893iY A02;
    public final /* synthetic */ UserSession A03;

    public AnonymousClass428(Fragment fragment, AnonymousClass601 r2, C63893iY r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = fragment;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void D8w() {
        if (AnonymousClass4Aj.A0A == AnonymousClass296.IG_EDIT_PROFILE) {
            C25667Dpo.A00(this.A03).A00 = true;
            C18180wK.A12(this.A00);
        }
        Object A0B = C63893iY.A0B(this.A02, 0);
        if (A0B instanceof C105916eC) {
            C109326jp r3 = ((C105916eC) A0B).A00;
            AnonymousClass601 r2 = this.A01;
            AnonymousClass3RS.A00 = r2;
            C61043Rr.A00(r2, new C63893iY(AnonymousClass3VO.A00().A00), r3);
        }
    }
}
