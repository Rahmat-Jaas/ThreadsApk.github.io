package X;

import java.util.Map;

/* renamed from: X.6tx  reason: invalid class name and case insensitive filesystem */
public final class C114826tx {
    public final String A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114826tx) {
                C114826tx r5 = (C114826tx) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, (C18180wK.A03(this.A00) + 1000) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("KaraokeBleeps(bleepAssetFilePath=");
        A0s.append(this.A00);
        A0s.append(", bleepAssetDurationInMs=");
        A0s.append(1000);
        A0s.append(", originalAudioBleeps=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114826tx(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }
}
