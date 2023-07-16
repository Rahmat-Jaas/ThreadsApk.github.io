package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.6w2  reason: invalid class name and case insensitive filesystem */
public final class C115866w2 {
    public static C104136bI A01(long j) {
        return A00(5, j);
    }

    public static final C104136bI A00(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = C98076Ec.A00(i, j);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(C121657He.A01(j), C41034Luz.A01(i));
        }
        return new C104136bI(porterDuffColorFilter);
    }
}
