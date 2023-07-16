package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7co  reason: invalid class name and case insensitive filesystem */
public final class C125267co implements C81894oZ {
    public final /* synthetic */ AnonymousClass76J A00;
    public final /* synthetic */ SettableFuture A01;

    public C125267co(AnonymousClass76J r1, SettableFuture settableFuture) {
        this.A00 = r1;
        this.A01 = settableFuture;
    }

    public final void Bls(List list, List list2, List list3, List list4) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass76J r2 = this.A00;
        A0y.put("name-autofill-data", AnonymousClass76J.A00(r2, "name-autofill-data", list));
        A0y.put("telephone-autofill-data", AnonymousClass76J.A00(r2, "telephone-autofill-data", list2));
        A0y.put("address-autofill-data", AnonymousClass76J.A00(r2, "address-autofill-data", list3));
        A0y.put("email-autofill-data", AnonymousClass76J.A00(r2, "email-autofill-data", list4));
        this.A01.set(A0y);
    }
}
