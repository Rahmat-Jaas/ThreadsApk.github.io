package X;

import android.os.Process;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.redex.IDxDListenerShape442S0100000_2_I2;

/* renamed from: X.60x  reason: invalid class name and case insensitive filesystem */
public final class C954860x extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass5uY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C954860x(AnonymousClass5uY r5) {
        super(13, 3, false, true);
        this.A00 = r5;
    }

    public final void run() {
        if (C18210wN.A1S(36313896948074207L)) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            Process.setThreadPriority(-14);
            DalvikInternals.mprotectExecCode();
            AnonymousClass5uY r2 = this.A00;
            AnonymousClass5uY.A00();
            if (C18210wN.A1S(36313896949057257L)) {
                C691847d.A02(new IDxDListenerShape442S0100000_2_I2(r2, 0));
            }
            Process.setThreadPriority(threadPriority);
        }
    }
}
