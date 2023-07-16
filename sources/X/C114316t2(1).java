package X;

/* renamed from: X.6t2  reason: invalid class name and case insensitive filesystem */
public final class C114316t2 {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114316t2) || i != ((C114316t2) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.A00;
        StringBuilder A0s = C18190wL.A0s("LineBreak(strategy=");
        int i2 = i & 255;
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = "Invalid";
        }
        A0s.append(str);
        A0s.append(", strictness=");
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = "Invalid";
        }
        A0s.append(str2);
        A0s.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else {
            str3 = "Invalid";
        }
        return C86104wH.A0y(str3, A0s);
    }

    public /* synthetic */ C114316t2(int i) {
        this.A00 = i;
    }
}
