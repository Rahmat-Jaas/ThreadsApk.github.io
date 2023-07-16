package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6jP  reason: invalid class name and case insensitive filesystem */
public final class C109066jP {
    public final KtCSuperShape0S2110000_I2 A00;
    public final Integer A01;
    public final List A02;

    public C109066jP(Integer num, List list) {
        Object obj;
        this.A02 = list;
        this.A01 = num;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((KtCSuperShape0S2110000_I2) obj).A03) {
                break;
            }
        }
        this.A00 = (KtCSuperShape0S2110000_I2) obj;
    }
}
