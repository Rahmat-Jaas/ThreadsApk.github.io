package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.RegularImmutableSet;
import java.util.Collection;

/* renamed from: X.2CQ  reason: invalid class name */
public abstract class AnonymousClass2CQ {
    public static AnonymousClass39S A00(PackageManager packageManager) {
        CompactHashMap compactHashMap = new CompactHashMap();
        for (Signature signature : C551531y.A02) {
            C30590GMc.A01("com.facebook.services", signature);
            Collection collection = (Collection) compactHashMap.get("com.facebook.services");
            if (collection == null) {
                collection = new CompactHashSet();
                compactHashMap.put("com.facebook.services", collection);
            }
            collection.add(signature);
        }
        return new AnonymousClass39S(packageManager, ImmutableSetMultimap.A00(compactHashMap.entrySet()), RegularImmutableSet.A03);
    }
}
