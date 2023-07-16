package X;

import android.os.Bundle;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8b4  reason: invalid class name */
public final class AnonymousClass8b4 extends C02220Ah implements AnonymousClass0YC {
    public static final AnonymousClass8b4 A00 = new AnonymousClass8b4();

    public AnonymousClass8b4() {
        super(4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        C123917Zx r10 = (C123917Zx) obj2;
        C147188nY A0H = C86104wH.A0H(obj3, obj4);
        C04220Ms.A0B(r10, 1);
        Bundle bundle = r10.A06;
        if (bundle == null || (string = bundle.getString("userId")) == null) {
            throw C18190wL.A0a("Required value was null.");
        }
        C117846zL.A00(A0H, AnonymousClass7FI.A01(Modifier.A00), (C19450zt) null, string, 0, 4);
        return Unit.A00;
    }
}
