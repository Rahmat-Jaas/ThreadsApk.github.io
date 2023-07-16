package X;

import android.content.Context;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;

/* renamed from: X.0ee  reason: invalid class name and case insensitive filesystem */
public final class C09000ee extends AnonymousClass0Uk {
    public boolean A00;
    public final Context A01;

    public C09000ee(Context context) {
        super((String) null);
        this.A01 = context;
    }

    public final int getSupportedProviders() {
        return ExternalProviders.A07.A01;
    }

    public final int getTracingProviders() {
        if (this.A00) {
            return ExternalProviders.A07.A01;
        }
        return 0;
    }

    public final void disable() {
        int A03 = C14030oh.A03(1387651773);
        this.A00 = false;
        Systrace.A00 = 0;
        C14030oh.A0A(1607498891, A03);
    }

    public final void enable() {
        int A03 = C14030oh.A03(-782532556);
        this.A00 = true;
        Context context = this.A01;
        if (!C10250hy.A00) {
            C15020qa.A05(context);
            Systrace.A00 = 1;
            C13850oP.A01(1, "SystraceInit", -92406422);
            C13850oP.A00(1, 1954521277);
            Systrace.A00 = 0;
        }
        C10250hy.A00 = true;
        Systrace.A00 = 1;
        C14030oh.A0A(-1445494276, A03);
    }
}
