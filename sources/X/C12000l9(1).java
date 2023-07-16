package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0l9  reason: invalid class name and case insensitive filesystem */
public final class C12000l9 implements AnonymousClass0W6 {
    public AnonymousClass0XU A00 = null;
    public Boolean A01 = null;

    public final String B51() {
        return "sapienz";
    }

    public final int B52() {
        return 37;
    }

    public final AnonymousClass0XU A01() {
        AnonymousClass0XU r2;
        if (this.A01 != null) {
            return this.A00;
        }
        synchronized (this) {
            boolean A04 = EndToEnd.A04();
            this.A01 = Boolean.valueOf(A04);
            if (A04) {
                this.A00 = new AnonymousClass0XU();
                String A012 = C02640Cf.A01("fb.sapienz_config_name");
                String A013 = C02640Cf.A01("fb.sapienz_request_id");
                r2 = this.A00;
                if (A012.equals("")) {
                    A012 = r2.A00;
                }
                r2.A00 = A012;
                if (A013.equals("")) {
                    A013 = r2.A01;
                }
                r2.A01 = A013;
            } else {
                r2 = null;
            }
        }
        return r2;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00(r2, (AnonymousClass0XU) obj);
    }

    public static final ListenableFuture A00(C09350fH r3, AnonymousClass0XU r4) {
        if ((EndToEnd.A04() || r3.BWB(37)) && r4 != null) {
            r3.AvU().A03("config_name", r4.A00);
            r3.AvU().A03(TraceFieldType.RequestID, r4.A01);
        }
        return C30954Gc6.A01((Object) null);
    }

    public final Class BCf() {
        return AnonymousClass0XU.class;
    }

    public final Class BDT() {
        return AnonymousClass0XU.class;
    }

    public final boolean BTR(C08640dy r3) {
        if (EndToEnd.A04() || C07960cV.A05(AnonymousClass0e5.A00(36315829683358527L))) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object CuR(int i, int i2) {
        return A01();
    }

    public final /* bridge */ /* synthetic */ Object Cuj(int i, int i2) {
        return A01();
    }

    public final /* bridge */ /* synthetic */ void Cw1(Object obj) {
    }
}
