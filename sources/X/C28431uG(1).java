package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

/* renamed from: X.1uG  reason: invalid class name and case insensitive filesystem */
public final class C28431uG extends C28451uI {
    public final /* synthetic */ AnonymousClass601 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28431uG(Fragment fragment, AnonymousClass601 r12, RegFlowExtras regFlowExtras, C07530bf r14, C313625r r15) {
        super(fragment, (C82824qK) null, regFlowExtras, r14, r15, (Integer) null, (String) null, false, false);
        this.A00 = r12;
    }

    public final void A03(User user) {
        super.A03(user);
        AnonymousClass601 r1 = this.A00;
        C04220Ms.A0B(r1, 0);
        FragmentActivity A05 = C63913ic.A05(r1);
        if (A05 instanceof C81594o3) {
            ((SignedOutFragmentActivity) ((C81594o3) A05)).A0A = true;
        }
    }
}
