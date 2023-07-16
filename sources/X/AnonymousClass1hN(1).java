package X;

import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;

/* renamed from: X.1hN  reason: invalid class name */
public final class AnonymousClass1hN extends C63873iU {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ IDxCListenerShape267S0100000_1_I2 A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass1hN(IDxCListenerShape267S0100000_1_I2 iDxCListenerShape267S0100000_1_I2, boolean z, boolean z2) {
        this.A01 = iDxCListenerShape267S0100000_1_I2;
        this.A02 = z;
        this.A00 = z2;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A03 = C14030oh.A03(1496839298);
        AnonymousClass4AX r4 = (AnonymousClass4AX) this.A01.A00;
        C28161tl A012 = AnonymousClass3WS.A01(r4.A0E);
        AnonymousClass0wJ.A13(C28161tl.A02(A012), "auto_save_reel_media_to_gallery", this.A00);
        C63813iO.A03(r4.A0B, "setAutoSaveReelMediaToGallery_error", 2131826851, 0);
        AnonymousClass4AX.A04(r4);
        C14030oh.A0A(-2097122438, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(303018414);
        int A032 = C14030oh.A03(-911027292);
        super.onSuccess(obj);
        C62423Zt.A02(((AnonymousClass4AX) this.A01.A00).A0E);
        C14030oh.A0A(-722566066, A032);
        C14030oh.A0A(1637962606, A03);
    }
}
