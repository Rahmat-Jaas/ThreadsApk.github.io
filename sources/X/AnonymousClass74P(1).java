package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.74P  reason: invalid class name */
public final class AnonymousClass74P {
    public static McB A00 = C86164wN.A0N(42);
    public static McB A01 = C86164wN.A0N(41);
    public static McB A02 = C86164wN.A0N(43);
    public static final Map A03;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(C40308LcF.A01, C969867m.CREDIT_CARD);
        builder.put(C40308LcF.A06, C969867m.PAYPAL);
        builder.put(C40308LcF.A02, C969867m.DIRECT_DEBIT);
        builder.put(C40308LcF.A07, C969867m.SHOP_PAY);
        A03 = builder.build();
    }
}
