package X;

import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.8G3  reason: invalid class name */
public final class AnonymousClass8G3 extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8G3 A00 = new AnonymousClass8G3();

    public AnonymousClass8G3() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        C04530Oa r4 = AnonymousClass7DD.A07;
        builder.put("cc-number", new C134697yC(C86114wI.A0v(builder, "cc-csc", new C134697yC(C86114wI.A0v(builder, "cc-exp", new C134697yC(C86114wI.A0v(builder, "cc-exp-month", new C134697yC(C86114wI.A0v(builder, "cc-exp-year", new C134697yC(C86114wI.A0v(builder, "cc-type", new C134697yC(C86114wI.A0v(builder, "cc-name", new C134697yC(C86114wI.A0v(builder, "cc-family-name", new C134697yC(C86114wI.A0v(builder, "cc-additional-name", new C134697yC((Set) r4.getValue(), "cc[\\-_\\s]?additional[\\-_\\s]?name"), r4), "cc[\\-_\\s]?family[\\-_\\s]?name|[cC]ard.*[lL]ast.*[nN]ame|[cC]ard.*[fF]amily.*[nN]ame"), r4), "cc[\\-_\\s]?name|[nN]ame.*[oO]n.*[cC]ard|[cC]ard.*[nN]ame|[cC][cC].?[nN]ame|[cC]ard.*[oO]wner|[cC]ard.*[hH]older.*[nN]ame"), r4), "cc-type"), r4), "cc[\\-_\\s]?exp[\\-_\\s]?year|exp[\\-_\\s]?year|credit[\\-_\\s]?card[\\-_\\s]?year|card[\\-_\\s]?exp[\\-_\\s]?year|[eE]xpir.*[yY]ear|[cC]redit.*[cC]ard.*[yY]ear"), r4), "cc[\\-_\\s]?exp[\\-_\\s]?month|exp[\\-_\\s]?month|credit[\\-_\\s]?card[\\-_\\s]?month|card[\\-_\\s]?exp[\\-_\\s]?month|[eE]xpir.*[mM]onth|[cC]redit.*[cC]ard.*[mM]onth"), r4), "cc[\\-_\\s]?exp|expiryDate|expiry|[eE]xpir.*[dD]ate|[eE]xp.*[dD]ate|[cC]ard.*[eE]xpir|([cC]ard|[eE]xpir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|expiration|mm\\s*[\\-_/]\\s*aa|mm\\s*[\\-_/]\\s*yy"), r4), "cvv|cc[\\-_\\s]?csc|credit[\\-_\\s]?card[\\-_\\s]?cvc|cvv[\\-_\\s]?num|payment\\[card[\\-_\\s]?code\\]|payment[\\-_\\s:]?ccv|cvc|payment\\.cvc|[sS]ecurity.*[cC]ode|[cC]v[vn]|CV[VN]"), r4), "cc[_\\-\\s]?number|credit[_\\-\\s]?card[_\\-\\s]?number|card[_\\-\\s]?Number|cc[_\\-\\s]?num|card[_\\-\\s]?No|number[_\\-\\s]?cc|card[_\\-\\s]?num|num[_\\-\\s]?card|number[_\\-\\s]?card|numer[_\\-\\s]?karty|n[uú]m[eé]ro.+tarjeta|n[uú]m[eé]ro.+carte|^[0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}$"));
        return builder.build();
    }
}
