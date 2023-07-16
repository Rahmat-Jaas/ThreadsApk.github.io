package X;

import com.instagram.bugreporter.BugReport;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.2Jj  reason: invalid class name and case insensitive filesystem */
public final class C34392Jj {
    public static final void A00(BugReport bugReport) {
        C04220Ms.A0B(bugReport, 0);
        Iterator it = bugReport.A0A.iterator();
        while (it.hasNext()) {
            new File(C18180wK.A0k(it)).delete();
        }
        Iterator it2 = bugReport.A0B.iterator();
        while (it2.hasNext()) {
            new File(C18180wK.A0k(it2)).delete();
        }
    }
}
