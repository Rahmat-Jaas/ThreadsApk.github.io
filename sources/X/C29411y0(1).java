package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.1y0  reason: invalid class name and case insensitive filesystem */
public final class C29411y0 extends C18720xk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass3DN A01;
    public final /* synthetic */ C84244sn A02;
    public final /* synthetic */ C202013n A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29411y0(Context context, AnonymousClass3DN r2, C84244sn r3, C202013n r4, int i) {
        super(i);
        this.A01 = r2;
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        AnonymousClass3DN r6 = this.A01;
        r6.A09 = false;
        Context context = this.A00;
        C202013n r3 = this.A03;
        ImageView imageView = r3.A06;
        C18180wK.A0r(context, imageView, R.drawable.instagram_error_pano_outline_24);
        C63393hP.A04(context, imageView, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        r3.A07.setVisibility(0);
        r3.A08.setVisibility(8);
        this.A02.Bra(r6);
    }
}
