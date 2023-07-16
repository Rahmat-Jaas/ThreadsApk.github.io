package X;

import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.4Ti  reason: invalid class name and case insensitive filesystem */
public final class C73664Ti implements Iterator {
    public int A00;
    public final String A01;
    public final String[] A02 = Locale.getISOCountries();

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A02.length);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Locale locale = new Locale(this.A01, this.A02[this.A00]);
        this.A00++;
        return locale;
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }

    public C73664Ti(String str) {
        this.A01 = str;
    }
}
