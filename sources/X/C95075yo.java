package X;

import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5yo  reason: invalid class name and case insensitive filesystem */
public final class C95075yo extends C63873iU {
    public final boolean A00;
    public final /* synthetic */ AnonymousClass7A4 A01;

    public C95075yo(AnonymousClass7A4 r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public static Double A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str) {
        uSLEBaseShape0S0000000.A0T(C28174Ezk.A00(821), str);
        uSLEBaseShape0S0000000.A0R(AnonymousClass000.A00(1130), Double.valueOf(C31017GdY.A00()));
        return Double.valueOf(((double) System.currentTimeMillis()) - C31017GdY.A00());
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String BK7;
        AnonymousClass0A2 A03;
        int i;
        USLEBaseShape0S0000000 A0I;
        int A032 = C14030oh.A03(2055216521);
        int A033 = C14030oh.A03(-416839040);
        User user = ((AnonymousClass5u4) obj).A02;
        if (user != null) {
            AnonymousClass7A4 r15 = this.A01;
            C31017GdY gdY = r15.A05;
            boolean z = this.A00;
            Double valueOf = Double.valueOf((double) 1.0f);
            String BK72 = user.BK7();
            UserSession userSession = r15.A0A;
            boolean A06 = C19573AyZ.A06(userSession, user);
            C13330nS r12 = gdY.A00;
            C10690il r11 = r12.A00;
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(r12.A03(r11, "ig_nametag_user_lookup_success"), 1370);
            Boolean valueOf2 = Boolean.valueOf(z);
            A0I2.A0Q("is_from_camera", valueOf2);
            A0I2.A0R("model_confidence_score", valueOf);
            A0I2.A0T("scanned_username", BK72);
            A0I2.A0Q("is_self_scan", Boolean.valueOf(A06));
            String str = gdY.A01;
            A0I2.A0T("entry_point", str);
            Double A002 = A00(A0I2, C31017GdY.A01());
            String A003 = C18170wI.A00(166);
            A0I2.A0R(A003, A002);
            A0I2.Bb4();
            user.BK7();
            r15.A08.CSJ(user, z);
            if (C19573AyZ.A06(userSession, user)) {
                A0I = C18180wK.A0I(r12.A03(r11, "ig_nametag_self_nametag_scanned"), 1366);
            } else {
                C23894D0g Aj4 = user.Aj4();
                if (Aj4 == C23894D0g.FollowStatusFollowing) {
                    BK7 = user.BK7();
                    A03 = r12.A03(r11, "ig_nametag_already_following");
                    i = 1362;
                } else if (Aj4 == C23894D0g.FollowStatusRequested) {
                    BK7 = user.BK7();
                    A03 = r12.A03(r11, "ig_nametag_already_requested_to_follow");
                    i = 1363;
                }
                A0I = C18180wK.A0I(A03, i);
                A0I.A0T("scanned_username", BK7);
                A0I.A0Q("is_from_camera", valueOf2);
            }
            A0I.A0T("entry_point", str);
            A0I.A0R(A003, A00(A0I, C31017GdY.A01()));
            A0I.Bb4();
        } else if (!this.A00) {
            this.A01.A08.C28();
        }
        C14030oh.A0A(-212610346, A033);
        C14030oh.A0A(-841128090, A032);
    }

    public final void onFail(AnonymousClass3XX r10) {
        String str;
        int A03 = C14030oh.A03(753548146);
        Object obj = r10.A00;
        String str2 = null;
        if (AnonymousClass0wJ.A1W(obj)) {
            obj.getClass();
            AnonymousClass5u4 r1 = (AnonymousClass5u4) obj;
            str = String.valueOf(r1.A00);
            if (!TextUtils.isEmpty(r1.A04)) {
                str2 = r1.A04;
            }
            String str3 = r1.A03;
            TextUtils.isEmpty(str3);
            this.A01.A08.CSR(str3, this.A00);
        } else {
            str = null;
        }
        AnonymousClass7A4 r5 = this.A01;
        C31017GdY gdY = r5.A05;
        boolean z = this.A00;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(gdY.A00, "ig_nametag_user_lookup_fail"), 1369);
        A0I.A0Q("is_from_camera", Boolean.valueOf(z));
        A0I.A0T(TraceFieldType.ErrorCode, str2);
        A0I.A0T("scanned_username", str);
        A0I.A0T("entry_point", gdY.A01);
        A0I.A0R(C18170wI.A00(166), A00(A0I, C31017GdY.A01()));
        A0I.Bb4();
        if (!z) {
            r5.A08.C28();
        }
        C14030oh.A0A(-1253910069, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(624864000);
        boolean z = this.A00;
        AnonymousClass7A4 r1 = this.A01;
        if (z) {
            r1.A0B = false;
        } else {
            r1.A0C = false;
        }
        C14030oh.A0A(1225757835, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-945508041);
        AnonymousClass7A4 r2 = this.A01;
        AnonymousClass2FY.A00(r2.A0A).A01("lookup_user");
        if (this.A00) {
            r2.A0B = true;
        } else {
            r2.A0C = true;
        }
        C14030oh.A0A(-1401316306, A03);
    }
}
