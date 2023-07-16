package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.List;

/* renamed from: X.5Km  reason: invalid class name and case insensitive filesystem */
public final class C90095Km extends AnonymousClass0Sf implements C144208i0 {
    public final IGPostClickEligibleExperienceTypes A00;
    public final String A01;
    public final List A02;

    public final C90095Km Cz1() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90095Km) {
                C90095Km r5 = (C90095Km) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A02) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A07(this.A00);
    }

    public C90095Km(IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = iGPostClickEligibleExperienceTypes;
    }
}
