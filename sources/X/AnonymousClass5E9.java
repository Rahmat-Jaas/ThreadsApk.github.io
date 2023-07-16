package X;

import android.os.Process;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5E9  reason: invalid class name */
public final class AnonymousClass5E9 extends AnonymousClass7DF {
    public final List A00 = new LinkedList();
    public final Set A01 = C18200wM.A0u();

    public static void A00(AnonymousClass5E9 r7) {
        File[] listFiles;
        File A0Z = C86144wL.A0Z(AnonymousClass00U.A0S("/proc/", "/task/", Process.myPid()));
        if (A0Z.exists() && A0Z.canRead() && (listFiles = A0Z.listFiles()) != null) {
            for (File name : listFiles) {
                try {
                    int parseInt = Integer.parseInt(name.getName());
                    if (parseInt != -1) {
                        Set set = r7.A01;
                        Integer valueOf = Integer.valueOf(parseInt);
                        if (!set.contains(valueOf)) {
                            set.add(valueOf);
                            r7.A00.add(new AnonymousClass5EB(parseInt));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
