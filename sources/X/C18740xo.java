package X;

import android.util.LruCache;
import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.0xo  reason: invalid class name and case insensitive filesystem */
public final class C18740xo extends LruCache {
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Medium medium = (Medium) obj2;
        if (z && medium != null && new File(medium.A0T).exists()) {
            File file = new File(medium.A0T);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Medium medium = (Medium) obj2;
        if (medium == null || !new File(medium.A0T).exists()) {
            return 0;
        }
        File file = new File(medium.A0T);
        if (file.exists()) {
            return (int) file.length();
        }
        return 0;
    }

    public C18740xo(int i) {
        super(i);
    }
}
