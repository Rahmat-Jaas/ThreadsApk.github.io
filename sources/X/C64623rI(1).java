package X;

import android.app.Activity;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rI  reason: invalid class name and case insensitive filesystem */
public final class C64623rI implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C64623rI(Activity activity, UserSession userSession, String str, String str2) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1204194148);
        C37350Jpy A0Y = C18230wP.A0Y(this.A00, this.A01, C171209wF.A19, this.A02);
        A0Y.A07(this.A03);
        A0Y.A04();
        C14030oh.A0C(-1275364390, A05);
    }
}
