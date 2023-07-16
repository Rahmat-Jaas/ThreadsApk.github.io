package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0XW  reason: invalid class name */
public final class AnonymousClass0XW implements C04050Mb {
    public final Context A00;

    public final void CWp(C04170Mn r4, AnonymousClass0ND r5) {
        C04220Ms.A0B(r4, 0);
        File filesDir = this.A00.getFilesDir();
        File file = new File(filesDir, "fury_async_stacktraces.txt");
        if (!file.exists()) {
            file = new File(filesDir, "fury_stacktrace_flow_collector_output.json");
            if (!file.exists()) {
                return;
            }
        }
        AnonymousClass0MY r1 = AnonymousClass0MY.A09;
        r4.A04(r1, AnonymousClass0ND.CRITICAL_REPORT, file);
        r4.A04(r1, AnonymousClass0ND.LARGE_REPORT, file);
    }

    public AnonymousClass0XW(Context context) {
        this.A00 = context;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0A;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
