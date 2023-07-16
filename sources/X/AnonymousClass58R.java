package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PickupInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.58R  reason: invalid class name */
public final class AnonymousClass58R extends C62793ak implements C146618mX {
    public SparseArray A00 = C86154wM.A0D();
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C880756q A05 = C880756q.A01();
    public final C880856r A06 = C880856r.A02();
    public final C143158gC A07 = C86114wI.A0Q(this, 130);
    public final C880856r A08 = C880856r.A04(C969667k.EDIT);

    public final AnonymousClass7Kx A00() {
        C108806iy r0;
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass69U r10 = AnonymousClass69U.A0V;
        AnonymousClass7Kx A09 = AnonymousClass7Kx.A09(new PuxContactItem(r10, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A06);
        if (A0R == null || (r0 = (C108806iy) A0R.A01) == null) {
            return A09;
        }
        PickupInfo pickupInfo = (PickupInfo) r0.A01;
        String str = pickupInfo.A01;
        String str2 = pickupInfo.A00;
        String str3 = pickupInfo.A03;
        if (!this.A03 || (str != null && !AnonymousClass8bQ.A0n(str))) {
            z = false;
        } else {
            z = true;
        }
        if (!this.A02 || (str2 != null && !AnonymousClass8bQ.A0n(str2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.A04 || (str3 != null && !AnonymousClass8bQ.A0n(str3))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!this.A03) {
            str = null;
        }
        if (!this.A02) {
            str2 = null;
        }
        if (!this.A04) {
            str3 = null;
        }
        List A17 = C06750aI.A17(str, str2, str3);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A17) {
            String str4 = (String) next;
            if (str4 != null && !AnonymousClass8bQ.A0n(str4)) {
                A0v.add(next);
            }
        }
        PuxContactItem puxContactItem = new PuxContactItem(r10, (Integer) null, (String) null, (String) AnonymousClass00J.A0G(A0v, 0), (String) AnonymousClass00J.A0G(A0v, 1), (String) AnonymousClass00J.A0G(A0v, 2), (String) null, false);
        if (z || z2 || z3) {
            return AnonymousClass7Kx.A0B(puxContactItem, new AnonymousClass88V(AnonymousClass69Q.A1A, 2131826436));
        }
        return AnonymousClass7Kx.A0A(puxContactItem);
    }

    public final void ACT(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r4) {
    }

    public final void AJJ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r4) {
    }

    public final void BrQ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r4) {
    }

    public final void CeZ() {
    }

    public final void Cwt() {
    }

    public final M5J Abc() {
        return this.A08;
    }

    public final M5J Cgs() {
        return this.A05;
    }

    public final /* synthetic */ boolean Cs9() {
        return true;
    }

    public final void D9D(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }
}
