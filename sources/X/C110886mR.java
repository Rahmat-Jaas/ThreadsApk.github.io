package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6mR  reason: invalid class name and case insensitive filesystem */
public final class C110886mR {
    public Integer A00;
    public final C129097lH A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public C110886mR(C129097lH r4, String str, String str2, Map map, Set set) {
        Set unmodifiableSet = Collections.unmodifiableSet(set);
        this.A05 = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4 == null ? C129097lH.A00 : r4;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator A14 = C86104wH.A14(map);
        if (A14.hasNext()) {
            A14.next();
            throw C18210wN.A0W("zaa");
        } else {
            this.A06 = Collections.unmodifiableSet(hashSet);
        }
    }
}
