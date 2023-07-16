package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import java.util.List;

/* renamed from: X.1la  reason: invalid class name and case insensitive filesystem */
public final class C25021la extends FR1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ C10300i6 A02;
    public final /* synthetic */ C145538kf A03;
    public final /* synthetic */ C85964w3 A04;
    public final /* synthetic */ AnonymousClass3HV A05;

    public final int getRunnableId() {
        return 261;
    }

    public C25021la(Context context, C11630kW r2, C10300i6 r3, C145538kf r4, C85964w3 r5, AnonymousClass3HV r6) {
        this.A05 = r6;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            AnonymousClass3HV r6 = this.A05;
            C10300i6 r5 = this.A02;
            C145538kf r4 = this.A03;
            C85964w3 r3 = this.A04;
            C32165H8c A0E = C63883iV.A0E(r5, list);
            A0E.A00 = new IDxACallbackShape15S0300000_1_I2(r5, r3, r6, 11);
            r4.schedule(A0E);
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        if (context != null) {
            return C63633hx.A01(context, this.A01, this.A02, this.A04, "login");
        }
        throw new Exception("the context should not bu null.");
    }
}
