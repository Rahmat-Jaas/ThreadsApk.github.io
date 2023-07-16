package com.facebook.redex;

import X.AnonymousClass05D;
import X.AnonymousClass3QH;
import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C127397h3;
import X.C61043Rr;
import X.C63893iY;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;

public class IDxRListenerShape228S0200000_1_I2 implements AnonymousClass05D {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRListenerShape228S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
            case 3:
                this.A01 = r2;
                this.A00 = r1;
                break;
            default:
                this.A00 = r1;
                this.A01 = r2;
                break;
        }
    }

    public final void Bzx(String str, Bundle bundle) {
        AnonymousClass601 r4;
        AnonymousClass3VO r3;
        C109326jp r2;
        C127397h3 r1;
        int i;
        switch (this.A02) {
            case 0:
            case 1:
            case 3:
                r2 = (C109326jp) this.A01;
                r3 = AnonymousClass3VO.A00();
                r4 = (AnonymousClass601) this.A00;
                r3.A02(r4.A00, 0);
                break;
            case 2:
                C04220Ms.A0B(bundle, 1);
                r1 = (C127397h3) this.A00;
                i = 36;
                break;
            case 4:
                C04220Ms.A0B(bundle, 1);
                C61043Rr.A00((AnonymousClass601) this.A00, C63893iY.A04(AnonymousClass3VO.A00(), Boolean.valueOf(bundle.getBoolean(AnonymousClass3QH.A00(9, 15, 12))), 0), (C109326jp) this.A01);
                return;
            case 5:
                C04220Ms.A0B(bundle, 1);
                r1 = (C127397h3) this.A00;
                if (r1 != null) {
                    i = 40;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r2 = r1.A0L(i);
        if (r2 != null) {
            int i2 = bundle.getInt(TraceFieldType.ErrorCode);
            r4 = (AnonymousClass601) this.A01;
            r3 = AnonymousClass3VO.A00();
            r3.A02(Integer.valueOf(i2), 0);
            C61043Rr.A00(r4, new C63893iY(r3.A00), r2);
        }
    }

    public IDxRListenerShape228S0200000_1_I2(AnonymousClass601 r1, C127397h3 r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }
}
