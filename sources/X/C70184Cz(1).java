package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.4Cz  reason: invalid class name and case insensitive filesystem */
public final class C70184Cz implements C33670HsH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public final void onDismiss() {
    }

    public C70184Cz(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, List list, List list2) {
        this.A04 = list;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = list2;
    }

    public final void Bp6(Context context) {
        List list = this.A04;
        if (list == null || list.isEmpty()) {
            List list2 = this.A03;
            if (list2 != null) {
                C50642tK.A00(this.A01, this.A02, "archive_share", list2);
            } else {
                return;
            }
        } else {
            C60113Ns.A01(this.A00, this.A02);
        }
        throw null;
    }
}
