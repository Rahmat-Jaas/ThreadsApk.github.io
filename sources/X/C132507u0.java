package X;

import android.content.Context;
import com.facebook.dcp.model.MetadataResponse;
import com.facebook.models.IgModelLoader;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7u0  reason: invalid class name and case insensitive filesystem */
public final class C132507u0 implements AnonymousClass0i1 {
    public C112826qG A00;
    public final AnonymousClass5FA A01;
    public final C127057gS A02;
    public final UserSession A03;
    public final C04530Oa A04;
    public final C04530Oa A05 = C86114wI.A0w(this, 31);
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C104456bo A08;
    public final C146988nC A09;
    public final C111736oI A0A;
    public final C104466bp A0B;
    public final C110566lu A0C;
    public final C112656py A0D;
    public final C121547Gq A0E;
    public final C125897eF A0F;
    public final C132247ta A0G;
    public final C112096oz A0H;
    public final C132487ty A0I;
    public final AnonymousClass7DX A0J;
    public final AnonymousClass7DX A0K;
    public final AnonymousClass7DX A0L;
    public final C104556by A0M;
    public final IgModelLoader A0N;
    public final C86004w7 A0O;
    public final C31580Grx A0P;
    public final C04530Oa A0Q;
    public final C04530Oa A0R;

    public final void onUserSessionWillEnd(boolean z) {
    }

    static {
        C132507u0.class.getCanonicalName();
    }

    public C132507u0(UserSession userSession, Context context) {
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        IgModelLoader A002 = GP0.A00(userSession2);
        if (A002 != null) {
            this.A0N = A002;
            C04530Oa A0w = C86114wI.A0w(this, 32);
            this.A0R = A0w;
            Context context2 = context;
            AnonymousClass0wJ.A1N(context2, userSession2);
            this.A02 = (C127057gS) userSession2.A01(C127057gS.class, C86154wM.A11(context2, userSession2, 4));
            this.A06 = AnonymousClass0OY.A02(AnonymousClass8GA.A00);
            C86004w7 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
            C04220Ms.A06(listeningDecorator);
            this.A0O = listeningDecorator;
            C31580Grx A012 = AnonymousClass3WK.A01(userSession2);
            this.A0P = A012;
            this.A04 = AnonymousClass0OY.A02(AnonymousClass8G9.A00);
            C132487ty A003 = C98726Gr.A00(context2, userSession2);
            this.A0I = A003;
            C104456bo r0 = new C104456bo((C37295Joc) this.A06.getValue());
            this.A08 = r0;
            C125677do A004 = C125677do.A00(r0.A00);
            this.A09 = A004;
            C104556by r1 = new C104556by((C07810cE) this.A05.getValue());
            this.A0M = r1;
            this.A07 = C86114wI.A0w(this, 33);
            AnonymousClass5FD r6 = new AnonymousClass5FD((HashMap) null, (DefaultConstructorMarker) null, 1);
            this.A0J = r6;
            AnonymousClass5F8 r5 = new AnonymousClass5F8((C03700Kj) C18190wL.A0f(this.A04));
            this.A0K = r5;
            C132247ta A005 = C98676Gm.A00(userSession2);
            this.A0G = A005;
            C121547Gq r4 = A005.A00;
            this.A0E = r4;
            C104466bp r14 = new C104466bp(userSession2);
            this.A0B = r14;
            C125897eF r02 = new C125897eF(r14);
            this.A0F = r02;
            AnonymousClass7DX r142 = (AnonymousClass7DX) this.A07.getValue();
            C04220Ms.A0B(A012, 0);
            C18190wL.A1S(r142, 4, context2);
            C121547Gq r25 = r4;
            this.A0C = new C110566lu(new C112086oy(context2, A012), new C1193074l(A004), new C98656Gk(), r25, r142, r1);
            this.A01 = new AnonymousClass5FA(userSession2);
            C04530Oa A0w2 = C86114wI.A0w(this, 30);
            this.A0Q = A0w2;
            AnonymousClass5FE r3 = new AnonymousClass5FE((HashMap) null, (DefaultConstructorMarker) null, 1);
            this.A0L = r3;
            C112096oz r2 = new C112096oz(A002, userSession2);
            this.A0H = r2;
            C104476bq r13 = new C104476bq(A004);
            C112076ox r11 = new C112076ox(context2, A012);
            C07810cE r12 = r1.A00;
            boolean z = true;
            C112656py r122 = new C112656py(r11, r13, r4, (r12 == null || !r12.ATr(36319231297786868L)) ? false : z);
            this.A0D = r122;
            C111736oI r112 = new C111736oI(A012);
            this.A0A = r112;
            AnonymousClass791 r143 = A003.A00;
            C03700Kj r132 = (C03700Kj) C18190wL.A0f(this.A04);
            AnonymousClass7DX r10 = (AnonymousClass7DX) this.A07.getValue();
            C86114wI.A1I(r132, 1, r10);
            C104526bv r7 = new C104526bv(new C104536bw());
            C104546bx r15 = new C104546bx(A0w);
            AnonymousClass7EB r152 = new AnonymousClass7EB(r4, r2, listeningDecorator);
            AnonymousClass780 r22 = new AnonymousClass780(r4, r143, r5, r3);
            C112386pV r03 = new C112386pV(r4, r143, r6);
            C03700Kj r19 = r132;
            C112826qG r04 = new C112826qG(r22, r4, new C113096qi(r19, r03, r22, r112, r122, r4, r152, r10), new AnonymousClass78M(r19, A004, r03, r22, r112, r122, r25, r7, r15, r10, A0w2));
            this.A00 = r04;
            C121547Gq r23 = r04.A01;
            synchronized (r23) {
                r23.A00.add(C86144wL.A0w(r02));
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C1192974k A00() {
        C147108nP A002;
        C110566lu r7 = this.A0C;
        C07810cE r2 = r7.A04.A00;
        if (r2 != null && r2.ATr(36319231297524720L)) {
            ((C125677do) r7.A01.A00).A00.removeAll();
        }
        List list = AnonymousClass6XC.A00;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            C04530Oa r1 = this.A07;
            C147108nP A003 = AnonymousClass7DX.A00((AnonymousClass7DX) r1.getValue(), next);
            if ((A003 != null && A003.BI3()) || ((A002 = AnonymousClass7DX.A00((AnonymousClass7DX) r1.getValue(), next)) != null && A002.B2U())) {
                A0v.add(next);
            }
        }
        MetadataResponse metadataResponse = (MetadataResponse) C98666Gl.A00(AnonymousClass68S.DCP_METADATA_FETCH, r7.A02, new MetadataResponse(AnonymousClass4WJ.A0A()), AnonymousClass00J.A0H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, (CharSequence) null, (CharSequence) null, A0v, (AnonymousClass0YY) null, 62), C86164wN.A0v(A0v, r7, 36));
        C04220Ms.A0B(metadataResponse, 0);
        C1192974k r4 = new C1192974k((AnonymousClass7DX) null, (DefaultConstructorMarker) null, 1);
        Iterator A0z = AnonymousClass0wJ.A0z(metadataResponse.A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            AnonymousClass7DX r0 = r4.A00;
            Object key = A0o.getKey();
            Object value = A0o.getValue();
            C04220Ms.A0B(key, 0);
            C04220Ms.A0B(value, 1);
            r0.A00.put(key, value);
        }
        return r4;
    }
}
