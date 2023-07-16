package X;

import android.content.res.Resources;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: X.5FV  reason: invalid class name */
public final class AnonymousClass5FV extends I3M {
    public static void A00(Resources resources) {
        Class cls;
        try {
            cls = Class.forName("android.content.res.ResourcesImpl");
        } catch (ClassNotFoundException unused) {
            cls = Resources.class;
        }
        try {
            Field declaredField = cls.getDeclaredField("sPreloadedDrawables");
            declaredField.setAccessible(true);
            Object obj = declaredField.get((Object) null);
            if (obj instanceof LongSparseArray) {
                if (!(obj instanceof I3M)) {
                    declaredField.set((Object) null, new AnonymousClass5FV(resources, (LongSparseArray) obj));
                }
            } else if (obj instanceof LongSparseArray[]) {
                LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) obj;
                for (int i = 0; i < longSparseArrayArr.length; i++) {
                    if (!(longSparseArrayArr[i] instanceof I3M)) {
                        longSparseArrayArr[i] = new AnonymousClass5FV(resources, longSparseArrayArr[i]);
                    }
                }
            }
        } catch (Exception e) {
            AnonymousClass0LU.A0I("NetworkDrawableCache", "Could not enable custom drawable support", e);
        }
    }

    public AnonymousClass5FV(Resources resources, LongSparseArray longSparseArray) {
        super(resources, longSparseArray);
    }
}
