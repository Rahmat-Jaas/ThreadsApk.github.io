package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* renamed from: X.11L  reason: invalid class name */
public final class AnonymousClass11L extends C41030Luu {
    public C82394pY A00;
    public C82394pY A01;
    public List A02 = AnonymousClass0wJ.A0v();
    public List A03 = AnonymousClass0wJ.A0v();
    public final Context A04;
    public final FragmentActivity A05;
    public final AnonymousClass3In A06;
    public final C11630kW A07;
    public final UserSession A08;

    public AnonymousClass11L(Context context, FragmentActivity fragmentActivity, AnonymousClass3In r4, C11630kW r5, UserSession userSession) {
        C04220Ms.A0B(userSession, 3);
        this.A04 = context;
        this.A05 = fragmentActivity;
        this.A08 = userSession;
        this.A07 = r5;
        this.A06 = r4;
    }

    public static final int A00(AnonymousClass11L r4, BKU bku) {
        int size = r4.A02.size();
        for (int i = 0; i < size; i++) {
            if (C04220Ms.A0I(bku.A0f.A4Y, ((BKU) r4.A02.get(i)).A0f.A4Y)) {
                return i;
            }
        }
        return -1;
    }

    public final void A02() {
        if (this.A00 != null) {
            C82394pY r0 = this.A00;
            C04220Ms.A0A(r0);
            AnonymousClass3LY.A00(this.A08).A02(r0, AnonymousClass46G.class);
            this.A00 = null;
        }
        if (this.A01 != null) {
            C82394pY r02 = this.A01;
            C04220Ms.A0A(r02);
            AnonymousClass3LY.A00(this.A08).A02(r02, AnonymousClass46T.class);
            this.A01 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.M5O r7, int r8) {
        /*
            r6 = this;
            X.13c r7 = (X.C200913c) r7
            r4 = 0
            X.C04220Ms.A0B(r7, r4)
            java.util.List r0 = r6.A03
            r0.set(r8, r7)
            java.util.List r0 = r6.A02
            java.lang.Object r3 = r0.get(r8)
            X.BKU r3 = (X.BKU) r3
            android.content.Context r0 = r6.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165656(0x7f0701d8, float:1.7945535E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r3.AWf()
            r0 = 0
            if (r1 <= 0) goto L_0x0071
            java.util.List r1 = r3.A3I()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r1.get(r4)
            X.BKU r1 = (X.BKU) r1
            if (r1 == 0) goto L_0x0044
            com.instagram.common.typedurl.ImageUrl r5 = r1.A23(r2)
        L_0x0039:
            if (r5 == 0) goto L_0x0044
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r4 = r7.A05
            com.instagram.service.session.UserSession r2 = r6.A08
            X.0kW r1 = r6.A07
            r4.setUrl(r2, r5, r1)
        L_0x0044:
            android.widget.TextView r2 = r7.A03
            X.BZI r1 = r3.A26()
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = r1.A0h
        L_0x004e:
            r2.setText(r0)
            X.BKN r0 = r3.A0f
            X.18N r0 = r0.A05
            if (r0 == 0) goto L_0x0062
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            int r0 = r0.intValue()
            A01(r7, r6, r0)
        L_0x0062:
            android.widget.ImageView r1 = r7.A01
            r0 = 32
            X.AnonymousClass0wJ.A18(r1, r0, r6, r3)
            android.view.View r1 = r7.A00
            r0 = 33
            X.AnonymousClass0wJ.A18(r1, r0, r6, r3)
            return
        L_0x0071:
            com.instagram.common.typedurl.ImageUrl r5 = r3.A23(r2)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11L.onBindViewHolder(X.M5O, int):void");
    }

    public static final void A01(C200913c r6, AnonymousClass11L r7, int i) {
        long A09 = C18220wO.A09(i);
        TextView textView = r6.A04;
        textView.setText(C18240wQ.A0i(new SimpleDateFormat("EEE, LLL d, yyyy, h:mm a", Locale.US), A09));
        if (Calendar.getInstance().getTimeInMillis() > A09) {
            Context context = r7.A04;
            C18180wK.A0s(context, textView, R.color.igds_error_or_destructive);
            ImageView imageView = r6.A02;
            imageView.setImageResource(R.drawable.instagram_error_filled_24);
            C18240wQ.A0r(context, imageView, R.color.igds_error_or_destructive);
        }
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(-907228623);
        int size = this.A02.size();
        C14030oh.A0A(408028165, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C200913c(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.scheduled_content_list_item, C18200wM.A1Y(viewGroup)));
    }
}
