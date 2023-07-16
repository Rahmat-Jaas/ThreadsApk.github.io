package X;

import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: X.4O1  reason: invalid class name */
public final class AnonymousClass4O1 implements Comparable {
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (obj == null || !C18190wL.A1Y(obj, this)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass4O1 r4 = (AnonymousClass4O1) obj;
        return C04220Ms.A0I(r4.A02, this.A02) && C04220Ms.A0I(r4.A01, this.A01) && C04220Ms.A0I(r4.A03, this.A03) && r4.A04 == this.A04;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass4O1 r3 = (AnonymousClass4O1) obj;
        C04220Ms.A0B(r3, 0);
        boolean z = r3.A00;
        if (z == this.A00) {
            return this.A03.compareTo(r3.A03);
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public final int hashCode() {
        String str;
        int hashCode = this.A02.hashCode() * this.A01.hashCode() * this.A03.hashCode();
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 0:
                str = "STORIES_ORGANIC";
                break;
            case 1:
                str = "STORIES_ADS";
                break;
            case 2:
                str = "STORIES_NETEGO";
                break;
            case 3:
                str = "FEED_ADS";
                break;
            case 4:
                str = "FEED_NETEGO";
                break;
            case 5:
                str = "REELS_ADS";
                break;
            default:
                str = "REELS_ORGANIC";
                break;
        }
        return hashCode * (str.hashCode() + intValue);
    }

    public final String toString() {
        return this.A03;
    }

    public AnonymousClass4O1(Integer num, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A04 = num;
    }

    public static void A00(AbstractMap abstractMap, Iterator it) {
        Object next = it.next();
        abstractMap.put(((AnonymousClass4O1) next).A02, next);
    }
}
