package X;

import com.facebook.forker.Process;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.6OS  reason: invalid class name */
public final class AnonymousClass6OS {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        C127397h3 A03 = C63893iY.A03(r9, AnonymousClass0wJ.A1Z(r9, r8) ? 1 : 0);
        String A0o = C18230wP.A0o(A03);
        if (A0o != null) {
            String A0o2 = C18220wO.A0o(A03);
            if (A0o2 != null) {
                int A0H = A03.A0H(38, Process.WAIT_RESULT_TIMEOUT);
                if (A0H != Integer.MIN_VALUE) {
                    String A0C = C127397h3.A0C(A03);
                    if (A0C != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        C04220Ms.A06(currencyInstance);
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setCurrency(Currency.getInstance(A0C));
                        String format = currencyInstance.format(Integer.valueOf(A0H));
                        C04220Ms.A06(format);
                        AnonymousClass3LY.A00(C05030Qo.A02(C63913ic.A0F(r8))).CWx(new C131247re(new ExistingStandaloneFundraiserForFeedModel(A0o, A0o2, format, (String) null)));
                        return null;
                    }
                    throw C18190wL.A0a("Requires goal currency");
                }
                throw C18190wL.A0a("Requires goal amount");
            }
            throw C18190wL.A0a("Requires beneficiary short name");
        }
        throw C18190wL.A0a("Requires fundraiser id");
    }
}
