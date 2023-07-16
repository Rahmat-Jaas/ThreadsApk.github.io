package X;

import java.util.Observable;

/* renamed from: X.89v  reason: invalid class name and case insensitive filesystem */
public final class C1377389v extends Observable implements C10390iG {
    public static C1377389v A02;
    public String A00 = "";
    public boolean A01 = true;

    public final void A00(String str) {
        if (str == null) {
            str = "null";
        }
        this.A00 = str;
        setChanged();
        notifyObservers();
    }

    public C1377389v() {
        C691847d.A02(this);
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(-1445556409);
        this.A01 = false;
        setChanged();
        notifyObservers();
        C14030oh.A0A(-1502119120, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(1369381382);
        this.A01 = true;
        setChanged();
        notifyObservers();
        C14030oh.A0A(238425739, A03);
    }
}
