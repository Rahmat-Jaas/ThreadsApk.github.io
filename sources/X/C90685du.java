package X;

import com.facebook.papaya.log.LogSink;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5du  reason: invalid class name and case insensitive filesystem */
public final class C90685du extends LogSink {
    public final Map A00 = AnonymousClass0wJ.A0y();

    public final synchronized void event(long j, long j2, long j3, int i, Map map, String str) {
        Iterator A14 = C86104wH.A14(this.A00);
        while (A14.hasNext()) {
            ((LogSink) A14.next()).event(j, j2, j3, i, map, str);
        }
    }

    public final synchronized void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
        Iterator A14 = C86104wH.A14(this.A00);
        while (A14.hasNext()) {
            ((LogSink) A14.next()).log(j, j2, j3, i, str, i2, str2);
        }
    }
}
