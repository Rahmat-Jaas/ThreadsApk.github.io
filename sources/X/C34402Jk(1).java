package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.2Jk  reason: invalid class name and case insensitive filesystem */
public final class C34402Jk {
    public static final AnonymousClass1a5 A00(Parcelable parcelable, Parcelable parcelable2, String str) {
        AnonymousClass0wJ.A1N(str, parcelable);
        C04220Ms.A0B(parcelable2, 2);
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, str);
        A06.putParcelable("GDPRPrivacyCheckFragment.ARGUMENT_BUGREPORT", parcelable);
        A06.putParcelable("GDPRPrivacyCheckFragment.ARGUMENT_COMPOSER_VIEWMODEL", parcelable2);
        AnonymousClass1a5 r0 = new AnonymousClass1a5();
        r0.setArguments(A06);
        return r0;
    }
}
