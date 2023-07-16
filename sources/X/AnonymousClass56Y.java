package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.redex.IDxBListenerShape743S0100000_2_I2;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.newsfeed.data.ActivityPagedData;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.56Y  reason: invalid class name */
public final class AnonymousClass56Y extends AnonymousClass10X {
    public static final C148878sK A0H;
    public static final C148878sK A0I;
    public KtCSuperShape0S0210000_I2 A00 = new KtCSuperShape0S0210000_I2();
    public ActivityPagedData A01;
    public C148838sG A02;
    public C148838sG A03;
    public boolean A04;
    public final C11630kW A05;
    public final AnonymousClass3V6 A06 = AnonymousClass2LT.A00();
    public final ActivityFeedRepository A07;
    public final C28044ExY A08;
    public final UserSession A09;
    public final Map A0A = C18220wO.A0y();
    public final C86074wE A0B = C18190wL.A0z(new KtCSuperShape0S0210000_I2());
    public final C86074wE A0C;
    public final C86074wE A0D = C18190wL.A0z(false);
    public final C86094wG A0E;
    public final C86094wG A0F;
    public final C27713Es3 A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56Y(Application application, C11630kW r16, ActivityFeedRepository activityFeedRepository, C28044ExY exY, UserSession userSession) {
        super(application);
        ActivityFeedRepository activityFeedRepository2 = activityFeedRepository;
        C04220Ms.A0B(activityFeedRepository2, 3);
        C28044ExY exY2 = exY;
        C04220Ms.A0B(exY2, 4);
        UserSession userSession2 = userSession;
        this.A09 = userSession2;
        this.A05 = r16;
        this.A07 = activityFeedRepository2;
        this.A08 = exY2;
        IDxBListenerShape743S0100000_2_I2 iDxBListenerShape743S0100000_2_I2 = new IDxBListenerShape743S0100000_2_I2(this, 0);
        this.A0G = iDxBListenerShape743S0100000_2_I2;
        C84714tk A012 = C25239DiK.A01(new KtSLambdaShape15S0201000_I2_1(this, (C146958n9) null, 35));
        this.A0E = C25753DrP.A04(new KtCSuperShape0S0210000_I2(), AnonymousClass3J5.A00(this), A012, new AnonymousClass87W());
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0200000_I2((C972268l) null, (DefaultConstructorMarker) null, (AnonymousClass8s2) null, 3, 19));
        this.A0C = A0z;
        this.A0F = A0z;
        AnonymousClass3NS.A01(userSession2).A01(AnonymousClass2AP.A05).A00(iDxBListenerShape743S0100000_2_I2);
        AnonymousClass3J5.A01(this, new KtSLambdaShape6S0200000_I2_1(this, (C146958n9) null, 5), AnonymousClass7E6.A00(userSession2).A02(AnonymousClass46R.class), 34);
        AnonymousClass3J5.A01(this, new KtSLambdaShape12S0100000_I2_1(this, (C146958n9) null, 3), AnonymousClass7E6.A00(userSession2).A02(BBZ.class), 34);
        AnonymousClass3J5.A01(this, new KtSLambdaShape12S0100000_I2_1(this, (C146958n9) null, 4), AnonymousClass7E6.A00(userSession2).A02(C131207ra.class), 34);
        AnonymousClass3J5.A01(this, new KtSLambdaShape12S0100000_I2_1(this, (C146958n9) null, 5), AnonymousClass7E6.A00(userSession2).A02(C131197rZ.class), 34);
        A02(this, AnonymousClass0wJ.A0Y(userSession2));
        A0A(false);
    }

    public static final void A00(Context context, Uri uri) {
        C04220Ms.A0B(context, 0);
        Intent A032 = C62333Yi.A01().A03(context, 67108864);
        A032.setData(uri);
        C10650ih.A02(context, A032);
    }

    public static final void A01(C972268l r7, AnonymousClass56Y r8, boolean z) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0211000_I2(r8, r7, (C146958n9) null, 4, z), AnonymousClass3J5.A00(r8), 3);
    }

    public final void A09(C89955Hr r10, Long l) {
        C04220Ms.A0B(r10, 1);
        C23922D1k d1k = r10.A03;
        String str = r10.A08;
        UserSession userSession = this.A09;
        C11630kW r5 = this.A05;
        String str2 = r10.A06;
        String str3 = r10.A0B;
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, userSession), AnonymousClass000.A00(1012)), 2431);
        C86114wI.A1D(A0I2, new AnonymousClass5CY(), r5, d1k, str);
        A0I2.A0S("userId", AnonymousClass0wJ.A0d(userSession.getUserId()));
        A0I2.A0S("position", l);
        A0I2.A0T("story_id", str2);
        A0I2.A0T("tuuid", str3);
        A0I2.Bb4();
    }

    static {
        C972268l r3 = C972268l.ALL;
        C972268l r2 = C972268l.REPLIES;
        C972268l r1 = C972268l.MENTIONS;
        A0H = AnonymousClass7C0.A02(r3, r2, r1, C972268l.VERIFIED);
        A0I = AnonymousClass7C0.A02(r3, C972268l.REQUESTED, r2, r1);
    }

    public final void A0A(boolean z) {
        Object value;
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2;
        A01((C972268l) ((KtCSuperShape0S0200000_I2) this.A0C.getValue()).A00, this, z);
        if (!z) {
            C86074wE r4 = this.A0B;
            do {
                value = r4.getValue();
                ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) value;
            } while (!C86154wM.A1a(AnonymousClass68G.LOADING, value, (AnonymousClass8s2) ktCSuperShape0S0210000_I2.A01, r4, ktCSuperShape0S0210000_I2.A02));
        }
    }

    public static final void A02(AnonymousClass56Y r7, User user) {
        Object value;
        C148878sK r2;
        C972268l r1;
        Object value2;
        C148878sK r22;
        C972268l r12;
        if (C18190wL.A1Z(user.A0k(), true)) {
            r7.A04 = true;
            C86074wE r4 = r7.A0C;
            do {
                value2 = r4.getValue();
                r22 = A0I;
                r12 = (C972268l) ((KtCSuperShape0S0200000_I2) value2).A00;
                C18210wN.A0n(1, r12, r22);
            } while (!r4.ADi(value2, new KtCSuperShape0S0200000_I2(r12, (AnonymousClass8s2) r22)));
            return;
        }
        r7.A04 = false;
        C86074wE r42 = r7.A0C;
        do {
            value = r42.getValue();
            r2 = A0H;
            r1 = (C972268l) ((KtCSuperShape0S0200000_I2) value).A00;
            C04220Ms.A0B(r1, 0);
            C04220Ms.A0B(r2, 1);
        } while (!r42.ADi(value, new KtCSuperShape0S0200000_I2(r1, (AnonymousClass8s2) r2)));
    }
}
