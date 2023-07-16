package com.instagram.wellbeing.quietmode.repository;

import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass3H1;
import X.AnonymousClass3Za;
import X.AnonymousClass4VZ;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C39142Kno;
import X.C63043bN;
import X.C63623hv;
import X.C83924sD;
import X.C85814vo;
import X.D0E;
import X.H1T;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2", f = "QuietModeRepository.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class QuietModeRepository$updateQuietModeWithWindows$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C83924sD A04;
    public final /* synthetic */ AnonymousClass3H1 A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuietModeRepository$updateQuietModeWithWindows$2(User user, C83924sD r3, AnonymousClass3H1 r4, Long l, Long l2, C146958n9 r7, long j, long j2, boolean z, boolean z2) {
        super(1, r7);
        this.A05 = r4;
        this.A09 = z;
        this.A02 = j;
        this.A01 = j2;
        this.A08 = z2;
        this.A07 = l;
        this.A06 = l2;
        this.A03 = user;
        this.A04 = r3;
    }

    public final C146958n9 create(C146958n9 r14) {
        AnonymousClass3H1 r3 = this.A05;
        boolean z = this.A09;
        long j = this.A02;
        long j2 = this.A01;
        boolean z2 = this.A08;
        return new QuietModeRepository$updateQuietModeWithWindows$2(this.A03, this.A04, r3, this.A07, this.A06, r14, j, j2, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((QuietModeRepository$updateQuietModeWithWindows$2) create((C146958n9) obj)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            UserSession userSession = this.A05.A01;
            boolean z = this.A09;
            long j = this.A02;
            long j2 = this.A01;
            boolean z2 = this.A08;
            Long l = this.A07;
            Long l2 = this.A06;
            this.A00 = 1;
            AnonymousClass0wJ.A13(C63043bN.A01.A06(userSession).edit(), "HAS_EVER_ENABLED_QUIET_MODE", true);
            H1T A0O = AnonymousClass0wJ.A0O(userSession);
            A0O.A0J("mental_well_being/update_quiet_time_window/");
            A0O.A0R("quiet_mode_enabled", z);
            C18180wK.A1I(A0O, j, j2);
            if (!(l == null || l2 == null)) {
                long longValue = l.longValue();
                long longValue2 = l2.longValue();
                JSONObject A0y = C18230wP.A0y();
                A0y.put("start_timestamp", longValue);
                A0y.put("end_timestamp", longValue2);
                A0O.A0O("pause_window", C18190wL.A0n(A0y));
                A0O.A0R("cancel_pause_window", z2);
            }
            obj = C63623hv.A00(AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class), this, 1440554863, 0);
            if (obj == d0e) {
                return d0e;
            }
        }
        Object obj2 = obj;
        User user = this.A03;
        boolean z3 = this.A09;
        C83924sD r4 = this.A04;
        long j3 = this.A02;
        long j4 = this.A01;
        Long l3 = this.A07;
        Long l4 = this.A06;
        Unit unit2 = null;
        if (obj instanceof AnonymousClass1jA) {
            user.A2X(z3);
            if (r4 != null) {
                r4.CNV(l3, l4, j3, j4, z3);
                unit = Unit.A00;
            } else {
                unit = null;
            }
            obj2 = AnonymousClass1jA.A00(unit);
        } else if (!(obj instanceof AnonymousClass1jB)) {
            throw AnonymousClass4VZ.A00();
        }
        if (obj2 instanceof AnonymousClass1jA) {
            return obj2;
        }
        if (obj2 instanceof AnonymousClass1jB) {
            boolean z4 = !z3;
            user.A2X(z4);
            if (r4 != null) {
                r4.Bwp(l3, l4, j3, j4, z4);
                unit2 = Unit.A00;
            }
            return new AnonymousClass1jB(unit2);
        }
        throw AnonymousClass4VZ.A00();
    }
}
