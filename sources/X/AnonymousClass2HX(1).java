package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Locale;
import kotlin.jvm.internal.KtLambdaShape4S1300000_I2;

/* renamed from: X.2HX  reason: invalid class name */
public final class AnonymousClass2HX {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        AnonymousClass601 r7 = r9;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        Object A0B = C63893iY.A0B(r10, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        FragmentActivity A05 = C63913ic.A05(r7);
        C10300i6 A0F = C63913ic.A0F(r7);
        C18200wM.A1R(A0F);
        C04530Oa A03 = C62373Zc.A03(new KtLambdaShape4S1300000_I2(A05, r7, A0F, (String) C63893iY.A0C(r10, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0), 8));
        C70894Gs r2 = (C70894Gs) A03.getValue();
        r2.A08.Cia(r2, r2.A0A);
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        ((C70894Gs) A03.getValue()).A05(C18250wR.A0c(Trigger.valueOf(C18220wO.A0u(locale, (String) A0B))));
        return null;
    }
}
