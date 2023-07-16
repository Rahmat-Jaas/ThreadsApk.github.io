package X;

import com.instagram.model.hashtag.Hashtag;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3I6  reason: invalid class name */
public final class AnonymousClass3I6 {
    public boolean A00;
    public final List A01;
    public final Map A02 = AnonymousClass0wJ.A0y();

    public final int A00(Hashtag hashtag, String str, int i) {
        C04220Ms.A0B(hashtag, 0);
        List list = this.A01;
        if (list.size() + 1 > 4) {
            return 1;
        }
        if (A01(hashtag)) {
            return 2;
        }
        list.add(hashtag);
        this.A00 = true;
        AnonymousClass38B r2 = new AnonymousClass38B();
        r2.A01 = str;
        r2.A00 = i;
        String str2 = hashtag.A0C;
        if (str2 != null) {
            this.A02.put(str2, r2);
        }
        return 0;
    }

    public final boolean A02(Hashtag hashtag) {
        C04220Ms.A0B(hashtag, 0);
        if (!A01(hashtag)) {
            return false;
        }
        this.A01.remove(hashtag);
        Map map = this.A02;
        C03940Lk.A02(map).remove(hashtag.A0C);
        this.A00 = true;
        return true;
    }

    public final boolean A01(Hashtag hashtag) {
        List<Object> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object A0I : list) {
                if (C04220Ms.A0I(A0I, hashtag)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass3I6(List list) {
        this.A01 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass38B r2 = new AnonymousClass38B();
            r2.A01 = "INIT";
            r2.A00 = -1;
            String str = ((Hashtag) it.next()).A0C;
            if (str != null) {
                this.A02.put(str, r2);
            }
        }
    }
}
