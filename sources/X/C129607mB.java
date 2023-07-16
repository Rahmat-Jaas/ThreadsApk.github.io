package X;

import android.util.Pair;

/* renamed from: X.7mB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129607mB implements C143858hQ {
    public final Pair A00;
    public final C107526gt A01;

    public C129607mB(Pair pair, C107526gt r2) {
        this.A01 = r2;
        this.A00 = pair;
    }

    public final Object Cx8(AnonymousClass7HU r4) {
        C107526gt r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return r4;
    }
}
