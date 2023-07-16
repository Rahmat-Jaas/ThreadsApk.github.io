package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3jN  reason: invalid class name and case insensitive filesystem */
public final class C64033jN implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C64033jN(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C61863Wc.A01(this.A00, this.A02, this.A03, this.A01.getModuleName(), "checkout_awareness_dialog_learn_more", this.A04);
    }
}
