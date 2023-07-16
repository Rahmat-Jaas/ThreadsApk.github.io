package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape177S0200000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.2T6  reason: invalid class name */
public final class AnonymousClass2T6 {
    public static final void A00(Context context, C81644o8 r12, C84844tx r13) {
        C04220Ms.A0B(context, 2);
        C28291u0 r122 = (C28291u0) r12;
        String str = r122.A09.A00;
        if (str.hashCode() == -5352129 && str.equals("instagram_app_rating_dialog")) {
            AnonymousClass37K r3 = new AnonymousClass37K(context);
            C28221tt r1 = r122.A08;
            C04220Ms.A06(r1);
            String str2 = r1.A09.A00;
            String str3 = r1.A03.A00;
            C65793vr r4 = new C65793vr(r13, r122);
            IDxCListenerShape177S0200000_1_I2 iDxCListenerShape177S0200000_1_I2 = new IDxCListenerShape177S0200000_1_I2(3, r13, r122);
            boolean A1W = AnonymousClass0wJ.A1W(r1.A00);
            Dialog dialog = new Dialog(r3.A01, R.style.IgDialogDeprecated);
            r3.A00 = dialog;
            dialog.setContentView(R.layout.new_appirater);
            RatingBar ratingBar = (RatingBar) r3.A00.requireViewById(R.id.rating_bar);
            View requireViewById = r3.A00.requireViewById(R.id.appirater_rate_later_button);
            ((TextView) r3.A00.requireViewById(R.id.appirater_title_area)).setText(str2);
            ((TextView) r3.A00.requireViewById(R.id.appirater_message_area)).setText(str3);
            if (A1W) {
                AnonymousClass0wJ.A18(requireViewById, 4, iDxCListenerShape177S0200000_1_I2, r3);
                r3.A00.setCancelable(true);
                r3.A00.setOnCancelListener(iDxCListenerShape177S0200000_1_I2);
            } else {
                View requireViewById2 = r3.A00.requireViewById(R.id.appirater_rate_later_divider);
                requireViewById.setVisibility(8);
                requireViewById2.setVisibility(8);
                r3.A00.setCancelable(false);
                r3.A00.setOnCancelListener((DialogInterface.OnCancelListener) null);
            }
            ratingBar.setOnRatingBarChangeListener(new C65783vq(r4, r3));
            Dialog dialog2 = r3.A00;
            dialog2.getClass();
            C13950oZ.A00(dialog2);
            r13.CEB(r122);
        }
    }
}
