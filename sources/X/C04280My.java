package X;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.0My  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04280My implements Callable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ Throwable A01;
    public final /* synthetic */ Map.Entry A02;

    public /* synthetic */ C04280My(String str, Throwable th, Map.Entry entry) {
        this.A02 = entry;
        this.A01 = th;
        this.A00 = str;
    }

    public final Object call() {
        Map.Entry entry = this.A02;
        String str = this.A00;
        try {
            return (String) ((AnonymousClass0X1) entry.getValue()).A01.get();
        } catch (Throwable th) {
            AnonymousClass0LU.A0L("lacrima", "Failed to apply lazy supplier: %s", th, str);
            C04790Pd.A00();
            return "";
        }
    }
}
