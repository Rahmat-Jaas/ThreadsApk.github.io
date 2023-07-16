package X;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.88l  reason: invalid class name and case insensitive filesystem */
public final class C1374088l extends RuntimeException {
    public Throwable A00;
    public final List A01;
    public final String A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|(1:(1:12)(1:(2:13|(1:16)(1:49))))(0)|17|(4:20|(2:22|52)(2:23|53)|51|18)|24|25|26|27|(1:46)(2:29|(2:31|47)(3:(2:32|(1:36)(1:35))|36|48))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0015 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r5 = r8.A00     // Catch:{ all -> 0x0083 }
            if (r5 != 0) goto L_0x0081
            X.88X r5 = new X.88X     // Catch:{ all -> 0x0083 }
            r5.<init>()     // Catch:{ all -> 0x0083 }
            java.util.HashSet r4 = X.C18200wM.A0u()     // Catch:{ all -> 0x0083 }
            java.util.List r0 = r8.A01     // Catch:{ all -> 0x0083 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0083 }
            r6 = r5
        L_0x0015:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0083 }
            boolean r0 = r4.contains(r3)     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0015
            r4.add(r3)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r1 = r3.getCause()     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0044
            if (r1 != r3) goto L_0x0037
            goto L_0x0044
        L_0x0037:
            r2.add(r1)     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0044
            if (r0 == r1) goto L_0x0044
            r1 = r0
            goto L_0x0037
        L_0x0044:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0083 }
        L_0x0048:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x0083 }
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "Duplicate found in causal chain so cropping to prevent loop ..."
            java.lang.RuntimeException r3 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0048
        L_0x0061:
            r4.add(r1)     // Catch:{ all -> 0x0083 }
            goto L_0x0048
        L_0x0065:
            r6.initCause(r3)     // Catch:{ all -> 0x0068 }
        L_0x0068:
            java.lang.Throwable r1 = r6.getCause()     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0015
            java.lang.Throwable r0 = r8.A00     // Catch:{ all -> 0x0083 }
            if (r0 != r1) goto L_0x0073
            goto L_0x0015
        L_0x0073:
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007d
            if (r0 == r1) goto L_0x007d
            r1 = r0
            goto L_0x0073
        L_0x007d:
            r6 = r1
            goto L_0x0015
        L_0x007f:
            r8.A00 = r5     // Catch:{ all -> 0x0083 }
        L_0x0081:
            monitor-exit(r8)
            return r5
        L_0x0083:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1374088l.getCause():java.lang.Throwable");
    }

    private void A00(C102546Vp r8) {
        StringBuilder A0s = C86114wI.A0s(128);
        A0s.append(this);
        A0s.append(10);
        for (StackTraceElement append : getStackTrace()) {
            A0s.append("\tat ");
            A0s.append(append);
            A0s.append(10);
        }
        int i = 1;
        for (Throwable A012 : this.A01) {
            A0s.append("  ComposedException ");
            A0s.append(i);
            A0s.append(" :\n");
            A01("\t", A0s, A012);
            i++;
        }
        String obj = A0s.toString();
        if (r8 instanceof C966065y) {
            ((C966065y) r8).A00.println(obj);
        } else {
            ((AnonymousClass65x) r8).A00.println(obj);
        }
    }

    public final String getMessage() {
        return this.A02;
    }

    public final void printStackTrace(PrintStream printStream) {
        A00(new AnonymousClass65x(printStream));
    }

    public C1374088l(Iterable iterable) {
        LinkedHashSet A0u = C86134wK.A0u();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C1374088l) {
                    A0u.addAll(((C1374088l) obj).A01);
                } else {
                    A0u.add(obj == null ? C18210wN.A0W("Throwable was null!") : obj);
                }
            }
        } else {
            A0u.add(C18210wN.A0W("errors was null"));
        }
        if (!A0u.isEmpty()) {
            A0v.addAll(A0u);
            List unmodifiableList = Collections.unmodifiableList(A0v);
            this.A01 = unmodifiableList;
            this.A02 = AnonymousClass00U.A02(unmodifiableList.size(), " exceptions occurred. ");
            return;
        }
        throw C18190wL.A0a("errors is empty");
    }

    private void A01(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            A01("", sb, th.getCause());
        }
    }

    public final void printStackTrace(PrintWriter printWriter) {
        A00(new C966065y(printWriter));
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }
}
