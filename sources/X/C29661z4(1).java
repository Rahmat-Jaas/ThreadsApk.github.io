package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1z4  reason: invalid class name and case insensitive filesystem */
public final class C29661z4 extends AnonymousClass4NE {
    public final /* synthetic */ AnonymousClass44T A00;

    public C29661z4(AnonymousClass44T r1) {
        this.A00 = r1;
    }

    public final void CGA() {
        C63813iO.A03(this.A00.A01, "report_failed_to_load", 2131831662, 0);
    }

    public final void CMu(String str) {
        String str2;
        AnonymousClass4N5 r4 = (AnonymousClass4N5) this.A00.A0B;
        AnonymousClass3IR r3 = AnonymousClass3IR.A00;
        if (r3 != null) {
            CUX cux = r4.A00;
            FragmentActivity requireActivity = cux.requireActivity();
            UserSession A0X = AnonymousClass0wJ.A0X(cux.A0I);
            if (r4.A01.Apo()) {
                str2 = "317704565734863";
            } else {
                str2 = "2450088378341050";
            }
            r3.A02(A0X, requireActivity, str2);
        }
    }
}
