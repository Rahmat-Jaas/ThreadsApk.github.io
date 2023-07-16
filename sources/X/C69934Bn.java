package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.4Bn  reason: invalid class name and case insensitive filesystem */
public final class C69934Bn implements C33977HyH {
    public final /* synthetic */ C58943Ip A00;

    public final void CEO(DirectShareTarget directShareTarget) {
    }

    public final void CEP(DirectShareTarget directShareTarget) {
        C04220Ms.A0B(directShareTarget, 0);
        C58943Ip r2 = this.A00;
        User user = (User) r2.A06.get(directShareTarget.A04());
        if (user != null) {
            C84474tC r0 = r2.A01;
            if (r0 == null) {
                C04220Ms.A0E("delegate");
                throw null;
            } else {
                r0.D9j(user);
            }
        }
    }

    public final void CEQ(DirectShareTarget directShareTarget) {
    }

    public final void CJ8(String str, boolean z) {
        C04220Ms.A0B(str, 0);
        if (z) {
            C84474tC r0 = this.A00.A01;
            if (r0 == null) {
                C04220Ms.A0E("delegate");
                throw null;
            } else {
                r0.onSearchTextChanged(str);
            }
        }
    }

    public final void onFocusChange(View view, boolean z) {
    }

    public C69934Bn(C58943Ip r1) {
        this.A00 = r1;
    }
}
