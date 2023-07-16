package X;

import com.instagram.api.schemas.ActionButtonPartnerType;

/* renamed from: X.5KP  reason: invalid class name */
public final class AnonymousClass5KP extends AnonymousClass0Sf implements C146558mR {
    public final ActionButtonPartnerType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public AnonymousClass5KP(ActionButtonPartnerType actionButtonPartnerType, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C04220Ms.A0B(str, 1);
        C18180wK.A1S(str6, actionButtonPartnerType, str7);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A00 = actionButtonPartnerType;
        this.A07 = str7;
    }

    public final AnonymousClass5KP CxO() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KP) {
                AnonymousClass5KP r5 = (AnonymousClass5KP) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AQz() {
        return this.A01;
    }

    public final String AUd() {
        return this.A03;
    }

    public final String AWx() {
        return this.A04;
    }

    public final String AdT() {
        return this.A05;
    }

    public final String B08() {
        return this.A06;
    }

    public final ActionButtonPartnerType B09() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A07;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A07, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A06, (((((((C18180wK.A03(this.A01) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C18200wM.A09(this.A05)) * 31)));
    }
}
