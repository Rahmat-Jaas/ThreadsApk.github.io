package X;

import com.instagram.api.schemas.CreatorSegmentation;

/* renamed from: X.5Kh  reason: invalid class name */
public final class AnonymousClass5Kh extends AnonymousClass0Sf implements C33730HtU {
    public final CreatorSegmentation A00;
    public final Boolean A01;

    public final AnonymousClass5Kh CyV() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Kh) {
                AnonymousClass5Kh r5 = (AnonymousClass5Kh) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final CreatorSegmentation Aah() {
        return this.A00;
    }

    public final Boolean BSf() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass5Kh(CreatorSegmentation creatorSegmentation, Boolean bool) {
        this.A00 = creatorSegmentation;
        this.A01 = bool;
    }
}
