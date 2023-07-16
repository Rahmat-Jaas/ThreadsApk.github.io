package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3H6  reason: invalid class name */
public class AnonymousClass3H6 {
    public ImmutableList A00;
    public final AnonymousClass0ZU A01;
    public final Map A02 = AnonymousClass0wJ.A0y();

    public final void A02(Collection collection) {
        C04220Ms.A0B(collection, 0);
        ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(AnonymousClass4TY.A00, collection);
        synchronized (this) {
            C04220Ms.A06(sortedCopyOf);
            this.A00 = sortedCopyOf;
        }
    }

    public AnonymousClass3H6(AnonymousClass0ZU r2) {
        this.A01 = r2;
        ImmutableList of = ImmutableList.of();
        C04220Ms.A06(of);
        this.A00 = of;
    }

    public final List A01(AnonymousClass3DQ r10, List list) {
        boolean A1Y = AnonymousClass0wJ.A1Y(list, r10);
        AnonymousClass3EB r7 = (AnonymousClass3EB) this.A01.invoke();
        AnonymousClass372 r5 = new AnonymousClass372();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C81224nO r2 = (C81224nO) it.next();
                AnonymousClass3DC A002 = r7.A00(r10, r2);
                if (A002.A08) {
                    if (A002.A07) {
                        C04220Ms.A0B(r2, A1Y);
                        r5 = new AnonymousClass372();
                        if (r5.A00 == null) {
                            r5.A00 = r2;
                        }
                        r5.A01.add(r2);
                    } else {
                        C04220Ms.A0B(r2, A1Y);
                        if (r5.A00 == null) {
                            r5.A00 = r2;
                        }
                        r5.A01.add(r2);
                        A0v.add(r2);
                    }
                } else if (A002.A06) {
                    A0v2.add(r2);
                }
            } else {
                Iterator it2 = A0v.iterator();
                while (it2.hasNext()) {
                    C81224nO r3 = (C81224nO) it2.next();
                    C58413Fm r0 = r10.A03;
                    C04220Ms.A0B(r3, A1Y);
                    AnonymousClass0A3 r22 = (AnonymousClass0A3) r0.A03.invoke(r0.A00);
                    if (AnonymousClass0wJ.A1U(r22)) {
                        r22.A0S("promotion_id", AnonymousClass0wJ.A0d(AnonymousClass1j3.A02(r3)));
                        r22.Bb4();
                    }
                }
                Iterator it3 = A0v2.iterator();
                while (it3.hasNext()) {
                    C81224nO r32 = (C81224nO) it3.next();
                    C58413Fm r02 = r10.A03;
                    C04220Ms.A0B(r32, A1Y ? 1 : 0);
                    AnonymousClass0A3 r23 = (AnonymousClass0A3) r02.A03.invoke(r02.A00);
                    if (AnonymousClass0wJ.A1U(r23)) {
                        r23.A0S("promotion_id", AnonymousClass0wJ.A0d(AnonymousClass1j3.A02(r32)));
                        r23.Bb4();
                    }
                }
            }
        }
        return r5.A01;
    }
}
