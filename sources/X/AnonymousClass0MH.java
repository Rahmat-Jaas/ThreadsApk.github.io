package X;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.util.Collection;

/* renamed from: X.0MH  reason: invalid class name */
public final class AnonymousClass0MH extends C15010qZ implements C15090qh {
    public AnonymousClass0MV A00;
    public final int A01;

    public final File A01(String str) {
        return this.A00.A08(str);
    }

    public final String A02(String str) {
        return this.A00.A02(str);
    }

    public final void A03(Collection collection) {
        this.A00.A03(collection);
    }

    public final String[] A04(String str) {
        return this.A00.A04(str);
    }

    public final int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        return this.A00.A05(threadPolicy, str, i);
    }

    public final void A06(int i) {
        this.A00.A06(i);
    }

    public final String toString() {
        return AnonymousClass00U.A0V("ApplicationSoSource[", this.A00.toString(), "]");
    }

    public AnonymousClass0MH(Context context, int i) {
        this.A01 = i;
        this.A00 = new AnonymousClass0MV(new File(context.getApplicationInfo().nativeLibraryDir), new String[0], i);
    }

    public final C15010qZ CZX(Context context) {
        this.A00 = new AnonymousClass0MV(new File(context.getApplicationInfo().nativeLibraryDir), new String[0], this.A01 | 1);
        return this;
    }
}
