package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7gj  reason: invalid class name and case insensitive filesystem */
public final class C127207gj implements C146298m0 {
    public final EventBuilder A00;
    public final AnonymousClass6U9 A01;
    public final C04530Oa A02;

    public final void A64(Exception exc) {
    }

    public final void A6h(String str) {
        this.A00.annotate(DialogModule.KEY_MESSAGE, str);
    }

    public final boolean isSampled() {
        return this.A00.isSampled();
    }

    public final void report() {
        EventBuilder eventBuilder = this.A00;
        if (eventBuilder.isSampled()) {
            Iterator A0z = AnonymousClass0wJ.A0z(AnonymousClass4WJ.A0A());
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                eventBuilder.annotate(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            eventBuilder.report();
        }
    }

    public C127207gj(AnonymousClass6U9 r4, Integer num, C04530Oa r6) {
        this.A02 = r6;
        this.A01 = r4;
        EventBuilder markEventBuilder = ((LightweightQuickPerformanceLogger) r6.getValue()).markEventBuilder(C116776xX.A00(num), C116776xX.A01(num));
        C04220Ms.A06(markEventBuilder);
        this.A00 = markEventBuilder;
    }

    public final void A8X(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        this.A00.annotate(str, str2);
    }
}
