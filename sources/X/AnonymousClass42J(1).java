package X;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.42J  reason: invalid class name */
public final class AnonymousClass42J implements C33788HuV {
    public final int A00;
    public final long A01 = System.currentTimeMillis();
    public final LinkedList A02 = new LinkedList();
    public final boolean A03;

    public final String getFilenamePrefix() {
        return "update_thread_event_buffer";
    }

    public final String getFilenameSuffix() {
        return "direct_update_thread_event_buffer_report";
    }

    public final String getTag() {
        return "DirectUpdateThreadEventBufferBugReportLog";
    }

    public final String getContentInBackground(Context context) {
        String A0o = AnonymousClass00U.A0o("Is buffer enabled: ", this.A03);
        String lineSeparator = System.lineSeparator();
        List A0Z = AnonymousClass00J.A0Z(this.A02, this.A00);
        String lineSeparator2 = System.lineSeparator();
        C04220Ms.A06(lineSeparator2);
        String A0V = AnonymousClass00U.A0V(A0o, lineSeparator, C18200wM.A0l(lineSeparator2, A0Z));
        C04220Ms.A06(A0V);
        return A0V;
    }

    public AnonymousClass42J(boolean z, int i) {
        this.A03 = z;
        this.A00 = i;
    }
}
