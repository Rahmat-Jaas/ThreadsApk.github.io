package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.4EZ  reason: invalid class name */
public final class AnonymousClass4EZ implements C82744qC {
    public final /* synthetic */ Set A00;

    public AnonymousClass4EZ(Set set) {
        this.A00 = set;
    }

    public final C84714tk AOb(Activity activity, C84874u0 r8, C10300i6 r9) {
        Object obj;
        boolean A1Z = AnonymousClass0wJ.A1Z(activity, r9);
        C04220Ms.A0B(r8, 2);
        Set<C313725t> set = this.A00;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet<C82744qC> linkedHashSet2 = new LinkedHashSet<>();
        for (C313725t A002 : set) {
            C313725t.A00(A002, linkedHashSet);
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C313725t r2 = (C313725t) it.next();
            switch (r2.ordinal()) {
                case 0:
                    obj = new C70334Ea((C63533hk) null, (DefaultConstructorMarker) null, A1Z ? 1 : 0);
                    break;
                case 1:
                    throw C18180wK.A0a(AnonymousClass0wJ.A0t("Not yet supported provider type ", r2));
                case 2:
                case 7:
                case 8:
                    throw C18180wK.A0a(AnonymousClass0wJ.A0t("Unexpected provider group found: ", r2));
                case 3:
                    obj = new C70354Ec((AnonymousClass0YY) null, (DefaultConstructorMarker) null, A1Z);
                    break;
                case 4:
                    obj = new C70364Ed((AnonymousClass0YC) null, (DefaultConstructorMarker) null, A1Z);
                    break;
                case 5:
                    obj = new C70344Eb((AnonymousClass3S2) null, (DefaultConstructorMarker) null, A1Z);
                    break;
                case 6:
                    obj = new AnonymousClass4EY();
                    break;
            }
            linkedHashSet2.add(obj);
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(linkedHashSet2);
        for (C82744qC AOb : linkedHashSet2) {
            A0w.add(AOb.AOb(activity, r8, r9));
        }
        return AnonymousClass7J0.A00(A0w);
    }
}
