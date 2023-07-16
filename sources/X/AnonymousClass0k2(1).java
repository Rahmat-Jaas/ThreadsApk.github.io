package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.0k2  reason: invalid class name */
public class AnonymousClass0k2 {
    public final AnonymousClass0DQ A00 = AnonymousClass0DQ.A01;

    public final void A01(int i, String str, String str2) {
        if (str != null && str2 != null) {
            USLEBaseShape0S0000000 A002 = C32382Bp.A00(new C10680ik(C10260hz.A00).A00());
            A002.A0S("dominant_task_id", Long.valueOf((long) i));
            A002.A0T("all_task_ids", str);
            A002.A0T("thread_dumps", str2);
            A002.Bb4();
        }
    }

    public void A02(AnonymousClass0gG r4) {
        int runnableId;
        AnonymousClass01V r2 = AnonymousClass01V.A0p;
        if (r2 != null && (runnableId = r4.getRunnableId()) != 401 && runnableId != 311 && runnableId != 615 && runnableId != 621) {
            int hashCode = r4.hashCode();
            r2.markerStart(628497193, hashCode);
            MarkerEditor withMarker = r2.withMarker(628497193, hashCode);
            withMarker.annotate("taskId", r4.getRunnableId());
            withMarker.annotate("priority", r4.getPriority());
            withMarker.annotate("taskIdName", C09680fv.A00(r4.getRunnableId()));
            withMarker.annotate("duringAppStart", AnonymousClass0DQ.A00);
            withMarker.point("queue_start");
            withMarker.markerEditingCompleted();
        }
    }

    public void A03(AnonymousClass0gG r7) {
        AnonymousClass01V r5 = AnonymousClass01V.A0p;
        if (r5 != null && A00(r5, r7)) {
            int hashCode = r7.hashCode();
            MarkerEditor withMarker = r5.withMarker(628497193, hashCode);
            withMarker.annotate("duringAppStart", AnonymousClass0DQ.A00);
            withMarker.point("execution_failed");
            r5.markerEnd(628497193, hashCode, 3);
        }
    }

    public void A04(AnonymousClass0gG r7) {
        AnonymousClass01V r5 = AnonymousClass01V.A0p;
        if (r5 != null && A00(r5, r7)) {
            int hashCode = r7.hashCode();
            MarkerEditor withMarker = r5.withMarker(628497193, hashCode);
            withMarker.annotate("duringAppStart", AnonymousClass0DQ.A00);
            withMarker.point("execution_end");
            r5.markerEnd(628497193, hashCode, 467);
        }
    }

    public void A05(AnonymousClass0gG r4) {
        AnonymousClass01V r2 = AnonymousClass01V.A0p;
        if (r2 != null && A00(r2, r4)) {
            MarkerEditor withMarker = r2.withMarker(628497193, r4.hashCode());
            withMarker.annotate("duringAppStart", AnonymousClass0DQ.A00);
            withMarker.point("startExecution");
            withMarker.point("queue_end");
            withMarker.point("execution_start");
            withMarker.markerEditingCompleted();
        }
    }

    public static boolean A00(AnonymousClass01V r2, AnonymousClass0gG r3) {
        int runnableId;
        if (!r2.isMarkerOn(628497193, r3.hashCode()) || (runnableId = r3.getRunnableId()) == 401 || runnableId == 311 || runnableId == 615 || runnableId == 621) {
            return false;
        }
        return true;
    }
}
