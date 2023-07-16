package X;

import android.app.Application;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0200000_I2_7;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;

/* renamed from: X.0zY  reason: invalid class name and case insensitive filesystem */
public final class C19250zY extends AnonymousClass10X {
    public String A00;
    public final Locale A01;
    public final C86064wD A02;
    public final C84714tk A03;
    public final C84714tk A04;
    public final C86074wE A05;
    public final C13330nS A06;
    public final List A07;

    public final void A09(AnonymousClass19W r6) {
        C04220Ms.A0B(r6, 0);
        String str = r6.A02;
        Locale locale = this.A01;
        if (!C18190wL.A0r(locale, str).equals(C18190wL.A0r(locale, this.A00))) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A06, "ig_app_language_changed_settings"), 792);
            A0I.A0T(C28174Ezk.A00(181), locale.toString());
            A0I.A0T("to_locale", str);
            A0I.A0T("from_locale", this.A00);
            A0I.Bb4();
            this.A00 = str;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape22S0201000_I2_8(r6, this, (C146958n9) null, 18), AnonymousClass3J5.A00(this), 3);
        }
    }

    public static final List A00(C19250zY r10, String str) {
        List<AnonymousClass19W> list;
        if (str == null || str.length() == 0) {
            list = r10.A07;
        } else {
            Locale locale = r10.A01;
            String A0r = C18190wL.A0r(locale, str);
            List list2 = r10.A07;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : list2) {
                AnonymousClass19W r2 = (AnonymousClass19W) next;
                Application application = r10.A00;
                C04220Ms.A0C(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                String A0r2 = C18190wL.A0r(locale, r2.A02);
                String A0r3 = C18190wL.A0r(locale, AnonymousClass0wJ.A0k(application, r2.A01));
                String A0r4 = C18190wL.A0r(locale, AnonymousClass0wJ.A0k(application, r2.A00));
                if (AnonymousClass8bP.A0j(A0r2, A0r, false) || AnonymousClass8bP.A0j(A0r3, A0r, false) || AnonymousClass8bP.A0j(A0r4, A0r, false)) {
                    A0v.add(next);
                }
            }
            list = A0v;
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (AnonymousClass19W r3 : list) {
            String str2 = r10.A00;
            Locale locale2 = r10.A01;
            A0w.add(new KtCSuperShape0S0110000_I2(r3, C18190wL.A0r(locale2, str2).equals(C18190wL.A0r(locale2, r3.A02))));
        }
        return A0w;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19250zY(Application application, C13330nS r9, String str, List list, Locale locale) {
        super(application);
        AnonymousClass0wJ.A1R(r9, str);
        this.A07 = list;
        this.A01 = locale;
        this.A06 = r9;
        this.A00 = str;
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A05 = A0z;
        C84714tk A012 = AnonymousClass7J0.A01(new KtSLambdaShape12S0200000_I2_7((Object) this, (C146958n9) null, 34), A0z);
        this.A04 = C25753DrP.A04(new KtCSuperShape1S0100000_I2_1(A00(this, (String) null), 16), AnonymousClass3J5.A00(this), A012, AnonymousClass74I.A01);
        C27442EnY enY = new C27442EnY();
        this.A02 = enY;
        this.A03 = AnonymousClass7C4.A02(enY);
    }
}
