package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.64h  reason: invalid class name and case insensitive filesystem */
public final class C963164h extends C24992DdU {
    public final /* synthetic */ Set A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ AnonymousClass8s9 A02;

    public C963164h(Set set, Set set2, AnonymousClass8s9 r3) {
        this.A00 = set;
        this.A01 = set2;
        this.A02 = r3;
    }

    public final void A02(Set set) {
        AnonymousClass8s9 r1 = this.A02;
        if (((C27420EnC) r1)._state instanceof C142598fH) {
            AnonymousClass8s9.A00("", r1);
        }
    }

    public final void A03(Set set) {
        AnonymousClass8s9 r1 = this.A02;
        if (((C27420EnC) r1)._state instanceof C142598fH) {
            AnonymousClass8s9.A00("", r1);
        }
    }

    public final void A01(Map map) {
        Collection<Reel> values = map.values();
        ArrayList A0w = AnonymousClass0wJ.A0w(values);
        for (Reel id : values) {
            A0w.add(id.getId());
        }
        Set set = this.A00;
        set.addAll(A0w);
        if (set.size() == this.A01.size()) {
            AnonymousClass8s9 r2 = this.A02;
            if (((C27420EnC) r2)._state instanceof C142598fH) {
                r2.Cf0(AnonymousClass1jA.A00(map.values()), (AnonymousClass0YY) null);
            }
        }
    }
}
