package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.5C6  reason: invalid class name */
public final class AnonymousClass5C6 extends C25739Dr5 {
    public final void A04(C34094I0o i0o) {
        C04220Ms.A0B(i0o, 0);
        try {
            A00(AnonymousClass0wJ.A0M(C25567Do3.A02(AnonymousClass0RG.A00().A01()).A0W, "ig_camera_database_created"), i0o, 906);
        } catch (IllegalStateException unused) {
        }
    }

    public final void A06(C34094I0o i0o) {
        C04220Ms.A0B(i0o, 0);
        try {
            A00(AnonymousClass0wJ.A0M(C25567Do3.A02(AnonymousClass0RG.A00().A01()).A0W, "ig_camera_database_opened"), i0o, 908);
        } catch (IllegalStateException unused) {
        }
    }

    public static void A00(AnonymousClass0A2 r3, Object obj, int i) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r3, i);
        if (uSLEBaseShape0S0000000.A00.isSampled()) {
            SQLiteDatabase sQLiteDatabase = ((K01) obj).A00;
            uSLEBaseShape0S0000000.A0S("database_version", Long.valueOf((long) sQLiteDatabase.getVersion()));
            uSLEBaseShape0S0000000.A0T("database_filepath", sQLiteDatabase.getPath());
            uSLEBaseShape0S0000000.A0O(C171799zz.A3g, "entry_point");
            uSLEBaseShape0S0000000.A0T("camera_session_id", "");
            uSLEBaseShape0S0000000.A0O(AnonymousClass6BO.STATE_EVENT, "event_type");
            uSLEBaseShape0S0000000.Bb4();
        }
    }

    public final void A05(C34094I0o i0o) {
        try {
            A00(AnonymousClass0wJ.A0M(C25567Do3.A02(AnonymousClass0RG.A00().A01()).A0W, "ig_camera_database_destructively_migrated"), i0o, 907);
        } catch (IllegalStateException unused) {
        }
    }
}
