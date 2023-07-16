package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2I2  reason: invalid class name */
public final class AnonymousClass2I2 {
    public static final Object A00(AnonymousClass601 r3, C63893iY r4) {
        String A0D = C63893iY.A0D(r4, AnonymousClass0wJ.A1Y(r4, r3) ? 1 : 0);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r3));
        FragmentActivity A05 = C63913ic.A05(r3);
        Bundle A06 = C18180wK.A06();
        A06.putString("igUserId", A0D);
        A06.putString("stripeAccountInformationType", "BANK_ACCOUNT");
        C71494Ja A01 = C63343hJ.A01(A02);
        A01.CpK("IgPaymentsSettingsPaymentAddBankAccountRoute");
        A01.Cod(A06);
        A01.CxN(A05).A05();
        return null;
    }
}
