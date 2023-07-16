package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import java.util.List;

/* renamed from: X.5KU  reason: invalid class name */
public final class AnonymousClass5KU extends AnonymousClass0Sf implements C145888lH {
    public final AudioBrowserCategoryType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KU) {
                AnonymousClass5KU r5 = (AnonymousClass5KU) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B2y() {
        return this.A03;
    }

    public final String BH2() {
        return this.A02;
    }

    public final String getId() {
        return this.A01;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A03(this.A00) * 31)));
    }

    public AnonymousClass5KU(AudioBrowserCategoryType audioBrowserCategoryType, String str, String str2, List list) {
        AnonymousClass0wJ.A1Q(str, list);
        C04220Ms.A0B(str2, 4);
        this.A00 = audioBrowserCategoryType;
        this.A01 = str;
        this.A03 = list;
        this.A02 = str2;
    }
}
