package X;

import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7cp  reason: invalid class name and case insensitive filesystem */
public final class C125277cp implements C81894oZ {
    public final /* synthetic */ AnonymousClass76J A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ String A02;

    public C125277cp(AnonymousClass76J r1, SettableFuture settableFuture, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = settableFuture;
    }

    public final void Bls(List list, List list2, List list3, List list4) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String str = this.A02;
        if (NameAutofillData.A00.contains(str)) {
            A0v.addAll(list);
        } else if (TelephoneAutofillData.A01.contains(str)) {
            A0v.addAll(list2);
        } else if (AddressAutofillData.A00.contains(str)) {
            A0v.addAll(list3);
        } else {
            A0v.addAll(list4);
        }
        this.A01.set(A0v);
    }
}
