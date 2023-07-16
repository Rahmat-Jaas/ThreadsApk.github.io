package com.facebook.redex;

import X.AnonymousClass01V;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass5ro;
import X.C04220Ms;
import X.C127057gS;
import X.C130017ns;
import X.C132427ts;
import X.C132437tt;
import X.C132497tz;
import X.C146148lj;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C30954Gc6;
import X.C39517Kv1;
import X.C86154wM;
import X.C97356Ba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1;

public class IDxAFunctionShape269S0200000_2_I2 implements C39517Kv1 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxAFunctionShape269S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture A8l(Object obj) {
        if (this.A02 == 0) {
            ((C132437tt) this.A00).A00();
            return C132497tz.A00((C132497tz) this.A01);
        } else if (obj == null) {
            return new AnonymousClass5ro(C18180wK.A0X());
        } else {
            C127057gS r7 = (C127057gS) this.A01;
            C146148lj r1 = (C146148lj) this.A00;
            String name = r1.getName();
            C04220Ms.A06(name);
            boolean BTd = r1.BTd();
            KtLambdaShape17S0200000_I2_1 A11 = C86154wM.A11(r1, obj, 5);
            C132427ts r2 = r7.A01;
            Map A0A = AnonymousClass4WJ.A0A();
            int hashCode = name.hashCode();
            AnonymousClass01V r4 = r2.A00;
            r4.markerStart(188226264, hashCode, false);
            Iterator A0z = AnonymousClass0wJ.A0z(A0A);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                r4.markerAnnotate(188226264, hashCode, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            r4.markerAnnotate(188226264, hashCode, "population", "ig4a");
            r4.markerAnnotate(188226264, hashCode, "task", name);
            ListenableFuture listenableFuture = (ListenableFuture) A11.invoke();
            C30954Gc6.A03(new C130017ns(r7, name, BTd), listenableFuture, C97356Ba.A01);
            return listenableFuture;
        }
    }
}
