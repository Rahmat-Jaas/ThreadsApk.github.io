package X;

import android.os.SystemClock;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Z2  reason: invalid class name */
public final class AnonymousClass0Z2 {
    public long A00;
    public AnonymousClass0M4 A01 = new AnonymousClass0M4(0);
    public String A02 = "unknown";
    public String A03 = "unknown";
    public String A04;
    public boolean A05 = false;
    public final StringBuilder A06 = new StringBuilder();
    public final C04140Mk A07 = new C04140Mk();
    public final Set A08 = new HashSet();
    public volatile File A09;

    public final void A00(String str) {
        String replace = str.replace(BasicHeaderValueParser.ELEM_DELIMITER, '_');
        StringBuilder sb = this.A06;
        synchronized (sb) {
            Set set = this.A08;
            if (!set.contains(replace)) {
                if (!set.isEmpty()) {
                    sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
                }
                sb.append(replace);
                set.add(replace);
                if (this.A09 != null) {
                    C04350Ng.A01.execute(new C04760Oz(this, replace));
                }
            }
        }
        SystemClock.uptimeMillis();
    }
}
