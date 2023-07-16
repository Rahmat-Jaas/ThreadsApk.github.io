package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3VY  reason: invalid class name */
public final class AnonymousClass3VY {
    public boolean A00;
    public final int A01;
    public final AnonymousClass01V A02;
    public final UserSession A03;

    public AnonymousClass3VY(UserSession userSession, int i) {
        C04220Ms.A0B(userSession, 2);
        this.A01 = i;
        this.A03 = userSession;
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        this.A02 = r0;
    }

    public final void A01(String str) {
        if (!this.A00) {
            AnonymousClass0LU.A0C("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerAnnotate(this.A01, str, 1);
        }
    }

    public final void A02(String str, String str2) {
        C04220Ms.A0B(str2, 1);
        if (!this.A00) {
            AnonymousClass0LU.A0C("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerAnnotate(this.A01, str, str2);
        }
    }

    public static /* synthetic */ void A00(AnonymousClass3VY r3, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if (r3.A00) {
            AnonymousClass0LU.A0C("CLNoticePerformanceLogger", "Marker already started");
        }
        r3.A00 = true;
        AnonymousClass01V r2 = r3.A02;
        int i2 = r3.A01;
        r2.markerStart(i2);
        if (str != null) {
            r2.markerAnnotate(i2, "entrypoint", str);
        }
        if (str2 != null) {
            r2.markerAnnotate(i2, "notice_variant", str2);
        }
        if (str3 != null) {
            r2.markerAnnotate(i2, "surface", str3);
        }
    }

    public final void A03(short s) {
        if (!this.A00) {
            AnonymousClass0LU.A0C("CLNoticePerformanceLogger", "Marker not started.");
            return;
        }
        this.A02.markerEnd(this.A01, s);
        this.A00 = false;
    }
}
