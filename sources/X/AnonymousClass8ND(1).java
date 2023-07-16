package X;

import com.facebook.pando.TreeJNI;
import com.fbpay.w3c.Address;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8ND  reason: invalid class name */
public final class AnonymousClass8ND extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8ND A00 = new AnonymousClass8ND();

    public AnonymousClass8ND() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        ImmutableList immutableList;
        C113576rk r14 = (C113576rk) obj;
        if (r14 == null || (immutableList = r14.A01) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass0wJ.A0w(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                TreeJNI A0G = C18210wN.A0G(it);
                arrayList.add(new Address(A0G.getStringValue("care_of"), A0G.getStringValue("city_name"), (String) null, C18250wR.A0X(A0G), A0G.getStringValue("state_name"), A0G.getStringValue("street1"), A0G.getStringValue("street2"), A0G.getStringValue("postal_code")));
            }
        }
        C04220Ms.A0A(arrayList);
        return arrayList;
    }
}
