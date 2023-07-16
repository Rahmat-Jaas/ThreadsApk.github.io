package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Date;

/* renamed from: X.0E3  reason: invalid class name */
public final class AnonymousClass0E3 extends C02530Bu {
    public static AnonymousClass0E3 A01;
    public final GLl A00;

    public final void onEventReceivedWithParamsCollectionMap(AnonymousClass0KD r14, AnonymousClass0CU r15) {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(1);
        for (int i = 0; i < r14.A00; i++) {
            String A0C = r14.A0C(i);
            if (FXPFAccessLibraryDebugFragment.NAME.equals(A0C)) {
                analyticsEventDebugInfo.A00 = (String) r14.A0B(i);
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry(FXPFAccessLibraryDebugFragment.NAME, r14.A0B(i)));
            }
            if (IgFragmentActivity.MODULE_KEY.equals(A0C)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry(IgFragmentActivity.MODULE_KEY, r14.A0B(i)));
            }
            if ("sample_rate".equals(A0C)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("sample_rate", r14.A0B(i)));
            }
            if ("tags".equals(A0C)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("tags", r14.A0B(i)));
            }
            if ("time".equals(A0C)) {
                double doubleValue = ((Number) r14.A0B(i)).doubleValue() * 1000.0d;
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("time", (Object) AnonymousClass00U.A0d(String.valueOf(doubleValue), " (", C11500kJ.A00.format(new Date((long) doubleValue)), ")")));
            }
            if ("extra".equals(A0C)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry(C11500kJ.A00((AnonymousClass0KD) r14.A0B(i)), "extra"));
            }
        }
        this.A00.A05(analyticsEventDebugInfo);
        StringBuilder sb = new StringBuilder("{\n");
        AnalyticsEventDebugInfo.A03(analyticsEventDebugInfo, "| ", sb, true);
        sb.append("}");
    }

    public AnonymousClass0E3(int i) {
        this.A00 = new GLl(i);
    }
}
