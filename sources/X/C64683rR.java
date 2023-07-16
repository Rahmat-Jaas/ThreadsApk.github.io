package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rR  reason: invalid class name and case insensitive filesystem */
public final class C64683rR implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    public C64683rR(Activity activity, Bundle bundle, UserSession userSession, String str, int i) {
        this.A03 = userSession;
        this.A04 = str;
        this.A01 = activity;
        this.A00 = i;
        this.A02 = bundle;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(76085466);
        C63343hJ.getInstance();
        C71494Ja r3 = new C71494Ja(this.A03);
        r3.CpK(this.A04);
        Activity activity = this.A01;
        r3.A07 = activity.getResources().getString(this.A00);
        r3.Cod(this.A02);
        r3.A08 = true;
        r3.BaN(activity);
        C14030oh.A0C(1605113420, A05);
    }
}
