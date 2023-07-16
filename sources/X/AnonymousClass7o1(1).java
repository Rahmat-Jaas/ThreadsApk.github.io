package X;

/* renamed from: X.7o1  reason: invalid class name */
public abstract class AnonymousClass7o1 implements C83334rD {
    public boolean A00;

    public final synchronized void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        if (!this.A00) {
            this.A00 = true;
            A01(th);
        }
    }

    public void A00(C143338gY r3) {
        Object A002;
        if (this instanceof C957061x) {
            ((C957061x) this).A00.set(r3);
            return;
        }
        C685344e r32 = (C685344e) r3;
        boolean isOk = r32.isOk();
        AnonymousClass8s9 r1 = ((C956961w) this).A00;
        if (!isOk) {
            A002 = C86164wN.A0R(new AnonymousClass1j9(r32));
        } else {
            A002 = AnonymousClass1jA.A00(r32);
        }
        r1.resumeWith(A002);
    }

    public void A01(Throwable th) {
        if (this instanceof C957061x) {
            ((C957061x) this).A00.setException(th);
        } else {
            ((C956961w) this).A00.resumeWith(C86164wN.A0R(new AnonymousClass1j8(th)));
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C143338gY r3 = (C143338gY) obj;
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                if (r3 != null) {
                    A00(r3);
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
        }
    }
}
