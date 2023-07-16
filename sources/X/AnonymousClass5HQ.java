package X;

import com.instagram.api.schemas.ThreadContainerType;
import java.util.List;

/* renamed from: X.5HQ  reason: invalid class name */
public final class AnonymousClass5HQ extends AnonymousClass0Sf {
    public final ThreadContainerType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public AnonymousClass5HQ(ThreadContainerType threadContainerType, String str, String str2, List list) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(list, threadContainerType);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A00 = threadContainerType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HQ) {
                AnonymousClass5HQ r5 = (AnonymousClass5HQ) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A05(this.A03, (C18180wK.A03(this.A02) + AnonymousClass0wJ.A06(this.A01)) * 31));
    }
}
