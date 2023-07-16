package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1fX  reason: invalid class name */
public final class AnonymousClass1fX extends C34727Idy implements C27900EvB {
    public L2E A00;
    public AnonymousClass3ET A01;
    public C36380JSp A02 = new C36380JSp();
    public boolean A03;

    public final CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final void A00(User user) {
        if (user != null) {
            clear();
            AnonymousClass3ET r2 = this.A01;
            r2.A00 = user;
            addModel(r2, this.A02, this.A00);
            if (this.A03) {
                notifyDataSetChangedSmart();
            } else {
                updateListView();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public AnonymousClass1fX(Fragment fragment, C11630kW r9, UserSession userSession, User user, boolean z, boolean z2) {
        C37987KFf kFf = new C37987KFf(fragment, r9, new C70584Fh(this), userSession, z);
        this.A00 = kFf;
        AnonymousClass3ET r0 = new AnonymousClass3ET();
        this.A01 = r0;
        r0.A00 = user;
        init(kFf);
        addModel(this.A01, this.A02, this.A00);
        this.A03 = z2;
    }
}
