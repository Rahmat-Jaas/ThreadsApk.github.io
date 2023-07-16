package X;

import java.io.File;
import java.util.Set;

/* renamed from: X.0Pp  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Pp implements Runnable {
    public final /* synthetic */ AnonymousClass0O7 A00;
    public final /* synthetic */ C04910Pt A01;
    public final /* synthetic */ C04920Pv A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ Runnable A04;

    public /* synthetic */ AnonymousClass0Pp(AnonymousClass0O7 r1, C04910Pt r2, C04920Pv r3, File file, Runnable runnable) {
        this.A01 = r2;
        this.A03 = file;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = runnable;
    }

    public final void run() {
        int i;
        C04910Pt r4 = this.A01;
        File file = this.A03;
        AnonymousClass0O7 r7 = this.A00;
        C04920Pv r6 = this.A02;
        Runnable runnable = this.A04;
        if (!file.exists()) {
            file.getName();
            return;
        }
        C13810oL.A01("ReportSender.sendInternal", 1233698618);
        try {
            Set set = r4.A07;
            synchronized (set) {
                try {
                    if (set.contains(file)) {
                        AnonymousClass0LU.A0O("lacrima", "Report sender attempt already in progress: %s", file.getName());
                        i = -39640117;
                    } else {
                        set.add(file);
                        boolean A012 = C04910Pt.A01(r7, r4, r6, file);
                        synchronized (set) {
                            try {
                                set.remove(file);
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        if (A012 && runnable != null) {
                            file.getName();
                            runnable.run();
                        }
                        i = -2143973774;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                    }
                    throw th;
                }
            }
            C13810oL.A00(i);
            return;
        } catch (Throwable th3) {
            C13810oL.A00(1655947214);
            throw th3;
        }
        throw th;
    }
}
