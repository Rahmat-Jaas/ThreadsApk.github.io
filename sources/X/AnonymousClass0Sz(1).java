package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.0Sz  reason: invalid class name */
public final class AnonymousClass0Sz {
    public static final AnonymousClass0Sz A03 = new AnonymousClass0Sz((Collection) null, (Map) null, (Map) null);
    public final Collection A00;
    public final Map A01;
    public final Map A02;

    public AnonymousClass0Sz(Collection collection, Map map, Map map2) {
        Map emptyMap;
        Collection emptyList;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        if (collection != null) {
            emptyList = Collections.unmodifiableCollection(collection);
        } else {
            emptyList = Collections.emptyList();
        }
        this.A00 = emptyList;
        this.A02 = map2;
    }
}
