package X;

import android.app.Application;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.facebook.redex.IDxComparatorShape302S0100000_1_I2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.3xk  reason: invalid class name and case insensitive filesystem */
public final class C66523xk implements C147138nS {
    public final Application A00;
    public final C13330nS A01;
    public final boolean A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public C66523xk(Application application, C13330nS r2, boolean z) {
        this.A00 = application;
        this.A01 = r2;
        this.A02 = z;
    }

    public final C62793ak create(Class cls) {
        String A0h = C18200wM.A0h(C18200wM.A0C(), "fb_language_locale");
        if (A0h == null || AnonymousClass8bQ.A0n(A0h)) {
            Locale A03 = C31103Gfm.A03();
            A0h = AnonymousClass00U.A0N(A03.getLanguage(), A03.getCountry(), Rfc3492Idn.delimiter);
        }
        Application application = this.A00;
        boolean z = this.A02;
        IDxComparatorShape302S0100000_1_I2 iDxComparatorShape302S0100000_1_I2 = new IDxComparatorShape302S0100000_1_I2((Object) application, 4);
        ArrayList A0s = C18200wM.A0s(C62503a9.A01);
        if (z) {
            A0s.add(new AnonymousClass19W("fb-HA", C31103Gfm.A00, 2131831791, 2131829300));
        }
        Collections.sort(A0s, iDxComparatorShape302S0100000_1_I2);
        return new C19250zY(application, this.A01, A0h, A0s, C31103Gfm.A03());
    }
}
