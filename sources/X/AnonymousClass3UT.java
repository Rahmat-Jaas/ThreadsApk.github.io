package X;

import com.instagram.nux.cal.model.ContentText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3UT  reason: invalid class name */
public final class AnonymousClass3UT {
    public int A00;
    public final List A01;

    public static AnonymousClass3AR A00(AnonymousClass3UT r2) {
        return (AnonymousClass3AR) r2.A01.get(r2.A00);
    }

    public final boolean A01() {
        if (this.A00 != this.A01.size() - 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass3UT(AnonymousClass22f r6, List list) {
        AnonymousClass3AR r0;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (list != null) {
            if (r6 == AnonymousClass22f.NO_SPLIT || r6 == AnonymousClass22f.NO_SPLIT_HINT_TEXT || r6 == AnonymousClass22f.NO_SPLIT_NON_STICKY_FOOTER) {
                r0 = new AnonymousClass3AR(list);
            } else {
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContentText contentText = (ContentText) it.next();
                    Boolean bool = contentText.A00;
                    if (bool != null && bool.booleanValue()) {
                        A0v.add(new AnonymousClass3AR(A0v2));
                        A0v2 = AnonymousClass0wJ.A0v();
                    }
                    A0v2.add(contentText);
                }
                r0 = new AnonymousClass3AR(A0v2);
            }
            A0v.add(r0);
        }
        this.A01 = A0v;
    }
}
