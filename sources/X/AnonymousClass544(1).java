package X;

import com.facebook.redex.IDxCCallbackShape484S0100000_2_I2;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.544  reason: invalid class name */
public final class AnonymousClass544 extends C115286uo {
    public float A00 = 1.0f;
    public C104136bI A01;
    public boolean A02;
    public final C147368pE A03 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C81784oM A04;
    public final AnonymousClass0ZU A05;
    public final IDxCCallbackShape484S0100000_2_I2 A06 = new IDxCCallbackShape484S0100000_2_I2(this, 0);
    public final C11630kW A07;
    public final ImageUrl A08;

    public AnonymousClass544(C81784oM r4, C11630kW r5, ImageUrl imageUrl, AnonymousClass0ZU r7) {
        C04220Ms.A0B(r5, 3);
        this.A08 = imageUrl;
        this.A04 = r4;
        this.A07 = r5;
        this.A05 = r7;
        A00(this, true);
    }

    public static final void A00(AnonymousClass544 r3, boolean z) {
        ImageUrl imageUrl = r3.A08;
        if (imageUrl != null) {
            C37030Jj7 A0A = C37744K2e.A01().A0A(imageUrl, r3.A07.getModuleName());
            A0A.A0F = false;
            A0A.A0A = C86144wL.A0w(new C130947rA(r3));
            A0A.A02(r3.A06);
            A0A.A03 = 1;
            A0A.A0D = false;
            A0A.A0J = z;
            A0A.A0G = true;
            A0A.A00().CYj();
        }
    }
}
