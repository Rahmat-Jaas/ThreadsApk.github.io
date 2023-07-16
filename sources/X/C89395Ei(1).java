package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.repositoriesimpl.MetaPayConnectRepositoryImpl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.5Ei  reason: invalid class name and case insensitive filesystem */
public final class C89395Ei extends C115616vd implements L3Z, L3Y, L3X {
    public C113336rB A00;
    public C114926u8 A01;
    public C92625ix A02;
    public UserSession A03;
    public String A04;
    public ArrayList A05;
    public C04530Oa A06;
    public C148838sG A07;
    public C148838sG A08;
    public final MetaPayConnectRepositoryImpl A09;

    public C89395Ei(UserSession userSession) {
        this.A03 = userSession;
        this.A05 = AnonymousClass0wJ.A0v();
        this.A09 = new MetaPayConnectRepositoryImpl();
    }

    public static final void A00(C89395Ei r5, L3B l3b) {
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36315855454014284L)) {
            C148838sG r0 = r5.A08;
            if (r0 == null || !r0.isActive()) {
                FragmentActivity activity = l3b.getActivity();
                C148838sG r4 = null;
                if (activity != null) {
                    r4 = C25237DiI.A00((Integer) null, C121437Gd.A00(), C86164wN.A0o(r5, (C146958n9) null, 28), AnonymousClass3J3.A00(activity.getLifecycle()), 2);
                }
                r5.A08 = r4;
            }
        }
    }

    public C89395Ei() {
    }
}
