package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;

/* renamed from: X.57p  reason: invalid class name and case insensitive filesystem */
public final class C883257p extends C62793ak {
    public int A00 = 0;
    public final C23416Cri A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C883257p(C23416Cri cri, List list) {
        this.A01 = cri;
        this.A03 = list;
        ArrayList<C109986kw> A0x = AnonymousClass0wJ.A0x(list, 10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0x.add(new C109986kw(this, (ProductType) it.next()));
        }
        this.A02 = A0x;
        ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
        for (C109986kw r1 : A0x) {
            C84714tk r5 = r1.A00;
            A0x2.add(C25753DrP.A04(new KtCSuperShape0S0200000_I2((AnonymousClass5HX) r1.A01.getValue(), (BKU) r1.A02.getValue()), AnonymousClass3J5.A00(this), r5, AnonymousClass74I.A00));
        }
        this.A04 = A0x2;
    }

    public static final void A00(C883257p r5, int i) {
        C86074wE r4 = ((C109986kw) r5.A02.get(i)).A01;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r4, (Object) r5, (C146958n9) null, 46), AnonymousClass3J5.A00(r5), 3);
    }
}
