package X;

import android.util.Log;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Random;

/* renamed from: X.7iA  reason: invalid class name and case insensitive filesystem */
public final class C127987iA implements C14100oo {
    public static final Random A03 = new Random();
    public final int A00;
    public final EventBuilder A01;
    public final boolean A02;

    public final C14100oo A8S(String str, int i) {
        this.A01.annotate(str, i);
        return this;
    }

    public final C14100oo A8T(String str, long j) {
        this.A01.annotate(str, j);
        return this;
    }

    public final C14100oo A8U(String str, String str2) {
        this.A01.annotate(str, str2);
        return this;
    }

    public final C14100oo A8V(String str, boolean z) {
        this.A01.annotate(str, z);
        return this;
    }

    public final C14100oo A8W(String str, String[] strArr) {
        this.A01.annotate(str, strArr);
        return this;
    }

    public final C14100oo Ciu(Throwable th) {
        EventBuilder eventBuilder = this.A01;
        if (eventBuilder.isSampled() && !this.A02) {
            eventBuilder.annotate("UI_UE_KEY_CAUSE_STACKTRACE", AnonymousClass0MN.A00(Log.getStackTraceString(th), this.A00));
        }
        return this;
    }

    public final boolean isSampled() {
        return this.A01.isSampled();
    }

    public final void report() {
        this.A01.report();
    }

    public C127987iA(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2, int i3, boolean z, boolean z2) {
        EventBuilder eventBuilder;
        String str2;
        EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, i3 == 0 ? A03.nextInt() : i3, str);
        this.A01 = markEventBuilder;
        this.A02 = z;
        this.A00 = i2;
        if (markEventBuilder.isSampled()) {
            if (!z && !z2) {
                this.A01.annotate("UI_UE_KEY_CALLSITE_STACKTRACE", AnonymousClass0MN.A00(AnonymousClass0MN.A01(new Throwable()), i2));
            }
            this.A01.annotate("UI_UE_KEY_END_POINT", AnonymousClass0MI.A00());
            this.A01.annotate("UI_UE_KEY_CATEGORY", str);
            this.A01.setActionId(11289);
            if (EndToEnd.A04()) {
                eventBuilder = this.A01;
                str2 = "sapienz";
            } else if (EndToEnd.A03()) {
                eventBuilder = this.A01;
                str2 = "mobilelab";
            } else if (EndToEnd.isRunningEndToEndTest()) {
                eventBuilder = this.A01;
                str2 = "jest_e2e";
            } else {
                return;
            }
            eventBuilder.annotate("report_source", str2);
        }
    }
}
