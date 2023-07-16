package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rK  reason: invalid class name and case insensitive filesystem */
public final class C64643rK implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;

    public C64643rK(FragmentActivity fragmentActivity, UserSession userSession, long j, long j2) {
        this.A03 = userSession;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(885705638);
        UserSession userSession = this.A03;
        C62803am r6 = C63043bN.A01;
        if (r6.A05(userSession) == 0 && this.A01 == 0) {
            AnonymousClass0wJ.A12(C62803am.A00(r6, userSession), "TAKE_A_BREAK", this.A00 * 60);
        }
        FragmentActivity fragmentActivity = this.A02;
        if (fragmentActivity != null) {
            fragmentActivity.onBackPressed();
        }
        C14030oh.A0C(2052112844, A05);
    }
}
