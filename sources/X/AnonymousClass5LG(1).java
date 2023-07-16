package X;

import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.List;

/* renamed from: X.5LG  reason: invalid class name */
public final class AnonymousClass5LG extends AnonymousClass0Sf implements AnonymousClass8iM {
    public final INLINE_SURVEY_QUESTION_TYPES A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final AnonymousClass5LG D2k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LG) {
                AnonymousClass5LG r5 = (AnonymousClass5LG) obj;
                if (!C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass0wJ.A03(this.A08) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + C18200wM.A07(this.A00);
    }

    public AnonymousClass5LG(INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A08 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = bool;
        this.A06 = str5;
        this.A07 = str6;
        this.A00 = inline_survey_question_types;
    }
}
