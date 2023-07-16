package X;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.7As  reason: invalid class name */
public final class AnonymousClass7As {
    public static final void A02(Spannable spannable, C147168nV r7, int i, int i2, long j) {
        Object relativeSizeSpan;
        long A00 = AnonymousClass7HC.A00(j);
        if (A00 == 4294967296L) {
            relativeSizeSpan = new AbsoluteSizeSpan(C147168nV.A01(r7, j), false);
        } else if (A00 == 8589934592L) {
            relativeSizeSpan = new RelativeSizeSpan(Float.intBitsToFloat(C86104wH.A08(j)));
        } else {
            return;
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }

    public static final void A00(Spannable spannable, int i, int i2, long j) {
        if (j != AnonymousClass7KE.A06) {
            spannable.setSpan(new ForegroundColorSpan(C121657He.A01(j)), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, AnonymousClass83Y r6, int i, int i2) {
        if (r6 != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(r6);
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                AnonymousClass79B r0 = (AnonymousClass79B) it.next();
                C04220Ms.A0B(r0, 0);
                C141838dH r1 = r0.A00;
                C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                A0w.add(((AnonymousClass7ZA) r1).A00);
            }
            Locale[] localeArr = (Locale[]) A0w.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }
}
