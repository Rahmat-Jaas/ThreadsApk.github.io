package X;

import android.net.Uri;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.models.W3CCardDetail;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8NE  reason: invalid class name */
public final class AnonymousClass8NE extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NE A00 = new AnonymousClass8NE();

    public AnonymousClass8NE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        ImmutableList immutableList = ((C113886sK) obj).A04;
        if (immutableList != null) {
            ArrayList<FbPayPaymentMethod> A0v = AnonymousClass0wJ.A0v();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                FbPayCreditCard fbPayCreditCard = ((FbPayPaymentMethod) next).A03;
                if (fbPayCreditCard == null || (!fbPayCreditCard.A0B)) {
                    A0v.add(next);
                }
            }
            arrayList = AnonymousClass0wJ.A0w(A0v);
            for (FbPayPaymentMethod fbPayPaymentMethod : A0v) {
                C04220Ms.A04(fbPayPaymentMethod);
                FbPayCreditCard fbPayCreditCard2 = fbPayPaymentMethod.A03;
                C04220Ms.A0A(fbPayCreditCard2);
                Integer num = null;
                Integer num2 = null;
                String str = null;
                Address address = new Address((String) null, (String) null, fbPayCreditCard2.A04, (String) null, (String) null, (String) null, (String) null, fbPayCreditCard2.A0A);
                String str2 = fbPayCreditCard2.A05;
                Uri uri = fbPayPaymentMethod.A01;
                if (uri != null) {
                    str = uri.toString();
                }
                String name = fbPayCreditCard2.A01.name();
                String str3 = fbPayCreditCard2.A06;
                if (str3 != null) {
                    num = C86124wJ.A0h(str3);
                }
                String str4 = fbPayCreditCard2.A07;
                if (str4 != null) {
                    num2 = C86124wJ.A0h(str4);
                }
                CardDetails cardDetails = new CardDetails(address, num, num2, name, str, (String) null, str2, (String) null, fbPayCreditCard2.A09);
                Boolean bool = fbPayCreditCard2.A02;
                if (bool == null) {
                    bool = false;
                }
                arrayList.add(new W3CCardDetail(cardDetails, bool.booleanValue()));
            }
        } else {
            arrayList = null;
        }
        C04220Ms.A0A(arrayList);
        return arrayList;
    }
}
