package X;

import android.os.RemoteException;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4VE  reason: invalid class name */
public final class AnonymousClass4VE implements C84644tb {
    public String A00;
    public final QuickPerformanceLogger A01 = AnonymousClass01V.A0p;
    public final C10300i6 A02;

    public final void CLj(Exception exc, C62273Yb r11) {
        C318429e r5;
        this.A01.markerEnd(857814189, 3);
        if (exc instanceof RemoteException) {
            r5 = C318429e.REMOTE_EXCEPTION;
        } else if (exc instanceof UnsupportedOperationException) {
            r5 = C318429e.UNSUPPORTEDOPERATION_EXCEPTION;
        } else {
            r5 = null;
        }
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_FAILURE, r5, (String) null, (Map) null, r11);
    }

    public final void CLk(C62273Yb r10) {
        this.A01.markerEnd(857814189, 3);
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_FAILURE, C318429e.NO_ACCOUNT_FOUND, (String) null, (Map) null, r10);
    }

    public final void CLl(C62273Yb r10) {
        this.A01.markerEnd(857814189, 2);
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_SUCCESS, (C318429e) null, (String) null, (Map) null, r10);
    }

    public final void CLm(C62273Yb r10) {
        this.A01.markerEnd(857814189, 3);
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_FAILURE, C318429e.PROVIDER_NOT_TRUSTED, (String) null, (Map) null, r10);
    }

    public final void CLn(Map map, C62273Yb r11) {
        this.A01.markerEnd(857814189, 3);
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_FAILURE, C318429e.PROVIDER_NOT_FOUND, (String) null, map, r11);
    }

    public final void A00(AnonymousClass297 r6, C318429e r7, String str, Map map, C62273Yb r10) {
        C317028q r3;
        if (str != null) {
            if (map == null) {
                map = AnonymousClass0wJ.A0y();
            }
            map.put(DevServerEntity.COLUMN_DESCRIPTION, String.format(DevServerEntity.COLUMN_DESCRIPTION, new Object[]{str}));
        }
        Long l = null;
        if (r10 == null) {
            r3 = null;
        } else if (r10.A04.equals(C307822y.A04)) {
            r3 = C317028q.FACEBOOK;
        } else {
            r3 = C317028q.INSTAGRAM;
        }
        try {
            String str2 = this.A00;
            if (str2 != null) {
                l = Long.valueOf(Long.parseLong(str2));
            }
        } catch (NumberFormatException unused) {
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(this.A02), "fx_sso_library"), 690);
        A0I.A0O(r6, "fx_sso_library_event");
        A0I.A0O(r7, "fx_sso_library_failure_reason");
        A0I.A0S("initiator_account_id", l);
        A0I.A0O(r3, "initiator_account_type");
        A0I.A0T("version_id", "1.0");
        C18220wO.A1G(A0I, map);
    }

    public final void Bj7(String str) {
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_FAILURE, (C318429e) null, str, (Map) null, (C62273Yb) null);
    }

    public final void Bkl(List list) {
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerAnnotate(857814189, "PLATFORM".toLowerCase(), "Android");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            quickPerformanceLogger.markerAnnotate(857814189, "ACCOUNT_TYPE".toLowerCase(), ((C307822y) it.next()).name());
        }
        quickPerformanceLogger.markerAnnotate(857814189, "APP_ID".toLowerCase(), "567067343352427");
        quickPerformanceLogger.markerAnnotate(857814189, "IS_USER_ID".toLowerCase(), AnonymousClass0wJ.A1W(this.A00));
        quickPerformanceLogger.markerAnnotate(857814189, "IS_LEGACY".toLowerCase(), false);
    }

    public final void Blm(C62273Yb r7) {
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_START, (C318429e) null, (String) null, (Map) null, r7);
    }

    public final void CLo(C62273Yb r4) {
        this.A01.markerPoint(857814189, "CONTENT_PROVIDER_RESOLVED");
    }

    public final void CQY(C62273Yb r7, C73914Va r8) {
        A00(AnonymousClass297.AUTH_TOKEN_FETCH_FAILURE, C318429e.TRANSFORMER_ERROR, (String) null, (Map) null, r7);
    }

    public final void onStart() {
        this.A01.markerStart(857814189);
    }

    public AnonymousClass4VE(C10300i6 r2, String str) {
        this.A02 = r2;
        this.A00 = str;
    }
}
