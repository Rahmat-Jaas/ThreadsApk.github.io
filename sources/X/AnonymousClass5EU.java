package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.5EU  reason: invalid class name */
public class AnonymousClass5EU extends AnonymousClass55x {
    public AnonymousClass7K3 A00;
    public Boolean A01;
    public Boolean A02;

    public AnonymousClass5EU() {
        Boolean A0X = C18180wK.A0X();
        this.A02 = A0X;
        this.A01 = A0X;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Bundle bundle;
        String str;
        String str2;
        super.onCancel(dialogInterface);
        AnonymousClass7K3 r3 = this.A00;
        if (r3 != null && (bundle = this.mArguments) != null) {
            AutofillData autofillData = (AutofillData) bundle.getParcelable("contact_info");
            CardDetails cardDetails = (CardDetails) this.mArguments.getParcelable("payment_info");
            if (autofillData != null || cardDetails != null) {
                C1200778k r5 = new C1200778k(autofillData, cardDetails);
                r3.A0M = true;
                C89405Ej r4 = r3.A02;
                if (r4.A03().equals(AnonymousClass006.A00)) {
                    str = "DECLINED_ADD_NEW_CARD";
                } else {
                    str = "DECLINED_SAVE";
                }
                AnonymousClass78Q A002 = AnonymousClass7K3.A00(r4, r3, str);
                AutofillData autofillData2 = r5.A00;
                if (autofillData2 != null) {
                    str2 = "CONTACT_AND_PAYMENT_AUTOFILL";
                } else {
                    str2 = "PAYMENT_AUTOFILL";
                }
                A002.A0F = str2;
                HashSet A0u = C18200wM.A0u();
                if (r5.A01 != null) {
                    A0u.addAll(C103836ao.A05);
                }
                if (autofillData2 != null) {
                    A0u.addAll(AnonymousClass7KI.A04(Arrays.asList(new AutofillData[]{autofillData2})));
                }
                A002.A05 = AnonymousClass7KI.A01(A0u);
                AnonymousClass78Q.A00(A002);
                if (r4.A03().equals(AnonymousClass006.A0C)) {
                    A002.A0G = "NOT_NOW_CLICK";
                    AnonymousClass78Q.A00(A002);
                }
            }
        }
    }
}
