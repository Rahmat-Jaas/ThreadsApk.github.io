package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3VC  reason: invalid class name */
public final class AnonymousClass3VC {
    public int A00;
    public boolean A01;
    public final Map A02;

    public final void A01(C81644o8 r4) {
        QuickPromotionSurface quickPromotionSurface = ((C28291u0) r4).A06;
        Map map = this.A02;
        List list = (List) map.get(quickPromotionSurface);
        if (list == null) {
            list = AnonymousClass0wJ.A0v();
            map.put(quickPromotionSurface, list);
        }
        list.add(r4);
        this.A00++;
    }

    public final /* bridge */ /* synthetic */ List A00(C81654o9 r3) {
        Map map = this.A02;
        if (map.containsKey(r3)) {
            return (List) map.get(r3);
        }
        return Collections.emptyList();
    }

    public AnonymousClass3VC(boolean z) {
        this.A02 = new EnumMap(QuickPromotionSurface.class);
        this.A00 = 0;
        this.A01 = false;
        this.A01 = z;
    }

    public AnonymousClass3VC() {
        this(false);
    }
}
