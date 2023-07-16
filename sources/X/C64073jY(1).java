package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.3jY  reason: invalid class name and case insensitive filesystem */
public final class C64073jY implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BusinessConversionActivity A01;
    public final /* synthetic */ C84294su A02;
    public final /* synthetic */ C145538kf A03;
    public final /* synthetic */ AnonymousClass266 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C64073jY(Context context, BusinessConversionActivity businessConversionActivity, C84294su r3, C145538kf r4, AnonymousClass266 r5, String str, boolean z) {
        this.A01 = businessConversionActivity;
        this.A03 = r4;
        this.A00 = context;
        this.A05 = str;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BusinessConversionActivity.A01(this.A00, this.A01, this.A02, this.A03, this.A04, true, this.A06);
    }
}
