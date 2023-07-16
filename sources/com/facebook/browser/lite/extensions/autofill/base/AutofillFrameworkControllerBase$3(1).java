package com.facebook.browser.lite.extensions.autofill.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass3W7;
import X.AnonymousClass7K3;
import X.AnonymousClass7KI;
import X.C14030oh;
import X.C86164wN;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.redex.IDxPredicateShape352S0100000_2_I2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class AutofillFrameworkControllerBase$3 extends AutofillContactDataCallback.Stub {
    public final /* synthetic */ AnonymousClass7K3 A00;
    public final /* synthetic */ Set A01;

    public AutofillFrameworkControllerBase$3(AnonymousClass7K3 r3, Set set) {
        this.A00 = r3;
        this.A01 = set;
        C14030oh.A0A(1891850437, C14030oh.A03(1406860485));
    }

    public final void BnY(List list) {
        int A03 = C14030oh.A03(-698202626);
        AnonymousClass7K3 r7 = this.A00;
        List<AutofillData> A032 = AnonymousClass7KI.A03(list);
        r7.A0D = A032;
        Set set = this.A01;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AutofillData autofillData : A032) {
            if (AnonymousClass3W7.A00(new IDxPredicateShape352S0100000_2_I2(set, 3), C86164wN.A0l(autofillData).keySet()) != null) {
                A0v.add(autofillData);
            }
        }
        AnonymousClass7K3.A05(r7, A0v, set, r7.A0D());
        C14030oh.A0A(2030566370, A03);
    }
}
