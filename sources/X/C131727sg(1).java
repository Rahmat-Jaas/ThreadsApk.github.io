package X;

import android.app.Activity;
import android.content.Context;
import java.util.Map;

/* renamed from: X.7sg  reason: invalid class name and case insensitive filesystem */
public final class C131727sg implements C144608im {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ F6u A01;

    public C131727sg(Context context, F6u f6u) {
        this.A01 = f6u;
        this.A00 = context;
    }

    public final void CAi(Map map) {
        C971568d A002 = C121897Ir.A00(map);
        C971568d r0 = C971568d.GRANTED;
        F6u f6u = this.A01;
        if (A002 == r0) {
            f6u.A01((Activity) this.A00);
        } else {
            F6u.A00(AnonymousClass7os.A00, f6u);
        }
    }
}
