package X;

import com.instagram.api.schemas.SettingId;
import java.util.List;
import java.util.Map;

/* renamed from: X.5N6  reason: invalid class name */
public final class AnonymousClass5N6 extends AnonymousClass0Sf implements C148728rk {
    public final SettingId A00;
    public final C17522ADi A01;
    public final String A02;
    public final List A03;
    public final Map A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass5N6(SettingId settingId, C17522ADi aDi, String str, List list, Map map, boolean z, boolean z2) {
        C04220Ms.A0B(settingId, 1);
        C18190wL.A1S(str, 4, list);
        C86104wH.A1P(aDi, 6, map);
        this.A00 = settingId;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = str;
        this.A03 = list;
        this.A01 = aDi;
        this.A04 = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5N6) {
                AnonymousClass5N6 r5 = (AnonymousClass5N6) obj;
                if (this.A00 != r5.A00 || this.A06 != r5.A06 || this.A05 != r5.A05 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean BLm() {
        return this.A06;
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A00);
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A042 + (z ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return C18220wO.A06(this.A04, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A07(this.A02, (i2 + i) * 31))));
    }
}
