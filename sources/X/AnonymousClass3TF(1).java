package X;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.3TF  reason: invalid class name */
public final class AnonymousClass3TF {
    public final long A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final C04530Oa A04 = AnonymousClass0OY.A02(new KtLambdaShape95S0100000_I2_75(this, 17));
    public final boolean A05;
    public final C04530Oa A06 = AnonymousClass0OY.A02(new KtLambdaShape95S0100000_I2_75(this, 16));

    public static final ImmutableSetMultimap A00(Set set, Set set2) {
        CompactHashMap compactHashMap = new CompactHashMap();
        for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) it.next();
                EnumSet A002 = M5W.A00(quickPromotionSlot, quickPromotionSurface);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it2 = A002.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (set2.contains(next)) {
                        A0v.add(next);
                    }
                }
                if (C18190wL.A1a(A0v)) {
                    C61013Rm.A00(A0v, quickPromotionSurface, compactHashMap);
                }
            }
        }
        return ImmutableSetMultimap.A00(compactHashMap.entrySet());
    }

    public AnonymousClass3TF(Set set, Set set2, Set set3, long j, boolean z) {
        this.A05 = z;
        this.A01 = set;
        this.A02 = set2;
        this.A03 = set3;
        this.A00 = j;
    }
}
