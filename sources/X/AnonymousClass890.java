package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.890  reason: invalid class name */
public final class AnonymousClass890 extends ThreadLocal {
    public final /* synthetic */ String A00;

    public AnonymousClass890(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
