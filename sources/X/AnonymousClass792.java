package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.Arrays;

/* renamed from: X.792  reason: invalid class name */
public final class AnonymousClass792 {
    public int A00;
    public NewFundraiserInfo A01;
    public AnonymousClass7EW A02;
    public AnonymousClass7EW A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass792(NewFundraiserInfo newFundraiserInfo, AnonymousClass7EW r2, AnonymousClass7EW r3, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A09 = str6;
        this.A08 = str5;
        this.A03 = r3;
        this.A07 = str4;
        this.A01 = newFundraiserInfo;
        this.A04 = str;
        this.A06 = str3;
        this.A02 = r2;
        this.A05 = str2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass792 r5 = (AnonymousClass792) obj;
            if (!C98336Fc.A00(this.A09, r5.A09) || !C98336Fc.A00(this.A08, r5.A08) || !C98336Fc.A00(this.A03, r5.A03) || !C98336Fc.A00(this.A07, r5.A07) || !C98336Fc.A00(this.A01, r5.A01) || !C98336Fc.A00(this.A04, r5.A04) || !C98336Fc.A00(this.A06, r5.A06) || !C98336Fc.A00(this.A02, r5.A02) || !C98336Fc.A00(this.A05, r5.A05) || !C98336Fc.A00(Integer.valueOf(this.A00), Integer.valueOf(r5.A00))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A08, this.A03, this.A07, this.A01, this.A04, this.A06, this.A02, this.A05});
    }

    public AnonymousClass792() {
    }
}
