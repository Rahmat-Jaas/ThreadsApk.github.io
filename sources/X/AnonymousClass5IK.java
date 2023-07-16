package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.dcp.model.UseCase$Companion;
import kotlinx.serialization.Serializable;

@Serializable(with = AnonymousClass87f.class)
/* renamed from: X.5IK  reason: invalid class name */
public final class AnonymousClass5IK extends AnonymousClass0Sf {
    public static final UseCase$Companion Companion = new UseCase$Companion();
    public final String A00;
    public final String A01;
    public final String A02;
    public final transient boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IK) {
                AnonymousClass5IK r5 = (AnonymousClass5IK) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        return AnonymousClass00U.A0N(this.A00, this.A02, ':');
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A01)));
    }

    public final String toString() {
        return AnonymousClass00U.A0Y(this.A01, this.A00, this.A02, BasicHeaderValueParser.ELEM_DELIMITER, BasicHeaderValueParser.ELEM_DELIMITER);
    }

    public AnonymousClass5IK(String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        boolean z = true;
        this.A03 = (str.equals("invalid") || str.length() <= 0 || str2.equals("invalid") || str2.length() <= 0 || str3.equals("invalid") || str3.length() <= 0) ? false : z;
    }
}
