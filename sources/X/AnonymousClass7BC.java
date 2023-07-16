package X;

import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.7BC  reason: invalid class name */
public final class AnonymousClass7BC {
    public static final Map A02(ECPPaymentRequest eCPPaymentRequest, List list) {
        String str;
        ECPPaymentRequest eCPPaymentRequest2 = eCPPaymentRequest;
        C04220Ms.A0B(eCPPaymentRequest2, 1);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            PriceInfo priceInfo = (PriceInfo) next;
            String A0J = AnonymousClass00U.A0J("ITEM_LIST", i);
            String str2 = priceInfo.A04;
            String str3 = priceInfo.A05;
            ItemDetails itemDetails = eCPPaymentRequest2.A04.A09;
            CurrencyAmount currencyAmount = priceInfo.A00;
            String str4 = priceInfo.A03;
            Integer num = priceInfo.A02;
            if (num != null) {
                str = num.toString();
            } else {
                str = null;
            }
            A0w.add(C18180wK.A0p(A0J, AnonymousClass7Kx.A0A(new PuxEntityItem(currencyAmount, AnonymousClass69U.A0W, itemDetails, (String) null, str2, str3, str, str4))));
            i = i2;
        }
        return AnonymousClass4WJ.A0B(A0w);
    }

    public static final AnonymousClass7Kx A00(AnonymousClass7Kx r5) {
        Integer num;
        TransactionInfo transactionInfo = (TransactionInfo) r5.A01;
        Integer num2 = null;
        if (transactionInfo != null) {
            ArrayList<PriceInfo> arrayList = transactionInfo.A09;
            num = transactionInfo.A05;
            num2 = transactionInfo.A04;
            if (arrayList != null) {
                return AnonymousClass7Kx.A0A(new PuxPriceTableItem(AnonymousClass69U.A0b, num, num2, arrayList));
            }
        } else {
            num = null;
        }
        return AnonymousClass7Kx.A02(new IDxFunctionShape152S0200000_2_I2(1, num2, num), r5);
    }

    public static final List A01(String str, Map map) {
        PuxEntityItem puxEntityItem;
        String str2;
        Collection<AnonymousClass7Kx> values = map.values();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass7Kx r0 : values) {
            Object obj = r0.A01;
            if (!(!(obj instanceof PuxEntityItem) || (puxEntityItem = (PuxEntityItem) obj) == null || (str2 = puxEntityItem.A03) == null)) {
                A0v.add(str2);
            }
        }
        ArrayList A0s = C18200wM.A0s(A0v);
        if (A0s.isEmpty() && str != null) {
            A0s.add(str);
        }
        return AnonymousClass00J.A0N(A0s);
    }
}
