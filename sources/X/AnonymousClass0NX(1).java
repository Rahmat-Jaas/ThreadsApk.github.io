package X;

import java.lang.Thread;
import java.util.Map;

/* renamed from: X.0NX  reason: invalid class name */
public final class AnonymousClass0NX implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ String A00;
    public final /* synthetic */ Thread.UncaughtExceptionHandler A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ C04560Oe A03;
    public final /* synthetic */ C04560Oe A04;
    public final /* synthetic */ C04560Oe A05;

    public AnonymousClass0NX(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Map map, C04560Oe r4, C04560Oe r5, C04560Oe r6) {
        this.A05 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A00 = str;
        this.A02 = map;
        this.A01 = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        String str2;
        C04560Oe r0 = this.A05;
        String str3 = null;
        if (r0 == null) {
            str = null;
        } else {
            str = (String) r0.get();
        }
        C04560Oe r02 = this.A04;
        if (r02 == null) {
            str2 = null;
        } else {
            str2 = (String) r02.get();
        }
        C04560Oe r03 = this.A03;
        if (r03 != null) {
            str3 = (String) r03.get();
        }
        AnonymousClass0NW.A01(str, str2, str3, this.A00, th, this.A02);
        this.A01.uncaughtException(thread, th);
    }
}
