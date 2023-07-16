package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.456  reason: invalid class name */
public final class AnonymousClass456 implements C82384pX {
    public final Map Aow() {
        Integer num = AnonymousClass006.A00;
        List A17 = C06750aI.A17(new AnonymousClass4O1(num, "stories_organic_1", "", "Inject \"New!\" Nux Reel"), new AnonymousClass4O1(num, "stories_organic_2", "", "Inject Post Live"), new AnonymousClass4O1(num, "stories_organic_3", "", "Inject Close Friends"), new AnonymousClass4O1(num, "stories_organic_4", "", "Inject Large Reel"), new AnonymousClass4O1(num, "stories_organic_5", "", "Inject Many Large Reels"), new AnonymousClass4O1(num, "stories_organic_6", "", "Inject Empty Reel"), new AnonymousClass4O1(num, "stories_organic_7", "", "Inject In Feed Tray"));
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(A17, 10)));
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            AnonymousClass4O1.A00(A0v, it);
        }
        return A0v;
    }
}
