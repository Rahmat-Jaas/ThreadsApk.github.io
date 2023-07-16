package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass791;
import X.C132487ty;
import X.C146958n9;
import X.C18180wK;
import X.C39142Kno;
import X.C83224qz;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.signals.model.SignalResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$saveLong$1", f = "SignalStoreTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SignalStoreTestFragment$saveLong$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ String $signalField1;
    public final /* synthetic */ String $signalField2;
    public final /* synthetic */ String $signalId;
    public final /* synthetic */ C132487ty $signalStoreObjWrapper;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalStoreTestFragment$saveLong$1(C132487ty r2, String str, String str2, String str3, C146958n9 r6) {
        super(2, r6);
        this.$signalStoreObjWrapper = r2;
        this.$signalId = str;
        this.$signalField1 = str2;
        this.$signalField2 = str3;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new SignalStoreTestFragment$saveLong$1(this.$signalStoreObjWrapper, this.$signalId, this.$signalField1, this.$signalField2, r8);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((SignalStoreTestFragment$saveLong$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0OU.A00(obj);
            AnonymousClass791 r3 = this.$signalStoreObjWrapper.A00;
            String str = this.$signalId;
            r3.A01(30, str, C18180wK.A0n(new SignalResult((DcpContext) null, str, (String) null, (String) null, AnonymousClass4WJ.A0G(C18180wK.A0p(this.$signalField1, new Long(6)), C18180wK.A0p(this.$signalField2, new Long(7))), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), 0)));
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0a();
    }
}
