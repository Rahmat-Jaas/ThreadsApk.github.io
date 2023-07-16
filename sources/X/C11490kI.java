package X;

import java.io.Serializable;

/* renamed from: X.0kI  reason: invalid class name and case insensitive filesystem */
public final class C11490kI implements Serializable {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11490kI)) {
            return false;
        }
        C11490kI r4 = (C11490kI) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public final int hashCode() {
        String str;
        switch (this.A00.intValue()) {
            case 1:
                str = "EXPLORE";
                break;
            case 2:
                str = "DISCOVERY";
                break;
            case 3:
                str = "SHOPPING";
                break;
            case 4:
                str = "CAMERA";
                break;
            case 5:
                str = "FEED";
                break;
            case 6:
                str = "COMMON";
                break;
            default:
                str = "STORIES";
                break;
        }
        return AnonymousClass00U.A0V(str, " - ", this.A01).hashCode();
    }

    public C11490kI(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
