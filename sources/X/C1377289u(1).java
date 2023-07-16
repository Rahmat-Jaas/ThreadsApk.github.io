package X;

import java.util.Observable;

/* renamed from: X.89u  reason: invalid class name and case insensitive filesystem */
public final class C1377289u extends Observable implements C10390iG {
    public static C1377289u A02;
    public String A00 = "";
    public boolean A01 = true;

    public final void A00(String str, String str2, String str3) {
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = str2;
        }
        this.A00 = C18180wK.A0j("%s\nV1: %s\nV2: %s", new Object[]{str, str2, str3});
        setChanged();
        notifyObservers();
    }

    public C1377289u() {
        C691847d.A02(this);
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(999799061);
        this.A01 = false;
        setChanged();
        notifyObservers();
        C14030oh.A0A(-1889941938, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(1913549138);
        this.A01 = true;
        setChanged();
        notifyObservers();
        C14030oh.A0A(-162586604, A03);
    }
}
