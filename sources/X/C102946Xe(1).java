package X;

import java.io.PrintStream;

/* renamed from: X.6Xe  reason: invalid class name and case insensitive filesystem */
public final class C102946Xe {
    public static final AnonymousClass6J1 A00;

    static {
        AnonymousClass6J1 r0;
        try {
            Integer num = (Integer) C86134wK.A0d();
            if (num != null) {
                if (num.intValue() >= 19) {
                    r0 = new AnonymousClass5pe();
                    A00 = r0;
                }
            }
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = AnonymousClass5pd.class.getName();
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(name) + 133);
            A0s.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            A0s.append(name);
            printStream2.println(C18180wK.A0i("will be used. The error is: ", A0s));
            th.printStackTrace(printStream2);
            r0 = new AnonymousClass5pd();
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            r0 = new AnonymousClass5pf();
        } else {
            r0 = new AnonymousClass5pd();
        }
        A00 = r0;
    }
}
