package com.mapbox.mapboxsdk.style.types;

import X.C18190wL;
import java.util.Arrays;

public class FormattedSection {
    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && Arrays.equals((Object[]) null, (Object[]) null));
    }

    public int hashCode() {
        return Arrays.hashCode((Object[]) null) * 31;
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("FormattedSection{text='");
        A0s.append((String) null);
        A0s.append('\'');
        A0s.append(", fontScale=");
        A0s.append((Object) null);
        A0s.append(", fontStack=");
        A0s.append(Arrays.toString((Object[]) null));
        A0s.append(", textColor='");
        A0s.append((String) null);
        A0s.append('\'');
        return C18190wL.A0o(A0s);
    }
}
