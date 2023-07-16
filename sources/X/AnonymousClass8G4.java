package X;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;

/* renamed from: X.8G4  reason: invalid class name */
public final class AnonymousClass8G4 extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8G4 A00 = new AnonymousClass8G4();

    public AnonymousClass8G4() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C04530Oa r7 = AnonymousClass7DD.A07;
        Pair[] pairArr = {C18180wK.A0p("cc-number", new C134697yC((Set) r7.getValue(), "cc[._\\-\\s]?number|credit[._\\-\\s]?card[._\\-\\s]?number|card[._\\-\\s]?Number|cc[._\\-\\s]?num|card[._\\-\\s]?No|number[._\\-\\s]?cc|card[._\\-\\s]?num|num[._\\-\\s]?card|number[._\\-\\s]?card|numer[._\\-\\s]?karty|n[uú]m[eé]ro.+tarjeta|n[uú]m[eé]ro.+carte|kortnummer|^[0123456789xX•*]{4}[- ][0123456789xX•*]{4}[- ][0123456789xX•*]{4}[- ][0123456789xX•*]{4}$|^credit[._\\-\\s]?card$|^cartão[._\\-\\s]?de[._\\-\\s]?crédito$|^tarjeta[._\\-\\s]?de[._\\-\\s]?crédito$|^carte[._\\-\\s]?de[._\\-\\s]?crédit$|^carta[._\\-\\s]?de[._\\-\\s]?credito$|^Card[._\\-\\s]?de[._\\-\\s]?credit$|^kredi[._\\-\\s]?kartı$|^kreditkarte$|^kreditkort$")), C18180wK.A0p("cc-csc", new C134697yC((Set) r7.getValue(), "cvv|cc[.\\-_\\s]?csc|credit[.\\-_\\s]?card[.\\-_\\s]?cvc|cvv[.\\-_\\s]?num|payment\\[card[.\\-_\\s]?code\\]|payment[\\-_\\s:]?ccv|cvc|payment\\.cvc|[sS]ecurity.*[cC]ode|[cC]v[vn]|CV[VN]|credit[.\\-_]?card[.\\-_]?security|^card_code$|card[s]?[.\\-_\\s]?ccv|cc[.\\-_\\s]?ccv|cc[.\\-_\\s]cid|^ccv$|card[.\\-_\\s]?verification[.\\-_\\s]?code|credit[.\\-_\\s]?card[.\\-_\\s]?cv2|cc[.\\-_\\s]?cv2|card[.\\-_\\s]?cv2")), C18180wK.A0p("cc-exp-year", new C134697yC((Set) r7.getValue(), "\"cc[.\\-_\\s]?exp[.\\-_\\s]?year|exp[.\\-_\\s]?year|credit[.\\-_\\s]?card[.\\-_\\s]?year|card[.\\-_\\s]?exp[.\\-_\\s]?year|[eE]xpir.*[yY]ear|[cC]redit.*[cC]ard.*[yY]ear|credito_ano")), C18180wK.A0p("cc-exp-month", new C134697yC((Set) r7.getValue(), "cc[.\\-_\\s]?exp[.\\-_\\s]?month|exp[.\\-_\\s]?month|credit[.\\-_\\s]?card[.\\-_\\s]?month|card[.\\-_\\s]?exp[.\\-_\\s]?month|[eE]xpir.*[mM]onth|[cC]redit.*[cC]ard.*[mM]onth|credito_mes")), C18180wK.A0p("cc-exp", new C134697yC((Set) r7.getValue(), "cc[.\\-_\\s]?exp|expiryDate|expiry|[eE]xpir.*[dD]ate|[eE]xp.*[dD]ate|[cC]ard.*[eE]xpir|([cC]ard|[eE]xpir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|expiration|mm\\s*[\\-_/]\\s*aa|mm\\s*[\\-_/]\\s*yy|^mm\\s*[\\-_/]\\s*rr$"))};
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(5));
        AnonymousClass4WJ.A0K(A0v, pairArr);
        return A0v;
    }
}
