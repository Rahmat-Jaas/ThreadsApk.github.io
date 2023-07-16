package com.facebook.redex;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C127017gO;
import X.C127057gS;
import X.C146428mE;
import X.C15020qa;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C30954Gc6;
import X.C39517Kv1;
import X.C93835rl;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;

public class IDxAFunctionShape732S0100000_2_I2 implements C39517Kv1 {
    public Object A00;
    public final int A01;

    public IDxAFunctionShape732S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture A8l(Object obj) {
        ListenableFuture A012;
        if (this.A01 != 0) {
            C146428mE r7 = (C146428mE) obj;
            if (r7 != null) {
                return r7.CfM((PapayaRestrictions) this.A00);
            }
            return null;
        } else if (C18190wL.A1Z(obj, true)) {
            C15020qa.A0B("torch-code-gen", 16);
            C127057gS r5 = (C127057gS) this.A00;
            synchronized (r5.A05) {
                C146428mE r3 = r5.A00;
                if (r3 == null) {
                    r3 = (C146428mE) r5.A04.call();
                    C04220Ms.A04(r3);
                    Iterator A0z = AnonymousClass0wJ.A0z(r5.A03);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        r3.A6a((LogSink) A0o.getValue(), C18200wM.A0p(A0o));
                    }
                    r3.CiY(new C127017gO(r3, r5));
                    r5.A00 = r3;
                }
                A012 = C30954Gc6.A01(r3);
            }
            return A012;
        } else {
            AnonymousClass0LU.A0C("Papaya", "Fail to load app-module('Papaya')!");
            return new C93835rl();
        }
    }
}
