package X;

import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.8G2  reason: invalid class name */
public final class AnonymousClass8G2 extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8G2 A00 = new AnonymousClass8G2();

    public AnonymousClass8G2() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("cc-number", new C134697yC((Set) AnonymousClass7DD.A07.getValue(), "swisspass|student|wellness|traveller|shipping|user[_\\-\\s]?id|passsword|reward|charm|student|club|valid|voucher|passport|gift|password|identity|phone|id[_\\-\\s]?card|family|name|district|super[_\\-\\s]?card|loyalty|member|isic|rcpt|country[._\\-\\s]?code|formCountry|formState|zip[._\\-\\s]?code|e[._\\-\\s]?mail"));
        return builder.build();
    }
}
