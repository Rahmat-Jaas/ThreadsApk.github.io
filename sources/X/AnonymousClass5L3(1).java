package X;

import com.instagram.api.schemas.SocialContextType;
import java.util.List;

/* renamed from: X.5L3  reason: invalid class name */
public final class AnonymousClass5L3 extends AnonymousClass0Sf implements C21547BwB {
    public final int A00;
    public final SocialContextType A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public AnonymousClass5L3(SocialContextType socialContextType, String str, List list, List list2, int i) {
        C18180wK.A1Q(list, 1, socialContextType);
        this.A03 = list;
        this.A02 = str;
        this.A04 = list2;
        this.A01 = socialContextType;
        this.A00 = i;
    }

    public final AnonymousClass5L3 D0f(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass5L3 D0g(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5L3) {
                AnonymousClass5L3 r5 = (AnonymousClass5L3) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || this.A01 != r5.A01 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A01, (((C18210wN.A04(this.A03) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A04)) * 31) + this.A00;
    }
}
