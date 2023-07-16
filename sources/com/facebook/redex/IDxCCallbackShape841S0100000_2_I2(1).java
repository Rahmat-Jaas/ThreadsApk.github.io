package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3J5;
import X.AnonymousClass9NY;
import X.C04220Ms;
import X.C144938jX;
import X.C146958n9;
import X.C149878ut;
import X.C17522ADi;
import X.C18200wM;
import X.C25237DiI;
import X.C27952Ew2;
import X.C62793ak;
import com.instagram.api.schemas.SettingId;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S2301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2;

public class IDxCCallbackShape841S0100000_2_I2 implements C144938jX {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape841S0100000_2_I2(AnonymousClass9NY r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void CSp(SettingId settingId, C17522ADi aDi, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        SettingId settingId2 = settingId;
        C17522ADi aDi2 = aDi;
        if (this.A01 != 0) {
            String str = (String) obj4;
            String str2 = (String) obj3;
            C04220Ms.A0B(settingId, 0);
            AnonymousClass0wJ.A1Q(str, str2);
            C149878ut r2 = (C149878ut) ((AnonymousClass9NY) this.A00).A03.getValue();
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S2301000_I2(r2, aDi2, settingId2, str2, str, (C146958n9) null, 3), AnonymousClass3J5.A00(r2), 3);
            return;
        }
        boolean A1X = AnonymousClass0wJ.A1X(obj3);
        C04220Ms.A0B(settingId, 0);
        C62793ak A0N = C18200wM.A0N(((AnonymousClass9NY) this.A00).A03);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0311000_I2(settingId, aDi, A0N, (C146958n9) null, 16, A1X), AnonymousClass3J5.A00(A0N), 3);
    }
}
