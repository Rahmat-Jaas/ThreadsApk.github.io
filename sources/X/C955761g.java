package X;

import com.instagram.model.venue.Venue;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.61g  reason: invalid class name and case insensitive filesystem */
public final class C955761g extends AnonymousClass7HN {
    public Boolean A00;
    public String A01 = "";
    public String A02 = "";
    public List A03 = new LinkedList();
    public final long A04;
    public final AnonymousClass6BA A05;
    public final C03710Kk A06;
    public final C13330nS A07;
    public final String A08 = C18180wK.A0e();

    public static List A00(List list) {
        Long l;
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Venue venue = (Venue) it.next();
            if (venue == null) {
                l = null;
            } else {
                try {
                    l = AnonymousClass0wJ.A0d(venue.A02());
                } catch (NumberFormatException unused) {
                    linkedList.add((Object) null);
                }
            }
            linkedList.add(l);
        }
        return linkedList;
    }

    public C955761g(C03710Kk r3, C11630kW r4, UserSession userSession, Integer num) {
        AnonymousClass6BA r0;
        int intValue = num.intValue();
        if (intValue == 1) {
            r0 = AnonymousClass6BA.IG_POST;
        } else if (intValue == 0) {
            r0 = AnonymousClass6BA.IG_STORY;
        } else if (intValue != 2) {
            r0 = null;
        } else {
            r0 = AnonymousClass6BA.IG_POST_SKITTLES;
        }
        this.A05 = r0;
        this.A04 = r3.now();
        this.A06 = r3;
        this.A07 = C13330nS.A01(r4, userSession);
    }
}
