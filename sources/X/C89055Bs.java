package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5Bs  reason: invalid class name and case insensitive filesystem */
public final class C89055Bs extends M5O {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final ImageView A04;
    public final /* synthetic */ C91515gM A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89055Bs(View view, C91515gM r8) {
        super(view);
        this.A05 = r8;
        ImageView imageView = (ImageView) view.findViewById(R.id.checkmark_icon);
        this.A04 = imageView;
        TextView A0G = C18180wK.A0G(view, R.id.title);
        this.A03 = A0G;
        TextView A0G2 = C18180wK.A0G(view, R.id.subtitle);
        this.A02 = A0G2;
        TextView A0G3 = C18180wK.A0G(view, R.id.see_receipt);
        this.A01 = A0G3;
        TextView A0G4 = C18180wK.A0G(view, R.id.pin_upsell);
        this.A00 = A0G4;
        C04220Ms.A04(imageView);
        C116966xu.A01(imageView, AnonymousClass697.ECP_CHECKMARK);
        C04220Ms.A04(A0G);
        AnonymousClass7Fd.A02(A0G, AnonymousClass69Q.A0s);
        C04220Ms.A04(A0G2);
        AnonymousClass7Fd.A02(A0G2, AnonymousClass69Q.A0D);
        C04220Ms.A04(A0G3);
        AnonymousClass69Q r0 = AnonymousClass69Q.A0o;
        AnonymousClass7Fd.A02(A0G3, r0);
        C04220Ms.A04(A0G4);
        AnonymousClass7Fd.A02(A0G4, r0);
        C86104wH.A1C(A0G4, 12, r8);
    }
}
