package com.instagram.ondevicecompute;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass4WJ;
import X.AnonymousClass4WK;
import X.AnonymousClass68S;
import X.AnonymousClass791;
import X.C04220Ms;
import X.C10600ic;
import X.C112826qG;
import X.C1203279s;
import X.C132487ty;
import X.C132507u0;
import X.C146958n9;
import X.C18180wK;
import X.C18220wO;
import X.C39142Kno;
import X.C98596Ge;
import X.C98666Gl;
import X.C98726Gr;
import android.content.Context;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.signals.model.SignalResult;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape4S0210000_I2;

@DebugMetadata(c = "com.instagram.ondevicecompute.OnDeviceCompute$submitTrainingInBackground$1", f = "OnDeviceCompute.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OnDeviceCompute$submitTrainingInBackground$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ DcpContext A01;
    public final /* synthetic */ C1203279s A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnDeviceCompute$submitTrainingInBackground$1(DcpContext dcpContext, C1203279s r3, String str, C146958n9 r5, long j) {
        super(2, r5);
        this.A02 = r3;
        this.A03 = str;
        this.A00 = j;
        this.A01 = dcpContext;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new OnDeviceCompute$submitTrainingInBackground$1(this.A01, this.A02, this.A03, r9, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OnDeviceCompute$submitTrainingInBackground$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        UserSession userSession = this.A02.A06;
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        C132507u0 A002 = C98596Ge.A00(context, userSession);
        Context context2 = C10600ic.A00;
        C04220Ms.A06(context2);
        C132487ty A003 = C98726Gr.A00(context2, userSession);
        C112826qG r4 = A002.A00;
        r4.A00(A002.A00());
        AnonymousClass791 r5 = A003.A00;
        Map A0O = AnonymousClass4WK.A0O(C18180wK.A0p(this.A03, new Long(this.A00)));
        DcpContext dcpContext = this.A01;
        r5.A01(30, "2474000", C18180wK.A0n(new SignalResult(dcpContext, "2474000", (String) null, (String) null, A0O, AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), 0)));
        C98666Gl.A00(AnonymousClass68S.SIGNAL_STORE_COLLECT_ALL, r5.A02, AnonymousClass4WJ.A0A(), "no_use_case", new KtLambdaShape4S0210000_I2(3, (Object) null, r5, false));
        r4.A03.A00("notification_ranking", C18180wK.A0n(dcpContext), false);
        return Unit.A00;
    }
}
