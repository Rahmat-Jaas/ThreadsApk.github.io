package X;

import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import java.util.ArrayList;

/* renamed from: X.4RJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4RJ implements Runnable {
    public final /* synthetic */ IDxEListenerShape223S0100000_1_I2 A00;
    public final /* synthetic */ ArrayList A01;

    public /* synthetic */ AnonymousClass4RJ(IDxEListenerShape223S0100000_1_I2 iDxEListenerShape223S0100000_1_I2, ArrayList arrayList) {
        this.A00 = iDxEListenerShape223S0100000_1_I2;
        this.A01 = arrayList;
    }

    public final void run() {
        C23391dj r2 = (C23391dj) this.A00.A00;
        AnonymousClass4MA r1 = r2.A07;
        r1.getClass();
        r1.A05 = r2.getString(2131835595);
        r2.A0A.notifyDataSetChanged();
    }
}
