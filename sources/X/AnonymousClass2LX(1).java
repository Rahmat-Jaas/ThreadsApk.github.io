package X;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: X.2LX  reason: invalid class name */
public final class AnonymousClass2LX {
    public static final String A00(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, AnonymousClass0wJ.A1Y(context, typedArray) ? 1 : 0);
        if (resourceId != 0) {
            return context.getString(resourceId);
        }
        return typedArray.getNonResourceString(i);
    }
}
