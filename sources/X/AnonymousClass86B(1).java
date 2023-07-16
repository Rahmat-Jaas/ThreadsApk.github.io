package X;

import android.content.Context;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;

/* renamed from: X.86B  reason: invalid class name */
public final class AnonymousClass86B implements AnonymousClass0ZU {
    public final /* synthetic */ C89405Ej A00;
    public final /* synthetic */ AutofillConnectPayload A01;
    public final /* synthetic */ AutofillData A02;
    public final /* synthetic */ Boolean A03;

    public AnonymousClass86B(C89405Ej r1, AutofillConnectPayload autofillConnectPayload, AutofillData autofillData, Boolean bool) {
        this.A00 = r1;
        this.A02 = autofillData;
        this.A01 = autofillConnectPayload;
        this.A03 = bool;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C1200778k r0;
        C89405Ej r4 = this.A00;
        r4.A0R = true;
        AnonymousClass7K3 r1 = r4.A06;
        Context context = r4.A00;
        context.getClass();
        r1.A09(context);
        AnonymousClass7K3 r3 = r4.A06;
        AutofillData autofillData = this.A02;
        CardDetails cardDetails = (CardDetails) C18240wQ.A0b(this.A01.A03);
        if (autofillData == null && cardDetails == null) {
            r0 = null;
        } else {
            r0 = new C1200778k(autofillData, cardDetails);
        }
        if (!(r3 == null || r0 == null)) {
            r3.A0B(r0);
            r4.A08 = r0;
        }
        r4.A08(autofillData);
        r4.A0F = "connect_opt_in";
        C89405Ej.A01(r4, "SUCCEEDED_CONNECT", this.A03.booleanValue());
        return null;
    }
}
