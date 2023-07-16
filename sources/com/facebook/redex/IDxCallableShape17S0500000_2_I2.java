package com.facebook.redex;

import X.AnonymousClass0LU;
import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C107206gM;
import X.C132437tt;
import X.C143468gn;
import X.C143478go;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.papaya.client.engine.impl.EngineFactory;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class IDxCallableShape17S0500000_2_I2 implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxCallableShape17S0500000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A04 = obj3;
        this.A00 = obj;
        this.A01 = obj4;
        this.A03 = obj2;
        this.A02 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.A05 == 0) {
            return A00(this);
        }
        return ((C143478go) this.A03).Cem((C143468gn) this.A01, (C107206gM) this.A02, this.A00, (List) this.A04);
    }

    public static final /* bridge */ /* synthetic */ Object A00(IDxCallableShape17S0500000_2_I2 iDxCallableShape17S0500000_2_I2) {
        if (C04220Ms.A0I(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            AnonymousClass0LU.A0C("Papaya", "EngineFactory should not be constructed in MAIN thread!");
        }
        ITransport iTransport = (ITransport) ((C132437tt) iDxCallableShape17S0500000_2_I2.A04).A07.call();
        AnonymousClass0ZV r5 = AnonymousClass0ZV.A00;
        C04220Ms.A04(iTransport);
        return new EngineFactory((Context) iDxCallableShape17S0500000_2_I2.A00, (Map) iDxCallableShape17S0500000_2_I2.A01, (Bundle) iDxCallableShape17S0500000_2_I2.A03, (Map) iDxCallableShape17S0500000_2_I2.A02, r5, iTransport, (IModelLoader) null);
    }
}
