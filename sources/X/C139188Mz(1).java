package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.TransactionInfo;

/* renamed from: X.8Mz  reason: invalid class name and case insensitive filesystem */
public final class C139188Mz extends C02220Ah implements AnonymousClass0YY {
    public static final C139188Mz A00 = new C139188Mz();

    public C139188Mz() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TransactionInfo transactionInfo = (TransactionInfo) C86104wH.A0S(obj).A01;
        if (transactionInfo != null) {
            return C122157Kv.A03(transactionInfo);
        }
        return new CurrencyAmount("", "");
    }
}
