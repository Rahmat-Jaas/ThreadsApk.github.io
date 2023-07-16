package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.File;
import java.util.Map;

/* renamed from: X.3HO  reason: invalid class name */
public final class AnonymousClass3HO {
    public final QuickPromotionSlot A00;
    public final File A01;
    public final Map A02;
    public final Map A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass3HO) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3HO(QuickPromotionSlot quickPromotionSlot, File file, Map map, Map map2) {
        this.A01 = file;
        this.A03 = map;
        this.A02 = map2;
        this.A00 = quickPromotionSlot;
    }
}
