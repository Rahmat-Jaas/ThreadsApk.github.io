package X;

import android.util.LruCache;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0xp  reason: invalid class name and case insensitive filesystem */
public final class C18750xp extends LruCache {
    public final /* synthetic */ C61663Ut A00;

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        try {
            this.A00.A00.invoke(obj2, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            AnonymousClass0LU.A0I("BundledLayoutLoader", "Unable to close XMLBlock", e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18750xp(C61663Ut r2) {
        super(98304);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return AnonymousClass0wJ.A04(obj);
    }
}
