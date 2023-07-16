package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.1te  reason: invalid class name and case insensitive filesystem */
public final class C28091te extends AnonymousClass1j2 implements C28104Eyb, C39775Kzj, C27703Ert {
    public long A00 = -1;
    public long A01 = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28091te(C212519q r3) {
        super(r3);
        C04220Ms.A0B(r3, 3);
    }

    public final long AUu() {
        return this.A00;
    }

    public final long AUw() {
        return this.A01;
    }

    public final String AxY() {
        return null;
    }

    public final boolean BRb() {
        return true;
    }

    public final boolean BRi() {
        return false;
    }

    public final boolean BS2() {
        return C18180wK.A1V((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final CnY CxJ() {
        TreeJNI reinterpret = this.A00.reinterpret(C27621sr.class);
        C04220Ms.A0B(reinterpret, 1);
        CnY cnY = new CnY();
        ImmutableList<C145458kX> optionalTreeListByHashCode = reinterpret.getOptionalTreeListByHashCode(100526016, AnonymousClass638.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C145458kX r1 : optionalTreeListByHashCode) {
                A0w.add(new AnonymousClass7HP(r1));
            }
            cnY.A00 = A0w;
            C102016Tm.A00(A0w, cnY.A02);
            return cnY;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final /* bridge */ /* synthetic */ Object D7H() {
        return this.A00.reinterpret(C27621sr.class);
    }

    public final void CiS(long j) {
        this.A00 = j;
    }

    public final void CiU(long j) {
        this.A01 = j;
    }
}
