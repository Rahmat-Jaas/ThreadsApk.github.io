package X;

import com.instagram.api.schemas.SettingId;
import java.util.List;
import java.util.Map;

/* renamed from: X.5N7  reason: invalid class name */
public final class AnonymousClass5N7 extends AnonymousClass0Sf implements C148728rk {
    public final SettingId A00;
    public final C57943Dd A01;
    public final C57943Dd A02;
    public final C57943Dd A03;
    public final C17522ADi A04;
    public final Boolean A05;
    public final String A06;
    public final List A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass5N7(SettingId settingId, C57943Dd r3, C57943Dd r4, C57943Dd r5, C17522ADi aDi, Boolean bool, String str, List list, Map map, boolean z, boolean z2) {
        C18180wK.A1Q(settingId, 1, str);
        C18180wK.A1S(aDi, r3, r4);
        C04220Ms.A0B(r5, 9);
        this.A00 = settingId;
        this.A0A = z;
        this.A09 = z2;
        this.A06 = str;
        this.A07 = list;
        this.A04 = aDi;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A08 = map;
        this.A05 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5N7) {
                AnonymousClass5N7 r5 = (AnonymousClass5N7) obj;
                if (this.A0A != r5.A0A || this.A09 != r5.A09 || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A08, r5.A08) || !"-1".equals("-1") || !C04220Ms.A0I(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean BLm() {
        return this.A0A;
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A00);
        boolean z = this.A0A;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A042 + (z ? 1 : 0)) * 31;
        if (!this.A09) {
            i = 0;
        }
        return ((AnonymousClass0wJ.A05(this.A08, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A07, AnonymousClass0wJ.A07(this.A06, (i2 + i) * 31))))))) + 1444) * 31) + AnonymousClass0wJ.A03(this.A05);
    }
}
