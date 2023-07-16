package X;

import android.os.Bundle;
import com.instagram.nux.cal.model.ConnectContent;

/* renamed from: X.4Es  reason: invalid class name and case insensitive filesystem */
public final class C70454Es implements C82774qF {
    public final /* synthetic */ ConnectContent A00;
    public final /* synthetic */ AnonymousClass1iA A01;

    public C70454Es(ConnectContent connectContent, AnonymousClass1iA r2) {
        this.A01 = r2;
        this.A00 = connectContent;
    }

    public final void CwK(Bundle bundle) {
        bundle.putParcelable("extra_cal_nux_content", this.A00);
    }
}
