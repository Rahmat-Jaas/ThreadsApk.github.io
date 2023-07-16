package X;

import com.instagram.base.activity.IgFragmentActivity;
import java.util.List;

/* renamed from: X.6BO  reason: invalid class name */
public enum AnonymousClass6BO implements C021109v {
    STATE_EVENT(1),
    ACTION(2);
    
    public final long A00;

    public static void A00(AnonymousClass0A3 r2, C25831Dsp dsp) {
        r2.A0O(dsp.A06, "entry_point");
        r2.A0T("camera_session_id", dsp.A0K);
        r2.A0O(ACTION, "event_type");
        r2.A0O(dsp.A0o(), "camera_destination");
        r2.A0T(IgFragmentActivity.MODULE_KEY, dsp.A0T.getModuleName());
        r2.A0O(dsp.A0B, "surface");
    }

    public static void A01(AnonymousClass0A3 r2, C25831Dsp dsp, List list) {
        r2.A0O(STATE_EVENT, "event_type");
        r2.A0T(IgFragmentActivity.MODULE_KEY, dsp.A0T.getModuleName());
        r2.A0O(dsp.A0o(), "camera_destination");
        r2.A0T("camera_session_id", dsp.A0K);
        r2.A0U(AnonymousClass000.A00(844), list);
    }

    /* access modifiers changed from: public */
    AnonymousClass6BO(long j) {
        this.A00 = j;
    }
}
